/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.NumberAnswer#getErrorMargin <em>Error Margin</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getNumberAnswer()
 * @model superTypes="no.hal.quiz.SimpleAnswer<org.eclipse.emf.ecore.EDoubleObject>"
 * @generated
 */
public interface NumberAnswer extends SimpleAnswer<Double> {

	/**
	 * Returns the value of the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Margin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Margin</em>' attribute.
	 * @see #setErrorMargin(double)
	 * @see no.hal.quiz.QuizPackage#getNumberAnswer_ErrorMargin()
	 * @model
	 * @generated
	 */
	double getErrorMargin();

	/**
	 * Sets the value of the '{@link no.hal.quiz.NumberAnswer#getErrorMargin <em>Error Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Margin</em>' attribute.
	 * @see #getErrorMargin()
	 * @generated
	 */
	void setErrorMargin(double value);
} // NumberAnswer
