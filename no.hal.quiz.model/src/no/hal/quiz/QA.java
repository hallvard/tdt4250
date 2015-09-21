/**
 */
package no.hal.quiz;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.QA#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.quiz.QA#getQ <em>Q</em>}</li>
 *   <li>{@link no.hal.quiz.QA#getA <em>A</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getQA()
 * @model
 * @generated
 */
public interface QA extends AbstractQA {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.quiz.QuizPackage#getQA_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QA#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Q</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Q</em>' containment reference.
	 * @see #setQ(Question)
	 * @see no.hal.quiz.QuizPackage#getQA_Q()
	 * @model containment="true"
	 * @generated
	 */
	Question getQ();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QA#getQ <em>Q</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' containment reference.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Question value);

	/**
	 * Returns the value of the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>A</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>A</em>' containment reference.
	 * @see #setA(Answer)
	 * @see no.hal.quiz.QuizPackage#getQA_A()
	 * @model containment="true"
	 * @generated
	 */
	Answer getA();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QA#getA <em>A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>A</em>' containment reference.
	 * @see #getA()
	 * @generated
	 */
	void setA(Answer value);

} // QA
