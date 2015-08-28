package no.hal.pg.quiz.runtime.engine;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.model.util.Util;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.runtime.engine.IReferenceHandler;

@Component
public class QAProposalReferenceHandler implements IReferenceHandler {

	@Override
	public String getReference(EObject eObject, EObject context) {
		return String.valueOf(Util.indexOf(eObject));
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		try {
			int num = Integer.valueOf(reference);
			if (context instanceof QuizTaskService) {
				context = ((QuizTaskService) context).getContext();
			}
			if (context instanceof QuizTask) {
				EList<QAProposal> proposals = ((QuizTask) context).getProposals();
				if (proposals.size() > num) {
					return proposals.get(num).getQa();
				}
			}
		} catch (NumberFormatException e) {
		}
		return null;
	}
}
