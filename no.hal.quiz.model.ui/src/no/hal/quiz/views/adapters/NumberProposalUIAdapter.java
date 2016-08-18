package no.hal.quiz.views.adapters;

import org.eclipse.swt.events.ModifyListener;

import no.hal.quiz.NumberAnswer;
import no.hal.quiz.SimpleProposal;

public class NumberProposalUIAdapter extends TextProposalUIAdapter<SimpleProposal<NumberAnswer>> implements ModifyListener {

	public NumberProposalUIAdapter(SimpleProposal<NumberAnswer> proposal) {
		super(proposal);
		format = "\\d+(\\.\\d+)?";
	}

	@Override
	protected void setModel(Object o) {
		Number num = (Number) o;
		getProposal().setProposal(num.doubleValue());
	}

	@Override
	protected Object getViewValue(String s) {
		try {
			return Double.valueOf(s);
		} catch (NumberFormatException e) {
			return null;
		}
	}
}
