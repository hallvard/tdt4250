/**
 */
package no.hal.quiz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see no.hal.quiz.QuizFactory
 * @model kind="package"
 * @generated
 */
public interface QuizPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quiz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.quiz.model/model/quiz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quiz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuizPackage eINSTANCE = no.hal.quiz.impl.QuizPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizImpl <em>Quiz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuiz()
	 * @generated
	 */
	int QUIZ = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__NAME = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Parts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ__PARTS = 2;

	/**
	 * The number of structural features of the '<em>Quiz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ___CREATE_PROPOSALS = 0;

	/**
	 * The number of operations of the '<em>Quiz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizProposalsImpl <em>Proposals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizProposalsImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizProposals()
	 * @generated
	 */
	int QUIZ_PROPOSALS = 1;

	/**
	 * The feature id for the '<em><b>Quiz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PROPOSALS__QUIZ = 0;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PROPOSALS__PROPOSALS = 1;

	/**
	 * The feature id for the '<em><b>All Proposals</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PROPOSALS__ALL_PROPOSALS = 2;

	/**
	 * The number of structural features of the '<em>Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PROPOSALS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PROPOSALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.AbstractQuizPartImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQuizPart()
	 * @generated
	 */
	int ABSTRACT_QUIZ_PART = 2;

	/**
	 * The number of structural features of the '<em>Abstract Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Questions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART___GET_QUESTIONS = 0;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART___GET_TITLE = 1;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART___CREATE_PROPOSALS = 2;

	/**
	 * The number of operations of the '<em>Abstract Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizPartProposalsImpl <em>Part Proposals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizPartProposalsImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPartProposals()
	 * @generated
	 */
	int QUIZ_PART_PROPOSALS = 3;

	/**
	 * The feature id for the '<em><b>Proposals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_PROPOSALS__PROPOSALS = 0;

	/**
	 * The feature id for the '<em><b>Quiz Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_PROPOSALS__QUIZ_PART = 1;

	/**
	 * The number of structural features of the '<em>Part Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_PROPOSALS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Part Proposals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_PROPOSALS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizPartRefImpl <em>Part Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizPartRefImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPartRef()
	 * @generated
	 */
	int QUIZ_PART_REF = 4;

	/**
	 * The feature id for the '<em><b>Part Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF__PART_REF = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF_FEATURE_COUNT = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Questions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF___GET_QUESTIONS = ABSTRACT_QUIZ_PART___GET_QUESTIONS;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF___GET_TITLE = ABSTRACT_QUIZ_PART___GET_TITLE;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF___CREATE_PROPOSALS = ABSTRACT_QUIZ_PART___CREATE_PROPOSALS;

	/**
	 * The number of operations of the '<em>Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF_OPERATION_COUNT = ABSTRACT_QUIZ_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizPartImpl <em>Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizPartImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPart()
	 * @generated
	 */
	int QUIZ_PART = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART__NAME = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART__TITLE = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Questions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART__QUESTIONS = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_FEATURE_COUNT = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get Questions</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART___GET_QUESTIONS = ABSTRACT_QUIZ_PART___GET_QUESTIONS;

	/**
	 * The operation id for the '<em>Get Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART___GET_TITLE = ABSTRACT_QUIZ_PART___GET_TITLE;

	/**
	 * The operation id for the '<em>Create Proposals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART___CREATE_PROPOSALS = ABSTRACT_QUIZ_PART___CREATE_PROPOSALS;

	/**
	 * The number of operations of the '<em>Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_OPERATION_COUNT = ABSTRACT_QUIZ_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.AbstractQAImpl <em>Abstract QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.AbstractQAImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQA()
	 * @generated
	 */
	int ABSTRACT_QA = 6;

	/**
	 * The number of structural features of the '<em>Abstract QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA___GET_A = 0;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA___GET_Q = 1;

	/**
	 * The number of operations of the '<em>Abstract QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QARefImpl <em>QA Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QARefImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQARef()
	 * @generated
	 */
	int QA_REF = 7;

	/**
	 * The feature id for the '<em><b>Qa Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_REF__QA_REF = ABSTRACT_QA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QA Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_REF_FEATURE_COUNT = ABSTRACT_QA_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_REF___GET_A = ABSTRACT_QA___GET_A;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_REF___GET_Q = ABSTRACT_QA___GET_Q;

	/**
	 * The number of operations of the '<em>QA Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_REF_OPERATION_COUNT = ABSTRACT_QA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QAImpl <em>QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QAImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQA()
	 * @generated
	 */
	int QA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA__NAME = ABSTRACT_QA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA__Q = ABSTRACT_QA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA__A = ABSTRACT_QA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_FEATURE_COUNT = ABSTRACT_QA_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get A</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA___GET_A = ABSTRACT_QA___GET_A;

	/**
	 * The operation id for the '<em>Get Q</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA___GET_Q = ABSTRACT_QA___GET_Q;

	/**
	 * The number of operations of the '<em>QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QA_OPERATION_COUNT = ABSTRACT_QA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuestionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 9;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.StringQuestionImpl <em>String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.StringQuestionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getStringQuestion()
	 * @generated
	 */
	int STRING_QUESTION = 10;

	/**
	 * The feature id for the '<em><b>Question</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION__QUESTION = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.StyledStringImpl <em>Styled String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.StyledStringImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getStyledString()
	 * @generated
	 */
	int STYLED_STRING = 12;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.StyledStringQuestionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getStyledStringQuestion()
	 * @generated
	 */
	int STYLED_STRING_QUESTION = 11;

	/**
	 * The feature id for the '<em><b>Styled Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION__STYLED_STRINGS = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Char Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__CHAR_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Effective Char Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__EFFECTIVE_CHAR_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Styled String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__STYLED_STRING = 3;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__SUFFIX = 4;

	/**
	 * The number of structural features of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.CharStyleImpl <em>Char Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.CharStyleImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getCharStyle()
	 * @generated
	 */
	int CHAR_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__ITALIC = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FOREGROUND = 4;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BACKGROUND = 5;

	/**
	 * The number of structural features of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlQuestionImpl <em>Xml Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlQuestionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlQuestion()
	 * @generated
	 */
	int XML_QUESTION = 14;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_QUESTION__XML = QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_QUESTION_FEATURE_COUNT = QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Xml Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_QUESTION_OPERATION_COUNT = QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.AnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 15;

	/**
	 * The number of structural features of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___ACCEPT__OBJECT = 0;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___VALIDATE__OBJECT = 1;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER___CREATE_PROPOSAL = 2;

	/**
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.ProposalImpl <em>Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.ProposalImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getProposal()
	 * @generated
	 */
	int PROPOSAL = 16;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL__ANSWER = 1;

	/**
	 * The number of structural features of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___GET_PROPOSAL = 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___ACCEPT = 1;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL___VALIDATE = 2;

	/**
	 * The number of operations of the '<em>Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPOSAL_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionAnswer()
	 * @generated
	 */
	int OPTION_ANSWER = 17;

	/**
	 * The number of structural features of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.SimpleAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getSimpleAnswer()
	 * @generated
	 */
	int SIMPLE_ANSWER = 18;

	/**
	 * The number of structural features of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_FEATURE_COUNT = OPTION_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___ACCEPT__OBJECT = OPTION_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___VALIDATE__OBJECT = OPTION_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___CREATE_PROPOSAL = OPTION_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___GET_VALUE = OPTION_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_OPERATION_COUNT = OPTION_ANSWER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.SimpleProposalImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getSimpleProposal()
	 * @generated
	 */
	int SIMPLE_PROPOSAL = 19;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__PROPOSAL = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.StringAnswerImpl <em>String Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.StringAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getStringAnswer()
	 * @generated
	 */
	int STRING_ANSWER = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__FORMAT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__REGEXP = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__IGNORE_CASE = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.NumberAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getNumberAnswer()
	 * @generated
	 */
	int NUMBER_ANSWER = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__ERROR_MARGIN = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__RANGE = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.NumberRangeImpl <em>Number Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.NumberRangeImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getNumberRange()
	 * @generated
	 */
	int NUMBER_RANGE = 22;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__STEP = 2;

	/**
	 * The number of structural features of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.BooleanAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getBooleanAnswer()
	 * @generated
	 */
	int BOOLEAN_ANSWER = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlAnswerImpl <em>Xml Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlAnswer()
	 * @generated
	 */
	int XML_ANSWER = 24;

	/**
	 * The feature id for the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER__XML = OPTION_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER_FEATURE_COUNT = OPTION_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER___ACCEPT__OBJECT = OPTION_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER___VALIDATE__OBJECT = OPTION_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER___CREATE_PROPOSAL = OPTION_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Xml Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ANSWER_OPERATION_COUNT = OPTION_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionsAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionsAnswer()
	 * @generated
	 */
	int OPTIONS_ANSWER = 25;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER__OPTIONS = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionsProposalImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionsProposal()
	 * @generated
	 */
	int OPTIONS_PROPOSAL = 26;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__INDICES = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 27;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CORRECT = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.SingleOptionsAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getSingleOptionsAnswer()
	 * @generated
	 */
	int SINGLE_OPTIONS_ANSWER = 28;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.ManyOptionsAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getManyOptionsAnswer()
	 * @generated
	 */
	int MANY_OPTIONS_ANSWER = 29;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlImpl <em>Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXml()
	 * @generated
	 */
	int XML = 30;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML__ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Xml</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlContentsImpl <em>Xml Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlContentsImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlContents()
	 * @generated
	 */
	int XML_CONTENTS = 31;

	/**
	 * The feature id for the '<em><b>Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENTS__ELEMENT = 0;

	/**
	 * The feature id for the '<em><b>Post</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENTS__POST = 1;

	/**
	 * The number of structural features of the '<em>Xml Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Xml Contents</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_CONTENTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlElementImpl <em>Xml Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlElementImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlElement()
	 * @generated
	 */
	int XML_ELEMENT = 32;

	/**
	 * The number of structural features of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Xml Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlPIAnswerElementImpl <em>Xml PI Answer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlPIAnswerElementImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlPIAnswerElement()
	 * @generated
	 */
	int XML_PI_ANSWER_ELEMENT = 33;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PI_ANSWER_ELEMENT__ANSWER = XML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Xml PI Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PI_ANSWER_ELEMENT_FEATURE_COUNT = XML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Xml PI Answer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_PI_ANSWER_ELEMENT_OPERATION_COUNT = XML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlTagElementImpl <em>Xml Tag Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlTagElementImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlTagElement()
	 * @generated
	 */
	int XML_TAG_ELEMENT = 34;

	/**
	 * The feature id for the '<em><b>Start Tag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT__START_TAG = XML_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT__PRE = XML_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Contents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT__CONTENTS = XML_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>End Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT__END_TAG = XML_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Xml Tag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT_FEATURE_COUNT = XML_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Xml Tag Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_ELEMENT_OPERATION_COUNT = XML_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlTagImpl <em>Xml Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlTagImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlTag()
	 * @generated
	 */
	int XML_TAG = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG__NAME = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Xml Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Xml Tag</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_TAG_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlAttributeImpl <em>Xml Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlAttributeImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlAttribute()
	 * @generated
	 */
	int XML_ATTRIBUTE = 36;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Xml Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Xml Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XML_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.TaskAnswerImpl <em>Task Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.TaskAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getTaskAnswer()
	 * @generated
	 */
	int TASK_ANSWER = 37;

	/**
	 * The feature id for the '<em><b>Required Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER__REQUIRED_COUNT = ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER_FEATURE_COUNT = ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___ACCEPT__OBJECT = ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___VALIDATE__OBJECT = ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER___CREATE_PROPOSAL = ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Task Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.TaskProposalImpl <em>Task Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.TaskProposalImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getTaskProposal()
	 * @generated
	 */
	int TASK_PROPOSAL = 38;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__QUESTION = PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__ANSWER = PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Completion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__COMPLETION = PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Proof</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__PROOF = PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attempt Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__ATTEMPT_COUNT = PROPOSAL_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Performed Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL__PERFORMED_COUNT = PROPOSAL_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL_FEATURE_COUNT = PROPOSAL_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___GET_PROPOSAL = PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___ACCEPT = PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL___VALIDATE = PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Task Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_PROPOSAL_OPERATION_COUNT = PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.util.RGB
	 * @see no.hal.quiz.impl.QuizPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 39;

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Quiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz</em>'.
	 * @see no.hal.quiz.Quiz
	 * @generated
	 */
	EClass getQuiz();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.Quiz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.quiz.Quiz#getName()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.Quiz#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.quiz.Quiz#getTitle()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.Quiz#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see no.hal.quiz.Quiz#getParts()
	 * @see #getQuiz()
	 * @generated
	 */
	EReference getQuiz_Parts();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Quiz#createProposals() <em>Create Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposals</em>' operation.
	 * @see no.hal.quiz.Quiz#createProposals()
	 * @generated
	 */
	EOperation getQuiz__CreateProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QuizProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposals</em>'.
	 * @see no.hal.quiz.QuizProposals
	 * @generated
	 */
	EClass getQuizProposals();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.QuizProposals#getQuiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quiz</em>'.
	 * @see no.hal.quiz.QuizProposals#getQuiz()
	 * @see #getQuizProposals()
	 * @generated
	 */
	EReference getQuizProposals_Quiz();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.QuizProposals#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see no.hal.quiz.QuizProposals#getProposals()
	 * @see #getQuizProposals()
	 * @generated
	 */
	EReference getQuizProposals_Proposals();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.quiz.QuizProposals#getAllProposals <em>All Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Proposals</em>'.
	 * @see no.hal.quiz.QuizProposals#getAllProposals()
	 * @see #getQuizProposals()
	 * @generated
	 */
	EReference getQuizProposals_AllProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.AbstractQuizPart <em>Abstract Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quiz Part</em>'.
	 * @see no.hal.quiz.AbstractQuizPart
	 * @generated
	 */
	EClass getAbstractQuizPart();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.AbstractQuizPart#getQuestions() <em>Get Questions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Questions</em>' operation.
	 * @see no.hal.quiz.AbstractQuizPart#getQuestions()
	 * @generated
	 */
	EOperation getAbstractQuizPart__GetQuestions();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.AbstractQuizPart#getTitle() <em>Get Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Title</em>' operation.
	 * @see no.hal.quiz.AbstractQuizPart#getTitle()
	 * @generated
	 */
	EOperation getAbstractQuizPart__GetTitle();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.AbstractQuizPart#createProposals() <em>Create Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposals</em>' operation.
	 * @see no.hal.quiz.AbstractQuizPart#createProposals()
	 * @generated
	 */
	EOperation getAbstractQuizPart__CreateProposals();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QuizPartProposals <em>Part Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Proposals</em>'.
	 * @see no.hal.quiz.QuizPartProposals
	 * @generated
	 */
	EClass getQuizPartProposals();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.QuizPartProposals#getProposals <em>Proposals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proposals</em>'.
	 * @see no.hal.quiz.QuizPartProposals#getProposals()
	 * @see #getQuizPartProposals()
	 * @generated
	 */
	EReference getQuizPartProposals_Proposals();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.QuizPartProposals#getQuizPart <em>Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Quiz Part</em>'.
	 * @see no.hal.quiz.QuizPartProposals#getQuizPart()
	 * @see #getQuizPartProposals()
	 * @generated
	 */
	EReference getQuizPartProposals_QuizPart();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QuizPartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part Ref</em>'.
	 * @see no.hal.quiz.QuizPartRef
	 * @generated
	 */
	EClass getQuizPartRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.QuizPartRef#getPartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Ref</em>'.
	 * @see no.hal.quiz.QuizPartRef#getPartRef()
	 * @see #getQuizPartRef()
	 * @generated
	 */
	EReference getQuizPartRef_PartRef();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QuizPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Part</em>'.
	 * @see no.hal.quiz.QuizPart
	 * @generated
	 */
	EClass getQuizPart();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.QuizPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.quiz.QuizPart#getName()
	 * @see #getQuizPart()
	 * @generated
	 */
	EAttribute getQuizPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.QuizPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.quiz.QuizPart#getTitle()
	 * @see #getQuizPart()
	 * @generated
	 */
	EAttribute getQuizPart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.QuizPart#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see no.hal.quiz.QuizPart#getQuestions()
	 * @see #getQuizPart()
	 * @generated
	 */
	EReference getQuizPart_Questions();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.AbstractQA <em>Abstract QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract QA</em>'.
	 * @see no.hal.quiz.AbstractQA
	 * @generated
	 */
	EClass getAbstractQA();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.AbstractQA#getA() <em>Get A</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get A</em>' operation.
	 * @see no.hal.quiz.AbstractQA#getA()
	 * @generated
	 */
	EOperation getAbstractQA__GetA();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.AbstractQA#getQ() <em>Get Q</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Q</em>' operation.
	 * @see no.hal.quiz.AbstractQA#getQ()
	 * @generated
	 */
	EOperation getAbstractQA__GetQ();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QARef <em>QA Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Ref</em>'.
	 * @see no.hal.quiz.QARef
	 * @generated
	 */
	EClass getQARef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.QARef#getQaRef <em>Qa Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qa Ref</em>'.
	 * @see no.hal.quiz.QARef#getQaRef()
	 * @see #getQARef()
	 * @generated
	 */
	EReference getQARef_QaRef();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.QA <em>QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA</em>'.
	 * @see no.hal.quiz.QA
	 * @generated
	 */
	EClass getQA();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.QA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.quiz.QA#getName()
	 * @see #getQA()
	 * @generated
	 */
	EAttribute getQA_Name();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.QA#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see no.hal.quiz.QA#getQ()
	 * @see #getQA()
	 * @generated
	 */
	EReference getQA_Q();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.QA#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see no.hal.quiz.QA#getA()
	 * @see #getQA()
	 * @generated
	 */
	EReference getQA_A();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see no.hal.quiz.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.StringQuestion <em>String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Question</em>'.
	 * @see no.hal.quiz.StringQuestion
	 * @generated
	 */
	EClass getStringQuestion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StringQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.quiz.StringQuestion#getQuestion()
	 * @see #getStringQuestion()
	 * @generated
	 */
	EAttribute getStringQuestion_Question();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.StyledStringQuestion <em>Styled String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String Question</em>'.
	 * @see no.hal.quiz.StyledStringQuestion
	 * @generated
	 */
	EClass getStyledStringQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.StyledStringQuestion#getStyledStrings <em>Styled Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styled Strings</em>'.
	 * @see no.hal.quiz.StyledStringQuestion#getStyledStrings()
	 * @see #getStyledStringQuestion()
	 * @generated
	 */
	EReference getStyledStringQuestion_StyledStrings();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.StyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String</em>'.
	 * @see no.hal.quiz.StyledString
	 * @generated
	 */
	EClass getStyledString();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.StyledString#getCharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char Style</em>'.
	 * @see no.hal.quiz.StyledString#getCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_CharStyle();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.StyledString#getEffectiveCharStyle <em>Effective Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Char Style</em>'.
	 * @see no.hal.quiz.StyledString#getEffectiveCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_EffectiveCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StyledString#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see no.hal.quiz.StyledString#getPrefix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.StyledString#getStyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styled String</em>'.
	 * @see no.hal.quiz.StyledString#getStyledString()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_StyledString();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StyledString#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see no.hal.quiz.StyledString#getSuffix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Suffix();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.CharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Style</em>'.
	 * @see no.hal.quiz.CharStyle
	 * @generated
	 */
	EClass getCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see no.hal.quiz.CharStyle#getItalic()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see no.hal.quiz.CharStyle#getBold()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.hal.quiz.CharStyle#getSize()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see no.hal.quiz.CharStyle#getFamily()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Family();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see no.hal.quiz.CharStyle#getForeground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Foreground();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.CharStyle#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see no.hal.quiz.CharStyle#getBackground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Background();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlQuestion <em>Xml Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Question</em>'.
	 * @see no.hal.quiz.XmlQuestion
	 * @generated
	 */
	EClass getXmlQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.XmlQuestion#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see no.hal.quiz.XmlQuestion#getXml()
	 * @see #getXmlQuestion()
	 * @generated
	 */
	EReference getXmlQuestion_Xml();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see no.hal.quiz.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Answer#accept(java.lang.Object) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.quiz.Answer#accept(java.lang.Object)
	 * @generated
	 */
	EOperation getAnswer__Accept__Object();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Answer#validate(java.lang.Object) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see no.hal.quiz.Answer#validate(java.lang.Object)
	 * @generated
	 */
	EOperation getAnswer__Validate__Object();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Answer#createProposal() <em>Create Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Proposal</em>' operation.
	 * @see no.hal.quiz.Answer#createProposal()
	 * @generated
	 */
	EOperation getAnswer__CreateProposal();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Proposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proposal</em>'.
	 * @see no.hal.quiz.Proposal
	 * @generated
	 */
	EClass getProposal();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.Proposal#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Question</em>'.
	 * @see no.hal.quiz.Proposal#getQuestion()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Question();

	/**
	 * Returns the meta object for the reference '{@link no.hal.quiz.Proposal#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Answer</em>'.
	 * @see no.hal.quiz.Proposal#getAnswer()
	 * @see #getProposal()
	 * @generated
	 */
	EReference getProposal_Answer();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Proposal#getProposal() <em>Get Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Proposal</em>' operation.
	 * @see no.hal.quiz.Proposal#getProposal()
	 * @generated
	 */
	EOperation getProposal__GetProposal();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Proposal#accept() <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.quiz.Proposal#accept()
	 * @generated
	 */
	EOperation getProposal__Accept();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.Proposal#validate() <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate</em>' operation.
	 * @see no.hal.quiz.Proposal#validate()
	 * @generated
	 */
	EOperation getProposal__Validate();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Answer</em>'.
	 * @see no.hal.quiz.OptionAnswer
	 * @generated
	 */
	EClass getOptionAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Answer</em>'.
	 * @see no.hal.quiz.SimpleAnswer
	 * @generated
	 */
	EClass getSimpleAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.quiz.SimpleAnswer#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see no.hal.quiz.SimpleAnswer#getValue()
	 * @generated
	 */
	EOperation getSimpleAnswer__GetValue();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.SimpleProposal <em>Simple Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Proposal</em>'.
	 * @see no.hal.quiz.SimpleProposal
	 * @generated
	 */
	EClass getSimpleProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.SimpleProposal#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see no.hal.quiz.SimpleProposal#getProposal()
	 * @see #getSimpleProposal()
	 * @generated
	 */
	EAttribute getSimpleProposal_Proposal();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Answer</em>'.
	 * @see no.hal.quiz.StringAnswer
	 * @generated
	 */
	EClass getStringAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StringAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.quiz.StringAnswer#getValue()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StringAnswer#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see no.hal.quiz.StringAnswer#getFormat()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Format();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StringAnswer#isRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see no.hal.quiz.StringAnswer#isRegexp()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.StringAnswer#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see no.hal.quiz.StringAnswer#isIgnoreCase()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Answer</em>'.
	 * @see no.hal.quiz.NumberAnswer
	 * @generated
	 */
	EClass getNumberAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.NumberAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.quiz.NumberAnswer#getValue()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.NumberAnswer#getErrorMargin <em>Error Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Margin</em>'.
	 * @see no.hal.quiz.NumberAnswer#getErrorMargin()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_ErrorMargin();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.NumberAnswer#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see no.hal.quiz.NumberAnswer#getRange()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EReference getNumberAnswer_Range();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Range</em>'.
	 * @see no.hal.quiz.NumberRange
	 * @generated
	 */
	EClass getNumberRange();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.NumberRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see no.hal.quiz.NumberRange#getMin()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.NumberRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see no.hal.quiz.NumberRange#getMax()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.NumberRange#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see no.hal.quiz.NumberRange#getStep()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Step();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Answer</em>'.
	 * @see no.hal.quiz.BooleanAnswer
	 * @generated
	 */
	EClass getBooleanAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.BooleanAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.quiz.BooleanAnswer#getValue()
	 * @see #getBooleanAnswer()
	 * @generated
	 */
	EAttribute getBooleanAnswer_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlAnswer <em>Xml Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Answer</em>'.
	 * @see no.hal.quiz.XmlAnswer
	 * @generated
	 */
	EClass getXmlAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.XmlAnswer#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see no.hal.quiz.XmlAnswer#getXml()
	 * @see #getXmlAnswer()
	 * @generated
	 */
	EReference getXmlAnswer_Xml();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Answer</em>'.
	 * @see no.hal.quiz.OptionsAnswer
	 * @generated
	 */
	EClass getOptionsAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.OptionsAnswer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see no.hal.quiz.OptionsAnswer#getOptions()
	 * @see #getOptionsAnswer()
	 * @generated
	 */
	EReference getOptionsAnswer_Options();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.OptionsProposal <em>Options Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Proposal</em>'.
	 * @see no.hal.quiz.OptionsProposal
	 * @generated
	 */
	EClass getOptionsProposal();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.quiz.OptionsProposal#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indices</em>'.
	 * @see no.hal.quiz.OptionsProposal#getIndices()
	 * @see #getOptionsProposal()
	 * @generated
	 */
	EAttribute getOptionsProposal_Indices();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see no.hal.quiz.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.Option#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see no.hal.quiz.Option#isCorrect()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Correct();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.Option#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see no.hal.quiz.Option#getOption()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Option();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Options Answer</em>'.
	 * @see no.hal.quiz.SingleOptionsAnswer
	 * @generated
	 */
	EClass getSingleOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Options Answer</em>'.
	 * @see no.hal.quiz.ManyOptionsAnswer
	 * @generated
	 */
	EClass getManyOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.Xml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml</em>'.
	 * @see no.hal.quiz.Xml
	 * @generated
	 */
	EClass getXml();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.Xml#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see no.hal.quiz.Xml#getElement()
	 * @see #getXml()
	 * @generated
	 */
	EReference getXml_Element();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlContents <em>Xml Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Contents</em>'.
	 * @see no.hal.quiz.XmlContents
	 * @generated
	 */
	EClass getXmlContents();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.XmlContents#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see no.hal.quiz.XmlContents#getElement()
	 * @see #getXmlContents()
	 * @generated
	 */
	EReference getXmlContents_Element();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlContents#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see no.hal.quiz.XmlContents#getPost()
	 * @see #getXmlContents()
	 * @generated
	 */
	EAttribute getXmlContents_Post();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Element</em>'.
	 * @see no.hal.quiz.XmlElement
	 * @generated
	 */
	EClass getXmlElement();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlPIAnswerElement <em>Xml PI Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml PI Answer Element</em>'.
	 * @see no.hal.quiz.XmlPIAnswerElement
	 * @generated
	 */
	EClass getXmlPIAnswerElement();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.XmlPIAnswerElement#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answer</em>'.
	 * @see no.hal.quiz.XmlPIAnswerElement#getAnswer()
	 * @see #getXmlPIAnswerElement()
	 * @generated
	 */
	EReference getXmlPIAnswerElement_Answer();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlTagElement <em>Xml Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Tag Element</em>'.
	 * @see no.hal.quiz.XmlTagElement
	 * @generated
	 */
	EClass getXmlTagElement();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.quiz.XmlTagElement#getStartTag <em>Start Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Tag</em>'.
	 * @see no.hal.quiz.XmlTagElement#getStartTag()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EReference getXmlTagElement_StartTag();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlTagElement#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre</em>'.
	 * @see no.hal.quiz.XmlTagElement#getPre()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EAttribute getXmlTagElement_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.XmlTagElement#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see no.hal.quiz.XmlTagElement#getContents()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EReference getXmlTagElement_Contents();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlTagElement#getEndTag <em>End Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Tag</em>'.
	 * @see no.hal.quiz.XmlTagElement#getEndTag()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EAttribute getXmlTagElement_EndTag();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Tag</em>'.
	 * @see no.hal.quiz.XmlTag
	 * @generated
	 */
	EClass getXmlTag();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.quiz.XmlTag#getName()
	 * @see #getXmlTag()
	 * @generated
	 */
	EAttribute getXmlTag_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.quiz.XmlTag#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see no.hal.quiz.XmlTag#getAttributes()
	 * @see #getXmlTag()
	 * @generated
	 */
	EReference getXmlTag_Attributes();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.XmlAttribute <em>Xml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Attribute</em>'.
	 * @see no.hal.quiz.XmlAttribute
	 * @generated
	 */
	EClass getXmlAttribute();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.quiz.XmlAttribute#getName()
	 * @see #getXmlAttribute()
	 * @generated
	 */
	EAttribute getXmlAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.XmlAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.quiz.XmlAttribute#getValue()
	 * @see #getXmlAttribute()
	 * @generated
	 */
	EAttribute getXmlAttribute_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.TaskAnswer <em>Task Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Answer</em>'.
	 * @see no.hal.quiz.TaskAnswer
	 * @generated
	 */
	EClass getTaskAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.TaskAnswer#getRequiredCount <em>Required Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Required Count</em>'.
	 * @see no.hal.quiz.TaskAnswer#getRequiredCount()
	 * @see #getTaskAnswer()
	 * @generated
	 */
	EAttribute getTaskAnswer_RequiredCount();

	/**
	 * Returns the meta object for class '{@link no.hal.quiz.TaskProposal <em>Task Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task Proposal</em>'.
	 * @see no.hal.quiz.TaskProposal
	 * @generated
	 */
	EClass getTaskProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.TaskProposal#getCompletion <em>Completion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Completion</em>'.
	 * @see no.hal.quiz.TaskProposal#getCompletion()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_Completion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.TaskProposal#getProof <em>Proof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proof</em>'.
	 * @see no.hal.quiz.TaskProposal#getProof()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_Proof();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.TaskProposal#getAttemptCount <em>Attempt Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempt Count</em>'.
	 * @see no.hal.quiz.TaskProposal#getAttemptCount()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_AttemptCount();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.quiz.TaskProposal#getPerformedCount <em>Performed Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Performed Count</em>'.
	 * @see no.hal.quiz.TaskProposal#getPerformedCount()
	 * @see #getTaskProposal()
	 * @generated
	 */
	EAttribute getTaskProposal_PerformedCount();

	/**
	 * Returns the meta object for data type '{@link no.hal.quiz.util.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see no.hal.quiz.util.RGB
	 * @model instanceClass="no.hal.quiz.util.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuizFactory getQuizFactory();

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
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuizImpl <em>Quiz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuizImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuiz()
		 * @generated
		 */
		EClass QUIZ = eINSTANCE.getQuiz();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__NAME = eINSTANCE.getQuiz_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ__TITLE = eINSTANCE.getQuiz_Title();

		/**
		 * The meta object literal for the '<em><b>Parts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ__PARTS = eINSTANCE.getQuiz_Parts();

		/**
		 * The meta object literal for the '<em><b>Create Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation QUIZ___CREATE_PROPOSALS = eINSTANCE.getQuiz__CreateProposals();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuizProposalsImpl <em>Proposals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuizProposalsImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizProposals()
		 * @generated
		 */
		EClass QUIZ_PROPOSALS = eINSTANCE.getQuizProposals();

		/**
		 * The meta object literal for the '<em><b>Quiz</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PROPOSALS__QUIZ = eINSTANCE.getQuizProposals_Quiz();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PROPOSALS__PROPOSALS = eINSTANCE.getQuizProposals_Proposals();

		/**
		 * The meta object literal for the '<em><b>All Proposals</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PROPOSALS__ALL_PROPOSALS = eINSTANCE.getQuizProposals_AllProposals();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.AbstractQuizPartImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQuizPart()
		 * @generated
		 */
		EClass ABSTRACT_QUIZ_PART = eINSTANCE.getAbstractQuizPart();

		/**
		 * The meta object literal for the '<em><b>Get Questions</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_QUIZ_PART___GET_QUESTIONS = eINSTANCE.getAbstractQuizPart__GetQuestions();

		/**
		 * The meta object literal for the '<em><b>Get Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_QUIZ_PART___GET_TITLE = eINSTANCE.getAbstractQuizPart__GetTitle();

		/**
		 * The meta object literal for the '<em><b>Create Proposals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_QUIZ_PART___CREATE_PROPOSALS = eINSTANCE.getAbstractQuizPart__CreateProposals();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuizPartProposalsImpl <em>Part Proposals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuizPartProposalsImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPartProposals()
		 * @generated
		 */
		EClass QUIZ_PART_PROPOSALS = eINSTANCE.getQuizPartProposals();

		/**
		 * The meta object literal for the '<em><b>Proposals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PART_PROPOSALS__PROPOSALS = eINSTANCE.getQuizPartProposals_Proposals();

		/**
		 * The meta object literal for the '<em><b>Quiz Part</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PART_PROPOSALS__QUIZ_PART = eINSTANCE.getQuizPartProposals_QuizPart();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuizPartRefImpl <em>Part Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuizPartRefImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPartRef()
		 * @generated
		 */
		EClass QUIZ_PART_REF = eINSTANCE.getQuizPartRef();

		/**
		 * The meta object literal for the '<em><b>Part Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PART_REF__PART_REF = eINSTANCE.getQuizPartRef_PartRef();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuizPartImpl <em>Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuizPartImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPart()
		 * @generated
		 */
		EClass QUIZ_PART = eINSTANCE.getQuizPart();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_PART__NAME = eINSTANCE.getQuizPart_Name();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_PART__TITLE = eINSTANCE.getQuizPart_Title();

		/**
		 * The meta object literal for the '<em><b>Questions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_PART__QUESTIONS = eINSTANCE.getQuizPart_Questions();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.AbstractQAImpl <em>Abstract QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.AbstractQAImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQA()
		 * @generated
		 */
		EClass ABSTRACT_QA = eINSTANCE.getAbstractQA();

		/**
		 * The meta object literal for the '<em><b>Get A</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_QA___GET_A = eINSTANCE.getAbstractQA__GetA();

		/**
		 * The meta object literal for the '<em><b>Get Q</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_QA___GET_Q = eINSTANCE.getAbstractQA__GetQ();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QARefImpl <em>QA Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QARefImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQARef()
		 * @generated
		 */
		EClass QA_REF = eINSTANCE.getQARef();

		/**
		 * The meta object literal for the '<em><b>Qa Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA_REF__QA_REF = eINSTANCE.getQARef_QaRef();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QAImpl <em>QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QAImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQA()
		 * @generated
		 */
		EClass QA = eINSTANCE.getQA();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QA__NAME = eINSTANCE.getQA_Name();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA__Q = eINSTANCE.getQA_Q();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QA__A = eINSTANCE.getQA_A();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.QuestionImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.StringQuestionImpl <em>String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.StringQuestionImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getStringQuestion()
		 * @generated
		 */
		EClass STRING_QUESTION = eINSTANCE.getStringQuestion();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_QUESTION__QUESTION = eINSTANCE.getStringQuestion_Question();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.StyledStringQuestionImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getStyledStringQuestion()
		 * @generated
		 */
		EClass STYLED_STRING_QUESTION = eINSTANCE.getStyledStringQuestion();

		/**
		 * The meta object literal for the '<em><b>Styled Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING_QUESTION__STYLED_STRINGS = eINSTANCE.getStyledStringQuestion_StyledStrings();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.StyledStringImpl <em>Styled String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.StyledStringImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getStyledString()
		 * @generated
		 */
		EClass STYLED_STRING = eINSTANCE.getStyledString();

		/**
		 * The meta object literal for the '<em><b>Char Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__CHAR_STYLE = eINSTANCE.getStyledString_CharStyle();

		/**
		 * The meta object literal for the '<em><b>Effective Char Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__EFFECTIVE_CHAR_STYLE = eINSTANCE.getStyledString_EffectiveCharStyle();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__PREFIX = eINSTANCE.getStyledString_Prefix();

		/**
		 * The meta object literal for the '<em><b>Styled String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__STYLED_STRING = eINSTANCE.getStyledString_StyledString();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__SUFFIX = eINSTANCE.getStyledString_Suffix();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.CharStyleImpl <em>Char Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.CharStyleImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getCharStyle()
		 * @generated
		 */
		EClass CHAR_STYLE = eINSTANCE.getCharStyle();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__ITALIC = eINSTANCE.getCharStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BOLD = eINSTANCE.getCharStyle_Bold();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__SIZE = eINSTANCE.getCharStyle_Size();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FAMILY = eINSTANCE.getCharStyle_Family();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FOREGROUND = eINSTANCE.getCharStyle_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BACKGROUND = eINSTANCE.getCharStyle_Background();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlQuestionImpl <em>Xml Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlQuestionImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlQuestion()
		 * @generated
		 */
		EClass XML_QUESTION = eINSTANCE.getXmlQuestion();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_QUESTION__XML = eINSTANCE.getXmlQuestion_Xml();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.AnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getAnswer()
		 * @generated
		 */
		EClass ANSWER = eINSTANCE.getAnswer();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___ACCEPT__OBJECT = eINSTANCE.getAnswer__Accept__Object();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___VALIDATE__OBJECT = eINSTANCE.getAnswer__Validate__Object();

		/**
		 * The meta object literal for the '<em><b>Create Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ANSWER___CREATE_PROPOSAL = eINSTANCE.getAnswer__CreateProposal();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.ProposalImpl <em>Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.ProposalImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getProposal()
		 * @generated
		 */
		EClass PROPOSAL = eINSTANCE.getProposal();

		/**
		 * The meta object literal for the '<em><b>Question</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__QUESTION = eINSTANCE.getProposal_Question();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPOSAL__ANSWER = eINSTANCE.getProposal_Answer();

		/**
		 * The meta object literal for the '<em><b>Get Proposal</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___GET_PROPOSAL = eINSTANCE.getProposal__GetProposal();

		/**
		 * The meta object literal for the '<em><b>Accept</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___ACCEPT = eINSTANCE.getProposal__Accept();

		/**
		 * The meta object literal for the '<em><b>Validate</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PROPOSAL___VALIDATE = eINSTANCE.getProposal__Validate();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.OptionAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionAnswer()
		 * @generated
		 */
		EClass OPTION_ANSWER = eINSTANCE.getOptionAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.SimpleAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getSimpleAnswer()
		 * @generated
		 */
		EClass SIMPLE_ANSWER = eINSTANCE.getSimpleAnswer();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ANSWER___GET_VALUE = eINSTANCE.getSimpleAnswer__GetValue();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.SimpleProposalImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getSimpleProposal()
		 * @generated
		 */
		EClass SIMPLE_PROPOSAL = eINSTANCE.getSimpleProposal();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PROPOSAL__PROPOSAL = eINSTANCE.getSimpleProposal_Proposal();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.StringAnswerImpl <em>String Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.StringAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getStringAnswer()
		 * @generated
		 */
		EClass STRING_ANSWER = eINSTANCE.getStringAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__VALUE = eINSTANCE.getStringAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__FORMAT = eINSTANCE.getStringAnswer_Format();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__REGEXP = eINSTANCE.getStringAnswer_Regexp();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__IGNORE_CASE = eINSTANCE.getStringAnswer_IgnoreCase();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.NumberAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getNumberAnswer()
		 * @generated
		 */
		EClass NUMBER_ANSWER = eINSTANCE.getNumberAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__VALUE = eINSTANCE.getNumberAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Error Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__ERROR_MARGIN = eINSTANCE.getNumberAnswer_ErrorMargin();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ANSWER__RANGE = eINSTANCE.getNumberAnswer_Range();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.NumberRangeImpl <em>Number Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.NumberRangeImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getNumberRange()
		 * @generated
		 */
		EClass NUMBER_RANGE = eINSTANCE.getNumberRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MIN = eINSTANCE.getNumberRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MAX = eINSTANCE.getNumberRange_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__STEP = eINSTANCE.getNumberRange_Step();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.BooleanAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getBooleanAnswer()
		 * @generated
		 */
		EClass BOOLEAN_ANSWER = eINSTANCE.getBooleanAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ANSWER__VALUE = eINSTANCE.getBooleanAnswer_Value();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlAnswerImpl <em>Xml Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlAnswer()
		 * @generated
		 */
		EClass XML_ANSWER = eINSTANCE.getXmlAnswer();

		/**
		 * The meta object literal for the '<em><b>Xml</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_ANSWER__XML = eINSTANCE.getXmlAnswer_Xml();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.OptionsAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionsAnswer()
		 * @generated
		 */
		EClass OPTIONS_ANSWER = eINSTANCE.getOptionsAnswer();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_ANSWER__OPTIONS = eINSTANCE.getOptionsAnswer_Options();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.OptionsProposalImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionsProposal()
		 * @generated
		 */
		EClass OPTIONS_PROPOSAL = eINSTANCE.getOptionsProposal();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_PROPOSAL__INDICES = eINSTANCE.getOptionsProposal_Indices();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.OptionImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__CORRECT = eINSTANCE.getOption_Correct();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__OPTION = eINSTANCE.getOption_Option();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.SingleOptionsAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getSingleOptionsAnswer()
		 * @generated
		 */
		EClass SINGLE_OPTIONS_ANSWER = eINSTANCE.getSingleOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.ManyOptionsAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getManyOptionsAnswer()
		 * @generated
		 */
		EClass MANY_OPTIONS_ANSWER = eINSTANCE.getManyOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlImpl <em>Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXml()
		 * @generated
		 */
		EClass XML = eINSTANCE.getXml();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML__ELEMENT = eINSTANCE.getXml_Element();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlContentsImpl <em>Xml Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlContentsImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlContents()
		 * @generated
		 */
		EClass XML_CONTENTS = eINSTANCE.getXmlContents();

		/**
		 * The meta object literal for the '<em><b>Element</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_CONTENTS__ELEMENT = eINSTANCE.getXmlContents_Element();

		/**
		 * The meta object literal for the '<em><b>Post</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_CONTENTS__POST = eINSTANCE.getXmlContents_Post();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlElementImpl <em>Xml Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlElementImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXmlElement();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlPIAnswerElementImpl <em>Xml PI Answer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlPIAnswerElementImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlPIAnswerElement()
		 * @generated
		 */
		EClass XML_PI_ANSWER_ELEMENT = eINSTANCE.getXmlPIAnswerElement();

		/**
		 * The meta object literal for the '<em><b>Answer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_PI_ANSWER_ELEMENT__ANSWER = eINSTANCE.getXmlPIAnswerElement_Answer();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlTagElementImpl <em>Xml Tag Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlTagElementImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlTagElement()
		 * @generated
		 */
		EClass XML_TAG_ELEMENT = eINSTANCE.getXmlTagElement();

		/**
		 * The meta object literal for the '<em><b>Start Tag</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TAG_ELEMENT__START_TAG = eINSTANCE.getXmlTagElement_StartTag();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TAG_ELEMENT__PRE = eINSTANCE.getXmlTagElement_Pre();

		/**
		 * The meta object literal for the '<em><b>Contents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TAG_ELEMENT__CONTENTS = eINSTANCE.getXmlTagElement_Contents();

		/**
		 * The meta object literal for the '<em><b>End Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TAG_ELEMENT__END_TAG = eINSTANCE.getXmlTagElement_EndTag();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlTagImpl <em>Xml Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlTagImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlTag()
		 * @generated
		 */
		EClass XML_TAG = eINSTANCE.getXmlTag();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_TAG__NAME = eINSTANCE.getXmlTag_Name();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XML_TAG__ATTRIBUTES = eINSTANCE.getXmlTag_Attributes();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.XmlAttributeImpl <em>Xml Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.XmlAttributeImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlAttribute()
		 * @generated
		 */
		EClass XML_ATTRIBUTE = eINSTANCE.getXmlAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE__NAME = eINSTANCE.getXmlAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XML_ATTRIBUTE__VALUE = eINSTANCE.getXmlAttribute_Value();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.TaskAnswerImpl <em>Task Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.TaskAnswerImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getTaskAnswer()
		 * @generated
		 */
		EClass TASK_ANSWER = eINSTANCE.getTaskAnswer();

		/**
		 * The meta object literal for the '<em><b>Required Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_ANSWER__REQUIRED_COUNT = eINSTANCE.getTaskAnswer_RequiredCount();

		/**
		 * The meta object literal for the '{@link no.hal.quiz.impl.TaskProposalImpl <em>Task Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.TaskProposalImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getTaskProposal()
		 * @generated
		 */
		EClass TASK_PROPOSAL = eINSTANCE.getTaskProposal();

		/**
		 * The meta object literal for the '<em><b>Completion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__COMPLETION = eINSTANCE.getTaskProposal_Completion();

		/**
		 * The meta object literal for the '<em><b>Proof</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__PROOF = eINSTANCE.getTaskProposal_Proof();

		/**
		 * The meta object literal for the '<em><b>Attempt Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__ATTEMPT_COUNT = eINSTANCE.getTaskProposal_AttemptCount();

		/**
		 * The meta object literal for the '<em><b>Performed Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK_PROPOSAL__PERFORMED_COUNT = eINSTANCE.getTaskProposal_PerformedCount();

		/**
		 * The meta object literal for the '<em>RGB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.util.RGB
		 * @see no.hal.quiz.impl.QuizPackageImpl#getRGB()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRGB();

	}

} //QuizPackage
