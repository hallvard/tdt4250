/**
 */
package no.hal.pg.quiz.runtime.impl;

import no.hal.pg.quiz.runtime.AcceptingAnswerState;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;

import no.hal.pg.runtime.impl.TaskStateImpl;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accepting Answer State</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptingAnswerStateImpl extends TaskStateImpl<QuizTask> implements AcceptingAnswerState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptingAnswerStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.ACCEPTING_ANSWER_STATE;
	}

} //AcceptingAnswerStateImpl
