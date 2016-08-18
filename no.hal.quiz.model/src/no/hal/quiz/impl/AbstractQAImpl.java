/**
 */
package no.hal.quiz.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.quiz.AbstractQA;
import no.hal.quiz.Answer;
import no.hal.quiz.Question;
import no.hal.quiz.QuizPackage;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract QA</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractQAImpl extends MinimalEObjectImpl.Container implements AbstractQA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractQAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.ABSTRACT_QA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Answer getA() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question getQ() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case QuizPackage.ABSTRACT_QA___GET_A:
				return getA();
			case QuizPackage.ABSTRACT_QA___GET_Q:
				return getQ();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractQAImpl
