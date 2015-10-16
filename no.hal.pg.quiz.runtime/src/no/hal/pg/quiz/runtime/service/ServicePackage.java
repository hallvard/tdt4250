/**
 */
package no.hal.pg.quiz.runtime.service;

import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see no.hal.pg.quiz.runtime.service.ServiceFactory
 * @model kind="package"
 * @generated
 */
public interface ServicePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "service";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.quiz.runtime/model/quiz-service.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quiz-service";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicePackage eINSTANCE = no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.service.impl.QuizTaskServiceImpl <em>Quiz Task Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.impl.QuizTaskServiceImpl
	 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQuizTaskService()
	 * @generated
	 */
	int QUIZ_TASK_SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The number of structural features of the '<em>Quiz Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Propose Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___PROPOSE_ANSWER__PLAYER_QA_STRING = RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept Answer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___ACCEPT_ANSWER__PLAYER_QA_STRING = RuntimePackage.SERVICE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept All Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___ACCEPT_ALL_PROPOSALS__PLAYER = RuntimePackage.SERVICE_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Get QA Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER = RuntimePackage.SERVICE_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Player Questions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___GET_PLAYER_QUESTIONS__PLAYER = RuntimePackage.SERVICE_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Quiz Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 5;


	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl <em>QA Proposal Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl
	 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQAProposalService()
	 * @generated
	 */
	int QA_PROPOSAL_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE__CONTEXT = RuntimePackage.SERVICE__CONTEXT;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE__QUESTION = RuntimePackage.SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE__PROPOSAL = RuntimePackage.SERVICE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE__ACCEPTED = RuntimePackage.SERVICE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Rejected Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE__REJECTED_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>QA Proposal Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE_FEATURE_COUNT = RuntimePackage.SERVICE_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>QA Proposal Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_PROPOSAL_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.impl.QuestionImpl
	 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 2;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__KIND = 0;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QUESTION = 1;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__OPTIONS = 2;

	/**
	 * The feature id for the '<em><b>Num Choices</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NUM_CHOICES = 3;

	/**
	 * The feature id for the '<em><b>Qid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__QID = 4;

	/**
	 * The feature id for the '<em><b>Last Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__LAST_PROPOSAL = 5;

	/**
	 * The feature id for the '<em><b>Accepted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ACCEPTED = 6;

	/**
	 * The feature id for the '<em><b>Rejected Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__REJECTED_COUNT = 7;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.service.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.impl.AnswerImpl
	 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 3;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER__SELECTED = 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.runtime.service.AnswerKind <em>Answer Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.AnswerKind
	 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getAnswerKind()
	 * @generated
	 */
	int ANSWER_KIND = 4;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.service.QuizTaskService <em>Quiz Task Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Task Service</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService
	 * @generated
	 */
	EClass getQuizTaskService();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String)
	 * @generated
	 */
	EOperation getQuizTaskService__ProposeAnswer__Player_QA_String();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String) <em>Accept Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Answer</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String)
	 * @generated
	 */
	EOperation getQuizTaskService__AcceptAnswer__Player_QA_String();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAllProposals(no.hal.pg.runtime.Player) <em>Accept All Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept All Proposals</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAllProposals(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getQuizTaskService__AcceptAllProposals__Player();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player) <em>Get QA Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get QA Proposals</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getQuizTaskService__GetQAProposals__Player();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getPlayerQuestions(no.hal.pg.runtime.Player) <em>Get Player Questions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Player Questions</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#getPlayerQuestions(no.hal.pg.runtime.Player)
	 * @generated
	 */
	EOperation getQuizTaskService__GetPlayerQuestions__Player();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.service.QAProposalService <em>QA Proposal Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Proposal Service</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService
	 * @generated
	 */
	EClass getQAProposalService();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion()
	 * @see #getQAProposalService()
	 * @generated
	 */
	EAttribute getQAProposalService_Question();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getProposal()
	 * @see #getQAProposalService()
	 * @generated
	 */
	EAttribute getQAProposalService_Proposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted()
	 * @see #getQAProposalService()
	 * @generated
	 */
	EAttribute getQAProposalService_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount <em>Rejected Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejected Count</em>'.
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount()
	 * @see #getQAProposalService()
	 * @generated
	 */
	EAttribute getQAProposalService_RejectedCount();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.service.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getKind()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Kind();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getQuestion()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Question();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.runtime.service.Question#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getOptions()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Options();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getNumChoices <em>Num Choices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Choices</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getNumChoices()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_NumChoices();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getQid <em>Qid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Qid</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getQid()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Qid();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getLastProposal <em>Last Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Proposal</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getLastProposal()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_LastProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getAccepted <em>Accepted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accepted</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getAccepted()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Accepted();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Question#getRejectedCount <em>Rejected Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rejected Count</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Question#getRejectedCount()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_RejectedCount();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.runtime.service.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Answer#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Answer</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Answer#getAnswer()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Answer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.runtime.service.Answer#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see no.hal.pg.quiz.runtime.service.Answer#isSelected()
	 * @see #getAnswer()
	 * @generated
	 */
	EAttribute getAnswer_Selected();

	/**
	 * Returns the meta object for enum '{@link no.hal.pg.quiz.runtime.service.AnswerKind <em>Answer Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Answer Kind</em>'.
	 * @see no.hal.pg.quiz.runtime.service.AnswerKind
	 * @generated
	 */
	EEnum getAnswerKind();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServiceFactory getServiceFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.service.impl.QuizTaskServiceImpl <em>Quiz Task Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.service.impl.QuizTaskServiceImpl
		 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQuizTaskService()
		 * @generated
		 */
		EClass QUIZ_TASK_SERVICE = eINSTANCE.getQuizTaskService();

		/**
		 * The meta object literal for the '<em><b>Propose Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___PROPOSE_ANSWER__PLAYER_QA_STRING = eINSTANCE.getQuizTaskService__ProposeAnswer__Player_QA_String();

		/**
		 * The meta object literal for the '<em><b>Accept Answer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___ACCEPT_ANSWER__PLAYER_QA_STRING = eINSTANCE.getQuizTaskService__AcceptAnswer__Player_QA_String();

		/**
		 * The meta object literal for the '<em><b>Accept All Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___ACCEPT_ALL_PROPOSALS__PLAYER = eINSTANCE.getQuizTaskService__AcceptAllProposals__Player();

		/**
		 * The meta object literal for the '<em><b>Get QA Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER = eINSTANCE.getQuizTaskService__GetQAProposals__Player();

		/**
		 * The meta object literal for the '<em><b>Get Player Questions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___GET_PLAYER_QUESTIONS__PLAYER = eINSTANCE.getQuizTaskService__GetPlayerQuestions__Player();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl <em>QA Proposal Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.service.impl.QAProposalServiceImpl
		 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQAProposalService()
		 * @generated
		 */
		EClass QA_PROPOSAL_SERVICE = eINSTANCE.getQAProposalService();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL_SERVICE__QUESTION = eINSTANCE.getQAProposalService_Question();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL_SERVICE__PROPOSAL = eINSTANCE.getQAProposalService_Proposal();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL_SERVICE__ACCEPTED = eINSTANCE.getQAProposalService_Accepted();

		/**
		 * The meta object literal for the '<em><b>Rejected Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA_PROPOSAL_SERVICE__REJECTED_COUNT = eINSTANCE.getQAProposalService_RejectedCount();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.service.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.service.impl.QuestionImpl
		 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__KIND = eINSTANCE.getQuestion_Kind();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QUESTION = eINSTANCE.getQuestion_Question();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__OPTIONS = eINSTANCE.getQuestion_Options();

		/**
		 * The meta object literal for the '<em><b>Num Choices</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NUM_CHOICES = eINSTANCE.getQuestion_NumChoices();

		/**
		 * The meta object literal for the '<em><b>Qid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__QID = eINSTANCE.getQuestion_Qid();

		/**
		 * The meta object literal for the '<em><b>Last Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__LAST_PROPOSAL = eINSTANCE.getQuestion_LastProposal();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__ACCEPTED = eINSTANCE.getQuestion_Accepted();

		/**
		 * The meta object literal for the '<em><b>Rejected Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__REJECTED_COUNT = eINSTANCE.getQuestion_RejectedCount();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.service.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.service.impl.AnswerImpl
		 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__ANSWER = eINSTANCE.getAnswer_Answer();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANSWER__SELECTED = eINSTANCE.getAnswer_Selected();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.runtime.service.AnswerKind <em>Answer Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.runtime.service.AnswerKind
		 * @see no.hal.pg.quiz.runtime.service.impl.ServicePackageImpl#getAnswerKind()
		 * @generated
		 */
		EEnum ANSWER_KIND = eINSTANCE.getAnswerKind();

	}

} //ServicePackage
