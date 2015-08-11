/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.quiz.model.QA;

import no.hal.pg.runtime.Ref;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QARef#getQaNum <em>Qa Num</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQARef()
 * @model
 * @generated
 */
public interface QARef extends Ref<QA> {
	/**
	 * Returns the value of the '<em><b>Qa Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa Num</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qa Num</em>' attribute.
	 * @see #setQaNum(int)
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQARef_QaNum()
	 * @model
	 * @generated
	 */
	int getQaNum();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QARef#getQaNum <em>Qa Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa Num</em>' attribute.
	 * @see #getQaNum()
	 * @generated
	 */
	void setQaNum(int value);

} // QARef
