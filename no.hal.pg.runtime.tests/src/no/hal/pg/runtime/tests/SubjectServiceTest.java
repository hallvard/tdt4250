/**
 */
package no.hal.pg.runtime.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.SubjectService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Subject Service</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SubjectServiceTest extends TestCase {

	/**
	 * The fixture for this Subject Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectService<?> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SubjectServiceTest.class);
	}

	/**
	 * Constructs a new Subject Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Subject Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SubjectService<?> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Subject Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubjectService<?> getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createSubjectService());
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

} //SubjectServiceTest
