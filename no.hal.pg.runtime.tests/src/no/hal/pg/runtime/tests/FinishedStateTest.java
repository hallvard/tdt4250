/**
 */
package no.hal.pg.runtime.tests;

import junit.textui.TestRunner;

import no.hal.pg.runtime.FinishedState;
import no.hal.pg.runtime.RuntimeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Finished State</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FinishedStateTest extends TaskStateTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FinishedStateTest.class);
	}

	/**
	 * Constructs a new Finished State test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishedStateTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Finished State test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected FinishedState<?> getFixture() {
		return (FinishedState<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RuntimeFactory.eINSTANCE.createFinishedState());
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

} //FinishedStateTest
