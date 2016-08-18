/**
 */
package no.hal.quiz;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Quiz Part</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.quiz.QuizPackage#getAbstractQuizPart()
 * @model abstract="true"
 * @generated
 */
public interface AbstractQuizPart extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<AbstractQA> getQuestions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	String getTitle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	QuizPartProposals createProposals();
} // AbstractQuizPart
