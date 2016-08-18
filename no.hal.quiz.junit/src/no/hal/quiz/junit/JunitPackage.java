/**
 */
package no.hal.quiz.junit;

import no.hal.quiz.QuizPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see no.hal.quiz.junit.JunitFactory
 * @model kind="package"
 * @generated
 */
public interface JunitPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "junit";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.quiz.junit/model/quiz-junit.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "junit";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JunitPackage eINSTANCE = no.hal.quiz.junit.impl.JunitPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.quiz.junit.impl.JunitTestAnswerImpl <em>Test Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.junit.impl.JunitTestAnswerImpl
	 * @see no.hal.quiz.junit.impl.JunitPackageImpl#getJunitTestAnswer()
	 * @generated
	 */
	int JUNIT_TEST_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Test Run Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER__TEST_RUN_NAME = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Method Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER__METHOD_NAMES = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Test Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER_FEATURE_COUNT = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___ACCEPT__OBJECT = QuizPackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___VALIDATE__OBJECT = QuizPackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER___CREATE_PROPOSAL = QuizPackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Test Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_ANSWER_OPERATION_COUNT = QuizPackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.junit.impl.JunitTestProposalImpl <em>Test Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.junit.impl.JunitTestProposalImpl
	 * @see no.hal.quiz.junit.impl.JunitPackageImpl#getJunitTestProposal()
	 * @generated
	 */
	int JUNIT_TEST_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__QUESTION = QuizPackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__ANSWER = QuizPackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__COMPLETION = QuizPackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL__PROOF = QuizPackage.TASK_PROPOSAL__PROOF;

	/**
	 * The number of structural features of the '<em>Test Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL_FEATURE_COUNT = QuizPackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___GET_PROPOSAL = QuizPackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___ACCEPT = QuizPackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL___VALIDATE = QuizPackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Test Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNIT_TEST_PROPOSAL_OPERATION_COUNT = QuizPackage.TASK_PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.junit.JunitTestAnswer <em>Test Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Answer</em>'.
	 * @see no.hal.quiz.junit.JunitTestAnswer
	 * @generated
	 */
	EClass getJunitTestAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.junit.JunitTestAnswer#getTestRunName <em>Test Run Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Test Run Name</em>'.
	 * @see no.hal.quiz.junit.JunitTestAnswer#getTestRunName()
	 * @see #getJunitTestAnswer()
	 * @generated
	 */
	EAttribute getJunitTestAnswer_TestRunName();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.quiz.junit.JunitTestAnswer#getMethodNames <em>Method Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Method Names</em>'.
	 * @see no.hal.quiz.junit.JunitTestAnswer#getMethodNames()
	 * @see #getJunitTestAnswer()
	 * @generated
	 */
	EAttribute getJunitTestAnswer_MethodNames();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.junit.JunitTestProposal <em>Test Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Proposal</em>'.
	 * @see no.hal.quiz.junit.JunitTestProposal
	 * @generated
	 */
	EClass getJunitTestProposal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JunitFactory getJunitFactory();

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
		 * The meta object literal for the '{@link no.hal.quiz.junit.impl.JunitTestAnswerImpl <em>Test Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.junit.impl.JunitTestAnswerImpl
		 * @see no.hal.quiz.junit.impl.JunitPackageImpl#getJunitTestAnswer()
		 * @generated
		 */
		EClass JUNIT_TEST_ANSWER = eINSTANCE.getJunitTestAnswer();

		/**
		 * The meta object literal for the '<em><b>Test Run Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_ANSWER__TEST_RUN_NAME = eINSTANCE.getJunitTestAnswer_TestRunName();

		/**
		 * The meta object literal for the '<em><b>Method Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute JUNIT_TEST_ANSWER__METHOD_NAMES = eINSTANCE.getJunitTestAnswer_MethodNames();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.junit.impl.JunitTestProposalImpl <em>Test Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.junit.impl.JunitTestProposalImpl
		 * @see no.hal.quiz.junit.impl.JunitPackageImpl#getJunitTestProposal()
		 * @generated
		 */
		EClass JUNIT_TEST_PROPOSAL = eINSTANCE.getJunitTestProposal();

	}

} //JunitPackage
