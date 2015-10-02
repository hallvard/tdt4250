package no.hal.pg.quiz.runtime.engine;

import org.osgi.service.component.annotations.Component;

import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.engine.ITaskProvider;
import no.hal.pg.runtime.util.Util;

@Component
public class QuizTaskProvider implements ITaskProvider {

	@Override
	public Task<? extends TaskDef, ?> getTask(TaskDef taskDef) {
		if (taskDef instanceof QuizTaskDef) {
			return Util.createTask(RuntimePackage.eINSTANCE.getQuizTask(), (QuizTaskDef) taskDef);
		}
		return null;
	}
}
