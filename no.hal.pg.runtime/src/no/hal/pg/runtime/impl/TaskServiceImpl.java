/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.ServiceInvocation;
import no.hal.pg.runtime.ServiceListener;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.TaskService;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.TaskServiceImpl#getServiceListeners <em>Service Listeners</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskServiceImpl#getTask <em>Task</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskServiceImpl<T extends Task<?>> extends MinimalEObjectImpl.Container implements TaskService<T> {
	/**
	 * The cached value of the '{@link #getServiceListeners() <em>Service Listeners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceListener> serviceListeners;
	/**
	 * The cached value of the '{@link #getTask() <em>Task</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTask()
	 * @generated
	 * @ordered
	 */
	protected T task;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TASK_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceListener> getServiceListeners() {
		if (serviceListeners == null) {
			serviceListeners = new EObjectResolvingEList<ServiceListener>(ServiceListener.class, this, RuntimePackage.TASK_SERVICE__SERVICE_LISTENERS);
		}
		return serviceListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getTask() {
		if (task != null && task.eIsProxy()) {
			InternalEObject oldTask = (InternalEObject)task;
			task = (T)eResolveProxy(oldTask);
			if (task != oldTask) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.TASK_SERVICE__TASK, oldTask, task));
			}
		}
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetTask() {
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTask(T newTask) {
		T oldTask = task;
		task = newTask;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK_SERVICE__TASK, oldTask, task));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void invokeService(ServiceInvocation invocation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.TASK_SERVICE__SERVICE_LISTENERS:
				return getServiceListeners();
			case RuntimePackage.TASK_SERVICE__TASK:
				if (resolve) return getTask();
				return basicGetTask();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RuntimePackage.TASK_SERVICE__SERVICE_LISTENERS:
				getServiceListeners().clear();
				getServiceListeners().addAll((Collection<? extends ServiceListener>)newValue);
				return;
			case RuntimePackage.TASK_SERVICE__TASK:
				setTask((T)newValue);
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
			case RuntimePackage.TASK_SERVICE__SERVICE_LISTENERS:
				getServiceListeners().clear();
				return;
			case RuntimePackage.TASK_SERVICE__TASK:
				setTask((T)null);
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
			case RuntimePackage.TASK_SERVICE__SERVICE_LISTENERS:
				return serviceListeners != null && !serviceListeners.isEmpty();
			case RuntimePackage.TASK_SERVICE__TASK:
				return task != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.TASK_SERVICE___INVOKE_SERVICE__SERVICEINVOCATION:
				invokeService((ServiceInvocation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskServiceImpl
