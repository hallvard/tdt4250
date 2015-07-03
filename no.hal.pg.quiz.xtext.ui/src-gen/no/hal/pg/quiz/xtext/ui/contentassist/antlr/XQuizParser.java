/*
 * generated by Xtext
 */
package no.hal.pg.quiz.xtext.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import no.hal.pg.quiz.xtext.services.XQuizGrammarAccess;

public class XQuizParser extends AbstractContentAssistParser {
	
	@Inject
	private XQuizGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected no.hal.pg.quiz.xtext.ui.contentassist.antlr.internal.InternalXQuizParser createParser() {
		no.hal.pg.quiz.xtext.ui.contentassist.antlr.internal.InternalXQuizParser result = new no.hal.pg.quiz.xtext.ui.contentassist.antlr.internal.InternalXQuizParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getQuizAccess().getAlternatives_2(), "rule__Quiz__Alternatives_2");
					put(grammarAccess.getAbstractQuizPartAccess().getAlternatives(), "rule__AbstractQuizPart__Alternatives");
					put(grammarAccess.getAbstractQAAccess().getAlternatives(), "rule__AbstractQA__Alternatives");
					put(grammarAccess.getQuestionAccess().getAlternatives(), "rule__Question__Alternatives");
					put(grammarAccess.getAnswerAccess().getAlternatives(), "rule__Answer__Alternatives");
					put(grammarAccess.getOptionAnswerAccess().getAlternatives(), "rule__OptionAnswer__Alternatives");
					put(grammarAccess.getSimpleAnswerAccess().getAlternatives(), "rule__SimpleAnswer__Alternatives");
					put(grammarAccess.getBooleanAnswerAccess().getAlternatives_1(), "rule__BooleanAnswer__Alternatives_1");
					put(grammarAccess.getBooleanAnswerAccess().getValueAlternatives_1_0_0(), "rule__BooleanAnswer__ValueAlternatives_1_0_0");
					put(grammarAccess.getBooleanAnswerAccess().getAlternatives_1_1(), "rule__BooleanAnswer__Alternatives_1_1");
					put(grammarAccess.getOptionsAnswerAccess().getAlternatives(), "rule__OptionsAnswer__Alternatives");
					put(grammarAccess.getSingleOptionsAnswerAccess().getAlternatives(), "rule__SingleOptionsAnswer__Alternatives");
					put(grammarAccess.getSingleListOptionAccess().getAlternatives_0(), "rule__SingleListOption__Alternatives_0");
					put(grammarAccess.getSingleListOptionAccess().getAlternatives_0_0(), "rule__SingleListOption__Alternatives_0_0");
					put(grammarAccess.getXmlElementAccess().getAlternatives(), "rule__XmlElement__Alternatives");
					put(grammarAccess.getXmlTagElementAccess().getAlternatives_1(), "rule__XmlTagElement__Alternatives_1");
					put(grammarAccess.getQuizAccess().getGroup(), "rule__Quiz__Group__0");
					put(grammarAccess.getQuizAccess().getGroup_2_0(), "rule__Quiz__Group_2_0__0");
					put(grammarAccess.getQNameAccess().getGroup(), "rule__QName__Group__0");
					put(grammarAccess.getQNameAccess().getGroup_1(), "rule__QName__Group_1__0");
					put(grammarAccess.getQuizPartAccess().getGroup(), "rule__QuizPart__Group__0");
					put(grammarAccess.getQuizPartRefAccess().getGroup(), "rule__QuizPartRef__Group__0");
					put(grammarAccess.getAnonymousQuizPartAccess().getGroup(), "rule__AnonymousQuizPart__Group__0");
					put(grammarAccess.getQARefAccess().getGroup(), "rule__QARef__Group__0");
					put(grammarAccess.getQAAccess().getGroup(), "rule__QA__Group__0");
					put(grammarAccess.getStringAnswerAccess().getGroup(), "rule__StringAnswer__Group__0");
					put(grammarAccess.getRegexAnswerAccess().getGroup(), "rule__RegexAnswer__Group__0");
					put(grammarAccess.getEDoubleObjectAccess().getGroup(), "rule__EDoubleObject__Group__0");
					put(grammarAccess.getEDoubleObjectAccess().getGroup_1(), "rule__EDoubleObject__Group_1__0");
					put(grammarAccess.getBooleanAnswerAccess().getGroup(), "rule__BooleanAnswer__Group__0");
					put(grammarAccess.getSingleBoxOptionAccess().getGroup(), "rule__SingleBoxOption__Group__0");
					put(grammarAccess.getSingleListOptionAccess().getGroup(), "rule__SingleListOption__Group__0");
					put(grammarAccess.getManyOptionAccess().getGroup(), "rule__ManyOption__Group__0");
					put(grammarAccess.getXmlAccess().getGroup(), "rule__Xml__Group__0");
					put(grammarAccess.getXmlContentsAccess().getGroup(), "rule__XmlContents__Group__0");
					put(grammarAccess.getXmlPIAnswerElementAccess().getGroup(), "rule__XmlPIAnswerElement__Group__0");
					put(grammarAccess.getXmlTagElementAccess().getGroup(), "rule__XmlTagElement__Group__0");
					put(grammarAccess.getXmlTagElementAccess().getGroup_1_1(), "rule__XmlTagElement__Group_1_1__0");
					put(grammarAccess.getXmlTagElementAccess().getGroup_1_1_2(), "rule__XmlTagElement__Group_1_1_2__0");
					put(grammarAccess.getXmlTagAccess().getGroup(), "rule__XmlTag__Group__0");
					put(grammarAccess.getXmlAttributeAccess().getGroup(), "rule__XmlAttribute__Group__0");
					put(grammarAccess.getQuizAccess().getNameAssignment_2_0_0(), "rule__Quiz__NameAssignment_2_0_0");
					put(grammarAccess.getQuizAccess().getTitleAssignment_2_0_1(), "rule__Quiz__TitleAssignment_2_0_1");
					put(grammarAccess.getQuizAccess().getPartsAssignment_2_0_2(), "rule__Quiz__PartsAssignment_2_0_2");
					put(grammarAccess.getQuizAccess().getPartsAssignment_2_1(), "rule__Quiz__PartsAssignment_2_1");
					put(grammarAccess.getQuizPartAccess().getNameAssignment_1(), "rule__QuizPart__NameAssignment_1");
					put(grammarAccess.getQuizPartAccess().getTitleAssignment_2(), "rule__QuizPart__TitleAssignment_2");
					put(grammarAccess.getQuizPartAccess().getQuestionsAssignment_3(), "rule__QuizPart__QuestionsAssignment_3");
					put(grammarAccess.getQuizPartRefAccess().getPartRefAssignment_2(), "rule__QuizPartRef__PartRefAssignment_2");
					put(grammarAccess.getAnonymousQuizPartAccess().getQuestionsAssignment_1(), "rule__AnonymousQuizPart__QuestionsAssignment_1");
					put(grammarAccess.getQARefAccess().getQaRefAssignment_1(), "rule__QARef__QaRefAssignment_1");
					put(grammarAccess.getQAAccess().getNameAssignment_0(), "rule__QA__NameAssignment_0");
					put(grammarAccess.getQAAccess().getQAssignment_1(), "rule__QA__QAssignment_1");
					put(grammarAccess.getQAAccess().getAAssignment_2(), "rule__QA__AAssignment_2");
					put(grammarAccess.getStringQuestionAccess().getQuestionAssignment(), "rule__StringQuestion__QuestionAssignment");
					put(grammarAccess.getXmlQuestionAccess().getXmlAssignment(), "rule__XmlQuestion__XmlAssignment");
					put(grammarAccess.getStringAnswerAccess().getValueAssignment_0(), "rule__StringAnswer__ValueAssignment_0");
					put(grammarAccess.getStringAnswerAccess().getIgnoreCaseAssignment_1(), "rule__StringAnswer__IgnoreCaseAssignment_1");
					put(grammarAccess.getRegexAnswerAccess().getRegexpAssignment_0(), "rule__RegexAnswer__RegexpAssignment_0");
					put(grammarAccess.getRegexAnswerAccess().getValueAssignment_1(), "rule__RegexAnswer__ValueAssignment_1");
					put(grammarAccess.getRegexAnswerAccess().getIgnoreCaseAssignment_3(), "rule__RegexAnswer__IgnoreCaseAssignment_3");
					put(grammarAccess.getNumberAnswerAccess().getValueAssignment(), "rule__NumberAnswer__ValueAssignment");
					put(grammarAccess.getBooleanAnswerAccess().getValueAssignment_1_0(), "rule__BooleanAnswer__ValueAssignment_1_0");
					put(grammarAccess.getXmlAnswerAccess().getXmlAssignment(), "rule__XmlAnswer__XmlAssignment");
					put(grammarAccess.getSingleBoxOptionsAnswerAccess().getOptionsAssignment(), "rule__SingleBoxOptionsAnswer__OptionsAssignment");
					put(grammarAccess.getSingleBoxOptionAccess().getCorrectAssignment_1(), "rule__SingleBoxOption__CorrectAssignment_1");
					put(grammarAccess.getSingleBoxOptionAccess().getOptionAssignment_3(), "rule__SingleBoxOption__OptionAssignment_3");
					put(grammarAccess.getSingleListOptionsAnswerAccess().getOptionsAssignment(), "rule__SingleListOptionsAnswer__OptionsAssignment");
					put(grammarAccess.getSingleListOptionAccess().getCorrectAssignment_0_1(), "rule__SingleListOption__CorrectAssignment_0_1");
					put(grammarAccess.getSingleListOptionAccess().getOptionAssignment_1(), "rule__SingleListOption__OptionAssignment_1");
					put(grammarAccess.getManyOptionsAnswerAccess().getOptionsAssignment(), "rule__ManyOptionsAnswer__OptionsAssignment");
					put(grammarAccess.getManyOptionAccess().getCorrectAssignment_1(), "rule__ManyOption__CorrectAssignment_1");
					put(grammarAccess.getManyOptionAccess().getOptionAssignment_3(), "rule__ManyOption__OptionAssignment_3");
					put(grammarAccess.getXmlAccess().getElementAssignment_1(), "rule__Xml__ElementAssignment_1");
					put(grammarAccess.getXmlContentsAccess().getElementAssignment_0(), "rule__XmlContents__ElementAssignment_0");
					put(grammarAccess.getXmlContentsAccess().getPostAssignment_1(), "rule__XmlContents__PostAssignment_1");
					put(grammarAccess.getXmlPIAnswerElementAccess().getAnswerAssignment_1(), "rule__XmlPIAnswerElement__AnswerAssignment_1");
					put(grammarAccess.getXmlTagElementAccess().getStartTagAssignment_0(), "rule__XmlTagElement__StartTagAssignment_0");
					put(grammarAccess.getXmlTagElementAccess().getPreAssignment_1_1_0(), "rule__XmlTagElement__PreAssignment_1_1_0");
					put(grammarAccess.getXmlTagElementAccess().getContentsAssignment_1_1_1(), "rule__XmlTagElement__ContentsAssignment_1_1_1");
					put(grammarAccess.getXmlTagElementAccess().getEndTagAssignment_1_1_2_1(), "rule__XmlTagElement__EndTagAssignment_1_1_2_1");
					put(grammarAccess.getXmlTagAccess().getNameAssignment_0(), "rule__XmlTag__NameAssignment_0");
					put(grammarAccess.getXmlTagAccess().getAttributesAssignment_1(), "rule__XmlTag__AttributesAssignment_1");
					put(grammarAccess.getXmlAttributeAccess().getNameAssignment_0(), "rule__XmlAttribute__NameAssignment_0");
					put(grammarAccess.getXmlAttributeAccess().getValueAssignment_2(), "rule__XmlAttribute__ValueAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			no.hal.pg.quiz.xtext.ui.contentassist.antlr.internal.InternalXQuizParser typedParser = (no.hal.pg.quiz.xtext.ui.contentassist.antlr.internal.InternalXQuizParser) parser;
			typedParser.entryRuleQuiz();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public XQuizGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XQuizGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
