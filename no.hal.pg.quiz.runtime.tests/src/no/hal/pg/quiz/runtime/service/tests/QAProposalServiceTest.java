/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.quiz.runtime.QAProposal;
import no.hal.pg.quiz.runtime.RuntimeFactory;
import no.hal.pg.quiz.runtime.service.QAProposalService;
import no.hal.pg.quiz.runtime.service.ServiceFactory;
import no.hal.quiz.QA;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.StringQuestion;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA Proposal Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion() <em>Question</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getProposal() <em>Proposal</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted() <em>Accepted</em>}</li>
 *   <li>{@link no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount() <em>Rejected Count</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class QAProposalServiceTest extends TestCase {

	/**
	 * The fixture for this QA Proposal Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAProposalService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QAProposalServiceTest.class);
	}

	/**
	 * Constructs a new QA Proposal Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QAProposalServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this QA Proposal Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QAProposalService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this QA Proposal Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QAProposalService getFixture() {
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
		setFixture(createQAProposalService());
	}

	protected QAProposalService createQAProposalService() {
		QAProposalService proposalService = ServiceFactory.eINSTANCE.createQAProposalService();
		QAProposal proposal = RuntimeFactory.eINSTANCE.createQAProposal();
		QA qa = QuizFactory.eINSTANCE.createQA();
		StringQuestion q = QuizFactory.eINSTANCE.createStringQuestion();
		q.setQuestion("???");
		qa.setQ(q);
		proposal.setQa(qa);
		proposalService.setContext(proposal);
		return proposalService;
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
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion() <em>Question</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getQuestion()
	 * @generated NOT
	 */
	public void testGetQuestion() {
		assertEquals(((StringQuestion) getFixture().getContext().getQa().getQ()).getQuestion(), getFixture().getQuestion());
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getProposal() <em>Proposal</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getProposal()
	 * @generated NOT
	 */
	public void testGetProposal() {
		assertEquals(getFixture().getContext().getLastProposal(), getFixture().getProposal());
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted() <em>Accepted</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getAccepted()
	 * @generated NOT
	 */
	public void testGetAccepted() {
		assertEquals(getFixture().getContext().getAccepted(), getFixture().getAccepted());
	}

	/**
	 * Tests the '{@link no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount() <em>Rejected Count</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.quiz.runtime.service.QAProposalService#getRejectedCount()
	 * @generated NOT
	 */
	public void testGetRejectedCount() {
		assertEquals(getFixture().getContext().getRejectedCount(), getFixture().getRejectedCount());
	}

} //QAProposalServiceTest
