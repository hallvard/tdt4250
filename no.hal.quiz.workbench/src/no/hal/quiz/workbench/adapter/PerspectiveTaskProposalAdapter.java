package no.hal.quiz.workbench.adapter;

import org.eclipse.ui.IPerspectiveDescriptor;
import org.eclipse.ui.IPerspectiveListener;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.workbench.PerspectiveTaskAnswer;

public class PerspectiveTaskProposalAdapter extends WorkbenchTaskProposalAdapter<PerspectiveTaskAnswer> {

	public PerspectiveTaskProposalAdapter(TaskProposal<PerspectiveTaskAnswer> proposal) {
		super(proposal);
	}

	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		workbench.getActiveWorkbenchWindow().addPerspectiveListener(new PerspectiveActivationListener());
	}

	//

	protected class PerspectiveActivationListener extends AbstractWorkbenchTaskListener implements IPerspectiveListener {

		private String getId(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
			return perspective.getId();
		}

		@Override
		public void perspectiveActivated(IWorkbenchPage page, IPerspectiveDescriptor perspective) {
			taskPerformed(getId(page, perspective), "activated");
		}

		@Override
		public void perspectiveChanged(IWorkbenchPage page, IPerspectiveDescriptor perspective, String changeId) {
			taskPerformed(getId(page, perspective), "changed");
		}
	}
}
