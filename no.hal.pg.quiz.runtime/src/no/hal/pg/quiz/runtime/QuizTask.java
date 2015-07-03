/**
 */
package no.hal.pg.quiz.runtime;

import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.runtime.Task;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTask#getProposals <em>Proposals</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQuizTask()
 * @model
 * @generated
 */
public interface QuizTask extends Task<QuizTaskDef> {
	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.quiz.runtime.QAProposal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see no.hal.pg.quiz.runtime.RuntimePackage#getQuizTask_Proposals()
	 * @model containment="true"
	 * @generated
	 */
	EList<QAProposal> getProposals();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Boolean proposeAnswer(int qaNum, String proposal, boolean accept);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	int getAcceptedAnswerCount();

} // QuizTask
