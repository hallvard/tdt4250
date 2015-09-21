/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.QuizPart;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPartTest extends AbstractQuizPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizPartTest.class);
	}

	/**
	 * Constructs a new Part test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Part test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuizPart getFixture() {
		return (QuizPart)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createQuizPart());
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

} //QuizPartTest
