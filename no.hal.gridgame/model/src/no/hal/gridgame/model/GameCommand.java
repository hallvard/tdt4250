/**
 */
package no.hal.gridgame.model;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.GameCommand#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @see no.hal.gridgame.model.ModelPackage#getGameCommand()
 * @model abstract="true"
 * @generated
 */
public interface GameCommand extends GridListener {
	/**
	 * Returns the value of the '<em><b>Changes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Changes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Changes</em>' containment reference.
	 * @see #setChanges(GridChangeDescription)
	 * @see no.hal.gridgame.model.ModelPackage#getGameCommand_Changes()
	 * @model containment="true"
	 * @generated
	 */
	GridChangeDescription getChanges();

	/**
	 * Sets the value of the '{@link no.hal.gridgame.model.GameCommand#getChanges <em>Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changes</em>' containment reference.
	 * @see #getChanges()
	 * @generated
	 */
	void setChanges(GridChangeDescription value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	boolean prepare();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void perform();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

} // GameCommand
