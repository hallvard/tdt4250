/**
 */
package no.hal.pg.runtime.engine.tests;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple1#getSimples2 <em>Simples2</em>}</li>
 *   <li>{@link no.hal.pg.runtime.engine.tests.Simple1#getString11 <em>String11</em>}</li>
 * </ul>
 *
 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple1()
 * @model kind="class"
 * @generated
 */
public class Simple1 extends MinimalEObjectImpl.Container implements EObject {
	/**
	 * The cached value of the '{@link #getSimples2() <em>Simples2</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimples2()
	 * @generated
	 * @ordered
	 */
	protected EList<Simple2> simples2;

	/**
	 * The default value of the '{@link #getString11() <em>String11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString11()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING11_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getString11() <em>String11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getString11()
	 * @generated
	 * @ordered
	 */
	protected String string11 = STRING11_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Simple1() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestsPackage.eINSTANCE.getSimple1();
	}

	/**
	 * Returns the value of the '<em><b>Simples2</b></em>' reference list.
	 * The list contents are of type {@link no.hal.pg.runtime.engine.tests.Simple2}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simples2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simples2</em>' reference list.
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple1_Simples2()
	 * @model
	 * @generated
	 */
	public EList<Simple2> getSimples2() {
		if (simples2 == null) {
			simples2 = new EObjectResolvingEList<Simple2>(Simple2.class, this, TestsPackage.SIMPLE1__SIMPLES2);
		}
		return simples2;
	}

	/**
	 * Returns the value of the '<em><b>String11</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String11</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String11</em>' attribute.
	 * @see #setString11(String)
	 * @see no.hal.pg.runtime.engine.tests.TestsPackage#getSimple1_String11()
	 * @model
	 * @generated
	 */
	public String getString11() {
		return string11;
	}

	/**
	 * Sets the value of the '{@link no.hal.pg.runtime.engine.tests.Simple1#getString11 <em>String11</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String11</em>' attribute.
	 * @see #getString11()
	 * @generated
	 */
	public void setString11(String newString11) {
		String oldString11 = string11;
		string11 = newString11;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestsPackage.SIMPLE1__STRING11, oldString11, string11));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestsPackage.SIMPLE1__SIMPLES2:
				return getSimples2();
			case TestsPackage.SIMPLE1__STRING11:
				return getString11();
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
			case TestsPackage.SIMPLE1__SIMPLES2:
				getSimples2().clear();
				getSimples2().addAll((Collection<? extends Simple2>)newValue);
				return;
			case TestsPackage.SIMPLE1__STRING11:
				setString11((String)newValue);
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
			case TestsPackage.SIMPLE1__SIMPLES2:
				getSimples2().clear();
				return;
			case TestsPackage.SIMPLE1__STRING11:
				setString11(STRING11_EDEFAULT);
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
			case TestsPackage.SIMPLE1__SIMPLES2:
				return simples2 != null && !simples2.isEmpty();
			case TestsPackage.SIMPLE1__STRING11:
				return STRING11_EDEFAULT == null ? string11 != null : !STRING11_EDEFAULT.equals(string11);
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
		result.append(" (string11: ");
		result.append(string11);
		result.append(')');
		return result.toString();
	}

} // Simple1
