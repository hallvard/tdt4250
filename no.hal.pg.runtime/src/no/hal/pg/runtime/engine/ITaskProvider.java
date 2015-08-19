package no.hal.pg.runtime.engine;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Task;

public interface ITaskProvider {
	public Task<? extends TaskDef, ?> getTask(TaskDef taskDef);
}
