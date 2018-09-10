package no.hal.quiz.html;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;

import no.hal.quiz.Quiz;

public class Quiz2TextGeneratorMain {

	public static void main(String[] args) throws IOException {
		Quiz quiz = (args.length > 0 ? Quiz2XhtmlGeneratorMain.getQuiz(args[0]) : Quiz2XhtmlGeneratorMain.getSampleQuiz());
		String html = new Quiz2TextGenerator().generateHtml(quiz);
		if (args.length > 1) {
			URI target = URI.createURI(args[1]);
			try (PrintStream ps = new PrintStream(quiz.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
				ps.print(html);
			}
		} else {
			System.out.println(html);
		}
	}
}
