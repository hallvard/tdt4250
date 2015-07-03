package no.hal.pg.quiz.runtime.engine;

import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.engine.AbstractTaskEngine;

public class QuizEngine extends AbstractTaskEngine<QuizTaskDef, QuizTask> {

	public QuizEngine(QuizTaskDef quizTaskDef) {
		super(quizTaskDef);
	}
	
	@Override
	public Task<QuizTaskDef> prepare() {
		return super.prepare(RuntimeFactory.eINSTANCE.createQuizTask());
	}
}
