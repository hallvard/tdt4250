/*
 * generated by Xtext
 */
package no.hal.quiz.xtext.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import no.hal.quiz.BooleanAnswer;
import no.hal.quiz.ManyOptionsAnswer;
import no.hal.quiz.NumberAnswer;
import no.hal.quiz.Option;
import no.hal.quiz.QA;
import no.hal.quiz.QARef;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;
import no.hal.quiz.QuizPartRef;
import no.hal.quiz.SingleOptionsAnswer;
import no.hal.quiz.StringAnswer;
import no.hal.quiz.StringQuestion;
import no.hal.quiz.Xml;
import no.hal.quiz.XmlAnswer;
import no.hal.quiz.XmlAttribute;
import no.hal.quiz.XmlContents;
import no.hal.quiz.XmlPIAnswerElement;
import no.hal.quiz.XmlQuestion;
import no.hal.quiz.XmlTag;
import no.hal.quiz.XmlTagElement;
import no.hal.quiz.xtext.services.XQuizGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractXQuizSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private XQuizGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == QuizPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case QuizPackage.BOOLEAN_ANSWER:
				sequence_BooleanAnswer(context, (BooleanAnswer) semanticObject); 
				return; 
			case QuizPackage.MANY_OPTIONS_ANSWER:
				sequence_ManyOptionsAnswer(context, (ManyOptionsAnswer) semanticObject); 
				return; 
			case QuizPackage.NUMBER_ANSWER:
				sequence_NumberAnswer(context, (NumberAnswer) semanticObject); 
				return; 
			case QuizPackage.OPTION:
				if(context == grammarAccess.getManyOptionRule()) {
					sequence_ManyOption(context, (Option) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleBoxOptionRule()) {
					sequence_SingleBoxOption(context, (Option) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleListOptionRule()) {
					sequence_SingleListOption(context, (Option) semanticObject); 
					return; 
				}
				else break;
			case QuizPackage.QA:
				sequence_QA(context, (QA) semanticObject); 
				return; 
			case QuizPackage.QA_REF:
				sequence_QARef(context, (QARef) semanticObject); 
				return; 
			case QuizPackage.QUIZ:
				sequence_Quiz(context, (Quiz) semanticObject); 
				return; 
			case QuizPackage.QUIZ_PART:
				if(context == grammarAccess.getAnonymousQuizPartRule()) {
					sequence_AnonymousQuizPart(context, (QuizPart) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAbstractQuizPartRule() ||
				   context == grammarAccess.getQuizPartRule()) {
					sequence_QuizPart(context, (QuizPart) semanticObject); 
					return; 
				}
				else break;
			case QuizPackage.QUIZ_PART_REF:
				sequence_QuizPartRef(context, (QuizPartRef) semanticObject); 
				return; 
			case QuizPackage.SINGLE_OPTIONS_ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getOptionsAnswerRule() ||
				   context == grammarAccess.getSingleOptionsAnswerRule()) {
					sequence_SingleBoxOptionsAnswer_SingleListOptionsAnswer_SingleOptionsAnswer(context, (SingleOptionsAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleBoxOptionsAnswerRule()) {
					sequence_SingleBoxOptionsAnswer(context, (SingleOptionsAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getSingleListOptionsAnswerRule()) {
					sequence_SingleListOptionsAnswer(context, (SingleOptionsAnswer) semanticObject); 
					return; 
				}
				else break;
			case QuizPackage.STRING_ANSWER:
				if(context == grammarAccess.getAnswerRule() ||
				   context == grammarAccess.getOptionAnswerRule() ||
				   context == grammarAccess.getSimpleAnswerRule()) {
					sequence_RegexAnswer_SimpleAnswer_StringAnswer(context, (StringAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRegexAnswerRule()) {
					sequence_RegexAnswer(context, (StringAnswer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getStringAnswerRule()) {
					sequence_StringAnswer(context, (StringAnswer) semanticObject); 
					return; 
				}
				else break;
			case QuizPackage.STRING_QUESTION:
				sequence_StringQuestion(context, (StringQuestion) semanticObject); 
				return; 
			case QuizPackage.XML:
				sequence_Xml(context, (Xml) semanticObject); 
				return; 
			case QuizPackage.XML_ANSWER:
				sequence_XmlAnswer(context, (XmlAnswer) semanticObject); 
				return; 
			case QuizPackage.XML_ATTRIBUTE:
				sequence_XmlAttribute(context, (XmlAttribute) semanticObject); 
				return; 
			case QuizPackage.XML_CONTENTS:
				sequence_XmlContents(context, (XmlContents) semanticObject); 
				return; 
			case QuizPackage.XML_PI_ANSWER_ELEMENT:
				sequence_XmlPIAnswerElement(context, (XmlPIAnswerElement) semanticObject); 
				return; 
			case QuizPackage.XML_QUESTION:
				sequence_XmlQuestion(context, (XmlQuestion) semanticObject); 
				return; 
			case QuizPackage.XML_TAG:
				sequence_XmlTag(context, (XmlTag) semanticObject); 
				return; 
			case QuizPackage.XML_TAG_ELEMENT:
				sequence_XmlTagElement(context, (XmlTagElement) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (questions+=AbstractQA*)
	 */
	protected void sequence_AnonymousQuizPart(EObject context, QuizPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((value?='yes' | value?='true')?)
	 */
	protected void sequence_BooleanAnswer(EObject context, BooleanAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (correct?='x'? option=OptionAnswer)
	 */
	protected void sequence_ManyOption(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     options+=ManyOption+
	 */
	protected void sequence_ManyOptionsAnswer(EObject context, ManyOptionsAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=EDoubleObject errorMargin=EDoubleObject?)
	 */
	protected void sequence_NumberAnswer(EObject context, NumberAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     qaRef=[QA|QName]
	 */
	protected void sequence_QARef(EObject context, QARef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.QA_REF__QA_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.QA_REF__QA_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQARefAccess().getQaRefQAQNameParserRuleCall_1_0_1(), semanticObject.getQaRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID? q=Question a=Answer)
	 */
	protected void sequence_QA(EObject context, QA semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     partRef=[QuizPart|QName]
	 */
	protected void sequence_QuizPartRef(EObject context, QuizPartRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.QUIZ_PART_REF__PART_REF) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.QUIZ_PART_REF__PART_REF));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getQuizPartRefAccess().getPartRefQuizPartQNameParserRuleCall_2_0_1(), semanticObject.getPartRef());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=STRING questions+=AbstractQA*)
	 */
	protected void sequence_QuizPart(EObject context, QuizPart semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((name=QName? title=STRING? parts+=AbstractQuizPart*) | parts+=AnonymousQuizPart)
	 */
	protected void sequence_Quiz(EObject context, Quiz semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((value=STRING ignoreCase?='~'?) | (regexp?='/' value=STRING ignoreCase?='~'?))
	 */
	protected void sequence_RegexAnswer_SimpleAnswer_StringAnswer(EObject context, StringAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (regexp?='/' value=STRING ignoreCase?='~'?)
	 */
	protected void sequence_RegexAnswer(EObject context, StringAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (correct?='x'? option=OptionAnswer)
	 */
	protected void sequence_SingleBoxOption(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (options+=SingleBoxOption+ | options+=SingleListOption+)
	 */
	protected void sequence_SingleBoxOptionsAnswer_SingleListOptionsAnswer_SingleOptionsAnswer(EObject context, SingleOptionsAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     options+=SingleBoxOption+
	 */
	protected void sequence_SingleBoxOptionsAnswer(EObject context, SingleOptionsAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (correct?='v'? option=OptionAnswer)
	 */
	protected void sequence_SingleListOption(EObject context, Option semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     options+=SingleListOption+
	 */
	protected void sequence_SingleListOptionsAnswer(EObject context, SingleOptionsAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=STRING ignoreCase?='~'?)
	 */
	protected void sequence_StringAnswer(EObject context, StringAnswer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     question=STRING
	 */
	protected void sequence_StringQuestion(EObject context, StringQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.STRING_QUESTION__QUESTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.STRING_QUESTION__QUESTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringQuestionAccess().getQuestionSTRINGTerminalRuleCall_0(), semanticObject.getQuestion());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     xml=Xml
	 */
	protected void sequence_XmlAnswer(EObject context, XmlAnswer semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_ANSWER__XML) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_ANSWER__XML));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlAnswerAccess().getXmlXmlParserRuleCall_0(), semanticObject.getXml());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=STRING)
	 */
	protected void sequence_XmlAttribute(EObject context, XmlAttribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_ATTRIBUTE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_ATTRIBUTE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getXmlAttributeAccess().getValueSTRINGTerminalRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (element=XmlElement post=XML_TEXT)
	 */
	protected void sequence_XmlContents(EObject context, XmlContents semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_CONTENTS__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_CONTENTS__ELEMENT));
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_CONTENTS__POST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_CONTENTS__POST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlContentsAccess().getElementXmlElementParserRuleCall_0_0(), semanticObject.getElement());
		feeder.accept(grammarAccess.getXmlContentsAccess().getPostXML_TEXTTerminalRuleCall_1_0(), semanticObject.getPost());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     answer=SimpleAnswer
	 */
	protected void sequence_XmlPIAnswerElement(EObject context, XmlPIAnswerElement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_PI_ANSWER_ELEMENT__ANSWER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_PI_ANSWER_ELEMENT__ANSWER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlPIAnswerElementAccess().getAnswerSimpleAnswerParserRuleCall_1_0(), semanticObject.getAnswer());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     xml=Xml
	 */
	protected void sequence_XmlQuestion(EObject context, XmlQuestion semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML_QUESTION__XML) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML_QUESTION__XML));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlQuestionAccess().getXmlXmlParserRuleCall_0(), semanticObject.getXml());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (startTag=XmlTag (pre=XML_TEXT contents+=XmlContents* endTag=ID?)?)
	 */
	protected void sequence_XmlTagElement(EObject context, XmlTagElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID attributes+=XmlAttribute*)
	 */
	protected void sequence_XmlTag(EObject context, XmlTag semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     element=XmlElement
	 */
	protected void sequence_Xml(EObject context, Xml semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, QuizPackage.Literals.XML__ELEMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, QuizPackage.Literals.XML__ELEMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getXmlAccess().getElementXmlElementParserRuleCall_1_0(), semanticObject.getElement());
		feeder.finish();
	}
}
