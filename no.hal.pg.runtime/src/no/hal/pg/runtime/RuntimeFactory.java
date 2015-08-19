/**
 */
package no.hal.pg.runtime;

import no.hal.pg.model.TaskDef;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.RuntimePackage
 * @generated
 */
public interface RuntimeFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RuntimeFactory eINSTANCE = no.hal.pg.runtime.impl.RuntimeFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Game</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Game</em>'.
	 * @generated
	 */
	Game createGame();

	/**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
	Player createPlayer();

	/**
	 * Returns a new object of class '<em>Services</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Services</em>'.
	 * @generated
	 */
	Services createServices();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	<T extends TaskDef, R> Task<T, R> createTask();

	/**
	 * Returns a new object of class '<em>Task State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task State</em>'.
	 * @generated
	 */
	<T extends Task<?, ?>> TaskState<T> createTaskState();

	/**
	 * Returns a new object of class '<em>Service Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Service Invocation</em>'.
	 * @generated
	 */
	ServiceInvocation createServiceInvocation();

	/**
	 * Returns a new object of class '<em>Direct Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Direct Ref</em>'.
	 * @generated
	 */
	<T> DirectRef<T> createDirectRef();

	/**
	 * Returns a new object of class '<em>Player Ref</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player Ref</em>'.
	 * @generated
	 */
	PlayerRef createPlayerRef();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RuntimePackage getRuntimePackage();

} //RuntimeFactory
