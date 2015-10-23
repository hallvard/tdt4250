/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.pg.runtime.Service;
import no.hal.sokoban.model.SokobanGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Grid Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanGridService#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanGridService()
 * @model
 * @generated
 */
public interface SokobanGridService extends Service<SokobanGrid> {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanGridService_Values()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	GridRectangleValues getValues();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GridRectangleValues getGridValues(int x, int y, int width, int height, Boolean stringFormat);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GridRectangleValues getGridValues(Boolean stringFormat);

} // SokobanGridService
