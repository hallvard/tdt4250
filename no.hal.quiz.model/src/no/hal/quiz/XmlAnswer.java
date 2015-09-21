/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.XmlAnswer#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getXmlAnswer()
 * @model
 * @generated
 */
public interface XmlAnswer extends OptionAnswer {
	/**
	 * Returns the value of the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(Xml)
	 * @see no.hal.quiz.QuizPackage#getXmlAnswer_Xml()
	 * @model containment="true"
	 * @generated
	 */
	Xml getXml();

	/**
	 * Sets the value of the '{@link no.hal.quiz.XmlAnswer#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(Xml value);

} // XmlAnswer
