/**
 */
package no.hal.pg.runtime.engine.tests;

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
 * A representation of the model object '<em><b>Simple2 Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple2Service#getInt1 <em>Int1</em>}</li>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple2Service#getString21 <em>String21</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2Service()
 * @model kind="class"
 * @generated
 */
public class Simple2Service extends MinimalEObjectImpl.Container implements Service<Simple2> {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Simple2 context;

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
	 * The default value of the '{@link #getString21() <em>String21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString21()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING21_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simple2Service() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.eINSTANCE.getSimple2Service();
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
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getService_Context()
	 * @model kind="reference"
	 *        annotation="platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore SelfService=''"
	 * @generated
	 */
	public Simple2 getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Simple2)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestsPackage.SIMPLE2_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple2 basicGetContext() {
		return context;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.engine.tests.Simple2Service#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	public void setContext(Simple2 newContext) {
		Simple2 oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.SIMPLE2_SERVICE__CONTEXT, oldContext, context));
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
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2Service_Int1()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="platform:/plugin/no.hal.pg.runtime/model/pg-runtime.ecore SelfService='int21'"
	 * @generated
	 */
	public int getInt1() {
		// TODO: implement this method to return the 'Int1' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * Returns the value of the '<em><b>Int21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Int21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Int21</em>' attribute.
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2Service_Int21()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public int getInt21() {
		return getContext().getInt21() + 1;
	}

	/**
	 * Returns the value of the '<em><b>String21</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String21</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String21</em>' attribute.
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2Service_String21()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public String getString21() {
		String s = getContext().getString21();
		return s.length() >= 3 ? s.substring(3) : "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void add1() {
		add(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated NOT
	 */
	public void add(int n) {
		getContext().setInt21(getContext().getInt21() + n);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsPackage.SIMPLE2_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case TestsPackage.SIMPLE2_SERVICE__INT1:
				return getInt1();
			case TestsPackage.SIMPLE2_SERVICE__STRING21:
				return getString21();
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
			case TestsPackage.SIMPLE2_SERVICE__CONTEXT:
				setContext((Simple2)newValue);
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
			case TestsPackage.SIMPLE2_SERVICE__CONTEXT:
				setContext((Simple2)null);
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
			case TestsPackage.SIMPLE2_SERVICE__CONTEXT:
				return context != null;
			case TestsPackage.SIMPLE2_SERVICE__INT1:
				return getInt1() != INT1_EDEFAULT;
			case TestsPackage.SIMPLE2_SERVICE__STRING21:
				return STRING21_EDEFAULT == null ? getString21() != null : !STRING21_EDEFAULT.equals(getString21());
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
			case TestsPackage.SIMPLE2_SERVICE___ADD1:
				add1();
				return null;
			case TestsPackage.SIMPLE2_SERVICE___ADD__INT:
				add((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // Simple2Service
