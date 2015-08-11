package no.hal.pg.runtime.engine;

import no.hal.pg.runtime.Task;

public interface ITaskEngineListener {
	public void taskEnabled(Task<?> task);
	public void taskStateChanged(Task<?> task);
	public void taskFinished(Task<?> task);
}
