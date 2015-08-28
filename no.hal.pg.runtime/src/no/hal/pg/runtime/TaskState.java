/**
 */
package no.hal.pg.runtime;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.TaskState#getTask <em>Task</em>}</li>
 *   <li>{@link no.hal.pg.runtime.TaskState#getEntered <em>Entered</em>}</li>
 *   <li>{@link no.hal.pg.runtime.TaskState#getExited <em>Exited</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTaskState()
 * @model
 * @generated
 */
public interface TaskState<T extends Task<?, ?>> extends EObject {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pg.runtime.Task#getCurrentState <em>Current State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' container reference.
	 * @see #setTask(Task)
	 * @see no.hal.pg.runtime.RuntimePackage#getTaskState_Task()
	 * @see no.hal.pg.runtime.Task#getCurrentState
	 * @model opposite="currentState" transient="false"
	 * @generated
	 */
	Task<?, ?> getTask();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.TaskState#getTask <em>Task</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' container reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(Task<?, ?> value);

	/**
	 * Returns the value of the '<em><b>Entered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entered</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entered</em>' attribute.
	 * @see #setEntered(Long)
	 * @see no.hal.pg.runtime.RuntimePackage#getTaskState_Entered()
	 * @model dataType="no.hal.pg.runtime.Timestamp"
	 * @generated
	 */
	Long getEntered();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.TaskState#getEntered <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entered</em>' attribute.
	 * @see #getEntered()
	 * @generated
	 */
	void setEntered(Long value);

	/**
	 * Returns the value of the '<em><b>Exited</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exited</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exited</em>' attribute.
	 * @see #setExited(Long)
	 * @see no.hal.pg.runtime.RuntimePackage#getTaskState_Exited()
	 * @model dataType="no.hal.pg.runtime.Timestamp"
	 * @generated
	 */
	Long getExited();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.TaskState#getExited <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exited</em>' attribute.
	 * @see #getExited()
	 * @generated
	 */
	void setExited(Long value);

} // TaskState
