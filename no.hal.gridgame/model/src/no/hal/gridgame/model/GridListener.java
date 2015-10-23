/**
 */
package no.hal.gridgame.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Listener</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.gridgame.model.ModelPackage#getGridListener()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GridListener extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void gridChanged(Grid<?, ?> grid, int x, int y, int width, int height);

} // GridListener
