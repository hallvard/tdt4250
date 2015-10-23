/**
 */
package no.hal.pg.sokoban.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanService;
import no.hal.pg.sokoban.runtime.SokobanTask;
import no.hal.sokoban.model.SokobanGame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanServiceImpl#getSokobanGame <em>Sokoban Game</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanServiceImpl extends MinimalEObjectImpl.Container implements SokobanService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected SokobanTask context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SOKOBAN_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanTask getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (SokobanTask)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.SOKOBAN_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanTask basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(SokobanTask newContext) {
		SokobanTask oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGame getSokobanGame() {
		SokobanGame sokobanGame = basicGetSokobanGame();
		return sokobanGame != null && sokobanGame.eIsProxy() ? (SokobanGame)eResolveProxy((InternalEObject)sokobanGame) : sokobanGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SokobanGame basicGetSokobanGame() {
		return getContext().getSokobanGame();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.SOKOBAN_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case RuntimePackage.SOKOBAN_SERVICE__SOKOBAN_GAME:
				if (resolve) return getSokobanGame();
				return basicGetSokobanGame();
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
			case RuntimePackage.SOKOBAN_SERVICE__CONTEXT:
				setContext((SokobanTask)newValue);
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
			case RuntimePackage.SOKOBAN_SERVICE__CONTEXT:
				setContext((SokobanTask)null);
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
			case RuntimePackage.SOKOBAN_SERVICE__CONTEXT:
				return context != null;
			case RuntimePackage.SOKOBAN_SERVICE__SOKOBAN_GAME:
				return basicGetSokobanGame() != null;
		}
		return super.eIsSet(featureID);
	}

} //SokobanServiceImpl
