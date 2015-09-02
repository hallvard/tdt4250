/**
 */
package no.hal.pg.runtime.engine.tests;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple2#getInt21 <em>Int21</em>}</li>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple2#getString21 <em>String21</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2()
 * @model kind="class"
 * @generated
 */
public class Simple2 extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The default value of the '{@link #getInt21() <em>Int21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt21()
	 * @generated
	 * @ordered
	 */
	protected static final int INT21_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getInt21() <em>Int21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInt21()
	 * @generated
	 * @ordered
	 */
	protected int int21 = INT21_EDEFAULT;

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
	 * The cached value of the '{@link #getString21() <em>String21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString21()
	 * @generated
	 * @ordered
	 */
	protected String string21 = STRING21_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simple2() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.eINSTANCE.getSimple2();
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
	 * @see #setInt21(int)
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2_Int21()
	 * @model
	 * @generated
	 */
	public int getInt21() {
		return int21;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.engine.tests.Simple2#getInt21 <em>Int21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Int21</em>' attribute.
	 * @see #getInt21()
	 * @generated
	 */
	public void setInt21(int newInt21) {
		int oldInt21 = int21;
		int21 = newInt21;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.SIMPLE2__INT21, oldInt21, int21));
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
	 * @see #setString21(String)
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple2_String21()
	 * @model
	 * @generated
	 */
	public String getString21() {
		return string21;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.engine.tests.Simple2#getString21 <em>String21</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String21</em>' attribute.
	 * @see #getString21()
	 * @generated
	 */
	public void setString21(String newString21) {
		String oldString21 = string21;
		string21 = newString21;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.SIMPLE2__STRING21, oldString21, string21));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsPackage.SIMPLE2__INT21:
				return getInt21();
			case TestsPackage.SIMPLE2__STRING21:
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
			case TestsPackage.SIMPLE2__INT21:
				setInt21((Integer)newValue);
				return;
			case TestsPackage.SIMPLE2__STRING21:
				setString21((String)newValue);
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
			case TestsPackage.SIMPLE2__INT21:
				setInt21(INT21_EDEFAULT);
				return;
			case TestsPackage.SIMPLE2__STRING21:
				setString21(STRING21_EDEFAULT);
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
			case TestsPackage.SIMPLE2__INT21:
				return int21 != INT21_EDEFAULT;
			case TestsPackage.SIMPLE2__STRING21:
				return STRING21_EDEFAULT == null ? string21 != null : !STRING21_EDEFAULT.equals(string21);
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
		result.append(" (int21: ");
		result.append(int21);
		result.append(", string21: ");
		result.append(string21);
		result.append(')');
		return result.toString();
	}

} // Simple2
