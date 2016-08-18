/**
 */
package no.hal.quiz.checkstyle;

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
 * @see no.hal.quiz.checkstyle.CheckstyleFactory
 * @model kind="package"
 * @generated
 */
public interface CheckstylePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "checkstyle";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.quiz.checkstyle/model/quiz-checkstyle.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "checkstyle";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CheckstylePackage eINSTANCE = no.hal.quiz.checkstyle.impl.CheckstylePackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.quiz.checkstyle.impl.CheckstyleAnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.checkstyle.impl.CheckstyleAnswerImpl
	 * @see no.hal.quiz.checkstyle.impl.CheckstylePackageImpl#getCheckstyleAnswer()
	 * @generated
	 */
	int CHECKSTYLE_ANSWER = 0;

	/**
	 * The feature id for the '<em><b>Class Names</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER__CLASS_NAMES = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Style Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER__STYLE_NAME = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER_FEATURE_COUNT = QuizPackage.TASK_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER___ACCEPT__OBJECT = QuizPackage.TASK_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER___VALIDATE__OBJECT = QuizPackage.TASK_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER___CREATE_PROPOSAL = QuizPackage.TASK_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_ANSWER_OPERATION_COUNT = QuizPackage.TASK_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.checkstyle.impl.CheckstyleProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.checkstyle.impl.CheckstyleProposalImpl
	 * @see no.hal.quiz.checkstyle.impl.CheckstylePackageImpl#getCheckstyleProposal()
	 * @generated
	 */
	int CHECKSTYLE_PROPOSAL = 1;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL__QUESTION = QuizPackage.TASK_PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL__ANSWER = QuizPackage.TASK_PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL__COMPLETION = QuizPackage.TASK_PROPOSAL__COMPLETION;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL__PROOF = QuizPackage.TASK_PROPOSAL__PROOF;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL_FEATURE_COUNT = QuizPackage.TASK_PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL___GET_PROPOSAL = QuizPackage.TASK_PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL___ACCEPT = QuizPackage.TASK_PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL___VALIDATE = QuizPackage.TASK_PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECKSTYLE_PROPOSAL_OPERATION_COUNT = QuizPackage.TASK_PROPOSAL_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.quiz.checkstyle.CheckstyleAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see no.hal.quiz.checkstyle.CheckstyleAnswer
	 * @generated
	 */
	EClass getCheckstyleAnswer();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.quiz.checkstyle.CheckstyleAnswer#getClassNames <em>Class Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Class Names</em>'.
	 * @see no.hal.quiz.checkstyle.CheckstyleAnswer#getClassNames()
	 * @see #getCheckstyleAnswer()
	 * @generated
	 */
	EAttribute getCheckstyleAnswer_ClassNames();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.checkstyle.CheckstyleAnswer#getStyleName <em>Style Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style Name</em>'.
	 * @see no.hal.quiz.checkstyle.CheckstyleAnswer#getStyleName()
	 * @see #getCheckstyleAnswer()
	 * @generated
	 */
	EAttribute getCheckstyleAnswer_StyleName();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.checkstyle.CheckstyleProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see no.hal.quiz.checkstyle.CheckstyleProposal
	 * @generated
	 */
	EClass getCheckstyleProposal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CheckstyleFactory getCheckstyleFactory();

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
		 * The meta object literal for the '{@link no.hal.quiz.checkstyle.impl.CheckstyleAnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.checkstyle.impl.CheckstyleAnswerImpl
		 * @see no.hal.quiz.checkstyle.impl.CheckstylePackageImpl#getCheckstyleAnswer()
		 * @generated
		 */
		EClass CHECKSTYLE_ANSWER = eINSTANCE.getCheckstyleAnswer();

		/**
		 * The meta object literal for the '<em><b>Class Names</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSTYLE_ANSWER__CLASS_NAMES = eINSTANCE.getCheckstyleAnswer_ClassNames();

		/**
		 * The meta object literal for the '<em><b>Style Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECKSTYLE_ANSWER__STYLE_NAME = eINSTANCE.getCheckstyleAnswer_StyleName();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.checkstyle.impl.CheckstyleProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.checkstyle.impl.CheckstyleProposalImpl
		 * @see no.hal.quiz.checkstyle.impl.CheckstylePackageImpl#getCheckstyleProposal()
		 * @generated
		 */
		EClass CHECKSTYLE_PROPOSAL = eINSTANCE.getCheckstyleProposal();

	}

} //CheckstylePackage
