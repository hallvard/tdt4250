/**
 */
package no.hal.quiz.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.SimpleAnswer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SimpleAnswerImpl<T> extends OptionAnswerImpl implements SimpleAnswer<T> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimpleAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.SIMPLE_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getValue() {
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
			case QuizPackage.SIMPLE_ANSWER___GET_VALUE:
				return getValue();
		}
		return super.eInvoke(operationID, arguments);
	}

	//
	
	@Override
	public Boolean accept(Object proposal) {
		return getValue().equals(proposal);
	}

} //SimpleAnswerImpl
