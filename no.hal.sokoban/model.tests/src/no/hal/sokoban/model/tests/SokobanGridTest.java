/**
 */
package no.hal.sokoban.model.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGrid;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sokoban Grid</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SokobanGridTest extends TestCase {

	/**
	 * The fixture for this Sokoban Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGrid fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SokobanGridTest.class);
	}

	/**
	 * Constructs a new Sokoban Grid test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGridTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sokoban Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(SokobanGrid fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sokoban Grid test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGrid getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createSokobanGrid());
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

} //SokobanGridTest
