/**
 */
package no.hal.pg.quiz.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.QA;
import no.hal.pg.quiz.model.StringAnswer;
import no.hal.pg.quiz.runtime.ProposeAnswerAction;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.runtime.Player;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Propose Answer Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProposeAnswerActionTest extends TestCase {

	/**
	 * The fixture for this Propose Answer Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProposeAnswerAction fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ProposeAnswerActionTest.class);
	}

	/**
	 * Constructs a new Propose Answer Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProposeAnswerActionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Propose Answer Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ProposeAnswerAction fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Propose Answer Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProposeAnswerAction getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createProposeAnswerAction());
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

	//

	protected QuizTask setupQuizTask(String value, String proposal, Boolean accepted) {
		ProposeAnswerAction action = getFixture();
		action.setProposal(proposal);
		QuizTask task = RuntimeFactory.eINSTANCE.createQuizTask();
		Player player =  no.hal.pg.runtime.RuntimeFactory.eINSTANCE.createPlayer();
		task.getPlayers().add(player);
		task.changeState(RuntimeFactory.eINSTANCE.createAcceptingAnswerState());
		action.setPlayer(player);

		StringAnswer answer = ModelFactory.eINSTANCE.createStringAnswer();
		answer.setValue(value);
		QA qa =  ModelFactory.eINSTANCE.createQA();
		qa.setA(answer);
		QAProposal qaProposal = RuntimeFactory.eINSTANCE.createQAProposal();
		qaProposal.setQa(qa);
		task.getProposals().add(qaProposal);
		return task;
	}
	
	public void testPrepare__Task() {
		QuizTask task = setupQuizTask(null, null, null);
		ProposeAnswerAction action = getFixture();
		assertTrue(action.prepare(task));
		assertEquals(task, action.getTask());
	}
	
	protected void testPerform(String value, String proposal, Boolean accepted) {
		QuizTask task = setupQuizTask(value, proposal, accepted);
		ProposeAnswerAction action = getFixture();
		assertTrue(action.prepare(task));
		assertTrue(action.perform());
	}

	public void testPerform() {
		testPerform(null, null, null);
	}

} //ProposeAnswerActionTest
