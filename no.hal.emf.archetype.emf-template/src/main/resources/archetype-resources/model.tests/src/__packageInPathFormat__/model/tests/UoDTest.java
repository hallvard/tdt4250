#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
/**
 */
package ${package}.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ${package}.model.ModelFactory;
import ${package}.model.UoD;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UoDTest extends TestCase {

	/**
	 * The fixture for this Uo D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoD fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UoDTest.class);
	}

	/**
	 * Constructs a new Uo D test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UoDTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Uo D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(UoD fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Uo D test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UoD getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createUoD());
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

} //UoDTest
