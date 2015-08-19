/**
 */
package no.hal.pg.quiz.runtime.tests;

import java.util.Arrays;

import org.eclipse.emf.common.util.EList;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelPackage;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.QARef;
import no.hal.pg.quiz.runtime.QuizTask;
import no.hal.pg.quiz.runtime.QuizTaskService;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.RuntimePackage;
import no.hal.pg.quiz.xtext.XQuizStandaloneSetup;
import no.hal.pg.runtime.DirectRef;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz Task Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String) <em>Propose Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String) <em>Accept Answer</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.QuizTaskService#getQAProposals(no.hal.pg.runtime.Ref) <em>Get QA Proposals</em>}</li>
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
		XQuizStandaloneSetup.doSetup();
		TestHelper testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE);
		setFixture((QuizTaskService) testHelper.loadTestResource(RuntimePackage.eINSTANCE.getQuizTaskService()));
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
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String) <em>Propose Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTaskService#proposeAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String)
	 * @generated NOT
	 */
	public void testProposeAnswer__Ref_Ref_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		DirectRef<Player> playerRef = no.hal.pg.runtime.RuntimeFactory.eINSTANCE.createDirectRef();
		playerRef.setRef(quizTask.getPlayers().get(0));
		QARef qaRef = RuntimeFactory.eINSTANCE.createQARef();

		qaRef.setQaNum(0);
		assertNull(service.proposeAnswer(playerRef, qaRef, "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, true, null, 0, false);
		
		qaRef.setQaNum(3);
		assertNull(service.proposeAnswer(playerRef, qaRef, "true"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, true, null, 0, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String) <em>Accept Answer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTaskService#acceptAnswer(no.hal.pg.runtime.Ref, no.hal.pg.runtime.Ref, java.lang.String)
	 * @generated NOT
	 */
	public void testAcceptAnswer__Ref_Ref_String() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		DirectRef<Player> playerRef = no.hal.pg.runtime.RuntimeFactory.eINSTANCE.createDirectRef();
		playerRef.setRef(quizTask.getPlayers().get(0));
		QARef qaRef = RuntimeFactory.eINSTANCE.createQARef();

		qaRef.setQaNum(0);
		assertTrue(service.acceptAnswer(playerRef, qaRef, "Hallvard"));
		QuizTaskTest.checkProposeAnswer(quizTask, 0, true, true, 1, false);
		
		qaRef.setQaNum(3);
		assertFalse(service.acceptAnswer(playerRef, qaRef, "false"));
		QuizTaskTest.checkProposeAnswer(quizTask, 3, true, false, 1, false);
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.QuizTaskService#getQAProposals(no.hal.pg.runtime.Ref) <em>Get QA Proposals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.QuizTaskService#getQAProposals(no.hal.pg.runtime.Ref)
	 * @generated NOT
	 */
	public void testGetQAProposals__Ref() {
		QuizTaskService service = getFixture();
		QuizTask quizTask = service.getContext();
		quizTask.start();

		EList<Player> players = quizTask.getGame().getPlayers();
		DirectRef<Player> playerRef1 = no.hal.pg.runtime.RuntimeFactory.eINSTANCE.createDirectRef();
		playerRef1.setRef(players.get(0));
		DirectRef<Player> playerRef2 = no.hal.pg.runtime.RuntimeFactory.eINSTANCE.createDirectRef();
		playerRef2.setRef(players.get(1));

		EList<QAProposal> proposals = quizTask.getProposals();
		// the first proposal is for the second player, the rest for the first
		proposals.get(0).getPlayers().add(players.get(1));
		
		EList<QAProposal> proposals1 = service.getQAProposals(playerRef1);
		assertEquals(3, proposals1.size());
		assertTrue(proposals1.containsAll(Arrays.asList(proposals.get(1), proposals.get(2), proposals.get(3))));
		
		EList<QAProposal> proposals2 = service.getQAProposals(playerRef2);
		assertEquals(1, proposals2.size());
		assertTrue(proposals2.containsAll(Arrays.asList(proposals.get(0))));
	}

} //QuizTaskServiceTest
