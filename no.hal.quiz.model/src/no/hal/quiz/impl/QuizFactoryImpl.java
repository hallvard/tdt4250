/**
 */
package no.hal.quiz.impl;

import no.hal.quiz.*;

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
public class QuizFactoryImpl extends EFactoryImpl implements QuizFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static QuizFactory init() {
		try {
			QuizFactory theQuizFactory = (QuizFactory)EPackage.Registry.INSTANCE.getEFactory(QuizPackage.eNS_URI);
			if (theQuizFactory != null) {
				return theQuizFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new QuizFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizFactoryImpl() {
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
			case QuizPackage.QUIZ: return createQuiz();
			case QuizPackage.QUIZ_PART_REF: return createQuizPartRef();
			case QuizPackage.QUIZ_PART: return createQuizPart();
			case QuizPackage.QA_REF: return createQARef();
			case QuizPackage.QA: return createQA();
			case QuizPackage.STRING_QUESTION: return createStringQuestion();
			case QuizPackage.XML_QUESTION: return createXmlQuestion();
			case QuizPackage.STRING_ANSWER: return createStringAnswer();
			case QuizPackage.NUMBER_ANSWER: return createNumberAnswer();
			case QuizPackage.BOOLEAN_ANSWER: return createBooleanAnswer();
			case QuizPackage.XML_ANSWER: return createXmlAnswer();
			case QuizPackage.OPTIONS_ANSWER: return createOptionsAnswer();
			case QuizPackage.OPTION: return createOption();
			case QuizPackage.SINGLE_OPTIONS_ANSWER: return createSingleOptionsAnswer();
			case QuizPackage.MANY_OPTIONS_ANSWER: return createManyOptionsAnswer();
			case QuizPackage.XML: return createXml();
			case QuizPackage.XML_CONTENTS: return createXmlContents();
			case QuizPackage.XML_PI_ANSWER_ELEMENT: return createXmlPIAnswerElement();
			case QuizPackage.XML_TAG_ELEMENT: return createXmlTagElement();
			case QuizPackage.XML_TAG: return createXmlTag();
			case QuizPackage.XML_ATTRIBUTE: return createXmlAttribute();
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
	public QuizPackage getQuizPackage() {
		return (QuizPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static QuizPackage getPackage() {
		return QuizPackage.eINSTANCE;
	}

} //QuizFactoryImpl
