/**
 */
package no.hal.gridgame.model.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.gridgame.model.GameCommand;
import no.hal.gridgame.model.Grid;
import no.hal.gridgame.model.GridChangeDescription;
import no.hal.gridgame.model.ModelFactory;
import no.hal.gridgame.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.impl.GameCommandImpl#getChanges <em>Changes</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class GameCommandImpl extends MinimalEObjectImpl.Container implements GameCommand {
	/**
	 * The cached value of the '{@link #getChanges() <em>Changes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChanges()
	 * @generated
	 * @ordered
	 */
	protected GridChangeDescription changes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GAME_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridChangeDescription getChanges() {
		return changes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChanges(GridChangeDescription newChanges, NotificationChain msgs) {
		GridChangeDescription oldChanges = changes;
		changes = newChanges;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.GAME_COMMAND__CHANGES, oldChanges, newChanges);
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
	public void setChanges(GridChangeDescription newChanges) {
		if (newChanges != changes) {
			NotificationChain msgs = null;
			if (changes != null)
				msgs = ((InternalEObject)changes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GAME_COMMAND__CHANGES, null, msgs);
			if (newChanges != null)
				msgs = ((InternalEObject)newChanges).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.GAME_COMMAND__CHANGES, null, msgs);
			msgs = basicSetChanges(newChanges, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.GAME_COMMAND__CHANGES, newChanges, newChanges));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean prepare() {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	protected void startPerform(Grid<?, ?> grid) {
		grid.getGridListeners().add(this);
	}
	
	protected void endPerform(Grid<?, ?> grid) {
		grid.getGridListeners().remove(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void perform() {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void undo() {
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void redo() {
		perform();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void gridChanged(Grid<?, ?> grid, int x, int y, int width, int height) {
		if (changes == null) {
			setChanges(ModelFactory.eINSTANCE.createGridChangeDescription());
		}
		changes.addChange(x, y, width, height);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GAME_COMMAND__CHANGES:
				return basicSetChanges(null, msgs);
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
			case ModelPackage.GAME_COMMAND__CHANGES:
				return getChanges();
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
			case ModelPackage.GAME_COMMAND__CHANGES:
				setChanges((GridChangeDescription)newValue);
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
			case ModelPackage.GAME_COMMAND__CHANGES:
				setChanges((GridChangeDescription)null);
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
			case ModelPackage.GAME_COMMAND__CHANGES:
				return changes != null;
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
			case ModelPackage.GAME_COMMAND___PREPARE:
				return prepare();
			case ModelPackage.GAME_COMMAND___PERFORM:
				perform();
				return null;
			case ModelPackage.GAME_COMMAND___UNDO:
				undo();
				return null;
			case ModelPackage.GAME_COMMAND___REDO:
				redo();
				return null;
			case ModelPackage.GAME_COMMAND___GRID_CHANGED__GRID_INT_INT_INT_INT:
				gridChanged((Grid<?, ?>)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GameCommandImpl
