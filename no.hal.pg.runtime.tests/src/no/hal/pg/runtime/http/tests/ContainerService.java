/**
 */
package no.hal.pg.runtime.http.tests;

import java.lang.reflect.InvocationTargetException;

import no.hal.pg.runtime.Service;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.http.tests.ContainerService#getSimple1 <em>Simple1</em>}</li>
 *   <li>{@link no.hal.pg.runtime.http.tests.ContainerService#getInt1 <em>Int1</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainerService()
 * @model kind="class"
 * @generated
 */
public class ContainerService extends MinimalEObjectImpl.Container implements Service<no.hal.pg.runtime.http.tests.Container> {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected no.hal.pg.runtime.http.tests.Container context;

	/**
	 * The default value of the '{@link #getInt1() <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt1()
	 * @generated
	 * @ordered
	 */
	protected static final int INT1_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt1() <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt1()
	 * @generated
	 * @ordered
	 */
	protected int int1 = INT1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerService() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.eINSTANCE.getContainerService();
	}

	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(Object)
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getService_Context()
	 * @model kind="reference"
	 *        annotation="platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore SelfService=''"
	 * @generated
	 */
	public no.hal.pg.runtime.http.tests.Container getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (no.hal.pg.runtime.http.tests.Container)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestsPackage.CONTAINER_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public no.hal.pg.runtime.http.tests.Container basicGetContext() {
		return context;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.http.tests.ContainerService#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	public void setContext(no.hal.pg.runtime.http.tests.Container newContext) {
		no.hal.pg.runtime.http.tests.Container oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * Returns the value of the '<em><b>Simple1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple1</em>' reference.
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainerService_Simple1()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	public Simple1 getSimple1() {
		Simple1 simple1 = basicGetSimple1();
		return simple1 != null && simple1.eIsProxy() ? (Simple1)eResolveProxy((InternalEObject)simple1) : simple1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple1 basicGetSimple1() {
		// TODO: implement this method to return the 'Simple1' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Int1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int1</em>' attribute.
	 * @see #setInt1(int)
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainerService_Int1()
	 * @model annotation="platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore SelfService='*'"
	 * @generated
	 */
	public int getInt1() {
		return int1;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.http.tests.ContainerService#getInt1 <em>Int1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int1</em>' attribute.
	 * @see #getInt1()
	 * @generated
	 */
	public void setInt1(int newInt1) {
		int oldInt1 = int1;
		int1 = newInt1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER_SERVICE__INT1, oldInt1, int1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	public EList<Simple2> getSimples2(String stringFilter) {
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
			case TestsPackage.CONTAINER_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case TestsPackage.CONTAINER_SERVICE__SIMPLE1:
				if (resolve) return getSimple1();
				return basicGetSimple1();
			case TestsPackage.CONTAINER_SERVICE__INT1:
				return getInt1();
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
			case TestsPackage.CONTAINER_SERVICE__CONTEXT:
				setContext((no.hal.pg.runtime.http.tests.Container)newValue);
				return;
			case TestsPackage.CONTAINER_SERVICE__INT1:
				setInt1((Integer)newValue);
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
			case TestsPackage.CONTAINER_SERVICE__CONTEXT:
				setContext((no.hal.pg.runtime.http.tests.Container)null);
				return;
			case TestsPackage.CONTAINER_SERVICE__INT1:
				setInt1(INT1_EDEFAULT);
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
			case TestsPackage.CONTAINER_SERVICE__CONTEXT:
				return context != null;
			case TestsPackage.CONTAINER_SERVICE__SIMPLE1:
				return basicGetSimple1() != null;
			case TestsPackage.CONTAINER_SERVICE__INT1:
				return int1 != INT1_EDEFAULT;
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
			case TestsPackage.CONTAINER_SERVICE___GET_SIMPLES2__STRING:
				return getSimples2((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (int1: ");
		result.append(int1);
		result.append(')');
		return result.toString();
	}

} // ContainerService
