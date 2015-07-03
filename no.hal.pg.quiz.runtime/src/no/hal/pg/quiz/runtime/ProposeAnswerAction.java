/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.runtime.TaskAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Propose Answer Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.ProposeAnswerAction#getQaNum <em>Qa Num</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.ProposeAnswerAction#getProposal <em>Proposal</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.RuntimePackage#getProposeAnswerAction()
 * @model
 * @generated
 */
public interface ProposeAnswerAction extends TaskAction<QuizTask> {
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
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getProposeAnswerAction_QaNum()
	 * @model
	 * @generated
	 */
	int getQaNum();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.ProposeAnswerAction#getQaNum <em>Qa Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa Num</em>' attribute.
	 * @see #getQaNum()
	 * @generated
	 */
	void setQaNum(int value);

	/**
	 * Returns the value of the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposal</em>' attribute.
	 * @see #setProposal(String)
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getProposeAnswerAction_Proposal()
	 * @model
	 * @generated
	 */
	String getProposal();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.ProposeAnswerAction#getProposal <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposal</em>' attribute.
	 * @see #getProposal()
	 * @generated
	 */
	void setProposal(String value);

} // ProposeAnswerAction
