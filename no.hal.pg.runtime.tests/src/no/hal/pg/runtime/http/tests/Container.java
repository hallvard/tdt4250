/**
 */
package no.hal.pg.runtime.http.tests;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.http.tests.Container#getSimple1 <em>Simple1</em>}</li>
 *   <li>{@link no.hal.pg.runtime.http.tests.Container#getSimples2 <em>Simples2</em>}</li>
 *   <li>{@link no.hal.pg.runtime.http.tests.Container#getInt1 <em>Int1</em>}</li>
 *   <li>{@link no.hal.pg.runtime.http.tests.Container#getString1 <em>String1</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainer()
 * @model kind="class"
 * @generated
 */
public class Container extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getSimple1() <em>Simple1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimple1()
	 * @generated
	 * @ordered
	 */
	protected Simple1 simple1;

	/**
	 * The cached value of the '{@link #getSimples2() <em>Simples2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimples2()
	 * @generated
	 * @ordered
	 */
	protected EList<Simple2> simples2;

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
	 * The default value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString1() <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString1()
	 * @generated
	 * @ordered
	 */
	protected String string1 = STRING1_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Container() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.eINSTANCE.getContainer();
	}

	/**
	 * Returns the value of the '<em><b>Simple1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simple1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simple1</em>' containment reference.
	 * @see #setSimple1(Simple1)
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainer_Simple1()
	 * @model containment="true"
	 * @generated
	 */
	public Simple1 getSimple1() {
		return simple1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimple1(Simple1 newSimple1, NotificationChain msgs) {
		Simple1 oldSimple1 = simple1;
		simple1 = newSimple1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER__SIMPLE1, oldSimple1, newSimple1);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.http.tests.Container#getSimple1 <em>Simple1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple1</em>' containment reference.
	 * @see #getSimple1()
	 * @generated
	 */
	public void setSimple1(Simple1 newSimple1) {
		if (newSimple1 != simple1) {
			NotificationChain msgs = null;
			if (simple1 != null)
				msgs = ((InternalEObject)simple1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TestsPackage.CONTAINER__SIMPLE1, null, msgs);
			if (newSimple1 != null)
				msgs = ((InternalEObject)newSimple1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TestsPackage.CONTAINER__SIMPLE1, null, msgs);
			msgs = basicSetSimple1(newSimple1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER__SIMPLE1, newSimple1, newSimple1));
	}

	/**
	 * Returns the value of the '<em><b>Simples2</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.http.tests.Simple2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simples2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simples2</em>' containment reference list.
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainer_Simples2()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Simple2> getSimples2() {
		if (simples2 == null) {
			simples2 = new EObjectContainmentEList<Simple2>(Simple2.class, this, TestsPackage.CONTAINER__SIMPLES2);
		}
		return simples2;
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
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainer_Int1()
	 * @model
	 * @generated
	 */
	public int getInt1() {
		return int1;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.http.tests.Container#getInt1 <em>Int1</em>}' attribute.
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER__INT1, oldInt1, int1));
	}

	/**
	 * Returns the value of the '<em><b>String1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String1</em>' attribute.
	 * @see #setString1(String)
	 * @see no.hal.pg.runtime.http.tests.TestsPackage#getContainer_String1()
	 * @model
	 * @generated
	 */
	public String getString1() {
		return string1;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.http.tests.Container#getString1 <em>String1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String1</em>' attribute.
	 * @see #getString1()
	 * @generated
	 */
	public void setString1(String newString1) {
		String oldString1 = string1;
		string1 = newString1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.CONTAINER__STRING1, oldString1, string1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestsPackage.CONTAINER__SIMPLE1:
				return basicSetSimple1(null, msgs);
			case TestsPackage.CONTAINER__SIMPLES2:
				return ((InternalEList<?>)getSimples2()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsPackage.CONTAINER__SIMPLE1:
				return getSimple1();
			case TestsPackage.CONTAINER__SIMPLES2:
				return getSimples2();
			case TestsPackage.CONTAINER__INT1:
				return getInt1();
			case TestsPackage.CONTAINER__STRING1:
				return getString1();
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
			case TestsPackage.CONTAINER__SIMPLE1:
				setSimple1((Simple1)newValue);
				return;
			case TestsPackage.CONTAINER__SIMPLES2:
				getSimples2().clear();
				getSimples2().addAll((Collection<? extends Simple2>)newValue);
				return;
			case TestsPackage.CONTAINER__INT1:
				setInt1((Integer)newValue);
				return;
			case TestsPackage.CONTAINER__STRING1:
				setString1((String)newValue);
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
			case TestsPackage.CONTAINER__SIMPLE1:
				setSimple1((Simple1)null);
				return;
			case TestsPackage.CONTAINER__SIMPLES2:
				getSimples2().clear();
				return;
			case TestsPackage.CONTAINER__INT1:
				setInt1(INT1_EDEFAULT);
				return;
			case TestsPackage.CONTAINER__STRING1:
				setString1(STRING1_EDEFAULT);
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
			case TestsPackage.CONTAINER__SIMPLE1:
				return simple1 != null;
			case TestsPackage.CONTAINER__SIMPLES2:
				return simples2 != null && !simples2.isEmpty();
			case TestsPackage.CONTAINER__INT1:
				return int1 != INT1_EDEFAULT;
			case TestsPackage.CONTAINER__STRING1:
				return STRING1_EDEFAULT == null ? string1 != null : !STRING1_EDEFAULT.equals(string1);
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
		result.append(" (int1: ");
		result.append(int1);
		result.append(", string1: ");
		result.append(string1);
		result.append(')');
		return result.toString();
	}

} // Container
