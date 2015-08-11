/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.quiz.model.QA;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Ref;
import no.hal.pg.runtime.TaskService;

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
	Boolean proposeAnswer(Ref<Player> playerRef, Ref<QA> qaRef, String proposal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean acceptAnswer(Ref<Player> playerRef, Ref<QA> qaRef, String proposal);

} // QuizTaskService
