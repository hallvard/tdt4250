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
import org.eclipse.emf.ecore.EObject;
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
 *   <li>{@link no.hal.pg.runtime.impl.TaskServiceImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TaskServiceImpl<T extends Task<?, ?>> extends MinimalEObjectImpl.Container implements TaskService<T> {
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
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected T context;
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
	public T getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (T)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.TASK_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(T newContext) {
		T oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK_SERVICE__CONTEXT, oldContext, context));
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
			case RuntimePackage.TASK_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case RuntimePackage.TASK_SERVICE__CONTEXT:
				setContext((T)newValue);
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
			case RuntimePackage.TASK_SERVICE__CONTEXT:
				setContext((T)null);
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
			case RuntimePackage.TASK_SERVICE__CONTEXT:
				return context != null;
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
