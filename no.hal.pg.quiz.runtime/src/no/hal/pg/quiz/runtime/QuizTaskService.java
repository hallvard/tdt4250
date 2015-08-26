/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.quiz.model.QA;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.TaskService;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQuizTaskService()
 * @model
 * @generated
 */
public interface QuizTaskService extends TaskService<QuizTask> {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean proposeAnswer(Player player, QA qa, String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean acceptAnswer(Player player, QA qa, String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	EList<QAProposal> getQAProposals(Player player);

} // QuizTaskService
