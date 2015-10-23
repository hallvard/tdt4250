/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.gridgame.model.GridRectangle;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Rectangle Values</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.GridRectangleValues#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getGridRectangleValues()
 * @model
 * @generated
 */
public interface GridRectangleValues extends GridRectangle {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getGridRectangleValues_Values()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getValues();

} // GridRectangleValues
