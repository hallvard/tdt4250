package no.hal.pg.quiz.runtime.ui;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.runtime.ui.html.HtmlGenerator;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPart;

public class HtmlGenerators {

	private static String generateExceptionHtml(Exception e) {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		PrintStream printStream = new PrintStream(output);
		e.printStackTrace(printStream);
		printStream.close();
		return "<html><head><title>Exception</title></head><body><verbatim>" + output.toString() + "</verbatim></body></html>";
	}
	
	public static class Quiz2XhtmlGenerator extends no.hal.quiz.html.Quiz2XhtmlGenerator implements HtmlGenerator {
		
		@Override
		public String toString() {
			return "[Quiz to Xhtml (M2M)]";
		}

		public String generateHtml(EObject eObject) {
			if (eObject instanceof Quiz) {
				try {
					return generateQuizHtmlString((Quiz) eObject);
				} catch (Exception e) {
					return generateExceptionHtml(e);
				}
			}
			return null;
		}
	}

	public static class Quiz2TextGenerator extends no.hal.quiz.html.Quiz2TextGenerator implements HtmlGenerator {

		@Override
		public String toString() {
			return "[Quiz to Html (M2T)]";
		}
	
		public String generateHtml(EObject eObject) {
			try {
				if (eObject instanceof Quiz) {
					return generateHtml((Quiz) eObject);
				} else if (eObject instanceof QuizPart) {
					return generateHtml((QuizPart) eObject);
				} else if (eObject instanceof QuizTaskDef) {
					return generateHtml(((QuizTaskDef) eObject).getQuizParts());
				}
			} catch (Exception e) {
				generateExceptionHtml(e);
			}
			return null;
		}
	}
}
