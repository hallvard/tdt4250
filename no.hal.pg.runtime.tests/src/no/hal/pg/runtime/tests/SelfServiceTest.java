/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.SelfService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Self Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SelfServiceTest extends TestCase {

	/**
	 * The fixture for this Self Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SelfServiceTest.class);
	}

	/**
	 * Constructs a new Self Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Self Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SelfService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Self Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SelfService getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createSelfService());
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

} //SelfServiceTest
