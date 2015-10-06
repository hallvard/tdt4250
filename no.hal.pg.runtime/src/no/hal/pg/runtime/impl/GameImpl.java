/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.Team;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameImpl extends MinimalEObjectImpl.Container implements Game {
	/**
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<Task<?, ?>> tasks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.GAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentEList<Player>(Player.class, this, RuntimePackage.GAME__PLAYERS);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, RuntimePackage.GAME__TEAMS, RuntimePackage.TEAM__GAME);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Player> getAllPlayers() {
		List<Player> allPlayers = new ArrayList<Player>(getPlayers());
		for (Team team : getTeams()) {
			allPlayers.addAll(team.getAllPlayers());
		}
		return ECollections.unmodifiableEList(allPlayers);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Task<?, ?>> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentWithInverseEList<Task<?, ?>>(Task.class, this, RuntimePackage.GAME__TASKS, RuntimePackage.TASK__GAME);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Task<?, ?>> getTasks(EClass stateClass) {
		EList<Task<?, ?>> result = new BasicEList<Task<?, ?>>();
		for (Task<?, ?> task : getTasks()) {
			if (task.isInState(stateClass)) {
				result.add(task);
			}
		}
		return result;
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
			case RuntimePackage.GAME__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
			case RuntimePackage.GAME__TASKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTasks()).basicAdd(otherEnd, msgs);
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
			case RuntimePackage.GAME__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
			case RuntimePackage.GAME__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case RuntimePackage.GAME__TASKS:
				return ((InternalEList<?>)getTasks()).basicRemove(otherEnd, msgs);
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
			case RuntimePackage.GAME__PLAYERS:
				return getPlayers();
			case RuntimePackage.GAME__TEAMS:
				return getTeams();
			case RuntimePackage.GAME__TASKS:
				return getTasks();
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
			case RuntimePackage.GAME__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case RuntimePackage.GAME__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case RuntimePackage.GAME__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends Task<?, ?>>)newValue);
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
			case RuntimePackage.GAME__PLAYERS:
				getPlayers().clear();
				return;
			case RuntimePackage.GAME__TEAMS:
				getTeams().clear();
				return;
			case RuntimePackage.GAME__TASKS:
				getTasks().clear();
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
			case RuntimePackage.GAME__PLAYERS:
				return players != null && !players.isEmpty();
			case RuntimePackage.GAME__TEAMS:
				return teams != null && !teams.isEmpty();
			case RuntimePackage.GAME__TASKS:
				return tasks != null && !tasks.isEmpty();
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
			case RuntimePackage.GAME___GET_TASKS__ECLASS:
				return getTasks((EClass)arguments.get(0));
			case RuntimePackage.GAME___GET_ALL_PLAYERS:
				return getAllPlayers();
		}
		return super.eInvoke(operationID, arguments);
	}

} //GameImpl
