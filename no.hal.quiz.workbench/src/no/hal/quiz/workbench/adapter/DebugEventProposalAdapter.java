package no.hal.quiz.workbench.adapter;

import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.ui.IWorkbench;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.workbench.DebugEventAnswer;

public class DebugEventProposalAdapter extends WorkbenchTaskProposalAdapter<DebugEventAnswer> {

	public DebugEventProposalAdapter(TaskProposal<DebugEventAnswer> proposal) {
		super(proposal);
	}

	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		DebugPlugin.getDefault().addDebugEventListener(new DebugEventListener());
	}

	//

	protected class DebugEventListener extends AbstractWorkbenchTaskListener implements IDebugEventSetListener {

		@Override
		public void handleDebugEvents(DebugEvent[] events) {
			String action = null, detail = null;
			for (int i = 0; i < events.length; i++) {
				DebugEvent event = events[i];
				switch (event.getKind()) {
				case DebugEvent.CREATE: 	action = "create"; break;
				case DebugEvent.CHANGE: 	action = "change"; break;
				case DebugEvent.TERMINATE:	action = "terminate"; break;
				case DebugEvent.RESUME: 	action = "resume"; break;
				case DebugEvent.SUSPEND: 	action = "suspend"; break;
				}
				switch (event.getDetail()) {
				case DebugEvent.STEP_INTO: 		action = "stepInto"; break;
				case DebugEvent.STEP_OVER:		action = "stepOver"; break;
				case DebugEvent.STEP_RETURN: 	action = "stepReturn"; break;
				case DebugEvent.STEP_END: 		action = "stepEnd"; break;
				case DebugEvent.BREAKPOINT:		action = "breakpoint"; break;
				case DebugEvent.EVALUATION: 	action = "evaluation"; break;
				}
				handleDebugEvent(event, action, detail);
			}
		}

		private void handleDebugEvent(DebugEvent event, String action, String detail) {
			Object source = event.getSource();
			String elementId = source.getClass().getName();
			if (! taskPerformed(elementId, action + "." + detail)) {
				taskPerformed(elementId, action);
			}
		}
	}
}
