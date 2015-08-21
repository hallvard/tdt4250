/**
 */
package no.hal.pg.quiz.runtime.tests;

import org.eclipse.emf.ecore.resource.Resource;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.model.QuizPart;
import no.hal.pg.quiz.model.util.ModelResourceFactoryImpl;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(no.hal.pg.quiz.model.QA, java.lang.String, boolean) <em>Propose Answer</em>}</li>
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
		TestHelper testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE);
		testHelper.registerResourceFactory("jquiz", new ModelResourceFactoryImpl());
		setFixture((QuizTask) testHelper.loadTestResource(RuntimePackage.eINSTANCE.getQuizTask()));
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

	public void testStart() {
		QuizTask quizTask = getFixture();
		assertTrue(quizTask.getTaskDef().getQuizParts().size() >= 1);
		QuizPart part1 = (QuizPart) quizTask.getTaskDef().getQuizParts().get(0);
		assertTrue(part1.getQuestions().size() >= 3);
		quizTask.start();
		assertEquals(part1.getQuestions().size(), quizTask.getProposals().size());
		assertTrue(quizTask.isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState()));
		assertFalse(quizTask.isFinished());
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(no.hal.pg.quiz.model.QA, java.lang.String, boolean) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTask#proposeAnswer(no.hal.pg.quiz.model.QA, java.lang.String, boolean)
	 * @generated NOT
	 */
	public void testProposeAnswer__QA_String_boolean() {
		QuizTask quizTask = getFixture();
		quizTask.start();
		
		checkProposeAnswer(0, "Hallvard", false, null, 0, 0, false);
		checkProposeAnswer(0, "Hallvard", true, true, 0, 1, false);
		checkProposeAnswer(1, "halvard", true, true, 0, 2, false);
		checkProposeAnswer(2, "1.0", true, false, 1, 2, false);
		checkProposeAnswer(2, "2.3", true, true, 1, 3, false);
		checkProposeAnswer(3, "false", true, false, 1, 3, false);
		checkProposeAnswer(3, "true", true, true, 1, 4, true);
	}

	private void checkProposeAnswer(int qaNum, String proposal, boolean accept, Boolean result, int rejectCount, int count, boolean isFinished) {
		QuizTask quizTask = getFixture();
		QAProposal qaProposal = quizTask.getProposals().get(qaNum);
		assertEquals(result, quizTask.proposeAnswer(qaProposal.getQa(), proposal, accept));
		assertEquals(rejectCount, qaProposal.getRejectedCount());
		checkProposeAnswer(quizTask, qaNum, accept, result, count, isFinished);
	}

	static void checkProposeAnswer(QuizTask quizTask, int qaNum, boolean accept, Boolean result, int count, boolean isFinished) {
		assertEquals(count, quizTask.getAcceptedAnswerCount());
		assertEquals(! isFinished, quizTask.isInState(RuntimePackage.eINSTANCE.getAcceptingAnswerState()));
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
		quizTask.start();
		assertEquals(0, quizTask.getAcceptedAnswerCount());
		quizTask.getProposals().get(1).setAccepted(true);
		assertEquals(1, quizTask.getAcceptedAnswerCount());
	}

} //QuizTaskTest
