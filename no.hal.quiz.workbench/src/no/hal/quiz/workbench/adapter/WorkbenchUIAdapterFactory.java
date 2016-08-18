package no.hal.quiz.workbench.adapter;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import no.hal.emf.ui.parts.adapters.EObjectUIAdapter;
import no.hal.quiz.TaskProposal;
import no.hal.quiz.workbench.CommandExecutionAnswer;
import no.hal.quiz.workbench.CommandExecutionProposal;
import no.hal.quiz.workbench.DebugEventAnswer;
import no.hal.quiz.workbench.DebugEventProposal;
import no.hal.quiz.workbench.PartTaskAnswer;
import no.hal.quiz.workbench.PartTaskProposal;
import no.hal.quiz.workbench.PerspectiveTaskAnswer;
import no.hal.quiz.workbench.PerspectiveTaskProposal;

public class WorkbenchUIAdapterFactory extends AdapterFactoryImpl {

	@Override
	public boolean isFactoryForType(Object type) {
		return EObjectUIAdapter.class.equals(type);
	}
	
	@Override
	@SuppressWarnings("unchecked")
	protected Adapter createAdapter(Notifier target) {
		if (target instanceof PartTaskProposal) {
			return new PartTaskProposalAdapter((TaskProposal<PartTaskAnswer>) target);
		} else if (target instanceof PerspectiveTaskProposal) {
			return new PerspectiveTaskProposalAdapter((TaskProposal<PerspectiveTaskAnswer>) target);
		} else if (target instanceof CommandExecutionProposal) {
			return new CommandExecutionProposalAdapter((TaskProposal<CommandExecutionAnswer>) target);
		} else if (target instanceof DebugEventProposal) {
			return new DebugEventProposalAdapter((TaskProposal<DebugEventAnswer>) target);
		}
		return null;
	}
}
