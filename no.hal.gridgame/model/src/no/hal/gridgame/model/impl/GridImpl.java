/**
 */
package no.hal.gridgame.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.gridgame.model.Grid;
import no.hal.gridgame.model.GridListener;
import no.hal.gridgame.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Grid</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getValues <em>Values</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getGridListeners <em>Grid Listeners</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GridImpl<V extends Object, O extends EObject> extends MinimalEObjectImpl.Container implements Grid<V, O> {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final int HEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected int height = HEIGHT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<V> values;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<O> objects;

	/**
	 * The cached value of the '{@link #getGridListeners() <em>Grid Listeners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<GridListener> gridListeners;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GridImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GRID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GRID__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(int newHeight) {
		int oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GRID__HEIGHT, oldHeight, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<V> getValues() {
		if (values == null) {
			values = new EDataTypeUniqueEList<V>(Object.class, this, ModelPackage.GRID__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<O> getObjects() {
		if (objects == null) {
			objects = new EObjectContainmentEList<O>(EObject.class, this, ModelPackage.GRID__OBJECTS);
		}
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GridListener> getGridListeners() {
		if (gridListeners == null) {
			gridListeners = new EObjectResolvingEList<GridListener>(GridListener.class, this, ModelPackage.GRID__GRID_LISTENERS);
		}
		return gridListeners;
	}

	protected int elementPos(int x, int y) {
		return y * getWidth() + x;
	}
	
	protected boolean isValidPos(int x, int y) {
		return x >= 0 && x < getWidth() && y >= 0 && y < getHeight(); 
	}

	protected boolean checkValidPos(int x, int y) {
		if (isValidPos(x, y)) {
			return true;
		}
		throw new IllegalArgumentException(x + ", " + y + " is an illegal position for a grid size of " + getWidth() + ", " + getHeight());
	}

	protected V ensureValue(int pos, boolean omitLast) {
		while (pos >= getValues().size()) {
			getValues().add(pos == getValues().size() - 1 && omitLast ? null : createGridValue());
		}
		return getValues().get(pos);
	}

	protected O ensureObject(int pos, boolean omitLast) {
		while (pos >= getObjects().size()) {
			getObjects().add(pos == getObjects().size() - 1 && omitLast ? null : createGridObject());
		}
		return getObjects().get(pos);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public V getGridValue(int x, int y) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		return ensureValue(pos, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public O getGridObject(int x, int y) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		return ensureObject(pos, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGridValue(int x, int y, V element) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		ensureValue(pos, true);
		getValues().set(pos, element);
		fireGridChanged(x, y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGridObject(int x, int y, O object) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		ensureObject(pos, true);
		getObjects().set(pos, object);
		fireGridChanged(x, y);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public V createGridValue() {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public O createGridObject() {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	private <T> EList<T> getGridElements(EList<T> elements, int x0, int y0, int width, int height) {
		EList<T> result = new BasicEList<T>();
		int uptoY = (height < 0 ? getHeight() + height + 1 : y0 + height);
		int uptoX = (width < 0 ? getWidth() + width + 1 : x0 + width);
		for (int y = y0; y < uptoY; y++) {
			for (int x = x0; x < uptoX; x++) {
				checkValidPos(x, y);
				int pos = elementPos(x, y);
				result.add(elements.get(pos));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<V> getGridValues(int x0, int y0, int width, int height) {
		return getGridElements(getValues(), x0, y0, width, height);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<O> getGridObjects(int x0, int y0, int width, int height) {
		return getGridElements(getObjects(), x0, y0, width, height);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GRID__OBJECTS:
				return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.GRID__WIDTH:
				return getWidth();
			case ModelPackage.GRID__HEIGHT:
				return getHeight();
			case ModelPackage.GRID__VALUES:
				return getValues();
			case ModelPackage.GRID__OBJECTS:
				return getObjects();
			case ModelPackage.GRID__GRID_LISTENERS:
				return getGridListeners();
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
			case ModelPackage.GRID__WIDTH:
				setWidth((Integer)newValue);
				return;
			case ModelPackage.GRID__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case ModelPackage.GRID__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends V>)newValue);
				return;
			case ModelPackage.GRID__OBJECTS:
				getObjects().clear();
				getObjects().addAll((Collection<? extends O>)newValue);
				return;
			case ModelPackage.GRID__GRID_LISTENERS:
				getGridListeners().clear();
				getGridListeners().addAll((Collection<? extends GridListener>)newValue);
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
			case ModelPackage.GRID__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case ModelPackage.GRID__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case ModelPackage.GRID__VALUES:
				getValues().clear();
				return;
			case ModelPackage.GRID__OBJECTS:
				getObjects().clear();
				return;
			case ModelPackage.GRID__GRID_LISTENERS:
				getGridListeners().clear();
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
			case ModelPackage.GRID__WIDTH:
				return width != WIDTH_EDEFAULT;
			case ModelPackage.GRID__HEIGHT:
				return height != HEIGHT_EDEFAULT;
			case ModelPackage.GRID__VALUES:
				return values != null && !values.isEmpty();
			case ModelPackage.GRID__OBJECTS:
				return objects != null && !objects.isEmpty();
			case ModelPackage.GRID__GRID_LISTENERS:
				return gridListeners != null && !gridListeners.isEmpty();
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
			case ModelPackage.GRID___GET_GRID_VALUE__INT_INT:
				return getGridValue((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ModelPackage.GRID___GET_GRID_OBJECT__INT_INT:
				return getGridObject((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ModelPackage.GRID___SET_GRID_VALUE__INT_INT_OBJECT:
				setGridValue((Integer)arguments.get(0), (Integer)arguments.get(1), (V)arguments.get(2));
				return null;
			case ModelPackage.GRID___SET_GRID_OBJECT__INT_INT_EOBJECT:
				setGridObject((Integer)arguments.get(0), (Integer)arguments.get(1), (O)arguments.get(2));
				return null;
			case ModelPackage.GRID___CREATE_GRID_VALUE:
				return createGridValue();
			case ModelPackage.GRID___CREATE_GRID_OBJECT:
				return createGridObject();
			case ModelPackage.GRID___GET_GRID_VALUES__INT_INT_INT_INT:
				return getGridValues((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
			case ModelPackage.GRID___GET_GRID_OBJECTS__INT_INT_INT_INT:
				return getGridObjects((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (width: ");
		result.append(width);
		result.append(", height: ");
		result.append(height);
		result.append(", values: ");
		result.append(values);
		result.append(')');
		return result.toString();
	}
	
	//
	
	protected void fireGridChanged(int x, int y, int width, int height) {
		for (GridListener gridListener : gridListeners) {
			gridListener.gridChanged(this, x, y, width, height);
		}
	}

	protected void fireGridChanged(int x, int y) {
		fireGridChanged(x, y, 1, 1);
	}

} //GridImpl
