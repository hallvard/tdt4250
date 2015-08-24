/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Services;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.TaskState;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getServices <em>Services</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getTaskDef <em>Task Def</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getGame <em>Game</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getStates <em>States</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.TaskImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskImpl<T extends TaskDef, R> extends MinimalEObjectImpl.Container implements Task<T, R> {
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service<?>> services;
	/**
	 * The cached value of the '{@link #getTaskDef() <em>Task Def</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskDef()
	 * @generated
	 * @ordered
	 */
	protected T taskDef;
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;
	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskState<?>> states;
	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected R result;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service<?>> getServices() {
		if (services == null) {
			services = new EObjectContainmentEList<Service<?>>(Service.class, this, RuntimePackage.TASK__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public T getTaskDef() {
		if (taskDef != null && taskDef.eIsProxy()) {
			InternalEObject oldTaskDef = (InternalEObject)taskDef;
			taskDef = (T)eResolveProxy(oldTaskDef);
			if (taskDef != oldTaskDef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.TASK__TASK_DEF, oldTaskDef, taskDef));
			}
		}
		return taskDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T basicGetTaskDef() {
		return taskDef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaskDef(T newTaskDef) {
		T oldTaskDef = taskDef;
		taskDef = newTaskDef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__TASK_DEF, oldTaskDef, taskDef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game getGame() {
		if (eContainerFeatureID() != RuntimePackage.TASK__GAME) return null;
		return (Game)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame(Game newGame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame, RuntimePackage.TASK__GAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGame(Game newGame) {
		if (newGame != eInternalContainer() || (eContainerFeatureID() != RuntimePackage.TASK__GAME && newGame != null)) {
			if (EcoreUtil.isAncestor(this, newGame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame != null)
				msgs = ((InternalEObject)newGame).eInverseAdd(this, RuntimePackage.GAME__TASKS, Game.class, msgs);
			msgs = basicSetGame(newGame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__GAME, newGame, newGame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectResolvingEList<Player>(Player.class, this, RuntimePackage.TASK__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskState<?>> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<TaskState<?>>(TaskState.class, this, RuntimePackage.TASK__STATES, RuntimePackage.TASK_STATE__TASK);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public R getResult() {
		if (result != null && ((EObject)result).eIsProxy()) {
			InternalEObject oldResult = (InternalEObject)result;
			result = (R)eResolveProxy(oldResult);
			if (result != oldResult) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.TASK__RESULT, oldResult, result));
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public R basicGetResult() {
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResult(R newResult) {
		R oldResult = result;
		result = newResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.TASK__RESULT, oldResult, result));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public TaskState<?> getCurrentState() {
		if (isFinished()) {
			return null;
		}
		EList<TaskState<?>> states = getStates();
		return states.size() > 0 ? states.get(states.size() - 1) : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isStarted() {
		return getStates().size() > 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFinished() {
		return getResult() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void start() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeState(TaskState<?> state) {
		TaskState<?> oldCurrentState = getCurrentState();
		if (oldCurrentState != null) {
			oldCurrentState.setExited(System.currentTimeMillis());
		}
		if (state != null) {
			state.setEntered(System.currentTimeMillis());
			getStates().add(state);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isInState(EClass stateClass) {
		TaskState<?> currentState = getCurrentState();
		return currentState != null && stateClass.isInstance(currentState);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK__GAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame((Game)otherEnd, msgs);
			case RuntimePackage.TASK__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RuntimePackage.TASK__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case RuntimePackage.TASK__GAME:
				return basicSetGame(null, msgs);
			case RuntimePackage.TASK__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RuntimePackage.TASK__GAME:
				return eInternalContainer().eInverseRemove(this, RuntimePackage.GAME__TASKS, Game.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.TASK__SERVICES:
				return getServices();
			case RuntimePackage.TASK__TASK_DEF:
				if (resolve) return getTaskDef();
				return basicGetTaskDef();
			case RuntimePackage.TASK__GAME:
				return getGame();
			case RuntimePackage.TASK__PLAYERS:
				return getPlayers();
			case RuntimePackage.TASK__STATES:
				return getStates();
			case RuntimePackage.TASK__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
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
			case RuntimePackage.TASK__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service<?>>)newValue);
				return;
			case RuntimePackage.TASK__TASK_DEF:
				setTaskDef((T)newValue);
				return;
			case RuntimePackage.TASK__GAME:
				setGame((Game)newValue);
				return;
			case RuntimePackage.TASK__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case RuntimePackage.TASK__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends TaskState<?>>)newValue);
				return;
			case RuntimePackage.TASK__RESULT:
				setResult((R)newValue);
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
			case RuntimePackage.TASK__SERVICES:
				getServices().clear();
				return;
			case RuntimePackage.TASK__TASK_DEF:
				setTaskDef((T)null);
				return;
			case RuntimePackage.TASK__GAME:
				setGame((Game)null);
				return;
			case RuntimePackage.TASK__PLAYERS:
				getPlayers().clear();
				return;
			case RuntimePackage.TASK__STATES:
				getStates().clear();
				return;
			case RuntimePackage.TASK__RESULT:
				setResult((R)null);
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
			case RuntimePackage.TASK__SERVICES:
				return services != null && !services.isEmpty();
			case RuntimePackage.TASK__TASK_DEF:
				return taskDef != null;
			case RuntimePackage.TASK__GAME:
				return getGame() != null;
			case RuntimePackage.TASK__PLAYERS:
				return players != null && !players.isEmpty();
			case RuntimePackage.TASK__STATES:
				return states != null && !states.isEmpty();
			case RuntimePackage.TASK__RESULT:
				return result != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Services.class) {
			switch (derivedFeatureID) {
				case RuntimePackage.TASK__SERVICES: return RuntimePackage.SERVICES__SERVICES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Services.class) {
			switch (baseFeatureID) {
				case RuntimePackage.SERVICES__SERVICES: return RuntimePackage.TASK__SERVICES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RuntimePackage.TASK___IS_STARTED:
				return isStarted();
			case RuntimePackage.TASK___IS_FINISHED:
				return isFinished();
			case RuntimePackage.TASK___START:
				start();
				return null;
			case RuntimePackage.TASK___CHANGE_STATE__TASKSTATE:
				changeState((TaskState<?>)arguments.get(0));
				return null;
			case RuntimePackage.TASK___GET_CURRENT_STATE:
				return getCurrentState();
			case RuntimePackage.TASK___IS_IN_STATE__ECLASS:
				return isInState((EClass)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //TaskImpl
