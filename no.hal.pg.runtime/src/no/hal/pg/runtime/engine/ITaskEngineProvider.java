package no.hal.pg.runtime.engine;

import no.hal.pg.model.TaskDef;

public interface ITaskEngineProvider {
	public boolean isProviderFor(TaskDef taskDef);
	public ITaskEngine<? extends TaskDef> getTaskEngine(TaskDef taskDef);
}
