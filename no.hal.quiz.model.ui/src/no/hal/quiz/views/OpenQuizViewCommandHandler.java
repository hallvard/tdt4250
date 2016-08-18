package no.hal.quiz.views;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.ui.PartInitException;

import no.hal.emf.ui.commands.EmfResourceObjectsCommandHandler;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;

public class OpenQuizViewCommandHandler extends EmfResourceObjectsCommandHandler<Quiz> {

	@Override
	protected EClass getEObjectClass() {
		return QuizPackage.eINSTANCE.getQuiz();
	}
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		return super.execute(event);
	}

	@Override
	protected void execute(IFile file, Quiz quiz, IContainer target) throws ExecutionException {
		try {
			QuizView view = (QuizView) activeWindow.getActivePage().showView(QuizView.class.getName());
			view.addQuiz(quiz);
		} catch (PartInitException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public boolean isEnabled() {
		return super.isEnabled();
	}

	@Override
	protected IContainer getTargetContainer(IFile resource) {
		return null;
	}

	@Override
	protected boolean isEmfFileExtension(String ext) {
		return "quiz".equals(ext);
	}
}
