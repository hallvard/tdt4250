/**
 */
package no.hal.quiz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Part Proposals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.quiz.QuizPartProposals#getProposals <em>Proposals</em>}</li>
 *   <li>{@link no.hal.quiz.QuizPartProposals#getQuizPart <em>Quiz Part</em>}</li>
 * </ul>
 *
 * @see no.hal.quiz.QuizPackage#getQuizPartProposals()
 * @model
 * @generated
 */
public interface QuizPartProposals extends EObject {
	/**
	 * Returns the value of the '<em><b>Proposals</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.quiz.Proposal}&lt;?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Proposals</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proposals</em>' containment reference list.
	 * @see no.hal.quiz.QuizPackage#getQuizPartProposals_Proposals()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proposal<?>> getProposals();

	/**
	 * Returns the value of the '<em><b>Quiz Part</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quiz Part</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quiz Part</em>' reference.
	 * @see #setQuizPart(QuizPart)
	 * @see no.hal.quiz.QuizPackage#getQuizPartProposals_QuizPart()
	 * @model
	 * @generated
	 */
	QuizPart getQuizPart();

	/**
	 * Sets the value of the '{@link no.hal.quiz.QuizPartProposals#getQuizPart <em>Quiz Part</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quiz Part</em>' reference.
	 * @see #getQuizPart()
	 * @generated
	 */
	void setQuizPart(QuizPart value);

} // QuizPartProposals
