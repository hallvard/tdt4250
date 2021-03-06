/**
 */
package no.hal.pg.quiz.runtime.service;

import org.eclipse.emf.common.util.EList;

import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.SubjectService;
import no.hal.quiz.QA;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.quiz.runtime.service.ServicePackage#getQuizTaskService()
 * @model
 * @generated
 */
public interface QuizTaskService extends SubjectService<QuizTask> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean proposeAnswer(QA qa, String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean acceptAnswer(QA qa, String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<Question> acceptAllProposals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<QAProposal> getQAProposals(Player player);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Question> getPlayerQuestions();

} // QuizTaskService
