package no.hal.quiz.views.adapters;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.quiz.BooleanAnswer;
import no.hal.quiz.NumberAnswer;
import no.hal.quiz.OptionsProposal;
import no.hal.quiz.QuizPartProposals;
import no.hal.quiz.QuizProposals;
import no.hal.quiz.SimpleAnswer;
import no.hal.quiz.SimpleProposal;
import no.hal.quiz.StringAnswer;

public class QuizUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof QuizProposals) {
			return new QuizProposalsUIAdapter((QuizProposals) target);
		} else if (target instanceof QuizPartProposals) {
			return new QuizPartProposalsUIAdapter((QuizPartProposals) target);
		} else if (target instanceof SimpleProposal<?>) {
			SimpleAnswer<?> answer = ((SimpleProposal<?>) target).getAnswer();
			if (answer instanceof BooleanAnswer) {
				return new BooleanProposalUIAdapter((SimpleProposal<BooleanAnswer>) target);
			} else if (answer instanceof StringAnswer) {
				return new StringProposalAdapter((SimpleProposal<StringAnswer>) target);
			} else if (answer instanceof NumberAnswer) {
				return new NumberProposalUIAdapter((SimpleProposal<NumberAnswer>) target);
			}
		} else if (target instanceof OptionsProposal) {
			return new OptionsProposalUIAdapter((OptionsProposal) target);
		}
		return null;
	}
}
