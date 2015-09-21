/**
 */
package no.hal.quiz;

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
	 * The number of operations of the '<em>Quiz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.AbstractQuizPartImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQuizPart()
	 * @generated
	 */
	int ABSTRACT_QUIZ_PART = 1;

	/**
	 * The number of structural features of the '<em>Abstract Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QuizPartRefImpl <em>Part Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QuizPartRefImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQuizPartRef()
	 * @generated
	 */
	int QUIZ_PART_REF = 2;

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
	int QUIZ_PART = 3;

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
	int ABSTRACT_QA = 4;

	/**
	 * The number of structural features of the '<em>Abstract QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Abstract QA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.QARefImpl <em>QA Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.QARefImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getQARef()
	 * @generated
	 */
	int QA_REF = 5;

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
	int QA = 6;

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
	int QUESTION = 7;

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
	int STRING_QUESTION = 8;

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
	 * The meta object id for the '{@link no.hal.quiz.impl.XmlQuestionImpl <em>Xml Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.XmlQuestionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getXmlQuestion()
	 * @generated
	 */
	int XML_QUESTION = 9;

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
	int ANSWER = 10;

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
	 * The number of operations of the '<em>Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANSWER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOptionAnswer()
	 * @generated
	 */
	int OPTION_ANSWER = 11;

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
	int SIMPLE_ANSWER = 12;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER__VALUE = OPTION_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_FEATURE_COUNT = OPTION_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___ACCEPT__OBJECT = OPTION_ANSWER___ACCEPT__OBJECT;

	/**
	 * The number of operations of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_OPERATION_COUNT = OPTION_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.StringAnswerImpl <em>String Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.StringAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getStringAnswer()
	 * @generated
	 */
	int STRING_ANSWER = 13;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__VALUE = SIMPLE_ANSWER__VALUE;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__REGEXP = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__IGNORE_CASE = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

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
	int NUMBER_ANSWER = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__VALUE = SIMPLE_ANSWER__VALUE;

	/**
	 * The feature id for the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__ERROR_MARGIN = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The number of operations of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.BooleanAnswerImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getBooleanAnswer()
	 * @generated
	 */
	int BOOLEAN_ANSWER = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER__VALUE = SIMPLE_ANSWER__VALUE;

	/**
	 * The number of structural features of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

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
	int XML_ANSWER = 16;

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
	int OPTIONS_ANSWER = 17;

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
	 * The number of operations of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_OPERATION_COUNT = ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.quiz.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.impl.OptionImpl
	 * @see no.hal.quiz.impl.QuizPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 18;

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
	int SINGLE_OPTIONS_ANSWER = 19;

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
	int MANY_OPTIONS_ANSWER = 20;

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
	int XML = 21;

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
	int XML_CONTENTS = 22;

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
	int XML_ELEMENT = 23;

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
	int XML_PI_ANSWER_ELEMENT = 24;

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
	int XML_TAG_ELEMENT = 25;

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
	int XML_TAG = 26;

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
	int XML_ATTRIBUTE = 27;

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
	 * Returns the meta object for class '{@link no.hal.quiz.AbstractQuizPart <em>Abstract Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quiz Part</em>'.
	 * @see no.hal.quiz.AbstractQuizPart
	 * @generated
	 */
	EClass getAbstractQuizPart();

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
	 * Returns the meta object for the attribute '{@link no.hal.quiz.SimpleAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.quiz.SimpleAnswer#getValue()
	 * @see #getSimpleAnswer()
	 * @generated
	 */
	EAttribute getSimpleAnswer_Value();

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
	 * Returns the meta object for class '{@link no.hal.quiz.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Answer</em>'.
	 * @see no.hal.quiz.BooleanAnswer
	 * @generated
	 */
	EClass getBooleanAnswer();

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
		 * The meta object literal for the '{@link no.hal.quiz.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.quiz.impl.AbstractQuizPartImpl
		 * @see no.hal.quiz.impl.QuizPackageImpl#getAbstractQuizPart()
		 * @generated
		 */
		EClass ABSTRACT_QUIZ_PART = eINSTANCE.getAbstractQuizPart();

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
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_ANSWER__VALUE = eINSTANCE.getSimpleAnswer_Value();

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
		 * The meta object literal for the '<em><b>Error Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__ERROR_MARGIN = eINSTANCE.getNumberAnswer_ErrorMargin();

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

	}

} //QuizPackage