/**
 */
package no.hal.pg.quiz.runtime;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.runtime.RuntimeFactory
 * @model kind="package"
 * @generated
 */
public interface RuntimePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "runtime";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.quiz.runtime/model/quiz-runtime.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quiz-runtime";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimePackage eINSTANCE = no.hal.pg.quiz.runtime.impl.RuntimePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.impl.QuizTaskImpl <em>Quiz Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.impl.QuizTaskImpl
	 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getQuizTask()
	 * @generated
	 */
	int QUIZ_TASK = 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__SERVICES = no.hal.pg.runtime.RuntimePackage.TASK__SERVICES;

	/**
	 * The feature id for the '<em><b>Task Def</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__TASK_DEF = no.hal.pg.runtime.RuntimePackage.TASK__TASK_DEF;

	/**
	 * The feature id for the '<em><b>Game</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__GAME = no.hal.pg.runtime.RuntimePackage.TASK__GAME;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK__PLAYERS;

	/**
	 * The feature id for the '<em><b>Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__CURRENT_STATE = no.hal.pg.runtime.RuntimePackage.TASK__CURRENT_STATE;

	/**
	 * The feature id for the '<em><b>Past States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__PAST_STATES = no.hal.pg.runtime.RuntimePackage.TASK__PAST_STATES;

	/**
	 * The feature id for the '<em><b>Result</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__RESULT = no.hal.pg.runtime.RuntimePackage.TASK__RESULT;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK__PROPOSALS = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quiz Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___GET_PLAYERS = no.hal.pg.runtime.RuntimePackage.TASK___GET_PLAYERS;

	/**
	 * The operation id for the '<em>Is Started</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___IS_STARTED = no.hal.pg.runtime.RuntimePackage.TASK___IS_STARTED;

	/**
	 * The operation id for the '<em>Is Finished</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___IS_FINISHED = no.hal.pg.runtime.RuntimePackage.TASK___IS_FINISHED;

	/**
	 * The operation id for the '<em>Start</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___START = no.hal.pg.runtime.RuntimePackage.TASK___START;

	/**
	 * The operation id for the '<em>Change State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___CHANGE_STATE__TASKSTATE = no.hal.pg.runtime.RuntimePackage.TASK___CHANGE_STATE__TASKSTATE;

	/**
	 * The operation id for the '<em>Is In State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___IS_IN_STATE__ECLASS = no.hal.pg.runtime.RuntimePackage.TASK___IS_IN_STATE__ECLASS;

	/**
	 * The operation id for the '<em>Finish</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___FINISH__OBJECT = no.hal.pg.runtime.RuntimePackage.TASK___FINISH__OBJECT;

	/**
	 * The operation id for the '<em>Propose Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___PROPOSE_ANSWER__QA_STRING_BOOLEAN = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Accepted Answer Count</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK___GET_ACCEPTED_ANSWER_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quiz Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.impl.AcceptingAnswerStateImpl <em>Accepting Answer State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.impl.AcceptingAnswerStateImpl
	 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getAcceptingAnswerState()
	 * @generated
	 */
	int ACCEPTING_ANSWER_STATE = 1;

	/**
	 * The feature id for the '<em><b>Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE__SERVICES = no.hal.pg.runtime.RuntimePackage.TASK_STATE__SERVICES;

	/**
	 * The feature id for the '<em><b>Task</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE__TASK = no.hal.pg.runtime.RuntimePackage.TASK_STATE__TASK;

	/**
	 * The feature id for the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE__ENTERED = no.hal.pg.runtime.RuntimePackage.TASK_STATE__ENTERED;

	/**
	 * The feature id for the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE__EXITED = no.hal.pg.runtime.RuntimePackage.TASK_STATE__EXITED;

	/**
	 * The number of structural features of the '<em>Accepting Answer State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Accepting Answer State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPTING_ANSWER_STATE_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.TASK_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl <em>QA Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.impl.QAProposalImpl
	 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getQAProposal()
	 * @generated
	 */
	int QA_PROPOSAL = 2;

	/**
	 * The feature id for the '<em><b>Qa</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__QA = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__PROPOSAL = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__ACCEPTED = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rejected Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__REJECTED_COUNT = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Players</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__PLAYERS = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Answered By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL__ANSWERED_BY = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>QA Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_FEATURE_COUNT = no.hal.pg.runtime.RuntimePackage.PLAYERS_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Get Players</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL___GET_PLAYERS = no.hal.pg.runtime.RuntimePackage.PLAYERS___GET_PLAYERS;

	/**
	 * The number of operations of the '<em>QA Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_OPERATION_COUNT = no.hal.pg.runtime.RuntimePackage.PLAYERS_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.QuizTask <em>Quiz Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Task</em>'.
	 * @see no.hal.pg.quiz.runtime.QuizTask
	 * @generated
	 */
	EClass getQuizTask();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.runtime.QuizTask#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see no.hal.pg.quiz.runtime.QuizTask#getProposals()
	 * @see #getQuizTask()
	 * @generated
	 */
	EReference getQuizTask_Proposals();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(no.hal.pg.quiz.model.QA, java.lang.String, boolean) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(no.hal.pg.quiz.model.QA, java.lang.String, boolean)
	 * @generated
	 */
	EOperation getQuizTask__ProposeAnswer__QA_String_boolean();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.QuizTask#getAcceptedAnswerCount() <em>Get Accepted Answer Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accepted Answer Count</em>' operation.
	 * @see no.hal.pg.quiz.runtime.QuizTask#getAcceptedAnswerCount()
	 * @generated
	 */
	EOperation getQuizTask__GetAcceptedAnswerCount();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.AcceptingAnswerState <em>Accepting Answer State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accepting Answer State</em>'.
	 * @see no.hal.pg.quiz.runtime.AcceptingAnswerState
	 * @generated
	 */
	EClass getAcceptingAnswerState();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.QAProposal <em>QA Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Proposal</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal
	 * @generated
	 */
	EClass getQAProposal();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.quiz.runtime.QAProposal#getQa <em>Qa</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qa</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getQa()
	 * @see #getQAProposal()
	 * @generated
	 */
	EReference getQAProposal_Qa();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.QAProposal#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getProposal()
	 * @see #getQAProposal()
	 * @generated
	 */
	EAttribute getQAProposal_Proposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.QAProposal#getAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getAccepted()
	 * @see #getQAProposal()
	 * @generated
	 */
	EAttribute getQAProposal_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.QAProposal#getRejectedCount <em>Rejected Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejected Count</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getRejectedCount()
	 * @see #getQAProposal()
	 * @generated
	 */
	EAttribute getQAProposal_RejectedCount();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.quiz.runtime.QAProposal#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Players</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getPlayers()
	 * @see #getQAProposal()
	 * @generated
	 */
	EReference getQAProposal_Players();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.quiz.runtime.QAProposal#getAnsweredBy <em>Answered By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answered By</em>'.
	 * @see no.hal.pg.quiz.runtime.QAProposal#getAnsweredBy()
	 * @see #getQAProposal()
	 * @generated
	 */
	EReference getQAProposal_AnsweredBy();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RuntimeFactory getRuntimeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.impl.QuizTaskImpl <em>Quiz Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.impl.QuizTaskImpl
		 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getQuizTask()
		 * @generated
		 */
		EClass QUIZ_TASK = eINSTANCE.getQuizTask();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_TASK__PROPOSALS = eINSTANCE.getQuizTask_Proposals();

		/**
		 * The meta object literal for the '<em><b>Propose Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK___PROPOSE_ANSWER__QA_STRING_BOOLEAN = eINSTANCE.getQuizTask__ProposeAnswer__QA_String_boolean();

		/**
		 * The meta object literal for the '<em><b>Get Accepted Answer Count</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK___GET_ACCEPTED_ANSWER_COUNT = eINSTANCE.getQuizTask__GetAcceptedAnswerCount();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.impl.AcceptingAnswerStateImpl <em>Accepting Answer State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.impl.AcceptingAnswerStateImpl
		 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getAcceptingAnswerState()
		 * @generated
		 */
		EClass ACCEPTING_ANSWER_STATE = eINSTANCE.getAcceptingAnswerState();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.impl.QAProposalImpl <em>QA Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.impl.QAProposalImpl
		 * @see no.hal.pg.quiz.runtime.impl.RuntimePackageImpl#getQAProposal()
		 * @generated
		 */
		EClass QA_PROPOSAL = eINSTANCE.getQAProposal();

		/**
		 * The meta object literal for the '<em><b>Qa</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA_PROPOSAL__QA = eINSTANCE.getQAProposal_Qa();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL__PROPOSAL = eINSTANCE.getQAProposal_Proposal();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL__ACCEPTED = eINSTANCE.getQAProposal_Accepted();

		/**
		 * The meta object literal for the '<em><b>Rejected Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL__REJECTED_COUNT = eINSTANCE.getQAProposal_RejectedCount();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA_PROPOSAL__PLAYERS = eINSTANCE.getQAProposal_Players();

		/**
		 * The meta object literal for the '<em><b>Answered By</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA_PROPOSAL__ANSWERED_BY = eINSTANCE.getQAProposal_AnsweredBy();

	}

} //RuntimePackage
