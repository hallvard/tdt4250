/**
 */
package no.hal.pg.sokoban.runtime.impl;

import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanResult;

import no.hal.sokoban.model.SokobanLevel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanResultImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanResultImpl#getMoveCount <em>Move Count</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanResultImpl#getPushCount <em>Push Count</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanResultImpl#getSolution <em>Solution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanResultImpl extends MinimalEObjectImpl.Container implements SokobanResult {
	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected SokobanLevel level;

	/**
	 * The default value of the '{@link #getMoveCount() <em>Move Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveCount()
	 * @generated
	 * @ordered
	 */
	protected static final int MOVE_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getPushCount() <em>Push Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPushCount()
	 * @generated
	 * @ordered
	 */
	protected static final int PUSH_COUNT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected static final String SOLUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSolution() <em>Solution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSolution()
	 * @generated
	 * @ordered
	 */
	protected String solution = SOLUTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanResultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SOKOBAN_RESULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanLevel getLevel() {
		if (level != null && level.eIsProxy()) {
			InternalEObject oldLevel = (InternalEObject)level;
			level = (SokobanLevel)eResolveProxy(oldLevel);
			if (level != oldLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.SOKOBAN_RESULT__LEVEL, oldLevel, level));
			}
		}
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanLevel basicGetLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(SokobanLevel newLevel) {
		SokobanLevel oldLevel = level;
		level = newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_RESULT__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMoveCount() {
		// TODO: implement this method to return the 'Move Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPushCount() {
		// TODO: implement this method to return the 'Push Count' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSolution() {
		return solution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSolution(String newSolution) {
		String oldSolution = solution;
		solution = newSolution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_RESULT__SOLUTION, oldSolution, solution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.SOKOBAN_RESULT__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
			case RuntimePackage.SOKOBAN_RESULT__MOVE_COUNT:
				return getMoveCount();
			case RuntimePackage.SOKOBAN_RESULT__PUSH_COUNT:
				return getPushCount();
			case RuntimePackage.SOKOBAN_RESULT__SOLUTION:
				return getSolution();
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
			case RuntimePackage.SOKOBAN_RESULT__LEVEL:
				setLevel((SokobanLevel)newValue);
				return;
			case RuntimePackage.SOKOBAN_RESULT__SOLUTION:
				setSolution((String)newValue);
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
			case RuntimePackage.SOKOBAN_RESULT__LEVEL:
				setLevel((SokobanLevel)null);
				return;
			case RuntimePackage.SOKOBAN_RESULT__SOLUTION:
				setSolution(SOLUTION_EDEFAULT);
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
			case RuntimePackage.SOKOBAN_RESULT__LEVEL:
				return level != null;
			case RuntimePackage.SOKOBAN_RESULT__MOVE_COUNT:
				return getMoveCount() != MOVE_COUNT_EDEFAULT;
			case RuntimePackage.SOKOBAN_RESULT__PUSH_COUNT:
				return getPushCount() != PUSH_COUNT_EDEFAULT;
			case RuntimePackage.SOKOBAN_RESULT__SOLUTION:
				return SOLUTION_EDEFAULT == null ? solution != null : !SOLUTION_EDEFAULT.equals(solution);
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
		result.append(" (solution: ");
		result.append(solution);
		result.append(')');
		return result.toString();
	}

} //SokobanResultImpl
