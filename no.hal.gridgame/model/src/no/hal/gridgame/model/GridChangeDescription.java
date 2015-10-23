/**
 */
package no.hal.gridgame.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grid Change Description</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.gridgame.model.ModelPackage#getGridChangeDescription()
 * @model
 * @generated
 */
public interface GridChangeDescription extends GridRectangle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addChange(int x, int y);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addChange(int x, int y, int width, int height);

} // GridChangeDescription
