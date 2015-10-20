/**
 */
package no.hal.gridgame.model.impl;

import java.util.Collection;
import java.util.Stack;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.gridgame.model.CompositeCommand;
import no.hal.gridgame.model.GameCommand;
import no.hal.gridgame.model.ModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Composite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.gridgame.model.impl.CompositeCommandImpl#getCommands <em>Commands</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CompositeCommandImpl<C extends GameCommand> extends GameCommandImpl implements CompositeCommand<C> {
	/**
	 * The cached value of the '{@link #getCommands() <em>Commands</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommands()
	 * @generated
	 * @ordered
	 */
	protected EList<C> commands;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompositeCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.COMPOSITE_COMMAND;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<C> getCommands() {
		if (commands == null) {
			commands = new EObjectContainmentEList<C>(GameCommand.class, this, ModelPackage.COMPOSITE_COMMAND__COMMANDS);
		}
		return commands;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean prepare() {
		for (C command : commands) {
			return command.prepare();
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void perform() {
		Stack<C> performed = null;
		C aborted = null;
		for (C command : commands) {
			if (performed != null) {
				if (! command.prepare()) {
					aborted = command;
				}
			} else {
				performed = new Stack<C>();
			}
			if (aborted == null) {
				try {
					command.perform();
					performed.push(command);
				} catch (Exception e) {
					aborted = command;
				}
			}
			if (aborted != null) {
				while (! performed.isEmpty()) {
					performed.pop().undo();
				}
				throw new IllegalStateException("Couldn't perform command: " + aborted);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void undo() {
		for (int i = getCommands().size() - 1; i >= 0 ; i--) {
			try {
				getCommands().get(i).undo();
			} catch (Exception e) {
				// try to roll forward
				for (int j = i + 1; j < getCommands().size(); j++) {
					getCommands().get(i).perform();
				}
				throw new IllegalStateException("Couldn't undo command: " + getCommands().get(i));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void redo() {
		for (int i = 0; i < getCommands().size(); i++) {
			try {
				getCommands().get(i).redo();
			} catch (Exception e) {
				// try to roll back
				for (int j = i - 1; j >= 0; j--) {
					getCommands().get(i).undo();
				}
				throw new IllegalStateException("Couldn't redo command: " + getCommands().get(i));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.COMPOSITE_COMMAND__COMMANDS:
				return ((InternalEList<?>)getCommands()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.COMPOSITE_COMMAND__COMMANDS:
				return getCommands();
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
			case ModelPackage.COMPOSITE_COMMAND__COMMANDS:
				getCommands().clear();
				getCommands().addAll((Collection<? extends C>)newValue);
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
			case ModelPackage.COMPOSITE_COMMAND__COMMANDS:
				getCommands().clear();
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
			case ModelPackage.COMPOSITE_COMMAND__COMMANDS:
				return commands != null && !commands.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CompositeCommandImpl
