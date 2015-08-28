/**
 */
package no.hal.pg.runtime.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.TaskState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.TaskStateImpl#getTask <em>Task</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskStateImpl#getEntered <em>Entered</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskStateImpl#getExited <em>Exited</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskStateImpl<T extends Task<?, ?>> extends MinimalEObjectImpl.Container implements TaskState<T> {
	/**
	 * The default value of the '{@link #getEntered() <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntered()
	 * @generated
	 * @ordered
	 */
	protected static final Long ENTERED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEntered() <em>Entered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntered()
	 * @generated
	 * @ordered
	 */
	protected Long entered = ENTERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getExited() <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExited()
	 * @generated
	 * @ordered
	 */
	protected static final Long EXITED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExited() <em>Exited</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExited()
	 * @generated
	 * @ordered
	 */
	protected Long exited = EXITED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TASK_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task<?, ?> getTask() {
		if (eContainerFeatureID() != RuntimePackage.TASK_STATE__TASK) return null;
		return (Task<?, ?>)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTask(Task<?, ?> newTask, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTask, RuntimePackage.TASK_STATE__TASK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(Task<?, ?> newTask) {
		if (newTask != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.TASK_STATE__TASK && newTask != null)) {
			if (EcoreUtil.isAncestor(this, newTask))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTask != null)
				msgs = ((InternalEObject)newTask).eInverseAdd(this, RuntimePackage.TASK__CURRENT_STATE, Task.class, msgs);
			msgs = basicSetTask(newTask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK_STATE__TASK, newTask, newTask));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getEntered() {
		return entered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntered(Long newEntered) {
		Long oldEntered = entered;
		entered = newEntered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK_STATE__ENTERED, oldEntered, entered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long getExited() {
		return exited;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExited(Long newExited) {
		Long oldExited = exited;
		exited = newExited;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK_STATE__EXITED, oldExited, exited));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isEnabled() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinished() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTask((Task<?, ?>)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				return basicSetTask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RuntimePackage.TASK_STATE__TASK:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.TASK__CURRENT_STATE, Task.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				return getTask();
			case RuntimePackage.TASK_STATE__ENTERED:
				return getEntered();
			case RuntimePackage.TASK_STATE__EXITED:
				return getExited();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				setTask((Task<?, ?>)newValue);
				return;
			case RuntimePackage.TASK_STATE__ENTERED:
				setEntered((Long)newValue);
				return;
			case RuntimePackage.TASK_STATE__EXITED:
				setExited((Long)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				setTask((Task<?, ?>)null);
				return;
			case RuntimePackage.TASK_STATE__ENTERED:
				setEntered(ENTERED_EDEFAULT);
				return;
			case RuntimePackage.TASK_STATE__EXITED:
				setExited(EXITED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RuntimePackage.TASK_STATE__TASK:
				return getTask() != null;
			case RuntimePackage.TASK_STATE__ENTERED:
				return ENTERED_EDEFAULT == null ? entered != null : !ENTERED_EDEFAULT.equals(entered);
			case RuntimePackage.TASK_STATE__EXITED:
				return EXITED_EDEFAULT == null ? exited != null : !EXITED_EDEFAULT.equals(exited);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (entered: ");
		result.append(entered);
		result.append(", exited: ");
		result.append(exited);
		result.append(')');
		return result.toString();
	}

} //TaskStateImpl
