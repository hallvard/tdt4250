/**
 */
package no.hal.quiz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proposals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.QuizProposals#getQuiz <em>Quiz</em>}</li>
 *   <li>{@link no.hal.quiz.QuizProposals#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.quiz.QuizProposals#getAllProposals <em>All Proposals</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getQuizProposals()
 * @model
 * @generated
 */
public interface QuizProposals extends EObject {
	/**
	 * Returns the value of the '<em><b>Quiz</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quiz</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quiz</em>' reference.
	 * @see #setQuiz(Quiz)
	 * @see no.hal.quiz.QuizPackage#getQuizProposals_Quiz()
	 * @model
	 * @generated
	 */
	Quiz getQuiz();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QuizProposals#getQuiz <em>Quiz</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quiz</em>' reference.
	 * @see #getQuiz()
	 * @generated
	 */
	void setQuiz(Quiz value);

	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.quiz.QuizPartProposals}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see no.hal.quiz.QuizPackage#getQuizProposals_Proposals()
	 * @model containment="true"
	 * @generated
	 */
	EList<QuizPartProposals> getProposals();

	/**
	 * Returns the value of the '<em><b>All Proposals</b></em>' reference list.
	 * The list contents are of type {@link no.hal.quiz.Proposal}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Proposals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Proposals</em>' reference list.
	 * @see no.hal.quiz.QuizPackage#getQuizProposals_AllProposals()
	 * @model transient="true" volatile="true" derived="true"
	 * @generated
	 */
	EList<Proposal<?>> getAllProposals();

} // QuizProposals
