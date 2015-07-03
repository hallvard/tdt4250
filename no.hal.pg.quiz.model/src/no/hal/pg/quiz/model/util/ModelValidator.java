/**
 */
package no.hal.pg.quiz.model.util;

import java.util.Map;
import no.hal.pg.quiz.model.*;
import no.hal.pg.quiz.model.AbstractQA;
import no.hal.pg.quiz.model.AbstractQuizPart;
import no.hal.pg.quiz.model.Answer;
import no.hal.pg.quiz.model.BooleanAnswer;
import no.hal.pg.quiz.model.ManyOptionsAnswer;
import no.hal.pg.quiz.model.NumberAnswer;
import no.hal.pg.quiz.model.Option;
import no.hal.pg.quiz.model.OptionAnswer;
import no.hal.pg.quiz.model.OptionsAnswer;
import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.model.QARef;
import no.hal.pg.quiz.model.Question;
import no.hal.pg.quiz.model.Quiz;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QuizPart;
import no.hal.pg.quiz.model.QuizPartRef;
import no.hal.pg.quiz.model.SimpleAnswer;
import no.hal.pg.quiz.model.SingleOptionsAnswer;
import no.hal.pg.quiz.model.StringAnswer;
import no.hal.pg.quiz.model.StringQuestion;
import no.hal.pg.quiz.model.Xml;
import no.hal.pg.quiz.model.XmlAnswer;
import no.hal.pg.quiz.model.XmlAttribute;
import no.hal.pg.quiz.model.XmlContents;
import no.hal.pg.quiz.model.XmlElement;
import no.hal.pg.quiz.model.XmlPIAnswerElement;
import no.hal.pg.quiz.model.XmlQuestion;
import no.hal.pg.quiz.model.XmlTag;
import no.hal.pg.quiz.model.XmlTagElement;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.model.ModelPackage
 * @generated
 */
public class ModelValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ModelValidator INSTANCE = new ModelValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.pg.quiz.model";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ModelPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ModelPackage.QUIZ:
				return validateQuiz((Quiz)value, diagnostics, context);
			case ModelPackage.QUIZ_TASK_DEF:
				return validateQuizTaskDef((QuizTaskDef)value, diagnostics, context);
			case ModelPackage.ABSTRACT_QUIZ_PART:
				return validateAbstractQuizPart((AbstractQuizPart)value, diagnostics, context);
			case ModelPackage.QUIZ_PART_REF:
				return validateQuizPartRef((QuizPartRef)value, diagnostics, context);
			case ModelPackage.QUIZ_PART:
				return validateQuizPart((QuizPart)value, diagnostics, context);
			case ModelPackage.ABSTRACT_QA:
				return validateAbstractQA((AbstractQA)value, diagnostics, context);
			case ModelPackage.QA_REF:
				return validateQARef((QARef)value, diagnostics, context);
			case ModelPackage.QA:
				return validateQA((QA)value, diagnostics, context);
			case ModelPackage.QUESTION:
				return validateQuestion((Question)value, diagnostics, context);
			case ModelPackage.STRING_QUESTION:
				return validateStringQuestion((StringQuestion)value, diagnostics, context);
			case ModelPackage.XML_QUESTION:
				return validateXmlQuestion((XmlQuestion)value, diagnostics, context);
			case ModelPackage.ANSWER:
				return validateAnswer((Answer)value, diagnostics, context);
			case ModelPackage.OPTION_ANSWER:
				return validateOptionAnswer((OptionAnswer)value, diagnostics, context);
			case ModelPackage.SIMPLE_ANSWER:
				return validateSimpleAnswer((SimpleAnswer<?>)value, diagnostics, context);
			case ModelPackage.STRING_ANSWER:
				return validateStringAnswer((StringAnswer)value, diagnostics, context);
			case ModelPackage.NUMBER_ANSWER:
				return validateNumberAnswer((NumberAnswer)value, diagnostics, context);
			case ModelPackage.BOOLEAN_ANSWER:
				return validateBooleanAnswer((BooleanAnswer)value, diagnostics, context);
			case ModelPackage.XML_ANSWER:
				return validateXmlAnswer((XmlAnswer)value, diagnostics, context);
			case ModelPackage.OPTIONS_ANSWER:
				return validateOptionsAnswer((OptionsAnswer)value, diagnostics, context);
			case ModelPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case ModelPackage.SINGLE_OPTIONS_ANSWER:
				return validateSingleOptionsAnswer((SingleOptionsAnswer)value, diagnostics, context);
			case ModelPackage.MANY_OPTIONS_ANSWER:
				return validateManyOptionsAnswer((ManyOptionsAnswer)value, diagnostics, context);
			case ModelPackage.XML:
				return validateXml((Xml)value, diagnostics, context);
			case ModelPackage.XML_CONTENTS:
				return validateXmlContents((XmlContents)value, diagnostics, context);
			case ModelPackage.XML_ELEMENT:
				return validateXmlElement((XmlElement)value, diagnostics, context);
			case ModelPackage.XML_PI_ANSWER_ELEMENT:
				return validateXmlPIAnswerElement((XmlPIAnswerElement)value, diagnostics, context);
			case ModelPackage.XML_TAG_ELEMENT:
				return validateXmlTagElement((XmlTagElement)value, diagnostics, context);
			case ModelPackage.XML_TAG:
				return validateXmlTag((XmlTag)value, diagnostics, context);
			case ModelPackage.XML_ATTRIBUTE:
				return validateXmlAttribute((XmlAttribute)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuiz(Quiz quiz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quiz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizTaskDef(QuizTaskDef quizTaskDef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quizTaskDef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractQuizPart(AbstractQuizPart abstractQuizPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractQuizPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizPartRef(QuizPartRef quizPartRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quizPartRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuizPart(QuizPart quizPart, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(quizPart, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbstractQA(AbstractQA abstractQA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abstractQA, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQARef(QARef qaRef, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qaRef, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQA(QA qa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qa, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(question, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringQuestion(StringQuestion stringQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlQuestion(XmlQuestion xmlQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAnswer(Answer answer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(answer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionAnswer(OptionAnswer optionAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleAnswer(SimpleAnswer<?> simpleAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringAnswer(StringAnswer stringAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberAnswer(NumberAnswer numberAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanAnswer(BooleanAnswer booleanAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlAnswer(XmlAnswer xmlAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionsAnswer(OptionsAnswer optionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionsAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleOptionsAnswer(SingleOptionsAnswer singleOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleOptionsAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleOptionsAnswer_SingleCorrectOption(singleOptionsAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SingleCorrectOption constraint of '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleOptionsAnswer_SingleCorrectOption(SingleOptionsAnswer singleOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (countCorrectOptions(singleOptionsAnswer) != 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleCorrectOption", getObjectLabel(singleOptionsAnswer, context) },
						 new Object[] { singleOptionsAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyOptionsAnswer(ManyOptionsAnswer manyOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manyOptionsAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validateManyOptionsAnswer_AtLeastOneCorrectOption(manyOptionsAnswer, diagnostics, context);
		return result;
	}

	private int countCorrectOptions(OptionsAnswer answer) {
		int count = 0;
		for (Option option : answer.getOptions()) {
			if (option.isCorrect()) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Validates the AtLeastOneCorrectOption constraint of '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateManyOptionsAnswer_AtLeastOneCorrectOption(ManyOptionsAnswer manyOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (countCorrectOptions(manyOptionsAnswer) < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtLeastOneCorrectOption", getObjectLabel(manyOptionsAnswer, context) },
						 new Object[] { manyOptionsAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXml(Xml xml, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xml, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlContents(XmlContents xmlContents, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlContents, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlElement(XmlElement xmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlPIAnswerElement(XmlPIAnswerElement xmlPIAnswerElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlPIAnswerElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlTagElement(XmlTagElement xmlTagElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(xmlTagElement, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(xmlTagElement, diagnostics, context);
		if (result || diagnostics != null) result &= validateXmlTagElement_MatchingEndTag(xmlTagElement, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MatchingEndTag constraint of '<em>Xml Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateXmlTagElement_MatchingEndTag(XmlTagElement xmlTagElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		String endTag = xmlTagElement.getEndTag();
		if (endTag != null && endTag.length() > 0 && (! endTag.equals(xmlTagElement.getStartTag().getName()))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "MatchingEndTag", getObjectLabel(xmlTagElement, context) },
						 new Object[] { xmlTagElement },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlTag(XmlTag xmlTag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlTag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXmlAttribute(XmlAttribute xmlAttribute, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlAttribute, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QuizValidator
