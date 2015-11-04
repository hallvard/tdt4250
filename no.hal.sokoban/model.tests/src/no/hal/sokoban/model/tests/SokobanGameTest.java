/**
 */
package no.hal.sokoban.model.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGame;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Game</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SokobanGameTest extends TestCase {

	/**
	 * The fixture for this Sokoban Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGame fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SokobanGameTest.class);
	}

	/**
	 * Constructs a new Sokoban Game test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sokoban Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SokobanGame fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sokoban Game test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGame getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createSokobanGame());
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

} //SokobanGameTest
