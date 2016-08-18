/**
 */
package no.hal.quiz.checkstyle.impl;

import no.hal.quiz.checkstyle.CheckstyleAnswer;
import no.hal.quiz.checkstyle.CheckstylePackage;
import no.hal.quiz.checkstyle.CheckstyleProposal;

import no.hal.quiz.impl.TaskProposalImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class CheckstyleProposalImpl extends TaskProposalImpl<CheckstyleAnswer> implements CheckstyleProposal {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckstyleProposalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckstylePackage.Literals.CHECKSTYLE_PROPOSAL;
	}

} //CheckstyleProposalImpl
