/**
 */
package no.hal.sokoban.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.gridgame.model.impl.GameCommandImpl;
import no.hal.sokoban.model.ModelPackage;
import no.hal.sokoban.model.MovePlayerCommand;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.util.Cell;
import no.hal.sokoban.util.Direction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.impl.MovePlayerCommandImpl#getGrid <em>Grid</em>}</li>
 *   <li>{@link no.hal.sokoban.model.impl.MovePlayerCommandImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link no.hal.sokoban.model.impl.MovePlayerCommandImpl#isPush <em>Push</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MovePlayerCommandImpl extends GameCommandImpl implements MovePlayerCommand {
	/**
	 * The cached value of the '{@link #getGrid() <em>Grid</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrid()
	 * @generated
	 * @ordered
	 */
	protected SokobanGrid grid;

	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final Direction DIRECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected Direction direction = DIRECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isPush() <em>Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPush()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUSH_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPush() <em>Push</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPush()
	 * @generated
	 * @ordered
	 */
	protected boolean push = PUSH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MovePlayerCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.MOVE_PLAYER_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPush() {
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPush(boolean newPush) {
		boolean oldPush = push;
		push = newPush;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MOVE_PLAYER_COMMAND__PUSH, oldPush, push));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGrid getGrid() {
		if (grid != null && grid.eIsProxy()) {
			InternalEObject oldGrid = (InternalEObject)grid;
			grid = (SokobanGrid)eResolveProxy(oldGrid);
			if (grid != oldGrid) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.MOVE_PLAYER_COMMAND__GRID, oldGrid, grid));
			}
		}
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGrid basicGetGrid() {
		return grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrid(SokobanGrid newGrid) {
		SokobanGrid oldGrid = grid;
		grid = newGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MOVE_PLAYER_COMMAND__GRID, oldGrid, grid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Direction getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(Direction newDirection) {
		Direction oldDirection = direction;
		direction = newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.MOVE_PLAYER_COMMAND__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.MOVE_PLAYER_COMMAND__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
			case ModelPackage.MOVE_PLAYER_COMMAND__DIRECTION:
				return getDirection();
			case ModelPackage.MOVE_PLAYER_COMMAND__PUSH:
				return isPush();
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
			case ModelPackage.MOVE_PLAYER_COMMAND__GRID:
				setGrid((SokobanGrid)newValue);
				return;
			case ModelPackage.MOVE_PLAYER_COMMAND__DIRECTION:
				setDirection((Direction)newValue);
				return;
			case ModelPackage.MOVE_PLAYER_COMMAND__PUSH:
				setPush((Boolean)newValue);
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
			case ModelPackage.MOVE_PLAYER_COMMAND__GRID:
				setGrid((SokobanGrid)null);
				return;
			case ModelPackage.MOVE_PLAYER_COMMAND__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ModelPackage.MOVE_PLAYER_COMMAND__PUSH:
				setPush(PUSH_EDEFAULT);
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
			case ModelPackage.MOVE_PLAYER_COMMAND__GRID:
				return grid != null;
			case ModelPackage.MOVE_PLAYER_COMMAND__DIRECTION:
				return DIRECTION_EDEFAULT == null ? direction != null : !DIRECTION_EDEFAULT.equals(direction);
			case ModelPackage.MOVE_PLAYER_COMMAND__PUSH:
				return push != PUSH_EDEFAULT;
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
		result.append(" (direction: ");
		result.append(direction);
		result.append(", push: ");
		result.append(push);
		result.append(')');
		return result.toString();
	}
	
	//
	
	@Override
	public boolean prepare() {
		if (grid == null || direction == null) {
			return false;
		}
		int x = grid.getPlayerX(), y = grid.getPlayerY();
		int dx = direction.dx, dy = direction.dy;
		Cell forward1 = grid.getGridValue(x + dx, y + dy);
		Cell forward2 = grid.getGridValue(x + dx + dx, y + dy + dy);
		if (forward1.isBox() && (! forward2.isOccupied())) {
			// remember that the move is a push
			setPush(true);
		}
		return isPush() || (! forward1.isOccupied());
	}

	@Override
	public void perform() {
		startPerform(grid);
		int x = grid.getPlayerX(), y = grid.getPlayerY();
		int dx = direction.dx, dy = direction.dy;
		Cell cell = grid.getGridValue(x, y), forward1 = grid.getGridValue(x + dx, y + dy);
		if (isPush()) {
			Cell forward2 = grid.getGridValue(x + dx + dx, y + dy + dy);
			grid.setGridValue(x + dx + dx, y + dy + dy, Cell.valueOf(forward2, forward1));
		}
		grid.setGridValue(x + dx, y + dy, Cell.valueOf(forward1, cell));
		grid.setGridValue(x, y, Cell.valueOf(cell));
		endPerform(grid);
	}

	@Override
	public void undo() {
		int x = grid.getPlayerX(), y = grid.getPlayerY();
		int dx = direction.dx, dy = direction.dy;
		Cell cell = grid.getGridValue(x, y), backward1 = grid.getGridValue(x - dx, y - dy);
		grid.setGridValue(x - dx, y - dy, Cell.valueOf(backward1, cell));
		if (isPush()) {
			Cell forward1 = grid.getGridValue(x + dx, y + dy);
			grid.setGridValue(x, y, Cell.valueOf(cell, forward1));
			grid.setGridValue(x + dx, y + dy, Cell.valueOf(forward1));
		} else {
			grid.setGridValue(x, y, Cell.valueOf(cell));
		}
	}

} //MoveCommandImpl
