/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.TaskAnswer#getRequiredCount <em>Required Count</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getTaskAnswer()
 * @model
 * @generated
 */
public interface TaskAnswer extends Answer {

	/**
	 * Returns the value of the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required Count</em>' attribute.
	 * @see #setRequiredCount(int)
	 * @see no.hal.quiz.QuizPackage#getTaskAnswer_RequiredCount()
	 * @model
	 * @generated
	 */
	int getRequiredCount();

	/**
	 * Sets the value of the '{@link no.hal.quiz.TaskAnswer#getRequiredCount <em>Required Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Required Count</em>' attribute.
	 * @see #getRequiredCount()
	 * @generated
	 */
	void setRequiredCount(int value);

} // TaskAnswer
