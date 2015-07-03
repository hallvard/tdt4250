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

} // QuizTaskDef
