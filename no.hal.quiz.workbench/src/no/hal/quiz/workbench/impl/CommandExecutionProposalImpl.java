/**
 */
package no.hal.quiz.workbench.impl;

import no.hal.quiz.impl.TaskProposalImpl;

import no.hal.quiz.workbench.CommandExecutionAnswer;
import no.hal.quiz.workbench.CommandExecutionProposal;
import no.hal.quiz.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Command Execution Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CommandExecutionProposalImpl extends TaskProposalImpl<CommandExecutionAnswer> implements CommandExecutionProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandExecutionProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.COMMAND_EXECUTION_PROPOSAL;
	}

} //CommandExecutionProposalImpl
