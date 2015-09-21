/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.QA;
import no.hal.quiz.QuizFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>QA</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QATest extends AbstractQATest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QATest.class);
	}

	/**
	 * Constructs a new QA test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QATest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this QA test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QA getFixture() {
		return (QA)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createQA());
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

} //QATest
