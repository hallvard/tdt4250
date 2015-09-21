/**
 */
package no.hal.quiz.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.quiz.Quiz;
import no.hal.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizTest extends TestCase {

	/**
	 * The fixture for this Quiz test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Quiz fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizTest.class);
	}

	/**
	 * Constructs a new Quiz test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quiz test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Quiz fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quiz test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Quiz getFixture() {
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
		setFixture(QuizFactory.eINSTANCE.createQuiz());
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

} //QuizTest