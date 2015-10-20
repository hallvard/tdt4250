/**
 */
package no.hal.gridgame.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Composite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.CompositeCommand#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @see no.hal.gridgame.model.ModelPackage#getCompositeCommand()
 * @model
 * @generated
 */
public interface CompositeCommand<C extends GameCommand> extends GameCommand {
	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commands</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see no.hal.gridgame.model.ModelPackage#getCompositeCommand_Commands()
	 * @model containment="true"
	 * @generated
	 */
	EList<C> getCommands();

} // CompositeCommand
