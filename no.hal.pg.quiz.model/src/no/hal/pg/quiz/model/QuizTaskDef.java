/**
 */
package no.hal.pg.quiz.model;

import no.hal.pg.model.TaskDef;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Quiz Task Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.quiz.model.QuizTaskDef#getQuizParts <em>Quiz Parts</em>}</li>
 *   <li>{@link no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded <em>Correct Needed</em>}</li>
 *   <li>{@link no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed <em>Attempts Allowed</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.quiz.model.ModelPackage#getQuizTaskDef()
 * @model
 * @generated
 */
public interface QuizTaskDef extends TaskDef {
	/**
	 * Returns the value of the '<em><b>Quiz Parts</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.quiz.model.AbstractQuizPart}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quiz Parts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quiz Parts</em>' reference list.
	 * @see no.hal.pg.quiz.model.ModelPackage#getQuizTaskDef_QuizParts()
	 * @model
	 * @generated
	 */
	EList<AbstractQuizPart> getQuizParts();

	/**
	 * Returns the value of the '<em><b>Correct Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Correct Needed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correct Needed</em>' attribute.
	 * @see #setCorrectNeeded(double)
	 * @see no.hal.pg.quiz.model.ModelPackage#getQuizTaskDef_CorrectNeeded()
	 * @model
	 * @generated
	 */
	double getCorrectNeeded();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.model.QuizTaskDef#getCorrectNeeded <em>Correct Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Correct Needed</em>' attribute.
	 * @see #getCorrectNeeded()
	 * @generated
	 */
	void setCorrectNeeded(double value);

	/**
	 * Returns the value of the '<em><b>Attempts Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attempts Allowed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attempts Allowed</em>' attribute.
	 * @see #setAttemptsAllowed(int)
	 * @see no.hal.pg.quiz.model.ModelPackage#getQuizTaskDef_AttemptsAllowed()
	 * @model
	 * @generated
	 */
	int getAttemptsAllowed();

	/**
	 * Sets the value of the '{@link no.hal.pg.quiz.model.QuizTaskDef#getAttemptsAllowed <em>Attempts Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attempts Allowed</em>' attribute.
	 * @see #getAttemptsAllowed()
	 * @generated
	 */
	void setAttemptsAllowed(int value);

} // QuizTaskDef
