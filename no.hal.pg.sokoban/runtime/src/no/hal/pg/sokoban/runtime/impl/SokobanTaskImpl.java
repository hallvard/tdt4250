/**
 */
package no.hal.pg.sokoban.runtime.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.pg.runtime.impl.TaskImpl;
import no.hal.pg.sokoban.model.SokobanTaskDef;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanResult;
import no.hal.pg.sokoban.runtime.SokobanTask;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanTaskImpl#getSokobanGame <em>Sokoban Game</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanTaskImpl extends TaskImpl<SokobanTaskDef, SokobanResult> implements SokobanTask {
	/**
	 * The cached value of the '{@link #getSokobanGame() <em>Sokoban Game</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSokobanGame()
	 * @generated
	 * @ordered
	 */
	protected SokobanGame sokobanGame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SOKOBAN_TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setTaskDef(SokobanTaskDef newTaskDef) {
		super.setTaskDef(newTaskDef);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setResult(SokobanResult newResult) {
		super.setResult(newResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGame getSokobanGame() {
		return sokobanGame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSokobanGame(SokobanGame newSokobanGame, NotificationChain msgs) {
		SokobanGame oldSokobanGame = sokobanGame;
		sokobanGame = newSokobanGame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME, oldSokobanGame, newSokobanGame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSokobanGame(SokobanGame newSokobanGame) {
		if (newSokobanGame != sokobanGame) {
			NotificationChain msgs = null;
			if (sokobanGame != null)
				msgs = ((InternalEObject)sokobanGame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME, null, msgs);
			if (newSokobanGame != null)
				msgs = ((InternalEObject)newSokobanGame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME, null, msgs);
			msgs = basicSetSokobanGame(newSokobanGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME, newSokobanGame, newSokobanGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME:
				return basicSetSokobanGame(null, msgs);
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
			case RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME:
				return getSokobanGame();
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
			case RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME:
				setSokobanGame((SokobanGame)newValue);
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
			case RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME:
				setSokobanGame((SokobanGame)null);
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
			case RuntimePackage.SOKOBAN_TASK__SOKOBAN_GAME:
				return sokobanGame != null;
		}
		return super.eIsSet(featureID);
	}

	//
	
	@Override
	public void start() {
		SokobanLevel sokobanLevel = getTaskDef().getLevels().iterator().next();
		SokobanGame game = ModelFactory.eINSTANCE.createSokobanGame();
		game.setLevel(sokobanLevel);
		game.setGrid(sokobanLevel.createGrid());
		setSokobanGame(game);
	}
} //SokobanTaskImpl
