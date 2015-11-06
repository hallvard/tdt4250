/**
 */
package no.hal.pg.sokoban.runtime.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.pg.sokoban.runtime.RuntimeFactory;
import no.hal.pg.sokoban.runtime.SokobanService;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame() <em>Sokoban Game</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SokobanServiceTest extends TestCase {

	/**
	 * The fixture for this Sokoban Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SokobanServiceTest.class);
	}

	/**
	 * Constructs a new Sokoban Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sokoban Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SokobanService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sokoban Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanService getFixture() {
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
		setFixture(RuntimeFactory.eINSTANCE.createSokobanService());
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

	/**
	 * Tests the '{@link no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame() <em>Sokoban Game</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.runtime.SokobanService#getSokobanGame()
	 * @generated NOT
	 */
	public void testGetSokobanGame() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
//		fail();
	}

} //SokobanServiceTest
