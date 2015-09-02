/**
 */
package no.hal.pg.runtime.engine.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Pg-runtime</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class AllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	public static Test suite() {
		TestSuite suite = new AllTests("Pg-runtime Engine Tests");
		suite.addTest(new ServiceExecutorTest());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllTests(String name) {
		super(name);
	}

} //PgruntimeAllTests
