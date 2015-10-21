/**
 */
package no.hal.quiz.impl;

import no.hal.quiz.AbstractQA;
import no.hal.quiz.AbstractQuizPart;
import no.hal.quiz.Answer;
import no.hal.quiz.BooleanAnswer;
import no.hal.quiz.ManyOptionsAnswer;
import no.hal.quiz.NumberAnswer;
import no.hal.quiz.Option;
import no.hal.quiz.OptionAnswer;
import no.hal.quiz.OptionsAnswer;
import no.hal.quiz.QARef;
import no.hal.quiz.Question;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;
import no.hal.quiz.QuizPartRef;
import no.hal.quiz.SimpleAnswer;
import no.hal.quiz.SingleOptionsAnswer;
import no.hal.quiz.StringAnswer;
import no.hal.quiz.StringQuestion;
import no.hal.quiz.Xml;
import no.hal.quiz.XmlAnswer;
import no.hal.quiz.XmlAttribute;
import no.hal.quiz.XmlContents;
import no.hal.quiz.XmlElement;
import no.hal.quiz.XmlPIAnswerElement;
import no.hal.quiz.XmlQuestion;
import no.hal.quiz.XmlTag;
import no.hal.quiz.XmlTagElement;

import no.hal.quiz.util.QuizValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPackageImpl extends EPackageImpl implements QuizPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quizEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQuizPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quizPartRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass quizPartEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractQAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaRefEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass questionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass answerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlPIAnswerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTagElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xmlAttributeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.quiz.QuizPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuizPackageImpl() {
		super(eNS_URI, QuizFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuizPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuizPackage init() {
		if (isInited) return (QuizPackage)EPackage.Registry.INSTANCE.getEPackage(QuizPackage.eNS_URI);

		// Obtain or create and register package
		QuizPackageImpl theQuizPackage = (QuizPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuizPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuizPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theQuizPackage.createPackageContents();

		// Initialize created meta-data
		theQuizPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQuizPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QuizValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQuizPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuizPackage.eNS_URI, theQuizPackage);
		return theQuizPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuiz() {
		return quizEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuiz_Name() {
		return (EAttribute)quizEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuiz_Title() {
		return (EAttribute)quizEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuiz_Parts() {
		return (EReference)quizEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQuizPart() {
		return abstractQuizPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuizPartRef() {
		return quizPartRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuizPartRef_PartRef() {
		return (EReference)quizPartRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuizPart() {
		return quizPartEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuizPart_Name() {
		return (EAttribute)quizPartEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQuizPart_Title() {
		return (EAttribute)quizPartEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQuizPart_Questions() {
		return (EReference)quizPartEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractQA() {
		return abstractQAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQARef() {
		return qaRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQARef_QaRef() {
		return (EReference)qaRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQA() {
		return qaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQA_Name() {
		return (EAttribute)qaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQA_Q() {
		return (EReference)qaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQA_A() {
		return (EReference)qaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQuestion() {
		return questionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringQuestion() {
		return stringQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringQuestion_Question() {
		return (EAttribute)stringQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlQuestion() {
		return xmlQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlQuestion_Xml() {
		return (EReference)xmlQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnswer() {
		return answerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAnswer__Accept__Object() {
		return answerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionAnswer() {
		return optionAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAnswer() {
		return simpleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleAnswer__GetValue() {
		return simpleAnswerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringAnswer() {
		return stringAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Value() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Regexp() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_IgnoreCase() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberAnswer() {
		return numberAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_Value() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_ErrorMargin() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAnswer() {
		return booleanAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanAnswer_Value() {
		return (EAttribute)booleanAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlAnswer() {
		return xmlAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlAnswer_Xml() {
		return (EReference)xmlAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsAnswer() {
		return optionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsAnswer_Options() {
		return (EReference)optionsAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Correct() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Option() {
		return (EReference)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOptionsAnswer() {
		return singleOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyOptionsAnswer() {
		return manyOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXml() {
		return xmlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXml_Element() {
		return (EReference)xmlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlContents() {
		return xmlContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlContents_Element() {
		return (EReference)xmlContentsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlContents_Post() {
		return (EAttribute)xmlContentsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlElement() {
		return xmlElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlPIAnswerElement() {
		return xmlPIAnswerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlPIAnswerElement_Answer() {
		return (EReference)xmlPIAnswerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlTagElement() {
		return xmlTagElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlTagElement_StartTag() {
		return (EReference)xmlTagElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlTagElement_Pre() {
		return (EAttribute)xmlTagElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlTagElement_Contents() {
		return (EReference)xmlTagElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlTagElement_EndTag() {
		return (EAttribute)xmlTagElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlTag() {
		return xmlTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlTag_Name() {
		return (EAttribute)xmlTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXmlTag_Attributes() {
		return (EReference)xmlTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXmlAttribute() {
		return xmlAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlAttribute_Name() {
		return (EAttribute)xmlAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXmlAttribute_Value() {
		return (EAttribute)xmlAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizFactory getQuizFactory() {
		return (QuizFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		quizEClass = createEClass(QUIZ);
		createEAttribute(quizEClass, QUIZ__NAME);
		createEAttribute(quizEClass, QUIZ__TITLE);
		createEReference(quizEClass, QUIZ__PARTS);

		abstractQuizPartEClass = createEClass(ABSTRACT_QUIZ_PART);

		quizPartRefEClass = createEClass(QUIZ_PART_REF);
		createEReference(quizPartRefEClass, QUIZ_PART_REF__PART_REF);

		quizPartEClass = createEClass(QUIZ_PART);
		createEAttribute(quizPartEClass, QUIZ_PART__NAME);
		createEAttribute(quizPartEClass, QUIZ_PART__TITLE);
		createEReference(quizPartEClass, QUIZ_PART__QUESTIONS);

		abstractQAEClass = createEClass(ABSTRACT_QA);

		qaRefEClass = createEClass(QA_REF);
		createEReference(qaRefEClass, QA_REF__QA_REF);

		qaEClass = createEClass(QA);
		createEAttribute(qaEClass, QA__NAME);
		createEReference(qaEClass, QA__Q);
		createEReference(qaEClass, QA__A);

		questionEClass = createEClass(QUESTION);

		stringQuestionEClass = createEClass(STRING_QUESTION);
		createEAttribute(stringQuestionEClass, STRING_QUESTION__QUESTION);

		xmlQuestionEClass = createEClass(XML_QUESTION);
		createEReference(xmlQuestionEClass, XML_QUESTION__XML);

		answerEClass = createEClass(ANSWER);
		createEOperation(answerEClass, ANSWER___ACCEPT__OBJECT);

		optionAnswerEClass = createEClass(OPTION_ANSWER);

		simpleAnswerEClass = createEClass(SIMPLE_ANSWER);
		createEOperation(simpleAnswerEClass, SIMPLE_ANSWER___GET_VALUE);

		stringAnswerEClass = createEClass(STRING_ANSWER);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__VALUE);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__REGEXP);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__IGNORE_CASE);

		numberAnswerEClass = createEClass(NUMBER_ANSWER);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__VALUE);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__ERROR_MARGIN);

		booleanAnswerEClass = createEClass(BOOLEAN_ANSWER);
		createEAttribute(booleanAnswerEClass, BOOLEAN_ANSWER__VALUE);

		xmlAnswerEClass = createEClass(XML_ANSWER);
		createEReference(xmlAnswerEClass, XML_ANSWER__XML);

		optionsAnswerEClass = createEClass(OPTIONS_ANSWER);
		createEReference(optionsAnswerEClass, OPTIONS_ANSWER__OPTIONS);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__CORRECT);
		createEReference(optionEClass, OPTION__OPTION);

		singleOptionsAnswerEClass = createEClass(SINGLE_OPTIONS_ANSWER);

		manyOptionsAnswerEClass = createEClass(MANY_OPTIONS_ANSWER);

		xmlEClass = createEClass(XML);
		createEReference(xmlEClass, XML__ELEMENT);

		xmlContentsEClass = createEClass(XML_CONTENTS);
		createEReference(xmlContentsEClass, XML_CONTENTS__ELEMENT);
		createEAttribute(xmlContentsEClass, XML_CONTENTS__POST);

		xmlElementEClass = createEClass(XML_ELEMENT);

		xmlPIAnswerElementEClass = createEClass(XML_PI_ANSWER_ELEMENT);
		createEReference(xmlPIAnswerElementEClass, XML_PI_ANSWER_ELEMENT__ANSWER);

		xmlTagElementEClass = createEClass(XML_TAG_ELEMENT);
		createEReference(xmlTagElementEClass, XML_TAG_ELEMENT__START_TAG);
		createEAttribute(xmlTagElementEClass, XML_TAG_ELEMENT__PRE);
		createEReference(xmlTagElementEClass, XML_TAG_ELEMENT__CONTENTS);
		createEAttribute(xmlTagElementEClass, XML_TAG_ELEMENT__END_TAG);

		xmlTagEClass = createEClass(XML_TAG);
		createEAttribute(xmlTagEClass, XML_TAG__NAME);
		createEReference(xmlTagEClass, XML_TAG__ATTRIBUTES);

		xmlAttributeEClass = createEClass(XML_ATTRIBUTE);
		createEAttribute(xmlAttributeEClass, XML_ATTRIBUTE__NAME);
		createEAttribute(xmlAttributeEClass, XML_ATTRIBUTE__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter simpleAnswerEClass_T = addETypeParameter(simpleAnswerEClass, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		quizPartRefEClass.getESuperTypes().add(this.getAbstractQuizPart());
		quizPartEClass.getESuperTypes().add(this.getAbstractQuizPart());
		qaRefEClass.getESuperTypes().add(this.getAbstractQA());
		qaEClass.getESuperTypes().add(this.getAbstractQA());
		stringQuestionEClass.getESuperTypes().add(this.getQuestion());
		xmlQuestionEClass.getESuperTypes().add(this.getQuestion());
		optionAnswerEClass.getESuperTypes().add(this.getAnswer());
		simpleAnswerEClass.getESuperTypes().add(this.getOptionAnswer());
		EGenericType g1 = createEGenericType(this.getSimpleAnswer());
		EGenericType g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		numberAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanAnswerEClass.getEGenericSuperTypes().add(g1);
		xmlAnswerEClass.getESuperTypes().add(this.getOptionAnswer());
		optionsAnswerEClass.getESuperTypes().add(this.getAnswer());
		singleOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());
		manyOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());
		xmlPIAnswerElementEClass.getESuperTypes().add(this.getXmlElement());
		xmlTagElementEClass.getESuperTypes().add(this.getXmlElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(quizEClass, Quiz.class, "Quiz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuiz_Name(), ecorePackage.getEString(), "name", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuiz_Title(), ecorePackage.getEString(), "title", null, 0, 1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuiz_Parts(), this.getAbstractQuizPart(), null, "parts", null, 0, -1, Quiz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQuizPartEClass, AbstractQuizPart.class, "AbstractQuizPart", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(quizPartRefEClass, QuizPartRef.class, "QuizPartRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQuizPartRef_PartRef(), this.getQuizPart(), null, "partRef", null, 0, 1, QuizPartRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(quizPartEClass, QuizPart.class, "QuizPart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQuizPart_Name(), ecorePackage.getEString(), "name", null, 0, 1, QuizPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQuizPart_Title(), ecorePackage.getEString(), "title", null, 0, 1, QuizPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQuizPart_Questions(), this.getAbstractQA(), null, "questions", null, 0, -1, QuizPart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractQAEClass, AbstractQA.class, "AbstractQA", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qaRefEClass, QARef.class, "QARef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQARef_QaRef(), this.getQA(), null, "qaRef", null, 0, 1, QARef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(qaEClass, no.hal.quiz.QA.class, "QA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getQA_Name(), ecorePackage.getEString(), "name", null, 0, 1, no.hal.quiz.QA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQA_Q(), this.getQuestion(), null, "q", null, 0, 1, no.hal.quiz.QA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQA_A(), this.getAnswer(), null, "a", null, 0, 1, no.hal.quiz.QA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(questionEClass, Question.class, "Question", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(stringQuestionEClass, StringQuestion.class, "StringQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringQuestion_Question(), ecorePackage.getEString(), "question", null, 0, 1, StringQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlQuestionEClass, XmlQuestion.class, "XmlQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlQuestion_Xml(), this.getXml(), null, "xml", null, 0, 1, XmlQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(answerEClass, Answer.class, "Answer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getAnswer__Accept__Object(), ecorePackage.getEBooleanObject(), "accept", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEJavaObject(), "proposal", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(optionAnswerEClass, OptionAnswer.class, "OptionAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleAnswerEClass, SimpleAnswer.class, "SimpleAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getSimpleAnswer__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(simpleAnswerEClass_T);
		initEOperation(op, g1);

		initEClass(stringAnswerEClass, StringAnswer.class, "StringAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringAnswer_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_Regexp(), ecorePackage.getEBoolean(), "regexp", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberAnswerEClass, NumberAnswer.class, "NumberAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberAnswer_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberAnswer_ErrorMargin(), ecorePackage.getEDouble(), "errorMargin", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanAnswerEClass, BooleanAnswer.class, "BooleanAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanAnswer_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAnswerEClass, XmlAnswer.class, "XmlAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlAnswer_Xml(), this.getXml(), null, "xml", null, 0, 1, XmlAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsAnswerEClass, OptionsAnswer.class, "OptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsAnswer_Options(), this.getOption(), null, "options", null, 0, -1, OptionsAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Correct(), ecorePackage.getEBoolean(), "correct", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Option(), this.getOptionAnswer(), null, "option", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleOptionsAnswerEClass, SingleOptionsAnswer.class, "SingleOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyOptionsAnswerEClass, ManyOptionsAnswer.class, "ManyOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlEClass, Xml.class, "Xml", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXml_Element(), this.getXmlElement(), null, "element", null, 0, 1, Xml.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlContentsEClass, XmlContents.class, "XmlContents", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlContents_Element(), this.getXmlElement(), null, "element", null, 0, 1, XmlContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlContents_Post(), ecorePackage.getEString(), "post", null, 0, 1, XmlContents.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlElementEClass, XmlElement.class, "XmlElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xmlPIAnswerElementEClass, XmlPIAnswerElement.class, "XmlPIAnswerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEReference(getXmlPIAnswerElement_Answer(), g1, null, "answer", null, 0, 1, XmlPIAnswerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTagElementEClass, XmlTagElement.class, "XmlTagElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXmlTagElement_StartTag(), this.getXmlTag(), null, "startTag", null, 0, 1, XmlTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTagElement_Pre(), ecorePackage.getEString(), "pre", null, 0, 1, XmlTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlTagElement_Contents(), this.getXmlContents(), null, "contents", null, 0, -1, XmlTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlTagElement_EndTag(), ecorePackage.getEString(), "endTag", null, 0, 1, XmlTagElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlTagEClass, XmlTag.class, "XmlTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlTag_Name(), ecorePackage.getEString(), "name", null, 0, 1, XmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getXmlTag_Attributes(), this.getXmlAttribute(), null, "attributes", null, 0, -1, XmlTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xmlAttributeEClass, XmlAttribute.class, "XmlAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXmlAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, XmlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXmlAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, XmlAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (singleOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleCorrectOption"
		   });	
		addAnnotation
		  (manyOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneCorrectOption"
		   });	
		addAnnotation
		  (xmlTagElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "MatchingEndTag"
		   });
	}

} //QuizPackageImpl
