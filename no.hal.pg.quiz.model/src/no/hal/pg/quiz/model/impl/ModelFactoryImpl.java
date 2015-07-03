/**
 */
package no.hal.pg.quiz.model.impl;

import no.hal.pg.quiz.model.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelFactoryImpl extends EFactoryImpl implements ModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ModelFactory init() {
		try {
			ModelFactory theModelFactory = (ModelFactory)EPackage.Registry.INSTANCE.getEFactory(ModelPackage.eNS_URI);
			if (theModelFactory != null) {
				return theModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ModelPackage.QUIZ: return createQuiz();
			case ModelPackage.QUIZ_TASK_DEF: return createQuizTaskDef();
			case ModelPackage.QUIZ_PART_REF: return createQuizPartRef();
			case ModelPackage.QUIZ_PART: return createQuizPart();
			case ModelPackage.QA_REF: return createQARef();
			case ModelPackage.QA: return createQA();
			case ModelPackage.STRING_QUESTION: return createStringQuestion();
			case ModelPackage.XML_QUESTION: return createXmlQuestion();
			case ModelPackage.STRING_ANSWER: return createStringAnswer();
			case ModelPackage.NUMBER_ANSWER: return createNumberAnswer();
			case ModelPackage.BOOLEAN_ANSWER: return createBooleanAnswer();
			case ModelPackage.XML_ANSWER: return createXmlAnswer();
			case ModelPackage.OPTIONS_ANSWER: return createOptionsAnswer();
			case ModelPackage.OPTION: return createOption();
			case ModelPackage.SINGLE_OPTIONS_ANSWER: return createSingleOptionsAnswer();
			case ModelPackage.MANY_OPTIONS_ANSWER: return createManyOptionsAnswer();
			case ModelPackage.XML: return createXml();
			case ModelPackage.XML_CONTENTS: return createXmlContents();
			case ModelPackage.XML_PI_ANSWER_ELEMENT: return createXmlPIAnswerElement();
			case ModelPackage.XML_TAG_ELEMENT: return createXmlTagElement();
			case ModelPackage.XML_TAG: return createXmlTag();
			case ModelPackage.XML_ATTRIBUTE: return createXmlAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Quiz createQuiz() {
		QuizImpl quiz = new QuizImpl();
		return quiz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTaskDef createQuizTaskDef() {
		QuizTaskDefImpl quizTaskDef = new QuizTaskDefImpl();
		return quizTaskDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartRef createQuizPartRef() {
		QuizPartRefImpl quizPartRef = new QuizPartRefImpl();
		return quizPartRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPart createQuizPart() {
		QuizPartImpl quizPart = new QuizPartImpl();
		return quizPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QARef createQARef() {
		QARefImpl qaRef = new QARefImpl();
		return qaRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QA createQA() {
		QAImpl qa = new QAImpl();
		return qa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringQuestion createStringQuestion() {
		StringQuestionImpl stringQuestion = new StringQuestionImpl();
		return stringQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlQuestion createXmlQuestion() {
		XmlQuestionImpl xmlQuestion = new XmlQuestionImpl();
		return xmlQuestion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringAnswer createStringAnswer() {
		StringAnswerImpl stringAnswer = new StringAnswerImpl();
		return stringAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberAnswer createNumberAnswer() {
		NumberAnswerImpl numberAnswer = new NumberAnswerImpl();
		return numberAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanAnswer createBooleanAnswer() {
		BooleanAnswerImpl booleanAnswer = new BooleanAnswerImpl();
		return booleanAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAnswer createXmlAnswer() {
		XmlAnswerImpl xmlAnswer = new XmlAnswerImpl();
		return xmlAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsAnswer createOptionsAnswer() {
		OptionsAnswerImpl optionsAnswer = new OptionsAnswerImpl();
		return optionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SingleOptionsAnswer createSingleOptionsAnswer() {
		SingleOptionsAnswerImpl singleOptionsAnswer = new SingleOptionsAnswerImpl();
		return singleOptionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManyOptionsAnswer createManyOptionsAnswer() {
		ManyOptionsAnswerImpl manyOptionsAnswer = new ManyOptionsAnswerImpl();
		return manyOptionsAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xml createXml() {
		XmlImpl xml = new XmlImpl();
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlContents createXmlContents() {
		XmlContentsImpl xmlContents = new XmlContentsImpl();
		return xmlContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlPIAnswerElement createXmlPIAnswerElement() {
		XmlPIAnswerElementImpl xmlPIAnswerElement = new XmlPIAnswerElementImpl();
		return xmlPIAnswerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTagElement createXmlTagElement() {
		XmlTagElementImpl xmlTagElement = new XmlTagElementImpl();
		return xmlTagElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlTag createXmlTag() {
		XmlTagImpl xmlTag = new XmlTagImpl();
		return xmlTag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XmlAttribute createXmlAttribute() {
		XmlAttributeImpl xmlAttribute = new XmlAttributeImpl();
		return xmlAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelPackage getModelPackage() {
		return (ModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ModelPackage getPackage() {
		return ModelPackage.eINSTANCE;
	}

} //QuizFactoryImpl
