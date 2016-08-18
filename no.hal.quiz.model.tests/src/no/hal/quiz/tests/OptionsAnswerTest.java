/**
 */
package no.hal.quiz.tests;

import java.util.Arrays;

import org.junit.Assert;

import junit.textui.TestRunner;
import no.hal.quiz.Option;
import no.hal.quiz.OptionsAnswer;
import no.hal.quiz.QuizFactory;
import no.hal.quiz.SimpleAnswer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Options Answer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptionsAnswerTest extends AnswerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OptionsAnswerTest.class);
	}

	/**
	 * Constructs a new Options Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionsAnswerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Options Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OptionsAnswer getFixture() {
		return (OptionsAnswer)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(QuizFactory.eINSTANCE.createOptionsAnswer());
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
	public void testValidate__Object() {
		OptionsAnswer optionsAnswer = getFixture();
		optionsAnswer.getOptions().addAll(Arrays.asList(
				createOption(QuizFactory.eINSTANCE.createStringAnswer(), "Hallvard", true),
				createOption(QuizFactory.eINSTANCE.createNumberAnswer(), 2.0d, false)
				));
		Assert.assertNull(optionsAnswer.validate(new int[]{0, 1}));
		Assert.assertNotNull(optionsAnswer.validate(new int[]{-1, 1}));
		Assert.assertNotNull(optionsAnswer.validate(new int[]{1, 3}));
		Assert.assertNotNull(optionsAnswer.validate(new int[]{1, 1}));
	}
	
	@Override
	public void testAccept__Object() {
		OptionsAnswer optionsAnswer = getFixture();
		// first try single selection variant
		optionsAnswer.getOptions().addAll(Arrays.asList(
			createOption(QuizFactory.eINSTANCE.createStringAnswer(), "Hallvard", true),
			createOption(QuizFactory.eINSTANCE.createNumberAnswer(), 2.0d, false)
		));
		assertTrue(optionsAnswer.accept(new int[]{0}));
		assertFalse(optionsAnswer.accept(new int[0]));
		assertFalse(optionsAnswer.accept(new int[]{0, 1}));
		assertFalse(optionsAnswer.accept(new int[]{1}));

		assertTrue(optionsAnswer.accept(new String[]{"Hallvard"}));
		assertFalse(optionsAnswer.accept(new Object[]{"Hallvard", 2.0d}));
		assertTrue(optionsAnswer.accept("Hallvard"));
		assertFalse(optionsAnswer.accept("hallvard"));
		assertFalse(optionsAnswer.accept(2.0d));
		assertFalse(optionsAnswer.accept(false));
		assertFalse(optionsAnswer.accept(true));

		// add another correct option
		optionsAnswer.getOptions().add(
			createOption(QuizFactory.eINSTANCE.createBooleanAnswer(), false, true)
		);
		assertTrue(optionsAnswer.accept(new int[]{0, 2}));
		assertTrue(optionsAnswer.accept(new int[]{2, 0}));
		assertFalse(optionsAnswer.accept(new int[0]));
		assertFalse(optionsAnswer.accept(new int[]{0}));
		assertFalse(optionsAnswer.accept(new int[]{2}));
		assertFalse(optionsAnswer.accept(new int[]{0, 1}));
		assertFalse(optionsAnswer.accept(new int[]{0, 1, 2}));

		assertTrue(optionsAnswer.accept(new Object[]{"Hallvard", false}));
		assertTrue(optionsAnswer.accept(new Object[]{false, "Hallvard"}));
		assertFalse(optionsAnswer.accept(new String[]{"Hallvard"}));
		assertFalse(optionsAnswer.accept(new Object[]{"Hallvard", 2.0d}));
	}

	private <T> Option createOption(SimpleAnswer<T> simpleAnswer, T t, boolean correct) {
		Option option = QuizFactory.eINSTANCE.createOption();
		simpleAnswer.eSet(simpleAnswer.eClass().getEStructuralFeature("value"), t);
		option.setOption(simpleAnswer);
		option.setCorrect(correct);
		return option;
	}

} //OptionsAnswerTest
