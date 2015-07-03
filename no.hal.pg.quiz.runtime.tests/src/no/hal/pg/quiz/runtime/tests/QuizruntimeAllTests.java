/**
 */
package no.hal.pg.quiz.runtime.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Quiz-runtime</b></em>' model.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizruntimeAllTests extends TestSuite {

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
		TestSuite suite = new QuizruntimeAllTests("Quiz-runtime Tests");
		suite.addTest(RuntimeTests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizruntimeAllTests(String name) {
		super(name);
	}

} //QuizruntimeAllTests
