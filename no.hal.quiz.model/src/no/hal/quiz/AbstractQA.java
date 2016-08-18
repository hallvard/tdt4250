/**
 */
package no.hal.quiz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract QA</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.quiz.QuizPackage#getAbstractQA()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQA extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Answer getA();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Question getQ();
} // AbstractQA
