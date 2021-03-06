/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.quiz.model.util.ModelResourceFactoryImpl;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.service.Answer;
import no.hal.pg.quiz.runtime.service.AnswerKind;
import no.hal.pg.quiz.runtime.service.Question;
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
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#proposeAnswer(no.hal.quiz.QA, java.lang.String) <em>Propose Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.quiz.QA, java.lang.String) <em>Accept Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAllProposals() <em>Accept All Proposals</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getQAProposals(no.hal.pg.runtime.Player) <em>Get QA Proposals</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getPlayerQuestions() <em>Get Player Questions</em>}</li>
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
	public void testProposeAnswer__QA_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		Player player = quizTask.getAllPlayers().get(0);
		service.setSubject(player.getPerson());
		assertNull(service.proposeAnswer(quizTask.getProposals().get(0).getQa(), "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, null, 0, false);
		
		assertNull(service.proposeAnswer(quizTask.getProposals().get(3).getQa(), "true"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, null, 0, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String) <em>Accept Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Player, no.hal.pg.quiz.model.QA, java.lang.String)
	 * @generated NOT
	 */
	public void testAcceptAnswer__QA_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		Player player = quizTask.getAllPlayers().get(0);
		service.setSubject(player.getPerson());

		assertTrue(service.acceptAnswer(quizTask.getProposals().get(0).getQa(), "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, true, 1, false);
		
		assertFalse(service.acceptAnswer(quizTask.getProposals().get(3).getQa(), "false"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, false, 1, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAllProposals(no.hal.pg.runtime.Player) <em>Accept All Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#acceptAllProposals(no.hal.pg.runtime.Player)
	 * @generated NOT
	 */
	public void testAcceptAllProposals() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		Player player = quizTask.getAllPlayers().get(0);
		service.setSubject(player.getPerson());

		assertNull(service.proposeAnswer(quizTask.getProposals().get(0).getQa(), "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, null, 0, false);
		
		assertNull(service.proposeAnswer(quizTask.getProposals().get(3).getQa(), "false"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, null, 0, false);

		service.acceptAllProposals();

		assertTrue(quizTask.getProposals().get(0).getAccepted());
		assertFalse(quizTask.getProposals().get(3).getAccepted());
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

		EList<Player> players = quizTask.getGame().getAllPlayers();
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

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QuizTaskService#getPlayerQuestions(no.hal.pg.runtime.Player) <em>Get Player Questions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QuizTaskService#getPlayerQuestions(no.hal.pg.runtime.Player)
	 * @generated NOT
	 */
	public void testGetPlayerQuestions() {
		Collection<Question> questions = createQuestions();
//		Resource res = new JsonResource();
//		res.getContents().addAll(questions);
//		
//		try {
//			res.save(System.out, null);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	public Collection<Question> createQuestions() {
		Question q1 = ServiceFactory.eINSTANCE.createQuestion();
		q1.setKind(AnswerKind.STRING);
		q1.setNumChoices(1);
		q1.setQuestion("I hvilken by ligger Stortinget?");
		
		Question q2 = ServiceFactory.eINSTANCE.createQuestion();
		q2.setKind(AnswerKind.YESNO);
		q2.setNumChoices(1);
		q2.setQuestion("I hvilken by ligger Stortinget?");
		Answer a1 = ServiceFactory.eINSTANCE.createAnswer();
		a1.setAnswer("Trondheim");
		a1.setSelected(true);
		q2.getOptions().add(a1);
		Answer a2 = ServiceFactory.eINSTANCE.createAnswer();
		a2.setAnswer("Oslo");
		q2.getOptions().add(a2);
		Answer a3 = ServiceFactory.eINSTANCE.createAnswer();
		a3.setAnswer("Fredrikstad");
		q2.getOptions().add(a3);
		
		Question q3 = ServiceFactory.eINSTANCE.createQuestion();
		q3.setKind(AnswerKind.NUM);
		q3.setNumChoices(1);
		q3.setQuestion("Hvor mange haler har ei ku?");
		
		Question q4 = ServiceFactory.eINSTANCE.createQuestion();
		q4.setKind(AnswerKind.YESNO);
		q4.setNumChoices(1);
		q4.setQuestion("Er tomaten en frukt?");
		
		return Arrays.asList(q1, q2, q3);
	}

} //QuizTaskServiceTest
