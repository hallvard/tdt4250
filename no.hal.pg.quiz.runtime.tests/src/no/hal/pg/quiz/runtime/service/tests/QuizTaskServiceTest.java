/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.quiz.model.Quiz;
import no.hal.pg.quiz.model.util.ModelResourceFactoryImpl;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.service.QuizTaskService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.pg.quiz.runtime.service.ServicePackage;
import no.hal.pg.quiz.runtime.tests.QuizTaskTest;
import no.hal.pg.quiz.runtime.util.RuntimeResourceFactoryImpl;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String) <em>Propose Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.quiz.QA, java.lang.String) <em>Accept Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player) <em>Get QA Proposals</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class QuizTaskServiceTest extends TestCase {

	/**
	 * The fixture for this Quiz Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizTaskServiceTest.class);
	}

	/**
	 * Constructs a new Quiz Task Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTaskServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quiz Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuizTaskService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quiz Task Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskService getFixture() {
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
		setFixture(createQuizTaskService());
	}

	private QuizTaskService createQuizTaskService() {
		TestHelper testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE, no.hal.pg.quiz.model.ModelPackage.eINSTANCE, no.hal.pg.quiz.runtime.RuntimePackage.eINSTANCE);
		testHelper.registerResourceFactory("jquiz", new RuntimeResourceFactoryImpl());

		testHelper.registerResourceFactory("jquiz", new ModelResourceFactoryImpl());
		testHelper.addResource(URI.createURI("test:/../../tests/QuizTaskTest.jquiz"), QuizTaskTest.createSimpleTestQuiz());
		return (QuizTaskService) testHelper.loadTestResource(ServicePackage.eINSTANCE.getQuizTaskService());
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
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String)
	 * @generated NOT
	 */
	public void testProposeAnswer__Player_QA_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		Player player = quizTask.getPlayers().get(0);
		assertNull(service.proposeAnswer(player, quizTask.getProposals().get(0).getQa(), "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, true, null, 0, false);
		
		assertNull(service.proposeAnswer(player, quizTask.getProposals().get(3).getQa(), "true"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, true, null, 0, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String) <em>Accept Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String)
	 * @generated NOT
	 */
	public void testAcceptAnswer__Player_QA_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		Player player = quizTask.getPlayers().get(0);

		assertTrue(service.acceptAnswer(player, quizTask.getProposals().get(0).getQa(), "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, true, true, 1, false);
		
		assertFalse(service.acceptAnswer(player, quizTask.getProposals().get(3).getQa(), "false"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, true, false, 1, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player) <em>Get QA Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player)
	 * @generated NOT
	 */
	public void testGetQAProposals__Player() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		EList<Player> players = quizTask.getGame().getPlayers();
		Player player1 = players.get(0), player2 = players.get(1);

		EList<QAProposal> proposals = quizTask.getProposals();
		// the first proposal is for the second player, the rest for the first
		proposals.get(0).getPlayers().add(players.get(1));
		
		EList<QAProposal> proposals1 = service.getQAProposals(player1);
		assertEquals(3, proposals1.size());
		assertTrue(proposals1.containsAll(Arrays.asList(proposals.get(1), proposals.get(2), proposals.get(3))));
		
		EList<QAProposal> proposals2 = service.getQAProposals(player2);
		assertEquals(1, proposals2.size());
		assertTrue(proposals2.containsAll(Arrays.asList(proposals.get(0))));
	}

} //QuizTaskServiceTest
