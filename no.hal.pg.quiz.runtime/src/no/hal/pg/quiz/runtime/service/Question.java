/**
 */
package no.hal.pg.quiz.runtime.service;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getKind <em>Kind</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getOptions <em>Options</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getNumChoices <em>Num Choices</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getQid <em>Qid</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getLastProposal <em>Last Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.Question#getRejectedCount <em>Rejected Count</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion()
 * @model
 * @generated
 */
public interface Question extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.pg.quiz.runtime.service.AnswerKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.AnswerKind
	 * @see #setKind(AnswerKind)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_Kind()
	 * @model
	 * @generated
	 */
	AnswerKind getKind();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.AnswerKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(AnswerKind value);

	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see #setQuestion(String)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_Question()
	 * @model required="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getQuestion <em>Question</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' attribute.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(String value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.quiz.runtime.service.Answer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_Options()
	 * @model containment="true"
	 * @generated
	 */
	EList<Answer> getOptions();

	/**
	 * Returns the value of the '<em><b>Num Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Choices</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Choices</em>' attribute.
	 * @see #setNumChoices(int)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_NumChoices()
	 * @model required="true"
	 * @generated
	 */
	int getNumChoices();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getNumChoices <em>Num Choices</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Choices</em>' attribute.
	 * @see #getNumChoices()
	 * @generated
	 */
	void setNumChoices(int value);

	/**
	 * Returns the value of the '<em><b>Qid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qid</em>' attribute.
	 * @see #setQid(String)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_Qid()
	 * @model
	 * @generated
	 */
	String getQid();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getQid <em>Qid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qid</em>' attribute.
	 * @see #getQid()
	 * @generated
	 */
	void setQid(String value);

	/**
	 * Returns the value of the '<em><b>Last Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Proposal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Proposal</em>' attribute.
	 * @see #setLastProposal(String)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_LastProposal()
	 * @model
	 * @generated
	 */
	String getLastProposal();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getLastProposal <em>Last Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Proposal</em>' attribute.
	 * @see #getLastProposal()
	 * @generated
	 */
	void setLastProposal(String value);

	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see #setAccepted(Boolean)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_Accepted()
	 * @model
	 * @generated
	 */
	Boolean getAccepted();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getAccepted <em>Accepted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accepted</em>' attribute.
	 * @see #getAccepted()
	 * @generated
	 */
	void setAccepted(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rejected Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Count</em>' attribute.
	 * @see #setRejectedCount(int)
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuestion_RejectedCount()
	 * @model
	 * @generated
	 */
	int getRejectedCount();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.service.Question#getRejectedCount <em>Rejected Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Count</em>' attribute.
	 * @see #getRejectedCount()
	 * @generated
	 */
	void setRejectedCount(int value);

} // Question
