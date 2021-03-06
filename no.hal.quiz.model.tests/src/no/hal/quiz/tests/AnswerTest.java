/**
 */
package no.hal.quiz.tests;

import junit.framework.TestCase;
import no.hal.quiz.Answer;
import no.hal.quiz.Proposal;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link no.hal.quiz.Answer#accept(java.lang.Object) <em>Accept</em>}</li>
 *   <li>{@link no.hal.quiz.Answer#validate(java.lang.Object) <em>Validate</em>}</li>
 *   <li>{@link no.hal.quiz.Answer#createProposal() <em>Create Proposal</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class AnswerTest extends TestCase {

	/**
	 * The fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Answer fixture = null;

	/**
	 * Constructs a new Answer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnswerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Answer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Answer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Answer getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link no.hal.quiz.Answer#accept(java.lang.Object) <em>Accept</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.Answer#accept(java.lang.Object)
	 * @generated
	 */
	public void testAccept__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.hal.quiz.Answer#validate(java.lang.Object) <em>Validate</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.Answer#validate(java.lang.Object)
	 * @generated
	 */
	public void testValidate__Object() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link no.hal.quiz.Answer#createProposal() <em>Create Proposal</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.quiz.Answer#createProposal()
	 * @generated NOT
	 */
	public void testCreateProposal() {
		Proposal<?> proposal = getFixture().createProposal();
		assertSame(getFixture(), proposal.getAnswer());
	}

	//
	
	static void assertTrue(double value) {
		assertEquals(1.0, value);
	}
	static void assertFalse(double value) {
		assertEquals(0.0, value);
	}

} //AnswerTest
