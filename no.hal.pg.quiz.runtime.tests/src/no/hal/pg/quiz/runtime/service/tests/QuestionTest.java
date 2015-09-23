/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.quiz.runtime.service.Question;
import no.hal.pg.quiz.runtime.service.ServiceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuestionTest extends TestCase {

	/**
	 * The fixture for this Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Question fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuestionTest.class);
	}

	/**
	 * Constructs a new Question test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuestionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Question fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Question test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Question getFixture() {
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
		setFixture(ServiceFactory.eINSTANCE.createQuestion());
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

} //QuestionTest
