/**
 */
package no.hal.pg.quiz.model.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>quiz</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizTests extends TestSuite {

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
		TestSuite suite = new QuizTests("quiz Tests");
		suite.addTestSuite(StringAnswerTest.class);
		suite.addTestSuite(NumberAnswerTest.class);
		suite.addTestSuite(BooleanAnswerTest.class);
		suite.addTestSuite(XmlAnswerTest.class);
		suite.addTestSuite(OptionsAnswerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTests(String name) {
		super(name);
	}

} //QuizTests
