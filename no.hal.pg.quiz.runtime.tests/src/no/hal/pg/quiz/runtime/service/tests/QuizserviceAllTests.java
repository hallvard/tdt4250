/**
 */
package no.hal.pg.quiz.runtime.service.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Quiz-service</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizserviceAllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new QuizserviceAllTests("Quiz-service Tests");
		suite.addTest(ServiceTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizserviceAllTests(String name) {
		super(name);
	}

} //QuizserviceAllTests
