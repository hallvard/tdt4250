/**
 */
package no.hal.sokoban.model.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.gridgame.model.impl.GridImpl;
import no.hal.sokoban.model.ModelPackage;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.util.Cell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanGridImpl#getPlayerX <em>Player X</em>}</li>
 *   <li>{@link no.hal.sokoban.model.impl.SokobanGridImpl#getPlayerY <em>Player Y</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanGridImpl extends GridImpl<Cell, EObject> implements SokobanGrid {
	/**
	 * The default value of the '{@link #getPlayerX() <em>Player X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerX()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_X_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getPlayerX() <em>Player X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerX()
	 * @generated
	 * @ordered
	 */
	protected int playerX = PLAYER_X_EDEFAULT;
	/**
	 * The default value of the '{@link #getPlayerY() <em>Player Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerY()
	 * @generated
	 * @ordered
	 */
	protected static final int PLAYER_Y_EDEFAULT = -1;
	/**
	 * The cached value of the '{@link #getPlayerY() <em>Player Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayerY()
	 * @generated
	 * @ordered
	 */
	protected int playerY = PLAYER_Y_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SOKOBAN_GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<Cell> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<Cell>(Cell.class, this, ModelPackage.SOKOBAN_GRID__VALUES);
		}
		return values;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlayerX() {
		return playerX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerX(int newPlayerX) {
		int oldPlayerX = playerX;
		playerX = newPlayerX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOKOBAN_GRID__PLAYER_X, oldPlayerX, playerX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPlayerY() {
		return playerY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPlayerY(int newPlayerY) {
		int oldPlayerY = playerY;
		playerY = newPlayerY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SOKOBAN_GRID__PLAYER_Y, oldPlayerY, playerY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.SOKOBAN_GRID__PLAYER_X:
				return getPlayerX();
			case ModelPackage.SOKOBAN_GRID__PLAYER_Y:
				return getPlayerY();
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
			case ModelPackage.SOKOBAN_GRID__PLAYER_X:
				setPlayerX((Integer)newValue);
				return;
			case ModelPackage.SOKOBAN_GRID__PLAYER_Y:
				setPlayerY((Integer)newValue);
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
			case ModelPackage.SOKOBAN_GRID__PLAYER_X:
				setPlayerX(PLAYER_X_EDEFAULT);
				return;
			case ModelPackage.SOKOBAN_GRID__PLAYER_Y:
				setPlayerY(PLAYER_Y_EDEFAULT);
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
			case ModelPackage.SOKOBAN_GRID__PLAYER_X:
				return playerX != PLAYER_X_EDEFAULT;
			case ModelPackage.SOKOBAN_GRID__PLAYER_Y:
				return playerY != PLAYER_Y_EDEFAULT;
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
		result.append(" (playerX: ");
		result.append(playerX);
		result.append(", playerY: ");
		result.append(playerY);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public void setGridValue(int x, int y, Cell cell) {
		super.setGridValue(x, y, cell);
		if (cell != null && cell.isPlayer()) {
			setPlayerX(x);
			setPlayerY(y);
		}
	}
	
	@Override
	public Cell createGridValue() {
		return Cell.valueOf(' ');
	}

} //SokobanGridImpl
