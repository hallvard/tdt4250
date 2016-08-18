/**
 */
package no.hal.quiz.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.quiz.QuizFactory;
import no.hal.quiz.QuizPartProposals;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part Proposals</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPartProposalsTest extends TestCase {

	/**
	 * The fixture for this Part Proposals test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartProposals fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizPartProposalsTest.class);
	}

	/**
	 * Constructs a new Part Proposals test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartProposalsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Part Proposals test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuizPartProposals fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Part Proposals test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizPartProposals getFixture() {
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
		setFixture(QuizFactory.eINSTANCE.createQuizPartProposals());
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

} //QuizPartProposalsTest
