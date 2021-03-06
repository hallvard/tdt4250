/*
 * generated by Xtext
 */
package no.hal.quiz.xtext.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import no.hal.quiz.xtext.services.XQuizGrammarAccess;

public class XQuizParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private XQuizGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected no.hal.quiz.xtext.parser.antlr.internal.InternalXQuizParser createParser(XtextTokenStream stream) {
		return new no.hal.quiz.xtext.parser.antlr.internal.InternalXQuizParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "Quiz";
	}
	
	public XQuizGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(XQuizGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
