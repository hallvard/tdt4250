package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GameService;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Services;
import no.hal.pg.runtime.Task;

@Component(immediate=true)
public class Engine {

	private Collection<ITaskProvider> taskProviders = new ArrayList<ITaskProvider>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeTaskProvider"
	)
	public synchronized void addTaskProvider(ITaskProvider taskProvider) {
		taskProviders.add(taskProvider);
	}
	
	public synchronized void removeTaskProvider(ITaskProvider taskProvider) {
		taskProviders.remove(taskProvider);
	}
	
	private Collection<IServiceListener> serviceListeners = new ArrayList<IServiceListener>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeServiceListener"
			)
	public synchronized void addServiceListener(IServiceListener serviceListener) {
		serviceListeners.add(serviceListener);
	}
	
	public synchronized void removeServiceListener(IServiceListener serviceListener) {
		serviceListeners.remove(serviceListener);
	}
	
	private Game game;
	
	public void init(GameDef gameDef) {
		Game game = RuntimeFactory.eINSTANCE.createGame();
		for (TaskDef taskDef : gameDef.getTasks()) {
			for (ITaskProvider taskProvider : taskProviders) {
				Task<?, ?> task = taskProvider.getTask(taskDef);
				if (task != null) {
					game.getTasks().add(task);
				}
			}
		}
		this.game = game;
		this.game.eAdapters().add(serviceListener);
		for (Task<?, ?> task : game.getTasks()) {
			task.eAdapters().add(serviceListener);
		}
		GameService gameService = RuntimeFactory.eINSTANCE.createGameService();
		gameService.setContext(game);
		game.getServices().add(gameService);
	}

	private boolean isChangeStateNotification(Notification notification) {
		return notification.getFeature() == RuntimePackage.eINSTANCE.getTask_States();
	}

	private Adapter stateListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getNotifier() instanceof Task<?, ?>  && isChangeStateNotification(msg)) {
				taskStateChanged((Task<?, ?>) msg.getNotifier());
			}
		}
	};
	
	protected void taskStateChanged(Task<?, ?> task) {
		if (task.isFinished()) {
			taskFinished(task);
			startNextTask();
		}
	}

	protected void taskFinished(Task<?, ?> task) {
		task.eAdapters().remove(stateListener);
		task.eAdapters().remove(serviceListener);
	}

	protected void startNextTask() {
		for (Task<?, ?> task : game.getTasks()) {
			if (! task.isStarted()) {
				taskStarting(task);
				task.start();
				break;
			}
		}
	}

	protected void taskStarting(Task<?, ?> task) {
		task.eAdapters().add(stateListener);
		task.eAdapters().add(serviceListener);
	}

	public void start() {
		startNextTask();
	}
	
	//
	
	private boolean isServiceChangeNotification(Notification notification) {
		return notification.getFeature() == RuntimePackage.eINSTANCE.getServices_Services();
	}

	private Adapter serviceListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getNotifier() instanceof Services && isServiceChangeNotification(msg)) {
				serviceChanged(msg);
			}
		}
	};

	private Map<Services, Collection<Service<?>>> lastServices = new HashMap<Services, Collection<Service<?>>>();
	
	protected void serviceChanged(Notification msg) {
		Services services = (Services) msg.getNotifier();
		fireServiceChanged(lastServices.get(services), services.getServices());
		lastServices.put(services, new ArrayList<Service<?>>(services.getServices()));
	}

	protected void fireServiceChanged(Collection<Service<?>> pre, Collection<Service<?>> post) {
		if (pre != null) {
			for (Service<?> service : pre) {
				if (post == null || (! post.contains(service))) {
					for (IServiceListener serviceListener : serviceListeners) {
						serviceListener.serviceDeactivated(service);
					}
				}
			}
		}
		if (post != null) {
			for (Service<?> service : post) {
				if (pre == null || (! pre.contains(service))) {
					for (IServiceListener serviceListener : serviceListeners) {
						serviceListener.serviceActivated(service);
					}
				}
			}
		}
	}
}
