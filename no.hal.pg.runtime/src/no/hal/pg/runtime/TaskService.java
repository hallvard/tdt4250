/**
 */
package no.hal.pg.runtime;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.TaskService#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.RuntimePackage#getTaskService()
 * @model abstract="true"
 * @generated
 */
public interface TaskService<T extends Task<?>> extends Service {
	/**
	 * Returns the value of the '<em><b>Task</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Task</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Task</em>' reference.
	 * @see #setTask(Task)
	 * @see no.hal.pg.runtime.RuntimePackage#getTaskService_Task()
	 * @model
	 * @generated
	 */
	T getTask();

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.TaskService#getTask <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Task</em>' reference.
	 * @see #getTask()
	 * @generated
	 */
	void setTask(T value);

} // TaskService
