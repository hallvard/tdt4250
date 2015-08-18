/**
 */
package no.hal.pg.quiz.model;

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
 * @see no.hal.pg.quiz.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.quiz.model/model/quiz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quizModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.pg.quiz.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuizImpl <em>Quiz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuizImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuiz()
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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl <em>Quiz Task Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuizTaskDefImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizTaskDef()
	 * @generated
	 */
	int QUIZ_TASK_DEF = 1;

	/**
	 * The feature id for the '<em><b>Quiz Parts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__QUIZ_PARTS = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Correct Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__CORRECT_NEEDED = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Attempts Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF__ATTEMPTS_ALLOWED = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Quiz Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF_FEATURE_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quiz Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_TASK_DEF_OPERATION_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.AbstractQuizPartImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAbstractQuizPart()
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
	 * The number of operations of the '<em>Abstract Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_QUIZ_PART_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuizPartRefImpl <em>Quiz Part Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuizPartRefImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizPartRef()
	 * @generated
	 */
	int QUIZ_PART_REF = 3;

	/**
	 * The feature id for the '<em><b>Part Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF__PART_REF = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Quiz Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF_FEATURE_COUNT = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Quiz Part Ref</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_REF_OPERATION_COUNT = ABSTRACT_QUIZ_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuizPartImpl <em>Quiz Part</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuizPartImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizPart()
	 * @generated
	 */
	int QUIZ_PART = 4;

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
	 * The number of structural features of the '<em>Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_FEATURE_COUNT = ABSTRACT_QUIZ_PART_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Quiz Part</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUIZ_PART_OPERATION_COUNT = ABSTRACT_QUIZ_PART_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.AbstractQAImpl <em>Abstract QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.AbstractQAImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAbstractQA()
	 * @generated
	 */
	int ABSTRACT_QA = 5;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QARefImpl <em>QA Ref</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QARefImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQARef()
	 * @generated
	 */
	int QA_REF = 6;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QAImpl <em>QA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QAImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQA()
	 * @generated
	 */
	int QA = 7;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.QuestionImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 8;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.StringQuestionImpl <em>String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.StringQuestionImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getStringQuestion()
	 * @generated
	 */
	int STRING_QUESTION = 9;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlQuestionImpl <em>Xml Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlQuestionImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlQuestion()
	 * @generated
	 */
	int XML_QUESTION = 10;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.AnswerImpl <em>Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.AnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAnswer()
	 * @generated
	 */
	int ANSWER = 11;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.OptionAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOptionAnswer()
	 * @generated
	 */
	int OPTION_ANSWER = 12;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.SimpleAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getSimpleAnswer()
	 * @generated
	 */
	int SIMPLE_ANSWER = 13;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.StringAnswerImpl <em>String Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.StringAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getStringAnswer()
	 * @generated
	 */
	int STRING_ANSWER = 14;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.NumberAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getNumberAnswer()
	 * @generated
	 */
	int NUMBER_ANSWER = 15;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.BooleanAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getBooleanAnswer()
	 * @generated
	 */
	int BOOLEAN_ANSWER = 16;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlAnswerImpl <em>Xml Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlAnswer()
	 * @generated
	 */
	int XML_ANSWER = 17;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.OptionsAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOptionsAnswer()
	 * @generated
	 */
	int OPTIONS_ANSWER = 18;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.OptionImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 19;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.SingleOptionsAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getSingleOptionsAnswer()
	 * @generated
	 */
	int SINGLE_OPTIONS_ANSWER = 20;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.ManyOptionsAnswerImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getManyOptionsAnswer()
	 * @generated
	 */
	int MANY_OPTIONS_ANSWER = 21;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlImpl <em>Xml</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXml()
	 * @generated
	 */
	int XML = 22;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlContentsImpl <em>Xml Contents</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlContentsImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlContents()
	 * @generated
	 */
	int XML_CONTENTS = 23;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlElementImpl <em>Xml Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlElementImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlElement()
	 * @generated
	 */
	int XML_ELEMENT = 24;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlPIAnswerElementImpl <em>Xml PI Answer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlPIAnswerElementImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlPIAnswerElement()
	 * @generated
	 */
	int XML_PI_ANSWER_ELEMENT = 25;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlTagElementImpl <em>Xml Tag Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlTagElementImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlTagElement()
	 * @generated
	 */
	int XML_TAG_ELEMENT = 26;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlTagImpl <em>Xml Tag</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlTagImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlTag()
	 * @generated
	 */
	int XML_TAG = 27;

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
	 * The meta object id for the '{@link no.hal.pg.quiz.model.impl.XmlAttributeImpl <em>Xml Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.model.impl.XmlAttributeImpl
	 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlAttribute()
	 * @generated
	 */
	int XML_ATTRIBUTE = 28;

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
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.Quiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz</em>'.
	 * @see no.hal.pg.quiz.model.Quiz
	 * @generated
	 */
	EClass getQuiz();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.Quiz#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.quiz.model.Quiz#getName()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.Quiz#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.pg.quiz.model.Quiz#getTitle()
	 * @see #getQuiz()
	 * @generated
	 */
	EAttribute getQuiz_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.model.Quiz#getParts <em>Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parts</em>'.
	 * @see no.hal.pg.quiz.model.Quiz#getParts()
	 * @see #getQuiz()
	 * @generated
	 */
	EReference getQuiz_Parts();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QuizTaskDef <em>Quiz Task Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Task Def</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef
	 * @generated
	 */
	EClass getQuizTaskDef();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.quiz.model.QuizTaskDef#getQuizParts <em>Quiz Parts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Quiz Parts</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getQuizParts()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EReference getQuizTaskDef_QuizParts();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded <em>Correct Needed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct Needed</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EAttribute getQuizTaskDef_CorrectNeeded();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed <em>Attempts Allowed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attempts Allowed</em>'.
	 * @see no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed()
	 * @see #getQuizTaskDef()
	 * @generated
	 */
	EAttribute getQuizTaskDef_AttemptsAllowed();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.AbstractQuizPart <em>Abstract Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Quiz Part</em>'.
	 * @see no.hal.pg.quiz.model.AbstractQuizPart
	 * @generated
	 */
	EClass getAbstractQuizPart();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QuizPartRef <em>Quiz Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Part Ref</em>'.
	 * @see no.hal.pg.quiz.model.QuizPartRef
	 * @generated
	 */
	EClass getQuizPartRef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.quiz.model.QuizPartRef#getPartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Part Ref</em>'.
	 * @see no.hal.pg.quiz.model.QuizPartRef#getPartRef()
	 * @see #getQuizPartRef()
	 * @generated
	 */
	EReference getQuizPartRef_PartRef();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QuizPart <em>Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quiz Part</em>'.
	 * @see no.hal.pg.quiz.model.QuizPart
	 * @generated
	 */
	EClass getQuizPart();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizPart#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.quiz.model.QuizPart#getName()
	 * @see #getQuizPart()
	 * @generated
	 */
	EAttribute getQuizPart_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QuizPart#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see no.hal.pg.quiz.model.QuizPart#getTitle()
	 * @see #getQuizPart()
	 * @generated
	 */
	EAttribute getQuizPart_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.model.QuizPart#getQuestions <em>Questions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Questions</em>'.
	 * @see no.hal.pg.quiz.model.QuizPart#getQuestions()
	 * @see #getQuizPart()
	 * @generated
	 */
	EReference getQuizPart_Questions();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.AbstractQA <em>Abstract QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract QA</em>'.
	 * @see no.hal.pg.quiz.model.AbstractQA
	 * @generated
	 */
	EClass getAbstractQA();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QARef <em>QA Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA Ref</em>'.
	 * @see no.hal.pg.quiz.model.QARef
	 * @generated
	 */
	EClass getQARef();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pg.quiz.model.QARef#getQaRef <em>Qa Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Qa Ref</em>'.
	 * @see no.hal.pg.quiz.model.QARef#getQaRef()
	 * @see #getQARef()
	 * @generated
	 */
	EReference getQARef_QaRef();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.QA <em>QA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QA</em>'.
	 * @see no.hal.pg.quiz.model.QA
	 * @generated
	 */
	EClass getQA();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.QA#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.quiz.model.QA#getName()
	 * @see #getQA()
	 * @generated
	 */
	EAttribute getQA_Name();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.QA#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see no.hal.pg.quiz.model.QA#getQ()
	 * @see #getQA()
	 * @generated
	 */
	EReference getQA_Q();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.QA#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see no.hal.pg.quiz.model.QA#getA()
	 * @see #getQA()
	 * @generated
	 */
	EReference getQA_A();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see no.hal.pg.quiz.model.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.StringQuestion <em>String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Question</em>'.
	 * @see no.hal.pg.quiz.model.StringQuestion
	 * @generated
	 */
	EClass getStringQuestion();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.StringQuestion#getQuestion <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Question</em>'.
	 * @see no.hal.pg.quiz.model.StringQuestion#getQuestion()
	 * @see #getStringQuestion()
	 * @generated
	 */
	EAttribute getStringQuestion_Question();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlQuestion <em>Xml Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Question</em>'.
	 * @see no.hal.pg.quiz.model.XmlQuestion
	 * @generated
	 */
	EClass getXmlQuestion();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.XmlQuestion#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see no.hal.pg.quiz.model.XmlQuestion#getXml()
	 * @see #getXmlQuestion()
	 * @generated
	 */
	EReference getXmlQuestion_Xml();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Answer</em>'.
	 * @see no.hal.pg.quiz.model.Answer
	 * @generated
	 */
	EClass getAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.pg.quiz.model.Answer#accept(java.lang.Object) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accept</em>' operation.
	 * @see no.hal.pg.quiz.model.Answer#accept(java.lang.Object)
	 * @generated
	 */
	EOperation getAnswer__Accept__Object();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Answer</em>'.
	 * @see no.hal.pg.quiz.model.OptionAnswer
	 * @generated
	 */
	EClass getOptionAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Answer</em>'.
	 * @see no.hal.pg.quiz.model.SimpleAnswer
	 * @generated
	 */
	EClass getSimpleAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.SimpleAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.pg.quiz.model.SimpleAnswer#getValue()
	 * @see #getSimpleAnswer()
	 * @generated
	 */
	EAttribute getSimpleAnswer_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Answer</em>'.
	 * @see no.hal.pg.quiz.model.StringAnswer
	 * @generated
	 */
	EClass getStringAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.StringAnswer#isRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see no.hal.pg.quiz.model.StringAnswer#isRegexp()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.StringAnswer#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see no.hal.pg.quiz.model.StringAnswer#isIgnoreCase()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Answer</em>'.
	 * @see no.hal.pg.quiz.model.NumberAnswer
	 * @generated
	 */
	EClass getNumberAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.NumberAnswer#getErrorMargin <em>Error Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Margin</em>'.
	 * @see no.hal.pg.quiz.model.NumberAnswer#getErrorMargin()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_ErrorMargin();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Answer</em>'.
	 * @see no.hal.pg.quiz.model.BooleanAnswer
	 * @generated
	 */
	EClass getBooleanAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlAnswer <em>Xml Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Answer</em>'.
	 * @see no.hal.pg.quiz.model.XmlAnswer
	 * @generated
	 */
	EClass getXmlAnswer();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.XmlAnswer#getXml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Xml</em>'.
	 * @see no.hal.pg.quiz.model.XmlAnswer#getXml()
	 * @see #getXmlAnswer()
	 * @generated
	 */
	EReference getXmlAnswer_Xml();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Answer</em>'.
	 * @see no.hal.pg.quiz.model.OptionsAnswer
	 * @generated
	 */
	EClass getOptionsAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.model.OptionsAnswer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see no.hal.pg.quiz.model.OptionsAnswer#getOptions()
	 * @see #getOptionsAnswer()
	 * @generated
	 */
	EReference getOptionsAnswer_Options();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see no.hal.pg.quiz.model.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.Option#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see no.hal.pg.quiz.model.Option#isCorrect()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Correct();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.Option#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see no.hal.pg.quiz.model.Option#getOption()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Option();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Options Answer</em>'.
	 * @see no.hal.pg.quiz.model.SingleOptionsAnswer
	 * @generated
	 */
	EClass getSingleOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Options Answer</em>'.
	 * @see no.hal.pg.quiz.model.ManyOptionsAnswer
	 * @generated
	 */
	EClass getManyOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.Xml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml</em>'.
	 * @see no.hal.pg.quiz.model.Xml
	 * @generated
	 */
	EClass getXml();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.Xml#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see no.hal.pg.quiz.model.Xml#getElement()
	 * @see #getXml()
	 * @generated
	 */
	EReference getXml_Element();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlContents <em>Xml Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Contents</em>'.
	 * @see no.hal.pg.quiz.model.XmlContents
	 * @generated
	 */
	EClass getXmlContents();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.XmlContents#getElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Element</em>'.
	 * @see no.hal.pg.quiz.model.XmlContents#getElement()
	 * @see #getXmlContents()
	 * @generated
	 */
	EReference getXmlContents_Element();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlContents#getPost <em>Post</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Post</em>'.
	 * @see no.hal.pg.quiz.model.XmlContents#getPost()
	 * @see #getXmlContents()
	 * @generated
	 */
	EAttribute getXmlContents_Post();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Element</em>'.
	 * @see no.hal.pg.quiz.model.XmlElement
	 * @generated
	 */
	EClass getXmlElement();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlPIAnswerElement <em>Xml PI Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml PI Answer Element</em>'.
	 * @see no.hal.pg.quiz.model.XmlPIAnswerElement
	 * @generated
	 */
	EClass getXmlPIAnswerElement();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.XmlPIAnswerElement#getAnswer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Answer</em>'.
	 * @see no.hal.pg.quiz.model.XmlPIAnswerElement#getAnswer()
	 * @see #getXmlPIAnswerElement()
	 * @generated
	 */
	EReference getXmlPIAnswerElement_Answer();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlTagElement <em>Xml Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Tag Element</em>'.
	 * @see no.hal.pg.quiz.model.XmlTagElement
	 * @generated
	 */
	EClass getXmlTagElement();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.pg.quiz.model.XmlTagElement#getStartTag <em>Start Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Start Tag</em>'.
	 * @see no.hal.pg.quiz.model.XmlTagElement#getStartTag()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EReference getXmlTagElement_StartTag();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlTagElement#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pre</em>'.
	 * @see no.hal.pg.quiz.model.XmlTagElement#getPre()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EAttribute getXmlTagElement_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.model.XmlTagElement#getContents <em>Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contents</em>'.
	 * @see no.hal.pg.quiz.model.XmlTagElement#getContents()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EReference getXmlTagElement_Contents();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlTagElement#getEndTag <em>End Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Tag</em>'.
	 * @see no.hal.pg.quiz.model.XmlTagElement#getEndTag()
	 * @see #getXmlTagElement()
	 * @generated
	 */
	EAttribute getXmlTagElement_EndTag();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Tag</em>'.
	 * @see no.hal.pg.quiz.model.XmlTag
	 * @generated
	 */
	EClass getXmlTag();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlTag#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.quiz.model.XmlTag#getName()
	 * @see #getXmlTag()
	 * @generated
	 */
	EAttribute getXmlTag_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pg.quiz.model.XmlTag#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see no.hal.pg.quiz.model.XmlTag#getAttributes()
	 * @see #getXmlTag()
	 * @generated
	 */
	EReference getXmlTag_Attributes();

	/**
	 * Returns the meta object for class '{@link no.hal.pg.quiz.model.XmlAttribute <em>Xml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Xml Attribute</em>'.
	 * @see no.hal.pg.quiz.model.XmlAttribute
	 * @generated
	 */
	EClass getXmlAttribute();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pg.quiz.model.XmlAttribute#getName()
	 * @see #getXmlAttribute()
	 * @generated
	 */
	EAttribute getXmlAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pg.quiz.model.XmlAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.pg.quiz.model.XmlAttribute#getValue()
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
	ModelFactory getModelFactory();

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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuizImpl <em>Quiz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuizImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuiz()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuizTaskDefImpl <em>Quiz Task Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuizTaskDefImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizTaskDef()
		 * @generated
		 */
		EClass QUIZ_TASK_DEF = eINSTANCE.getQuizTaskDef();

		/**
		 * The meta object literal for the '<em><b>Quiz Parts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUIZ_TASK_DEF__QUIZ_PARTS = eINSTANCE.getQuizTaskDef_QuizParts();

		/**
		 * The meta object literal for the '<em><b>Correct Needed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_TASK_DEF__CORRECT_NEEDED = eINSTANCE.getQuizTaskDef_CorrectNeeded();

		/**
		 * The meta object literal for the '<em><b>Attempts Allowed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUIZ_TASK_DEF__ATTEMPTS_ALLOWED = eINSTANCE.getQuizTaskDef_AttemptsAllowed();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.AbstractQuizPartImpl <em>Abstract Quiz Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.AbstractQuizPartImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAbstractQuizPart()
		 * @generated
		 */
		EClass ABSTRACT_QUIZ_PART = eINSTANCE.getAbstractQuizPart();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuizPartRefImpl <em>Quiz Part Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuizPartRefImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizPartRef()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuizPartImpl <em>Quiz Part</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuizPartImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuizPart()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.AbstractQAImpl <em>Abstract QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.AbstractQAImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAbstractQA()
		 * @generated
		 */
		EClass ABSTRACT_QA = eINSTANCE.getAbstractQA();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QARefImpl <em>QA Ref</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QARefImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQARef()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QAImpl <em>QA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QAImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQA()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.QuestionImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.StringQuestionImpl <em>String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.StringQuestionImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getStringQuestion()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlQuestionImpl <em>Xml Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlQuestionImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlQuestion()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.AnswerImpl <em>Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.AnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.OptionAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOptionAnswer()
		 * @generated
		 */
		EClass OPTION_ANSWER = eINSTANCE.getOptionAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.SimpleAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getSimpleAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.StringAnswerImpl <em>String Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.StringAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getStringAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.NumberAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getNumberAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.BooleanAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getBooleanAnswer()
		 * @generated
		 */
		EClass BOOLEAN_ANSWER = eINSTANCE.getBooleanAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlAnswerImpl <em>Xml Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.OptionsAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOptionsAnswer()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.OptionImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getOption()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.SingleOptionsAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getSingleOptionsAnswer()
		 * @generated
		 */
		EClass SINGLE_OPTIONS_ANSWER = eINSTANCE.getSingleOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.ManyOptionsAnswerImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getManyOptionsAnswer()
		 * @generated
		 */
		EClass MANY_OPTIONS_ANSWER = eINSTANCE.getManyOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlImpl <em>Xml</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXml()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlContentsImpl <em>Xml Contents</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlContentsImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlContents()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlElementImpl <em>Xml Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlElementImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlElement()
		 * @generated
		 */
		EClass XML_ELEMENT = eINSTANCE.getXmlElement();

		/**
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlPIAnswerElementImpl <em>Xml PI Answer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlPIAnswerElementImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlPIAnswerElement()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlTagElementImpl <em>Xml Tag Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlTagElementImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlTagElement()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlTagImpl <em>Xml Tag</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlTagImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlTag()
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
		 * The meta object literal for the '{@link no.hal.pg.quiz.model.impl.XmlAttributeImpl <em>Xml Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.quiz.model.impl.XmlAttributeImpl
		 * @see no.hal.pg.quiz.model.impl.ModelPackageImpl#getXmlAttribute()
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
