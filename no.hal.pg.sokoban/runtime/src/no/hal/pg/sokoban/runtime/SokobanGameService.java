/**
 */
package no.hal.pg.sokoban.runtime;

import no.hal.gridgame.model.GridChangeDescription;

import no.hal.pg.runtime.Service;

import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanGrid;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sokoban Game Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.SokobanGameService#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanGameService()
 * @model
 * @generated
 */
public interface SokobanGameService extends Service<SokobanGame> {
	/**
	 * Returns the value of the '<em><b>Grid</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grid</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grid</em>' reference.
	 * @see no.hal.pg.sokoban.runtime.RuntimePackage#getSokobanGameService_Grid()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	SokobanGrid getGrid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GridChangeDescription movePlayer(String direction);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GridRectangleValues movePlayer(String direction, Boolean stringFormat);

} // SokobanGameService
