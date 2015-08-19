/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Players</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.pg.runtime.RuntimePackage#getPlayers()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Players extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<Player> getPlayers();

} // Players
