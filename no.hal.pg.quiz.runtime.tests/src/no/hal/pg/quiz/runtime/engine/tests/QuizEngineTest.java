package no.hal.pg.quiz.runtime.engine.tests;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import junit.framework.TestCase;
import no.hal.pg.model.GameDef;
import no.hal.pg.model.TaskDef;
import no.hal.pg.quiz.model.AbstractQuizPart;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.Quiz;
import no.hal.pg.quiz.model.QuizTaskDef;
import no.hal.pg.quiz.runtime.engine.QuizEngineFactory;
import no.hal.pg.quiz.xtext.XQuizStandaloneSetup;
import no.hal.pg.runtime.engine.Engine;

public class QuizEngineTest extends TestCase {

	private GameDef gameDef;
	private Engine engine;
	private QuizEngineFactory taskEngineFactory;
	
	@Override
	protected void setUp() throws Exception {
		// register quiz model
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		// register xquiz DSL
		XQuizStandaloneSetup.doSetup();

		ResourceSet resSet = new ResourceSetImpl();
		Resource xquizResource = resSet.getResource(URI.createURI(getClass().getResource("QuizEngineTest.xquiz").toString()), true);
		Collection<QuizTaskDef> taskDefs = new ArrayList<QuizTaskDef>();
		Quiz quiz = (Quiz) EcoreUtil.getObjectByType(xquizResource.getContents(), ModelPackage.eINSTANCE.getQuiz());
		for (AbstractQuizPart quizPart : quiz.getParts()) {
			QuizTaskDef taskDef = ModelFactory.eINSTANCE.createQuizTaskDef();
			taskDef.getQuizParts().add(quizPart);
			taskDefs.add(taskDef);
		}
		gameDef = no.hal.pg.model.ModelFactory.eINSTANCE.createGameDef();
		gameDef.getTasks().addAll(taskDefs);
		
		engine = new Engine();
		taskEngineFactory = new QuizEngineFactory();
		engine.addTaskEngineProvider(taskEngineFactory);
	}
	
	public void testQuizEngineFactory() {
		for (TaskDef taskDef : gameDef.getTasks()) {
			assertTrue(taskEngineFactory.isProviderFor(taskDef));
		}
	}

	public void testQuizEngine() {
		
	}
}
