package no.hal.pg.quiz.runtime.engine;

import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IServiceProvider;
import no.hal.pg.runtime.util.Util;

@Component
public class QuizServiceProvider implements IServiceProvider {

	@Override
	public Service<?> getService(EObject eObject) {
		if (eObject instanceof QuizTask) {
			return Util.createService(ServicePackage.eINSTANCE.getQuizTaskService(), (QuizTask) eObject);
		} else if (eObject instanceof QAProposal) {
			return Util.createService(ServicePackage.eINSTANCE.getQAProposalService(), (QAProposal) eObject);
		}
		return null;
	}
}
