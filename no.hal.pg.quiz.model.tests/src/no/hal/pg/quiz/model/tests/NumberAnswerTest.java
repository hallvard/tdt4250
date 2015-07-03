/**
 */
package no.hal.pg.quiz.model.tests;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.NumberAnswer;
import no.hal.pg.quiz.model.ModelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Number Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class NumberAnswerTest extends SimpleAnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NumberAnswerTest.class);
	}

	/**
	 * Constructs a new Number Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Number Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected NumberAnswer getFixture() {
		return (NumberAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ModelFactory.eINSTANCE.createNumberAnswer());
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
	
	//
	
	@Override
	public void testAccept__Object() {
		NumberAnswer numberAnswer = getFixture();
		numberAnswer.setValue(2.0);
		assertTrue(numberAnswer.accept(2.0d));
		assertTrue(numberAnswer.accept(2.0));
		assertTrue(numberAnswer.accept(2));
		assertTrue(numberAnswer.accept("2.0"));
		assertTrue(numberAnswer.accept("2"));

		assertFalse(numberAnswer.accept(1.0d));
		assertFalse(numberAnswer.accept(1.0));
		assertFalse(numberAnswer.accept(1));
		assertFalse(numberAnswer.accept("1.0"));
		assertFalse(numberAnswer.accept("1"));
	}

} //NumberAnswerTest
