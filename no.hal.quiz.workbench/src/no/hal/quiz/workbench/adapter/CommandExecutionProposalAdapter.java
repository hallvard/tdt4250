package no.hal.quiz.workbench.adapter;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IExecutionListener;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.commands.ICommandService;

import no.hal.quiz.TaskProposal;
import no.hal.quiz.workbench.CommandExecutionAnswer;

public class CommandExecutionProposalAdapter extends WorkbenchTaskProposalAdapter<CommandExecutionAnswer> {

	public CommandExecutionProposalAdapter(TaskProposal<CommandExecutionAnswer> proposal) {
		super(proposal);
	}

	@Override
	protected void addWorkbenchListeners(IWorkbench workbench) {
		workbench.getAdapter(ICommandService.class).addExecutionListener(new CommandExecutionListener());
	}

	//

	protected class CommandExecutionListener extends AbstractWorkbenchTaskListener implements IExecutionListener {

		@Override
		public void notHandled(String commandId, NotHandledException exception) {
		}

		@Override
		public void postExecuteFailure(String commandId, ExecutionException exception) {
			taskPerformed(commandId, "executeFailure");
		}

		@Override
		public void postExecuteSuccess(String commandId, Object returnValue) {
			taskPerformed(commandId, "executeSuccess");
		}

		@Override
		public void preExecute(String commandId, ExecutionEvent event) {
		}
	}
}
