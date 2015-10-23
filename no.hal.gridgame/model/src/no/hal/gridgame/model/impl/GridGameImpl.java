/**
 */
package no.hal.gridgame.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.gridgame.model.GameCommand;
import no.hal.gridgame.model.Grid;
import no.hal.gridgame.model.GridGame;
import no.hal.gridgame.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.impl.GridGameImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridGameImpl#getUndoStack <em>Undo Stack</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridGameImpl#getRedoStack <em>Redo Stack</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GridGameImpl<G extends Grid<?, ?>, C extends GameCommand> extends MinimalEObjectImpl.Container implements GridGame<G, C> {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected G grid;

	/**
	 * The cached value of the '{@link #getUndoStack() <em>Undo Stack</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUndoStack()
	 * @generated
	 * @ordered
	 */
	protected EList<C> undoStack;

	/**
	 * The cached value of the '{@link #getRedoStack() <em>Redo Stack</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRedoStack()
	 * @generated
	 * @ordered
	 */
	protected EList<C> redoStack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridGameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GRID_GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public G getGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrid(G newGrid, NotificationChain msgs) {
		G oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GRID_GAME__GRID, oldGrid, newGrid);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrid(G newGrid) {
		if (newGrid != grid) {
			NotificationChain msgs = null;
			if (grid != null)
				msgs = ((InternalEObject)grid).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GRID_GAME__GRID, null, msgs);
			if (newGrid != null)
				msgs = ((InternalEObject)newGrid).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GRID_GAME__GRID, null, msgs);
			msgs = basicSetGrid(newGrid, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GRID_GAME__GRID, newGrid, newGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C> getUndoStack() {
		if (undoStack == null) {
			undoStack = new EObjectContainmentEList<C>(GameCommand.class, this, ModelPackage.GRID_GAME__UNDO_STACK);
		}
		return undoStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C> getRedoStack() {
		if (redoStack == null) {
			redoStack = new EObjectContainmentEList<C>(GameCommand.class, this, ModelPackage.GRID_GAME__REDO_STACK);
		}
		return redoStack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void perform(C command) {
		if (command.prepare()) {
			command.perform();
			getUndoStack().add(command);
			getRedoStack().clear();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void undo() {
		int pos = getUndoStack().size() - 1;
		if (pos >= 0) {
			C lastCommand = getUndoStack().get(pos);
			lastCommand.undo();
			getUndoStack().remove(pos);
			getRedoStack().add(lastCommand);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void redo() {
		int pos = getRedoStack().size() - 1;
		if (pos >= 0) {
			C lastCommand = getRedoStack().get(pos);
			lastCommand.redo();
			getRedoStack().remove(pos);
			getUndoStack().add(lastCommand);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFinished() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GRID_GAME__GRID:
				return basicSetGrid(null, msgs);
			case ModelPackage.GRID_GAME__UNDO_STACK:
				return ((InternalEList<?>)getUndoStack()).basicRemove(otherEnd, msgs);
			case ModelPackage.GRID_GAME__REDO_STACK:
				return ((InternalEList<?>)getRedoStack()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.GRID_GAME__GRID:
				return getGrid();
			case ModelPackage.GRID_GAME__UNDO_STACK:
				return getUndoStack();
			case ModelPackage.GRID_GAME__REDO_STACK:
				return getRedoStack();
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
			case ModelPackage.GRID_GAME__GRID:
				setGrid((G)newValue);
				return;
			case ModelPackage.GRID_GAME__UNDO_STACK:
				getUndoStack().clear();
				getUndoStack().addAll((Collection<? extends C>)newValue);
				return;
			case ModelPackage.GRID_GAME__REDO_STACK:
				getRedoStack().clear();
				getRedoStack().addAll((Collection<? extends C>)newValue);
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
			case ModelPackage.GRID_GAME__GRID:
				setGrid((G)null);
				return;
			case ModelPackage.GRID_GAME__UNDO_STACK:
				getUndoStack().clear();
				return;
			case ModelPackage.GRID_GAME__REDO_STACK:
				getRedoStack().clear();
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
			case ModelPackage.GRID_GAME__GRID:
				return grid != null;
			case ModelPackage.GRID_GAME__UNDO_STACK:
				return undoStack != null && !undoStack.isEmpty();
			case ModelPackage.GRID_GAME__REDO_STACK:
				return redoStack != null && !redoStack.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ModelPackage.GRID_GAME___PERFORM__GAMECOMMAND:
				perform((C)arguments.get(0));
				return null;
			case ModelPackage.GRID_GAME___UNDO:
				undo();
				return null;
			case ModelPackage.GRID_GAME___REDO:
				redo();
				return null;
			case ModelPackage.GRID_GAME___IS_FINISHED:
				return isFinished();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GridGameImpl
