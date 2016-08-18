package no.hal.quiz.views.adapters;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.ProgressBar;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapterImpl;
import no.hal.quiz.TaskProposal;

public abstract class ProgressBarUIAdapter<P extends TaskProposal<?>> extends EObjectUIAdapterImpl<P, ProgressBar> implements ProposalUIAdapter<P, ProgressBar>, MouseListener {

	public ProgressBarUIAdapter(P proposal) {
		super(proposal);
	}

	private static int maxValue = 100;

	@Override
	public ProgressBar initView(Composite parent) {
		ProgressBar progressBar = new ProgressBar(parent, SWT.HORIZONTAL);
		progressBar.setMinimum(0);
		progressBar.setMaximum(maxValue);
		this.view = progressBar;
		updateView();
		return view;
	}

	@Override
	public void updateView() {
		view.setSelection((int) (getProposal().getCompletion() * maxValue));
	}
	
	@Override
	public void updateModel() {
	}
	
	protected void updateModel(int controlNum) {
	}
	
	protected void updateModel(double completion) {
		getProposal().setCompletion(completion);
	}
	
	//

	@Override
	public void mouseDown(MouseEvent e) {
	}
	@Override
	public void mouseUp(MouseEvent e) {
	}
	@Override
	public void mouseDoubleClick(MouseEvent e) {
		updateModel(((double) e.x) / view.getSize().x);
	}
}
