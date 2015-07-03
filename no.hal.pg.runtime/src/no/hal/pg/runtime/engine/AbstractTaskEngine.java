package no.hal.pg.runtime.engine;

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
}
