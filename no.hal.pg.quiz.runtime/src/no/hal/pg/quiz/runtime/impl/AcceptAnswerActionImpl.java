/**
 */
package no.hal.pg.quiz.runtime.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.pg.quiz.runtime.AcceptAnswerAction;
import no.hal.pg.quiz.runtime.RuntimePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Answer Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptAnswerActionImpl extends ProposeAnswerActionImpl implements AcceptAnswerAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptAnswerActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ACCEPT_ANSWER_ACTION;
	}

	//
	
	@Override
	public boolean perform() {
		return perform(true);
	}
	
} //AcceptAnswerActionImpl
