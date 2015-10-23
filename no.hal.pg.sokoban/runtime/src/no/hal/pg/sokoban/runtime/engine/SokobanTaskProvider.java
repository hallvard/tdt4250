package no.hal.pg.sokoban.runtime.engine;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.engine.ITaskProvider;
import no.hal.pg.runtime.util.Util;
import no.hal.pg.sokoban.model.SokobanTaskDef;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanTask;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanLevel;

public class SokobanTaskProvider implements ITaskProvider {

	@Override
	public Task<? extends TaskDef, ?> getTask(TaskDef taskDef) {
		if (taskDef instanceof SokobanTaskDef) {
			SokobanTaskDef sokobanTaskDef = (SokobanTaskDef) taskDef;
			SokobanTask task = (SokobanTask) Util.createTask(RuntimePackage.eINSTANCE.getSokobanTask(), sokobanTaskDef);
			SokobanLevel sokobanLevel = sokobanTaskDef.getLevels().iterator().next();
			SokobanGame game = ModelFactory.eINSTANCE.createSokobanGame();
			game.setGrid(sokobanLevel.createGrid());
			task.setSokobanGame(game);
			return task;
		}
		return null;
	}
}
