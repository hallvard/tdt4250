/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.QuizPartRef#getPartRef <em>Part Ref</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getQuizPartRef()
 * @model
 * @generated
 */
public interface QuizPartRef extends AbstractQuizPart {
	/**
	 * Returns the value of the '<em><b>Part Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part Ref</em>' reference.
	 * @see #setPartRef(QuizPart)
	 * @see no.hal.quiz.QuizPackage#getQuizPartRef_PartRef()
	 * @model
	 * @generated
	 */
	QuizPart getPartRef();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QuizPartRef#getPartRef <em>Part Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part Ref</em>' reference.
	 * @see #getPartRef()
	 * @generated
	 */
	void setPartRef(QuizPart value);

} // QuizPartRef
