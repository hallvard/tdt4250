/**
 */
package no.hal.pg.model.impl;

import java.util.Collection;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.model.TaskDef;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.model.impl.GameDefImpl#getTasks <em>Tasks</em>}</li>
 *   <li>{@link no.hal.pg.model.impl.GameDefImpl#getTaskRefs <em>Task Refs</em>}</li>
 *   <li>{@link no.hal.pg.model.impl.GameDefImpl#getAllTasks <em>All Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameDefImpl extends MinimalEObjectImpl.Container implements GameDef {
	/**
	 * The cached value of the '{@link #getTasks() <em>Tasks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTasks()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDef> tasks;

	/**
	 * The cached value of the '{@link #getTaskRefs() <em>Task Refs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskRefs()
	 * @generated
	 * @ordered
	 */
	protected EList<TaskDef> taskRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameDefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.GAME_DEF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskDef> getTasks() {
		if (tasks == null) {
			tasks = new EObjectContainmentEList<TaskDef>(TaskDef.class, this, ModelPackage.GAME_DEF__TASKS);
		}
		return tasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaskDef> getTaskRefs() {
		if (taskRefs == null) {
			taskRefs = new EObjectResolvingEList<TaskDef>(TaskDef.class, this, ModelPackage.GAME_DEF__TASK_REFS);
		}
		return taskRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<TaskDef> getAllTasks() {
		EList<TaskDef> result = new BasicEList<TaskDef>();
		result.addAll(getTasks());
		result.addAll(getTaskRefs());
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.GAME_DEF__TASKS:
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
			case ModelPackage.GAME_DEF__TASKS:
				return getTasks();
			case ModelPackage.GAME_DEF__TASK_REFS:
				return getTaskRefs();
			case ModelPackage.GAME_DEF__ALL_TASKS:
				return getAllTasks();
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
			case ModelPackage.GAME_DEF__TASKS:
				getTasks().clear();
				getTasks().addAll((Collection<? extends TaskDef>)newValue);
				return;
			case ModelPackage.GAME_DEF__TASK_REFS:
				getTaskRefs().clear();
				getTaskRefs().addAll((Collection<? extends TaskDef>)newValue);
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
			case ModelPackage.GAME_DEF__TASKS:
				getTasks().clear();
				return;
			case ModelPackage.GAME_DEF__TASK_REFS:
				getTaskRefs().clear();
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
			case ModelPackage.GAME_DEF__TASKS:
				return tasks != null && !tasks.isEmpty();
			case ModelPackage.GAME_DEF__TASK_REFS:
				return taskRefs != null && !taskRefs.isEmpty();
			case ModelPackage.GAME_DEF__ALL_TASKS:
				return !getAllTasks().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GameDefImpl
