package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;

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
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.RuntimePackage;
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
	
	public synchronized void removeTaskProvider(ITaskProvider taskEngineProvider) {
		taskProviders.remove(taskEngineProvider);
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
			task.eAdapters().remove(stateListener);
			startNextTask();
		}
	}

	protected void startNextTask() {
		for (Task<?, ?> task : game.getTasks()) {
			if (! task.isStarted()) {
				task.start();
				break;
			}
		}
	}

	public void start() {
		startNextTask();
	}
}
