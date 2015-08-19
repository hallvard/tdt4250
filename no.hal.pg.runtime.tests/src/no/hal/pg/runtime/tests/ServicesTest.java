/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Services;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Services</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesTest extends TestCase {

	/**
	 * The fixture for this Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Services fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ServicesTest.class);
	}

	/**
	 * Constructs a new Services test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Services fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Services test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Services getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createServices());
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

} //ServicesTest
