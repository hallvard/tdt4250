/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.StringAnswer#isRegexp <em>Regexp</em>}</li>
 *   <li>{@link no.hal.quiz.StringAnswer#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getStringAnswer()
 * @model superTypes="no.hal.quiz.SimpleAnswer<org.eclipse.emf.ecore.EString>"
 * @generated
 */
public interface StringAnswer extends SimpleAnswer<String> {
	/**
	 * Returns the value of the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regexp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regexp</em>' attribute.
	 * @see #setRegexp(boolean)
	 * @see no.hal.quiz.QuizPackage#getStringAnswer_Regexp()
	 * @model
	 * @generated
	 */
	boolean isRegexp();

	/**
	 * Sets the value of the '{@link no.hal.quiz.StringAnswer#isRegexp <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regexp</em>' attribute.
	 * @see #isRegexp()
	 * @generated
	 */
	void setRegexp(boolean value);

	/**
	 * Returns the value of the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Case</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Case</em>' attribute.
	 * @see #setIgnoreCase(boolean)
	 * @see no.hal.quiz.QuizPackage#getStringAnswer_IgnoreCase()
	 * @model
	 * @generated
	 */
	boolean isIgnoreCase();

	/**
	 * Sets the value of the '{@link no.hal.quiz.StringAnswer#isIgnoreCase <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Case</em>' attribute.
	 * @see #isIgnoreCase()
	 * @generated
	 */
	void setIgnoreCase(boolean value);

} // StringAnswer
