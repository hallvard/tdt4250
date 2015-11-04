/**
 */
package no.hal.sokoban.model.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.MovePlayerCommand;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Move Player Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MovePlayerCommandTest extends TestCase {

	/**
	 * The fixture for this Move Player Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovePlayerCommand fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MovePlayerCommandTest.class);
	}

	/**
	 * Constructs a new Move Player Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MovePlayerCommandTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Move Player Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MovePlayerCommand fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Move Player Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovePlayerCommand getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createMovePlayerCommand());
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

} //MovePlayerCommandTest
