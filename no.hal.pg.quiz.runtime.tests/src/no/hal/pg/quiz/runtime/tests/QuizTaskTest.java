/**
 */
package no.hal.pg.quiz.runtime.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.resource.JsonResourceFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QuizPart;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.xtext.XQuizStandaloneSetup;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(int, java.lang.String, boolean) <em>Propose Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTask#getAcceptedAnswerCount() <em>Get Accepted Answer Count</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class QuizTaskTest extends TestCase {

	/**
	 * The fixture for this Quiz Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTask fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizTaskTest.class);
	}

	/**
	 * Constructs a new Quiz Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quiz Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuizTask fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quiz Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTask getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		QuizTask quizTask = createQuizTask("QuizTaskTest.json", this);
		setFixture(quizTask);
	}

	public static EObject loadResourceObject(String modelPath, EClass eClass, Object context) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		// register quiz model
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, ModelPackage.eINSTANCE);
		// register quiz runtime
		EPackage.Registry.INSTANCE.put(RuntimePackage.eNS_URI, RuntimePackage.eINSTANCE);
		// register xquiz DSL
		XQuizStandaloneSetup.doSetup();
		
		URI modelUri = URI.createURI(context.getClass().getResource(modelPath).toString());
		ResourceSet resSet = new ResourceSetImpl();
		resSet.getURIConverter().getURIMap().put(URI.createURI("test:/"), modelUri.trimSegments(1).appendSegment(""));
		Resource taskResource = resSet.getResource(modelUri, true);
		return (EObject) EcoreUtil.getObjectByType(taskResource.getContents(), eClass);
	}
	
	public static QuizTask createQuizTask(String modelPath, Object context) {
		QuizTask quizTask = (QuizTask) loadResourceObject(modelPath, RuntimePackage.eINSTANCE.getQuizTask(), context);
		quizTask.start();
		return quizTask;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(int, java.lang.String, boolean) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(int, java.lang.String, boolean)
	 * @generated NOT
	 */
	public void testProposeAnswer__int_String_boolean() {
		QuizTask quizTask = getFixture();
		assertTrue(quizTask.getTaskDef().getQuizParts().size() >= 1);
		QuizPart part1 = (QuizPart) quizTask.getTaskDef().getQuizParts().get(0);
		assertTrue(part1.getQuestions().size() >= 3);

		quizTask.changeState(RuntimeFactory.eINSTANCE.createAcceptingAnswerState());
		assertTrue(quizTask.isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState()));
		assertFalse(quizTask.isFinished());

		checkProposeAnswer(0, "Hallvard", false, null, 0, false);
		checkProposeAnswer(0, "Hallvard", true, true, 1, false);
		checkProposeAnswer(1, "halvard", true, true, 2, false);
		checkProposeAnswer(2, "1.0", true, false, 2, false);
		checkProposeAnswer(2, "2.3", true, true, 3, false);
		checkProposeAnswer(3, "false", true, false, 3, false);
		checkProposeAnswer(3, "true", true, true, 4, true);
	}

	private void checkProposeAnswer(int qaNum, String proposal, boolean accept, Boolean result, int count, boolean isFinished) {
		QuizTask quizTask = getFixture();
		assertEquals(result, quizTask.proposeAnswer(qaNum, proposal, accept));
		assertEquals(count, quizTask.getAcceptedAnswerCount());
		assertEquals(! isFinished, quizTask.isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState()));
		assertEquals(isFinished, quizTask.isInState(no.hal.pg.runtime.RuntimePackage.eINSTANCE.getFinishedState()));
		assertEquals(isFinished, quizTask.isFinished());
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTask#getAcceptedAnswerCount() <em>Get Accepted Answer Count</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTask#getAcceptedAnswerCount()
	 * @generated NOT
	 */
	public void testGetAcceptedAnswerCount() {
		QuizTask quizTask = getFixture();
		assertEquals(0, quizTask.getAcceptedAnswerCount());
		quizTask.getProposals().get(1).setAccepted(true);
		assertEquals(1, quizTask.getAcceptedAnswerCount());
	}

} //QuizTaskTest
