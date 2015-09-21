/**
 */
package no.hal.pg.quiz.model.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.QuizTaskDef;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Quiz Task Def</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizTaskDefTest extends TestCase {

	/**
	 * The fixture for this Quiz Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskDef fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(QuizTaskDefTest.class);
	}

	/**
	 * Constructs a new Quiz Task Def test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizTaskDefTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Quiz Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(QuizTaskDef fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Quiz Task Def test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuizTaskDef getFixture() {
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
		setFixture(ModelFactory.eINSTANCE.createQuizTaskDef());
	}

	public void testIgnore() {
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

} //QuizTaskDefTest
