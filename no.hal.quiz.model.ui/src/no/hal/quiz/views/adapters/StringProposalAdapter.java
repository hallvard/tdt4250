package no.hal.quiz.views.adapters;

import org.eclipse.swt.events.ModifyListener;

import no.hal.quiz.SimpleProposal;
import no.hal.quiz.StringAnswer;

public class StringProposalAdapter extends TextProposalUIAdapter<SimpleProposal<StringAnswer>> implements ModifyListener {

	public StringProposalAdapter(SimpleProposal<StringAnswer> proposal) {
		super(proposal);
		format = proposal.getAnswer().getFormat();
	}

	@Override
	protected void setModel(Object o) {
		getProposal().setProposal(String.valueOf(o));
	}
}
