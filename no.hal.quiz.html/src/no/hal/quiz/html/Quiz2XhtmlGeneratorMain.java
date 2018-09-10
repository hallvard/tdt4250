package no.hal.quiz.html;

import java.io.IOException;
import java.io.PrintStream;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.util.QuizResourceFactoryImpl;

public class Quiz2XhtmlGeneratorMain {

	public static void main(String[] args) throws IOException {
		Quiz quiz = (args.length > 0 ? getQuiz(args[0]) : getSampleQuiz());
		String html = new Quiz2XhtmlGenerator().generateHtml(quiz);
		if (args.length > 1) {
			URI target = URI.createURI(args[1]);
			try (PrintStream ps = new PrintStream(quiz.eResource().getResourceSet().getURIConverter().createOutputStream(target))) {
				ps.print(html);
			}
		} else {
			System.out.println(html);
		}
	}

	public static Quiz getQuiz(String uriString) throws IOException {
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getPackageRegistry().put(QuizPackage.eNS_URI, QuizPackage.eINSTANCE);
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("quiz", new QuizResourceFactoryImpl());
		Resource resource = resSet.getResource(URI.createURI(uriString), true);
		for (EObject eObject : resource.getContents()) {
			if (eObject instanceof Quiz) {
				return (Quiz) eObject;
			}
		}
		return null;
	}

	public static Quiz getSampleQuiz() {
		try {
			return getQuiz(Quiz2XhtmlGeneratorMain.class.getResource("SampleQuiz.quiz").toString());
		} catch (IOException e) {
			System.err.println(e);
			return null;
		}
	}
}
