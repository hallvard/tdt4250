package no.hal.pg.sokoban.runtime.engine;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.engine.ITaskProvider;
import no.hal.pg.runtime.util.Util;
import no.hal.pg.sokoban.model.SokobanTaskDef;
import no.hal.pg.sokoban.runtime.RuntimePackage;

public class SokobanTaskProvider implements ITaskProvider {

	@Override
	public Task<? extends TaskDef, ?> getTask(TaskDef taskDef) {
		if (taskDef instanceof SokobanTaskDef) {
			SokobanTaskDef sokobanTaskDef = (SokobanTaskDef) taskDef;
			return Util.createTask(RuntimePackage.eINSTANCE.getSokobanTask(), sokobanTaskDef);
		}
		return null;
	}
}
