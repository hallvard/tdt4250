/**
 */
package no.hal.pg.quiz.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.quiz.runtime.AcceptingAnswerState;
import no.hal.pg.quiz.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accepting Answer State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcceptingAnswerStateTest extends TestCase {

	/**
	 * The fixture for this Accepting Answer State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptingAnswerState fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptingAnswerStateTest.class);
	}

	/**
	 * Constructs a new Accepting Answer State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptingAnswerStateTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Accepting Answer State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AcceptingAnswerState fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Accepting Answer State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptingAnswerState getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createAcceptingAnswerState());
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
	
	public void testIsFinishState() {
		assertTrue(getFixture().isEnabled());
		assertFalse(getFixture().isFinished());
	}
	
} //AcceptingAnswerStateTest
