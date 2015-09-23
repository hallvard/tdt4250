/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.quiz.runtime.service.Answer;
import no.hal.pg.quiz.runtime.service.ServiceFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AnswerTest extends TestCase {

	/**
	 * The fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Answer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AnswerTest.class);
	}

	/**
	 * Constructs a new Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Answer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Answer getFixture() {
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
		setFixture(ServiceFactory.eINSTANCE.createAnswer());
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

} //AnswerTest
