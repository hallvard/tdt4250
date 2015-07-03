/**
 */
package no.hal.pg.quiz.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.quiz.model.ModelPackage#getAnswer()
 * @model abstract="true"
 * @generated
 */
public interface Answer extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean accept(Object proposal);
} // Answer
