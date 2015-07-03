package no.hal.pg.runtime.engine;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Task;

public interface ITaskEngine<T extends TaskDef> {
	public Task<T> prepare();
	public void perform();
}
