package no.hal.quiz.xtext.tests;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import no.hal.quiz.Quiz;
import no.hal.quiz.QuizPackage;
import no.hal.quiz.QuizPart;
import no.hal.quiz.xtext.XQuizStandaloneSetup;

@RunWith(JUnit4.class)

public class XQuizTest {

	@Before
	public void setUp () {
		XQuizStandaloneSetup.doSetup();
		EPackage.Registry.INSTANCE.put(QuizPackage.eNS_URI, QuizPackage.eINSTANCE);
	}

	private <T> T loadResource(String name, Class<T> clazz) {
		URL modelUri = this.getClass().getResource(name);
		ResourceSet resourceSet = new ResourceSetImpl();
		Resource resource = resourceSet.getResource(URI.createURI(modelUri.toString()), true);
		for (EObject eObject : resource.getContents()) {
			if (clazz.isInstance(eObject)) {
				return (T) eObject;
			}
		}
		return null;
	}
	
	@Test
	public void testExample1() {
		Quiz quiz1 = loadResource("example1.xquiz", Quiz.class);
		Assert.assertNotNull(quiz1);
		Assert.assertEquals(2, quiz1.getParts().size());
		Assert.assertTrue(quiz1.getParts().get(0) instanceof QuizPart);
		Assert.assertEquals(5, ((QuizPart) quiz1.getParts().get(0)).getQuestions().size());
		Assert.assertTrue(quiz1.getParts().get(1) instanceof QuizPart);
		Assert.assertEquals(5, ((QuizPart) quiz1.getParts().get(1)).getQuestions().size());		
	}
}
