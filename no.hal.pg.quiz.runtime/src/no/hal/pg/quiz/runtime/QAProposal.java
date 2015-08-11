/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.quiz.model.QA;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getQa <em>Qa</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getRejectedCount <em>Rejected Count</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QAProposal#getAnsweredBy <em>Answered By</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='AnsweredByPlayers'"
 * @generated
 */
public interface QAProposal extends Players {
	/**
	 * Returns the value of the '<em><b>Qa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Qa</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Qa</em>' reference.
	 * @see #setQa(QA)
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_Qa()
	 * @model
	 * @generated
	 */
	QA getQa();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QAProposal#getQa <em>Qa</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Qa</em>' reference.
	 * @see #getQa()
	 * @generated
	 */
	void setQa(QA value);

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
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_Proposal()
	 * @model
	 * @generated
	 */
	String getProposal();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QAProposal#getProposal <em>Proposal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Proposal</em>' attribute.
	 * @see #getProposal()
	 * @generated
	 */
	void setProposal(String value);

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
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_Accepted()
	 * @model
	 * @generated
	 */
	Boolean getAccepted();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QAProposal#getAccepted <em>Accepted</em>}' attribute.
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
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_RejectedCount()
	 * @model
	 * @generated
	 */
	int getRejectedCount();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QAProposal#getRejectedCount <em>Rejected Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rejected Count</em>' attribute.
	 * @see #getRejectedCount()
	 * @generated
	 */
	void setRejectedCount(int value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Player}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Players</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' reference list.
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_Players()
	 * @model
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Answered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answered By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answered By</em>' reference.
	 * @see #setAnsweredBy(Player)
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQAProposal_AnsweredBy()
	 * @model
	 * @generated
	 */
	Player getAnsweredBy();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.runtime.QAProposal#getAnsweredBy <em>Answered By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answered By</em>' reference.
	 * @see #getAnsweredBy()
	 * @generated
	 */
	void setAnsweredBy(Player value);

} // QAProposal
