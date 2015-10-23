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

import no.hal.pg.sokoban.runtime.GridRectangleValues;
import no.hal.pg.sokoban.runtime.RuntimeFactory;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanGridService;
import no.hal.sokoban.model.SokobanGrid;
import no.hal.sokoban.util.Cell;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sokoban Grid Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.sokoban.runtime.impl.SokobanGridServiceImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SokobanGridServiceImpl extends MinimalEObjectImpl.Container implements SokobanGridService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected SokobanGrid context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SokobanGridServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.SOKOBAN_GRID_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SokobanGrid getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (SokobanGrid)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGrid basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(SokobanGrid newContext) {
		SokobanGrid oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridRectangleValues getValues() {
		GridRectangleValues values = basicGetValues();
		return values != null && values.eIsProxy() ? (GridRectangleValues)eResolveProxy((InternalEObject)values) : values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public GridRectangleValues basicGetValues() {
		return getGridValues(true);
	}

	static GridRectangleValues getGridValues(SokobanGrid grid, int x, int y, int width, int height, Boolean stringFormat) {
		EList<Cell> values = grid.getGridValues(x, y, width, height);
		if (width < 0) {
			width = grid.getWidth() + width + 1 - x;
		}
		if (height < 0) {
			height = grid.getHeight() + height + 1 - y;
		}
		GridRectangleValues result = RuntimeFactory.eINSTANCE.createGridRectangleValues();
		StringBuilder builder = null;
		for (Cell cell : values) {
			if (stringFormat == null) {
				result.getValues().add(cell.toString());
			} else if (stringFormat) {
				if (builder == null) {
					builder = new StringBuilder(width);
				}
				builder.append(cell.toChar());
				if (builder.length() == width) {
					result.getValues().add(builder.toString());
					builder.setLength(0);
				}
			} else {
				result.getValues().add(cell.toName());
			}
		}
		result.setValues(x, y, width, height);
		return result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GridRectangleValues getGridValues(int x, int y, int width, int height, Boolean stringFormat) {
		return getGridValues(getContext() , x, y, width, height, stringFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GridRectangleValues getGridValues(Boolean stringFormat) {
		return getGridValues(0, 0, -1, -1, stringFormat);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case RuntimePackage.SOKOBAN_GRID_SERVICE__VALUES:
				if (resolve) return getValues();
				return basicGetValues();
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
			case RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT:
				setContext((SokobanGrid)newValue);
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
			case RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT:
				setContext((SokobanGrid)null);
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
			case RuntimePackage.SOKOBAN_GRID_SERVICE__CONTEXT:
				return context != null;
			case RuntimePackage.SOKOBAN_GRID_SERVICE__VALUES:
				return basicGetValues() != null;
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
			case RuntimePackage.SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__INT_INT_INT_INT_BOOLEAN:
				return getGridValues((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Boolean)arguments.get(4));
			case RuntimePackage.SOKOBAN_GRID_SERVICE___GET_GRID_VALUES__BOOLEAN:
				return getGridValues((Boolean)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //SokobanGridServiceImpl
