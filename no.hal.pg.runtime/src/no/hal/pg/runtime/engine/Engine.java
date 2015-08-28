package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.Group;
import no.hal.pg.model.Person;
import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Services;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.service.GameService;
import no.hal.pg.runtime.service.ServiceFactory;

@Component(factory=Engine.FACTORY_ID)
public class Engine implements IEngine {

	public final static String FACTORY_ID = "no.hal.pg.runtime.engine.Engine";
	
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

	private Game game;
	
	public void init(GameDef gameDef) {
		Game game = RuntimeFactory.eINSTANCE.createGame();
		for (Group group : gameDef.getParticipants()) {
			for (Person person : group.getPersons()) {
				Player player = RuntimeFactory.eINSTANCE.createPlayer();
				player.setPerson(person);
				game.getPlayers().add(player);
			}
		}
		for (TaskDef taskDef : gameDef.getTasks()) {
			for (ITaskProvider taskProvider : taskProviders) {
				Task<?, ?> task = taskProvider.getTask(taskDef);
				if (task != null) {
					game.getTasks().add(task);
				}
			}
		}
		setGame(game);
		GameService gameService = ServiceFactory.eINSTANCE.createGameService();
		gameService.setContext(game);
		game.getServices().add(gameService);
		Resource gameDefResource = gameDef.eResource();
		URI gameUri = gameDefResource.getURI().trimFileExtension().appendFileExtension("pg-rt");
		ResourceSet resourceSet = gameDefResource.getResourceSet();
		if (resourceSet == null) {
			resourceSet = new ResourceSetImpl();
			resourceSet.getResources().add(gameDefResource);
		}
		Resource resource = resourceSet.createResource(gameUri);
		resource.getContents().add(game);
	}

	private void setGame(Game game) {
		this.game = game;
		this.game.eAdapters().add(serviceListener);
	}
	
	public void init(Game game) {
		setGame(game);
	}

	@Override
	public String getKey() {
		return getGame().eResource().getURI().path();
	}	
	public Game getGame() {
		return game;
	}

	private boolean isChangeStateNotification(Notification notification) {
		return notification.getFeature() == RuntimePackage.eINSTANCE.getTask_CurrentState();
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

	private Adapter serviceListener = new EContentAdapter() {
		@Override
		public void notifyChanged(Notification msg) {
			if (msg.getNotifier() instanceof Services && isServiceChangeNotification(msg)) {
				switch (msg.getEventType()) {
				case Notification.ADD:
				case Notification.ADD_MANY: {
					fireServiceActivated(msg.getNewValue());
					break;
				}
				case Notification.REMOVE:
				case Notification.REMOVE_MANY:
					fireServiceDeactivated(msg.getOldValue());
					break;
				}
			}
		}
	};

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

	protected void fireServiceActivated(Object o) {
		if (o instanceof Service<?>) {
			for (IServiceListener serviceListener : serviceListeners) {
				serviceListener.serviceActivated(this, (Service<?>) o);
			}
		} else if (o instanceof Collection<?>) {
			for (Object element : (Collection<?>) o) {
				fireServiceActivated(element);
			}
		}
	}
	protected void fireServiceDeactivated(Object o) {
		if (o instanceof Service<?>) {
			for (IServiceListener serviceListener : serviceListeners) {
				serviceListener.serviceDeactivated(this, (Service<?>) o);
			}
		} else if (o instanceof Collection<?>) {
			for (Object element : (Collection<?>) o) {
				fireServiceDeactivated(element);
			}
		}
	}
}
