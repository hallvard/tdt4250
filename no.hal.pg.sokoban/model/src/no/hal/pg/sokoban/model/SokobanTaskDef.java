/**
 */
package no.hal.pg.sokoban.model;

import no.hal.pg.model.TaskDef;
import no.hal.sokoban.model.SokobanLevel;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uo D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.model.SokobanTaskDef#getLevels <em>Levels</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.model.ModelPackage#getSokobanTaskDef()
 * @model
 * @generated
 */
public interface SokobanTaskDef extends TaskDef {

	/**
	 * Returns the value of the '<em><b>Levels</b></em>' reference list.
	 * The list contents are of type {@link no.hal.sokoban.model.SokobanLevel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Levels</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Levels</em>' reference list.
	 * @see no.hal.pg.sokoban.model.ModelPackage#getSokobanTaskDef_Levels()
	 * @model
	 * @generated
	 */
	EList<SokobanLevel> getLevels();
} // UoD
