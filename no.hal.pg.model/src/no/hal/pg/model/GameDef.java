/**
 */
package no.hal.pg.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.model.GameDef#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.model.ModelPackage#getGameDef()
 * @model
 * @generated
 */
public interface GameDef extends EObject {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.model.TaskDef}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see no.hal.pg.model.ModelPackage#getGameDef_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<TaskDef> getTasks();

} // GameDef
