/**
 */
package no.hal.pg.quiz.runtime.service;

import no.hal.pg.runtime.RuntimePackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
	 * The operation id for the '<em>Get QA Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER = RuntimePackage.SERVICE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quiz Task Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_SERVICE_OPERATION_COUNT = RuntimePackage.SERVICE_OPERATION_COUNT + 3;


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
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Propose Answer</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String)
	 * @generated
	 */
	EOperation getQuizTaskService__ProposeAnswer__Player_QA_String();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String) <em>Accept Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept Answer</em>' operation.
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String)
	 * @generated
	 */
	EOperation getQuizTaskService__AcceptAnswer__Player_QA_String();

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
		 * The meta object literal for the '<em><b>Get QA Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ_TASK_SERVICE___GET_QA_PROPOSALS__PLAYER = eINSTANCE.getQuizTaskService__GetQAProposals__Player();

	}

} //ServicePackage
