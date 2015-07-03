/**
 */
package no.hal.pg.quiz.model.util;

import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.model.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see no.hal.pg.quiz.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ModelPackage.QUIZ: {
				Quiz quiz = (Quiz)theEObject;
				T1 result = caseQuiz(quiz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QUIZ_TASK_DEF: {
				QuizTaskDef quizTaskDef = (QuizTaskDef)theEObject;
				T1 result = caseQuizTaskDef(quizTaskDef);
				if (result == null) result = caseTaskDef(quizTaskDef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_QUIZ_PART: {
				AbstractQuizPart abstractQuizPart = (AbstractQuizPart)theEObject;
				T1 result = caseAbstractQuizPart(abstractQuizPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QUIZ_PART_REF: {
				QuizPartRef quizPartRef = (QuizPartRef)theEObject;
				T1 result = caseQuizPartRef(quizPartRef);
				if (result == null) result = caseAbstractQuizPart(quizPartRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QUIZ_PART: {
				QuizPart quizPart = (QuizPart)theEObject;
				T1 result = caseQuizPart(quizPart);
				if (result == null) result = caseAbstractQuizPart(quizPart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ABSTRACT_QA: {
				AbstractQA abstractQA = (AbstractQA)theEObject;
				T1 result = caseAbstractQA(abstractQA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QA_REF: {
				QARef qaRef = (QARef)theEObject;
				T1 result = caseQARef(qaRef);
				if (result == null) result = caseAbstractQA(qaRef);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QA: {
				QA qa = (QA)theEObject;
				T1 result = caseQA(qa);
				if (result == null) result = caseAbstractQA(qa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.QUESTION: {
				Question question = (Question)theEObject;
				T1 result = caseQuestion(question);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_QUESTION: {
				StringQuestion stringQuestion = (StringQuestion)theEObject;
				T1 result = caseStringQuestion(stringQuestion);
				if (result == null) result = caseQuestion(stringQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_QUESTION: {
				XmlQuestion xmlQuestion = (XmlQuestion)theEObject;
				T1 result = caseXmlQuestion(xmlQuestion);
				if (result == null) result = caseQuestion(xmlQuestion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.ANSWER: {
				Answer answer = (Answer)theEObject;
				T1 result = caseAnswer(answer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OPTION_ANSWER: {
				OptionAnswer optionAnswer = (OptionAnswer)theEObject;
				T1 result = caseOptionAnswer(optionAnswer);
				if (result == null) result = caseAnswer(optionAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SIMPLE_ANSWER: {
				SimpleAnswer<?> simpleAnswer = (SimpleAnswer<?>)theEObject;
				T1 result = caseSimpleAnswer(simpleAnswer);
				if (result == null) result = caseOptionAnswer(simpleAnswer);
				if (result == null) result = caseAnswer(simpleAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.STRING_ANSWER: {
				StringAnswer stringAnswer = (StringAnswer)theEObject;
				T1 result = caseStringAnswer(stringAnswer);
				if (result == null) result = caseSimpleAnswer(stringAnswer);
				if (result == null) result = caseOptionAnswer(stringAnswer);
				if (result == null) result = caseAnswer(stringAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.NUMBER_ANSWER: {
				NumberAnswer numberAnswer = (NumberAnswer)theEObject;
				T1 result = caseNumberAnswer(numberAnswer);
				if (result == null) result = caseSimpleAnswer(numberAnswer);
				if (result == null) result = caseOptionAnswer(numberAnswer);
				if (result == null) result = caseAnswer(numberAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.BOOLEAN_ANSWER: {
				BooleanAnswer booleanAnswer = (BooleanAnswer)theEObject;
				T1 result = caseBooleanAnswer(booleanAnswer);
				if (result == null) result = caseSimpleAnswer(booleanAnswer);
				if (result == null) result = caseOptionAnswer(booleanAnswer);
				if (result == null) result = caseAnswer(booleanAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_ANSWER: {
				XmlAnswer xmlAnswer = (XmlAnswer)theEObject;
				T1 result = caseXmlAnswer(xmlAnswer);
				if (result == null) result = caseOptionAnswer(xmlAnswer);
				if (result == null) result = caseAnswer(xmlAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OPTIONS_ANSWER: {
				OptionsAnswer optionsAnswer = (OptionsAnswer)theEObject;
				T1 result = caseOptionsAnswer(optionsAnswer);
				if (result == null) result = caseAnswer(optionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.OPTION: {
				Option option = (Option)theEObject;
				T1 result = caseOption(option);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.SINGLE_OPTIONS_ANSWER: {
				SingleOptionsAnswer singleOptionsAnswer = (SingleOptionsAnswer)theEObject;
				T1 result = caseSingleOptionsAnswer(singleOptionsAnswer);
				if (result == null) result = caseOptionsAnswer(singleOptionsAnswer);
				if (result == null) result = caseAnswer(singleOptionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.MANY_OPTIONS_ANSWER: {
				ManyOptionsAnswer manyOptionsAnswer = (ManyOptionsAnswer)theEObject;
				T1 result = caseManyOptionsAnswer(manyOptionsAnswer);
				if (result == null) result = caseOptionsAnswer(manyOptionsAnswer);
				if (result == null) result = caseAnswer(manyOptionsAnswer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML: {
				Xml xml = (Xml)theEObject;
				T1 result = caseXml(xml);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_CONTENTS: {
				XmlContents xmlContents = (XmlContents)theEObject;
				T1 result = caseXmlContents(xmlContents);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_ELEMENT: {
				XmlElement xmlElement = (XmlElement)theEObject;
				T1 result = caseXmlElement(xmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_PI_ANSWER_ELEMENT: {
				XmlPIAnswerElement xmlPIAnswerElement = (XmlPIAnswerElement)theEObject;
				T1 result = caseXmlPIAnswerElement(xmlPIAnswerElement);
				if (result == null) result = caseXmlElement(xmlPIAnswerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_TAG_ELEMENT: {
				XmlTagElement xmlTagElement = (XmlTagElement)theEObject;
				T1 result = caseXmlTagElement(xmlTagElement);
				if (result == null) result = caseXmlElement(xmlTagElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_TAG: {
				XmlTag xmlTag = (XmlTag)theEObject;
				T1 result = caseXmlTag(xmlTag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XML_ATTRIBUTE: {
				XmlAttribute xmlAttribute = (XmlAttribute)theEObject;
				T1 result = caseXmlAttribute(xmlAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quiz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quiz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuiz(Quiz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quiz Task Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quiz Task Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuizTaskDef(QuizTaskDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Quiz Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Quiz Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractQuizPart(AbstractQuizPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quiz Part Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quiz Part Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuizPartRef(QuizPartRef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Quiz Part</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Quiz Part</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuizPart(QuizPart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract QA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract QA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAbstractQA(AbstractQA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QA Ref</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QA Ref</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQARef(QARef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQA(QA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringQuestion(StringQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlQuestion(XmlQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseAnswer(Answer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOptionAnswer(OptionAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T> T1 caseSimpleAnswer(SimpleAnswer<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStringAnswer(StringAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Number Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Number Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNumberAnswer(NumberAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Boolean Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Boolean Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBooleanAnswer(BooleanAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlAnswer(XmlAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOptionsAnswer(OptionsAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseOption(Option object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSingleOptionsAnswer(SingleOptionsAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Many Options Answer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseManyOptionsAnswer(ManyOptionsAnswer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXml(Xml object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Contents</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Contents</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlContents(XmlContents object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlElement(XmlElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml PI Answer Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml PI Answer Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlPIAnswerElement(XmlPIAnswerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Tag Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Tag Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlTagElement(XmlTagElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlTag(XmlTag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Xml Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Xml Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXmlAttribute(XmlAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task Def</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task Def</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTaskDef(TaskDef object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //QuizSwitch
