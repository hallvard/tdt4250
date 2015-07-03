/**
 */
package no.hal.pg.quiz.model.tests;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.QuizPartRef;

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
	 * Constructs a new Quiz Part Ref test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizPartRefTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Quiz Part Ref test case.
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
		setFixture(ModelFactory.eINSTANCE.createQuizPartRef());
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
