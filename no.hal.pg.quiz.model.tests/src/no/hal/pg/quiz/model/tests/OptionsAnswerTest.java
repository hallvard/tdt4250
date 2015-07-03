/**
 */
package no.hal.pg.quiz.model.tests;

import java.util.Arrays;

import junit.textui.TestRunner;
import no.hal.pg.quiz.model.ModelFactory;
import no.hal.pg.quiz.model.Option;
import no.hal.pg.quiz.model.OptionsAnswer;
import no.hal.pg.quiz.model.SimpleAnswer;

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
		setFixture(ModelFactory.eINSTANCE.createOptionsAnswer());
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
		OptionsAnswer optionsAnswer = getFixture();
		// first try single selection variant
		optionsAnswer.getOptions().addAll(Arrays.asList(
			createOption(ModelFactory.eINSTANCE.createStringAnswer(), "Hallvard", true),
			createOption(ModelFactory.eINSTANCE.createNumberAnswer(), 2.0d, false)
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
			createOption(ModelFactory.eINSTANCE.createBooleanAnswer(), false, true)
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
		Option option = ModelFactory.eINSTANCE.createOption();
		simpleAnswer.setValue(t);
		option.setOption(simpleAnswer);
		option.setCorrect(correct);
		return option;
	}

} //OptionsAnswerTest
