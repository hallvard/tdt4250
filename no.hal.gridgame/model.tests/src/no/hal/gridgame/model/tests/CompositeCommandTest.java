/**
 */
package no.hal.gridgame.model.tests;

import junit.textui.TestRunner;

import no.hal.gridgame.model.CompositeCommand;
import no.hal.gridgame.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Composite Command</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CompositeCommandTest extends GameCommandTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CompositeCommandTest.class);
	}

	/**
	 * Constructs a new Composite Command test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompositeCommandTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Composite Command test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected CompositeCommand<?> getFixture() {
		return (CompositeCommand<?>)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createCompositeCommand());
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

} //CompositeCommandTest
