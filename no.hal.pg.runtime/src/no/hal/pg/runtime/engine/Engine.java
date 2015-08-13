package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

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

	private Collection<ITaskEngineProvider> taskEngineProviders = new ArrayList<ITaskEngineProvider>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeTaskEngineProvider"
	)
	public synchronized void addTaskEngineProvider(ITaskEngineProvider taskEngineProvider) {
		taskEngineProviders.add(taskEngineProvider);
	}
	
	public synchronized void removeTaskEngineProvider(ITaskEngineProvider taskEngineProvider) {
		taskEngineProviders.remove(taskEngineProvider);
	}
	
	private Game game;
	
	private ITaskEngine<?> getTaskEngine(TaskDef taskDef) {
		for (ITaskEngineProvider taskEngineFactory : taskEngineProviders) {
			if (taskEngineFactory.isProviderFor(taskDef)) {
				return taskEngineFactory.getTaskEngine(taskDef);
			}
		}
		return null;
	}
	
	private Map<Task<?>, ITaskEngine<?>> taskEngines = new HashMap<Task<?>, ITaskEngine<?>>();
	
	private ITaskEngine<?> getTaskEngine(Task<?> task) {
		return taskEngines.get(task);
	}
	
	public void prepare(GameDef gameDef) {
		Game game = RuntimeFactory.eINSTANCE.createGame();
		for (TaskDef taskDef : gameDef.getTasks()) {
			ITaskEngine<?> taskEngine = getTaskEngine(taskDef);
			if (taskEngine != null) {
				Task<?> task = taskEngine.prepare();
				taskEngines.put(task, taskEngine);
				game.getTasks().add(task);
			}
		}
		this.game = game;
	}

	private boolean isChangeStateNotification(Notification notification) {
		return notification.getFeature() == RuntimePackage.eINSTANCE.getTask_States();
	}

	private AdapterImpl finishedListener = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification notification) {
			if (notification.getNotifier() instanceof Task && isChangeStateNotification(notification)) {
				Task<?> task = (Task<?>) notification.getNotifier();
				if (task.isFinished()) {
					task.eAdapters().remove(finishedListener);
					performNextTask();
				}
			}
		}
	};
	
	private void perform(final Task<?> task) {
		ITaskEngine<?> taskEngine = getTaskEngine(task);
		task.eAdapters().add(finishedListener);
		taskEngine.perform();
	}
	
	protected void performNextTask() {
		for (Task<?> task : game.getTasks()) {
			if (task.isEnabled() && (! task.isStarted()))
			perform(task);
			break;
		}
	}

	public void perform() {
		performNextTask();
	}
}
