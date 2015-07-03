/**
 */
package no.hal.pg.quiz.runtime.tests;

import junit.textui.TestRunner;

import no.hal.pg.quiz.runtime.AcceptAnswerAction;
import no.hal.pg.quiz.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Accept Answer Action</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AcceptAnswerActionTest extends ProposeAnswerActionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AcceptAnswerActionTest.class);
	}

	/**
	 * Constructs a new Accept Answer Action test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptAnswerActionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Accept Answer Action test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AcceptAnswerAction getFixture() {
		return (AcceptAnswerAction)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createAcceptAnswerAction());
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
	
	public void testPrepare__Task() {
		super.testPrepare__Task();
	}

	public void testPerform() {
		super.testPerform("Hallvard", "Hallvard", true);
		super.testPerform("Hallvard", "Halvard", false);
	}

} //AcceptAnswerActionTest
