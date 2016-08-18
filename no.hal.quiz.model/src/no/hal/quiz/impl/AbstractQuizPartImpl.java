/**
 */
package no.hal.quiz.impl;

import java.lang.reflect.InvocationTargetException;
import no.hal.quiz.AbstractQA;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.quiz.AbstractQuizPart;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPartProposals;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Quiz Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractQuizPartImpl extends MinimalEObjectImpl.Container implements AbstractQuizPart {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractQuizPartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.ABSTRACT_QUIZ_PART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractQA> getQuestions() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartProposals createProposals() {
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
			case QuizPackage.ABSTRACT_QUIZ_PART___GET_QUESTIONS:
				return getQuestions();
			case QuizPackage.ABSTRACT_QUIZ_PART___GET_TITLE:
				return getTitle();
			case QuizPackage.ABSTRACT_QUIZ_PART___CREATE_PROPOSALS:
				return createProposals();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AbstractQuizPartImpl
