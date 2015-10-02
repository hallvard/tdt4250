/**
 */
package no.hal.pg.runtime.service;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.PlayerService#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.service.ServicePackage#getPlayerService()
 * @model
 * @generated
 */
public interface PlayerService extends Service<Player> {
	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.Task}&lt;?, ?>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' reference list.
	 * @see no.hal.pg.runtime.service.ServicePackage#getPlayerService_Tasks()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<Task<?, ?>> getTasks();

} // PlayerService
