/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.SimpleAnswer#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getSimpleAnswer()
 * @model abstract="true"
 * @generated
 */
public interface SimpleAnswer<T> extends OptionAnswer {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(Object)
	 * @see no.hal.quiz.QuizPackage#getSimpleAnswer_Value()
	 * @model
	 * @generated
	 */
	T getValue();

	/**
	 * Sets the value of the '{@link no.hal.quiz.SimpleAnswer#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(T value);

} // SimpleAnswer
