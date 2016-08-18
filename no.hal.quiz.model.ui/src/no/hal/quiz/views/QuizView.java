package no.hal.quiz.views;

import no.hal.emf.ui.parts.EObjectsView;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizProposals;

public class QuizView extends EObjectsView {
	
	public void addQuiz(QuizProposals proposals) {
		super.addEObject(proposals);
	}

	public void addQuiz(Quiz quiz) {
		addQuiz(quiz.createProposals());
	}
}
