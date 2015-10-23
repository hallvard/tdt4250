/**
 */
package no.hal.pg.sokoban.runtime.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.gridgame.model.GridChangeDescription;
import no.hal.pg.sokoban.runtime.GridRectangleValues;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanGameService;
import no.hal.sokoban.model.ModelFactory;
import no.hal.sokoban.model.MovePlayerCommand;
import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.util.Direction;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Game Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanGameServiceImpl#getGrid <em>Grid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanGameServiceImpl extends MinimalEObjectImpl.Container implements SokobanGameService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected SokobanGame context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGameServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SOKOBAN_GAME_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGame getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (SokobanGame)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGame basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(SokobanGame newContext) {
		SokobanGame oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGrid getGrid() {
		SokobanGrid grid = basicGetGrid();
		return grid != null && grid.eIsProxy() ? (SokobanGrid)eResolveProxy((InternalEObject)grid) : grid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public SokobanGrid basicGetGrid() {
		return getContext().getGrid();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GridChangeDescription movePlayer(String direction) {
		SokobanGame game = getContext();
		MovePlayerCommand command = ModelFactory.eINSTANCE.createMovePlayerCommand();
		command.setDirection(Direction.valueOf(direction.charAt(0)));
		command.setGrid(game.getGrid());
		game.perform(command);
		return EcoreUtil.copy(command.getChanges());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GridRectangleValues movePlayer(String direction, Boolean stringFormat) {
		GridChangeDescription changes = movePlayer(direction);
		GridRectangleValues result = SokobanGridServiceImpl.getGridValues(getContext().getGrid(), changes.getX(), changes.getY(), changes.getWidth(), changes.getHeight(), stringFormat);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case RuntimePackage.SOKOBAN_GAME_SERVICE__GRID:
				if (resolve) return getGrid();
				return basicGetGrid();
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
			case RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT:
				setContext((SokobanGame)newValue);
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
			case RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT:
				setContext((SokobanGame)null);
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
			case RuntimePackage.SOKOBAN_GAME_SERVICE__CONTEXT:
				return context != null;
			case RuntimePackage.SOKOBAN_GAME_SERVICE__GRID:
				return basicGetGrid() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.SOKOBAN_GAME_SERVICE___MOVE_PLAYER__CHAR:
				return movePlayer((String)arguments.get(0));
			case RuntimePackage.SOKOBAN_GAME_SERVICE___MOVE_PLAYER__CHAR_BOOLEAN:
				return movePlayer((String)arguments.get(0), (Boolean)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SokobanGameServiceImpl
