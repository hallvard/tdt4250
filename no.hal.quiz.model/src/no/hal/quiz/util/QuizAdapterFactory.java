/**
 */
package no.hal.quiz.util;

import no.hal.quiz.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.quiz.QuizPackage
 * @generated
 */
public class QuizAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static QuizPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = QuizPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizSwitch<Adapter> modelSwitch =
		new QuizSwitch<Adapter>() {
			@Override
			public Adapter caseQuiz(Quiz object) {
				return createQuizAdapter();
			}
			@Override
			public Adapter caseAbstractQuizPart(AbstractQuizPart object) {
				return createAbstractQuizPartAdapter();
			}
			@Override
			public Adapter caseQuizPartRef(QuizPartRef object) {
				return createQuizPartRefAdapter();
			}
			@Override
			public Adapter caseQuizPart(QuizPart object) {
				return createQuizPartAdapter();
			}
			@Override
			public Adapter caseAbstractQA(AbstractQA object) {
				return createAbstractQAAdapter();
			}
			@Override
			public Adapter caseQARef(QARef object) {
				return createQARefAdapter();
			}
			@Override
			public Adapter caseQA(QA object) {
				return createQAAdapter();
			}
			@Override
			public Adapter caseQuestion(Question object) {
				return createQuestionAdapter();
			}
			@Override
			public Adapter caseStringQuestion(StringQuestion object) {
				return createStringQuestionAdapter();
			}
			@Override
			public Adapter caseXmlQuestion(XmlQuestion object) {
				return createXmlQuestionAdapter();
			}
			@Override
			public Adapter caseAnswer(Answer object) {
				return createAnswerAdapter();
			}
			@Override
			public Adapter caseOptionAnswer(OptionAnswer object) {
				return createOptionAnswerAdapter();
			}
			@Override
			public <T> Adapter caseSimpleAnswer(SimpleAnswer<T> object) {
				return createSimpleAnswerAdapter();
			}
			@Override
			public Adapter caseStringAnswer(StringAnswer object) {
				return createStringAnswerAdapter();
			}
			@Override
			public Adapter caseNumberAnswer(NumberAnswer object) {
				return createNumberAnswerAdapter();
			}
			@Override
			public Adapter caseBooleanAnswer(BooleanAnswer object) {
				return createBooleanAnswerAdapter();
			}
			@Override
			public Adapter caseXmlAnswer(XmlAnswer object) {
				return createXmlAnswerAdapter();
			}
			@Override
			public Adapter caseOptionsAnswer(OptionsAnswer object) {
				return createOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseSingleOptionsAnswer(SingleOptionsAnswer object) {
				return createSingleOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseManyOptionsAnswer(ManyOptionsAnswer object) {
				return createManyOptionsAnswerAdapter();
			}
			@Override
			public Adapter caseXml(Xml object) {
				return createXmlAdapter();
			}
			@Override
			public Adapter caseXmlContents(XmlContents object) {
				return createXmlContentsAdapter();
			}
			@Override
			public Adapter caseXmlElement(XmlElement object) {
				return createXmlElementAdapter();
			}
			@Override
			public Adapter caseXmlPIAnswerElement(XmlPIAnswerElement object) {
				return createXmlPIAnswerElementAdapter();
			}
			@Override
			public Adapter caseXmlTagElement(XmlTagElement object) {
				return createXmlTagElementAdapter();
			}
			@Override
			public Adapter caseXmlTag(XmlTag object) {
				return createXmlTagAdapter();
			}
			@Override
			public Adapter caseXmlAttribute(XmlAttribute object) {
				return createXmlAttributeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Quiz <em>Quiz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Quiz
	 * @generated
	 */
	public Adapter createQuizAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.AbstractQuizPart <em>Abstract Quiz Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.AbstractQuizPart
	 * @generated
	 */
	public Adapter createAbstractQuizPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.QuizPartRef <em>Part Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.QuizPartRef
	 * @generated
	 */
	public Adapter createQuizPartRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.QuizPart <em>Part</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.QuizPart
	 * @generated
	 */
	public Adapter createQuizPartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.AbstractQA <em>Abstract QA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.AbstractQA
	 * @generated
	 */
	public Adapter createAbstractQAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.QARef <em>QA Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.QARef
	 * @generated
	 */
	public Adapter createQARefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.QA <em>QA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.QA
	 * @generated
	 */
	public Adapter createQAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.StringQuestion <em>String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.StringQuestion
	 * @generated
	 */
	public Adapter createStringQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlQuestion <em>Xml Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlQuestion
	 * @generated
	 */
	public Adapter createXmlQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Answer <em>Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Answer
	 * @generated
	 */
	public Adapter createAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.OptionAnswer
	 * @generated
	 */
	public Adapter createOptionAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.SimpleAnswer
	 * @generated
	 */
	public Adapter createSimpleAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.StringAnswer
	 * @generated
	 */
	public Adapter createStringAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.NumberAnswer
	 * @generated
	 */
	public Adapter createNumberAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.BooleanAnswer
	 * @generated
	 */
	public Adapter createBooleanAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlAnswer <em>Xml Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlAnswer
	 * @generated
	 */
	public Adapter createXmlAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.OptionsAnswer
	 * @generated
	 */
	public Adapter createOptionsAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.SingleOptionsAnswer
	 * @generated
	 */
	public Adapter createSingleOptionsAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.ManyOptionsAnswer
	 * @generated
	 */
	public Adapter createManyOptionsAnswerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.Xml <em>Xml</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.Xml
	 * @generated
	 */
	public Adapter createXmlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlContents <em>Xml Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlContents
	 * @generated
	 */
	public Adapter createXmlContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlElement <em>Xml Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlElement
	 * @generated
	 */
	public Adapter createXmlElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlPIAnswerElement <em>Xml PI Answer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlPIAnswerElement
	 * @generated
	 */
	public Adapter createXmlPIAnswerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlTagElement <em>Xml Tag Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlTagElement
	 * @generated
	 */
	public Adapter createXmlTagElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlTag <em>Xml Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlTag
	 * @generated
	 */
	public Adapter createXmlTagAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.quiz.XmlAttribute <em>Xml Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.quiz.XmlAttribute
	 * @generated
	 */
	public Adapter createXmlAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //QuizAdapterFactory
