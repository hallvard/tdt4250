/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml PI Answer Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.XmlPIAnswerElement#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getXmlPIAnswerElement()
 * @model
 * @generated
 */
public interface XmlPIAnswerElement extends XmlElement {
	/**
	 * Returns the value of the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' containment reference.
	 * @see #setAnswer(SimpleAnswer)
	 * @see no.hal.quiz.QuizPackage#getXmlPIAnswerElement_Answer()
	 * @model containment="true"
	 * @generated
	 */
	SimpleAnswer<?> getAnswer();

	/**
	 * Sets the value of the '{@link no.hal.quiz.XmlPIAnswerElement#getAnswer <em>Answer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' containment reference.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(SimpleAnswer<?> value);

} // XmlPIAnswerElement
