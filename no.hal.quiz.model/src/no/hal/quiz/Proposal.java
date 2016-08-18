/**
 */
package no.hal.quiz;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.Proposal#getQuestion <em>Question</em>}</li>
 *   <li>{@link no.hal.quiz.Proposal#getAnswer <em>Answer</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getProposal()
 * @model
 * @generated
 */
public interface Proposal<A extends Answer> extends EObject {
	/**
	 * Returns the value of the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question</em>' reference.
	 * @see #setQuestion(Question)
	 * @see no.hal.quiz.QuizPackage#getProposal_Question()
	 * @model
	 * @generated
	 */
	Question getQuestion();

	/**
	 * Sets the value of the '{@link no.hal.quiz.Proposal#getQuestion <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Question</em>' reference.
	 * @see #getQuestion()
	 * @generated
	 */
	void setQuestion(Question value);

	/**
	 * Returns the value of the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Answer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Answer</em>' reference.
	 * @see #setAnswer(Answer)
	 * @see no.hal.quiz.QuizPackage#getProposal_Answer()
	 * @model
	 * @generated
	 */
	A getAnswer();

	/**
	 * Sets the value of the '{@link no.hal.quiz.Proposal#getAnswer <em>Answer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Answer</em>' reference.
	 * @see #getAnswer()
	 * @generated
	 */
	void setAnswer(A value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	Object getProposal();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Double accept();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String validate();

} // Proposal
