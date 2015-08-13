package no.hal.pg.quiz.runtime.engine;

import org.osgi.service.component.annotations.Component;

import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.runtime.engine.ITaskEngine;
import no.hal.pg.runtime.engine.ITaskEngineProvider;

@Component
public class QuizEngineFactory implements ITaskEngineProvider {

	@Override
	public boolean isProviderFor(TaskDef taskDef) {
		return taskDef instanceof QuizTaskDef;
	}

	@Override
	public ITaskEngine<? extends TaskDef> getTaskEngine(TaskDef taskDef) {
		return new QuizEngine((QuizTaskDef) taskDef);
	}
}
