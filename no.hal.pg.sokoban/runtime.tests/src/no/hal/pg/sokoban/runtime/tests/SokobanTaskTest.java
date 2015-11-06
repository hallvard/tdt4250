/**
 */
package no.hal.pg.sokoban.runtime.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.sokoban.runtime.RuntimeFactory;
import no.hal.pg.sokoban.runtime.SokobanTask;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Task</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SokobanTaskTest extends TestCase {

	/**
	 * The fixture for this Sokoban Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanTask fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SokobanTaskTest.class);
	}

	/**
	 * Constructs a new Sokoban Task test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanTaskTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sokoban Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SokobanTask fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sokoban Task test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanTask getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createSokobanTask());
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
	
	public void testIgnore() {
		// ignore
	}
} //SokobanTaskTest
