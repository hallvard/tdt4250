package no.hal.quiz.views.adapters;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.quiz.TaskProposal;

public class TaskProgressProposalAdapter<P extends TaskProposal<?>> extends ProgressBarUIAdapter<P> implements ProposalUIAdapter<P, ProgressBar> {

	public TaskProgressProposalAdapter(P proposal) {
		super(proposal);
	}
	
	@Override
	public P getProposal() {
		return eObject;
	}

	//
	
	protected boolean editable = true;

	@Override
	public ProgressBar initView(Composite parent) {
		ProgressBar control = super.initView(parent);
		if (editable) {
			control.addMouseListener(this);
		}
		return control;
	}
}
