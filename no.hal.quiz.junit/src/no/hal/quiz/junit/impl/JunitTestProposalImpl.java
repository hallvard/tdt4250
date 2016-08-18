/**
 */
package no.hal.quiz.junit.impl;

import no.hal.quiz.impl.TaskProposalImpl;

import no.hal.quiz.junit.JunitPackage;
import no.hal.quiz.junit.JunitTestAnswer;
import no.hal.quiz.junit.JunitTestProposal;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JunitTestProposalImpl extends TaskProposalImpl<JunitTestAnswer> implements JunitTestProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JunitTestProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JunitPackage.Literals.JUNIT_TEST_PROPOSAL;
	}

} //JunitTestProposalImpl
