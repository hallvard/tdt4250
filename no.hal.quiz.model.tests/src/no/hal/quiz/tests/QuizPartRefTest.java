/**
 */
package no.hal.quiz.tests;

import junit.textui.TestRunner;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.QuizPartRef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Part Ref</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPartRefTest extends AbstractQuizPartTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizPartRefTest.class);
	}

	/**
	 * Constructs a new Part Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Part Ref test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected QuizPartRef getFixture() {
		return (QuizPartRef)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createQuizPartRef());
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

} //QuizPartRefTest
