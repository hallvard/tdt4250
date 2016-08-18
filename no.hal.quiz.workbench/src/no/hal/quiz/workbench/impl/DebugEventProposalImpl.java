/**
 */
package no.hal.quiz.workbench.impl;

import no.hal.quiz.impl.TaskProposalImpl;

import no.hal.quiz.workbench.DebugEventAnswer;
import no.hal.quiz.workbench.DebugEventProposal;
import no.hal.quiz.workbench.WorkbenchPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Debug Event Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DebugEventProposalImpl extends TaskProposalImpl<DebugEventAnswer> implements DebugEventProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DebugEventProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkbenchPackage.Literals.DEBUG_EVENT_PROPOSAL;
	}

} //DebugEventProposalImpl
