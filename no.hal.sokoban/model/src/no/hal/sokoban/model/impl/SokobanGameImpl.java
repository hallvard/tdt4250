/**
 */
package no.hal.sokoban.model.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import no.hal.gridgame.model.impl.GridGameImpl;
import no.hal.sokoban.model.ModelPackage;
import no.hal.sokoban.model.MovePlayerCommand;
import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.model.SokobanLevel;
import no.hal.sokoban.util.Cell;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanGameImpl#getLevel <em>Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanGameImpl extends GridGameImpl<SokobanGrid, MovePlayerCommand> implements SokobanGame {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOKOBAN_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public NotificationChain basicSetGrid(SokobanGrid newGrid, NotificationChain msgs) {
		return super.basicSetGrid(newGrid, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<MovePlayerCommand> getUndoStack() {
		if (undoStack == null) {
			undoStack = new EObjectContainmentEList<MovePlayerCommand>(MovePlayerCommand.class, this, ModelPackage.SOKOBAN_GAME__UNDO_STACK);
		}
		return undoStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<MovePlayerCommand> getRedoStack() {
		if (redoStack == null) {
			redoStack = new EObjectContainmentEList<MovePlayerCommand>(MovePlayerCommand.class, this, ModelPackage.SOKOBAN_GAME__REDO_STACK);
		}
		return redoStack;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.SOKOBAN_GAME__LEVEL, oldLevel, level));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOKOBAN_GAME__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_GAME__LEVEL:
				if (resolve) return getLevel();
				return basicGetLevel();
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
			case ModelPackage.SOKOBAN_GAME__LEVEL:
				setLevel((SokobanLevel)newValue);
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
			case ModelPackage.SOKOBAN_GAME__LEVEL:
				setLevel((SokobanLevel)null);
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
			case ModelPackage.SOKOBAN_GAME__LEVEL:
				return level != null;
		}
		return super.eIsSet(featureID);
	}

	//
	
	private int countRemainingTargets() {
		int count = 0;
		// iterate over all cells
		for (Cell cell : grid.getValues()) {
			// increase counter if this cell is a target without box
			if (cell.isTarget() && (! cell.isBox())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public boolean isFinished() {
		return countRemainingTargets() == 0;
	}

} //SokobanGameImpl
