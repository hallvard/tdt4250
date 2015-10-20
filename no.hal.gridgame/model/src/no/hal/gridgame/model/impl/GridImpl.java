/**
 */
package no.hal.gridgame.model.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.gridgame.model.Grid;
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
 *   <li>{@link no.hal.gridgame.model.impl.GridImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GridImpl<E extends EObject> extends MinimalEObjectImpl.Container implements Grid<E> {
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
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<E> elements;

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
	public EList<E> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentEList<E>(EObject.class, this, ModelPackage.GRID__ELEMENTS);
		}
		return elements;
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

	protected E ensureElement(int pos, boolean omitLast) {
		while (pos >= getElements().size()) {
			getElements().add(pos == getElements().size() - 1 && omitLast ? null : createGridElement());
		}
		return getElements().get(pos);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public E getGridElement(int x, int y) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		return ensureElement(pos, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setGridElement(int x, int y, E element) {
		checkValidPos(x, y);
		int pos = elementPos(x, y);
		ensureElement(pos, true);
		getElements().set(pos, element);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public E createGridElement() {
		EGenericType eClass = eClass().getEGenericSuperTypes().get(0);
		EGenericType eType = eClass.getETypeArguments().get(0);
		return (E) EcoreUtil.create((EClass) eType.getEClassifier());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public E moveGridElement(int x1, int y1, int x2, int y2, E element) {
		checkValidPos(x1, y1);
		checkValidPos(x2, y2);
		E replacedElement = getGridElement(x2, y2);
		setGridElement(x2, y2, getGridElement(x1, y1));
		setGridElement(x1, y1, element);
		return replacedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GRID__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.GRID__ELEMENTS:
				return getElements();
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
			case ModelPackage.GRID__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends E>)newValue);
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
			case ModelPackage.GRID__ELEMENTS:
				getElements().clear();
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
			case ModelPackage.GRID__ELEMENTS:
				return elements != null && !elements.isEmpty();
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
			case ModelPackage.GRID___GET_GRID_ELEMENT__INT_INT:
				return getGridElement((Integer)arguments.get(0), (Integer)arguments.get(1));
			case ModelPackage.GRID___SET_GRID_ELEMENT__INT_INT_GRIDELEMENT:
				setGridElement((Integer)arguments.get(0), (Integer)arguments.get(1), (E)arguments.get(2));
				return null;
			case ModelPackage.GRID___CREATE_GRID_ELEMENT:
				return createGridElement();
			case ModelPackage.GRID___MOVE_GRID_ELEMENT__INT_INT_INT_INT_GRIDELEMENT:
				return moveGridElement((Integer)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (E)arguments.get(4));
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
		result.append(')');
		return result.toString();
	}

} //GridImpl
