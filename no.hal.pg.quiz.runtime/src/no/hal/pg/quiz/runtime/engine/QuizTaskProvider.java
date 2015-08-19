package no.hal.pg.quiz.runtime.engine;

import org.osgi.service.component.annotations.Component;

import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.engine.ITaskProvider;

@Component
public class QuizTaskProvider implements ITaskProvider {

	@Override
	public Task<? extends TaskDef, ?> getTask(TaskDef taskDef) {
		QuizTask task = null;
		if (taskDef instanceof QuizTaskDef) {
			task = RuntimeFactory.eINSTANCE.createQuizTask();
			task.setTaskDef((QuizTaskDef) taskDef);
		}
		return task;
	}
}
