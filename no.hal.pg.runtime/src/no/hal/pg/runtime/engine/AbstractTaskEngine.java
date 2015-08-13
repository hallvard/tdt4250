package no.hal.pg.runtime.engine;

import java.util.ArrayList;
import java.util.Collection;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Task;

public abstract class AbstractTaskEngine<TD extends TaskDef, T extends Task<TD>> implements ITaskEngine<TD> {

	private final TD taskDef;
	protected T task;
	
	public AbstractTaskEngine(TD taskDef) {
		this.taskDef = taskDef;
	}

	protected T prepare(T task) {
		task.setTaskDef(taskDef);
		this.task = task;
		return task;
	}

	@Override
	public void perform() {
		task.start();
	}
	
	//
	
	private Collection<ITaskEngineListener> taskEngineListeners = new ArrayList<ITaskEngineListener>();
	
	@Override
	public void addTaskEngineListener(ITaskEngineListener listener) {
		taskEngineListeners.add(listener);
	}
	
	@Override
	public void removeTaskEngineListener(ITaskEngineListener listener) {
		taskEngineListeners.remove(listener);
	}
	
	protected void fireTaskChanged(Task<TD> task, boolean enabled, boolean stateChanged, boolean finished) {
		if (enabled) {
			for (ITaskEngineListener taskEngineListener : taskEngineListeners) {
				taskEngineListener.taskEnabled(task);
			}
		}
		if (stateChanged) {
			for (ITaskEngineListener taskEngineListener : taskEngineListeners) {
				taskEngineListener.taskStateChanged(task);
			}
		}
		if (finished) {
			for (ITaskEngineListener taskEngineListener : taskEngineListeners) {
				taskEngineListener.taskFinished(task);
			}
		}
	}
}
