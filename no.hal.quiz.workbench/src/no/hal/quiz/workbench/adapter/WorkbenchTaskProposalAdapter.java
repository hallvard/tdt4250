package no.hal.quiz.workbench.adapter;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PlatformUI;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.views.adapters.TaskProposalUIAdapter;
import no.hal.quiz.workbench.WorkbenchTaskAnswer;

public abstract class WorkbenchTaskProposalAdapter<A extends WorkbenchTaskAnswer> extends TaskProposalUIAdapter<A> {

	public WorkbenchTaskProposalAdapter(TaskProposal<A> proposal) {
		super(proposal);
	}

	@Override
	public Composite initView(final Composite parent) {
		addWorkbenchListeners(PlatformUI.getWorkbench());
		return super.initView(parent);
	}

	protected abstract void addWorkbenchListeners(IWorkbench workbench);

	//

	protected class AbstractWorkbenchTaskListener implements Runnable {

		private int performedCount = 0;
		
		protected boolean taskPerformed(String id, String action) {
			String answerElement = getProposal().getAnswer().getElementId();
			String answerAction = getProposal().getAnswer().getAction();
			boolean performed = (answerElement == null || answerElement.equals(id)) && (answerAction == null || answerAction.equals(action));
			if (performed) {
				performedCount++;
				updateProposal();
			}
			return performed;
		}

		protected void updateProposal() {
			getView().getDisplay().asyncExec(this);
		}

		@Override
		public void run() {
			getProposal().setPerformedCount(this.performedCount);
			getProposal().setCompletion(((double) getProposal().getAnswer().getRequiredCount()) / this.performedCount);
		}
	}
}
