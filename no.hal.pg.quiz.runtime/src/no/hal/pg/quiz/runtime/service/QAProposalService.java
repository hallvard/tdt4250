/**
 */
package no.hal.pg.quiz.runtime.service;

import no.hal.pg.quiz.runtime.QAProposal;

import no.hal.pg.runtime.Service;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>QA Proposal Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getProposal <em>Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount <em>Rejected Count</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQAProposalService()
 * @model
 * @generated
 */
public interface QAProposalService extends Service<QAProposal> {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQAProposalService_Question()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getQuestion();

	/**
	 * Returns the value of the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposal</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQAProposalService_Proposal()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getProposal();

	/**
	 * Returns the value of the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accepted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accepted</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQAProposalService_Accepted()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Boolean getAccepted();

	/**
	 * Returns the value of the '<em><b>Rejected Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rejected Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rejected Count</em>' attribute.
	 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQAProposalService_RejectedCount()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getRejectedCount();

} // QAProposalService
