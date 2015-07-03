/**
 */
package no.hal.pg.quiz.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xml Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.model.XmlQuestion#getXml <em>Xml</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.model.ModelPackage#getXmlQuestion()
 * @model
 * @generated
 */
public interface XmlQuestion extends Question {
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
	 * @see no.hal.pg.quiz.model.ModelPackage#getXmlQuestion_Xml()
	 * @model containment="true"
	 * @generated
	 */
	Xml getXml();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.model.XmlQuestion#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(Xml value);

} // XmlQuestion
