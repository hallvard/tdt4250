package no.hal.quiz.checkstyle.adapter;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.checkstyle.CheckstyleAnswer;
import no.hal.quiz.views.adapters.TaskProgressProposalAdapter;

public class CheckstyleProposalAdapter extends TaskProgressProposalAdapter<TaskProposal<CheckstyleAnswer>> {

	private String markerType = "net.sf.eclipsecs.core.CheckstyleMarker";
	
	public CheckstyleProposalAdapter(TaskProposal<CheckstyleAnswer> proposal) {
		super(proposal);
	}

	@Override
	public ProgressBar initView(final Composite parent) {
		return super.initView(parent);
	}
}
