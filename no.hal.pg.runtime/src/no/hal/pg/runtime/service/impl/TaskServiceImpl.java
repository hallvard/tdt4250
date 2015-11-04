/**
 */
package no.hal.pg.runtime.service.impl;

import java.util.ArrayList;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.Team;
import no.hal.pg.runtime.service.ServicePackage;
import no.hal.pg.runtime.service.TaskService;
import no.hal.pg.runtime.util.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#getTaskClassName <em>Task Class Name</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#isStarted <em>Started</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#isFinished <em>Finished</em>}</li>
 *   <li>{@link no.hal.pg.runtime.service.impl.TaskServiceImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TaskServiceImpl extends MinimalEObjectImpl.Container implements TaskService {
	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Task<?, ?> context;

	/**
	 * The default value of the '{@link #getTaskClassName() <em>Task Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaskClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String TASK_CLASS_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #isStarted() <em>Started</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStarted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean STARTED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #isFinished() <em>Finished</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFinished()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FINISHED_EDEFAULT = false;

	/**
	 * The default value of the '{@link #getResult() <em>Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected static final Object RESULT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.TASK_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Task<?, ?> getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Task<?, ?>)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.TASK_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task<?, ?> basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContext(Task<?, ?> newContext) {
		Task<?, ?> oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.TASK_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getTaskClassName() {
		Task<?, ?> task = getContext();
		String className = task.eClass().getName();
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Player> getPlayers() {
		return ECollections.<Player>unmodifiableEList(new ArrayList<Player>(Util.getPlayers(getContext(), true)));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Team getTeam() {
		Team team = basicGetTeam();
		return team != null && team.eIsProxy() ? (Team)eResolveProxy((InternalEObject)team) : team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Team basicGetTeam() {
		return getContext().getTeam();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isStarted() {
		return getContext().isStarted();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isFinished() {
		return getContext().isFinished();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getResult() {
		return getContext().getResult();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.TASK_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case ServicePackage.TASK_SERVICE__TASK_CLASS_NAME:
				return getTaskClassName();
			case ServicePackage.TASK_SERVICE__PLAYERS:
				return getPlayers();
			case ServicePackage.TASK_SERVICE__TEAM:
				if (resolve) return getTeam();
				return basicGetTeam();
			case ServicePackage.TASK_SERVICE__STARTED:
				return isStarted();
			case ServicePackage.TASK_SERVICE__FINISHED:
				return isFinished();
			case ServicePackage.TASK_SERVICE__RESULT:
				return getResult();
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
			case ServicePackage.TASK_SERVICE__CONTEXT:
				setContext((Task<?, ?>)newValue);
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
			case ServicePackage.TASK_SERVICE__CONTEXT:
				setContext((Task<?, ?>)null);
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
			case ServicePackage.TASK_SERVICE__CONTEXT:
				return context != null;
			case ServicePackage.TASK_SERVICE__TASK_CLASS_NAME:
				return TASK_CLASS_NAME_EDEFAULT == null ? getTaskClassName() != null : !TASK_CLASS_NAME_EDEFAULT.equals(getTaskClassName());
			case ServicePackage.TASK_SERVICE__PLAYERS:
				return !getPlayers().isEmpty();
			case ServicePackage.TASK_SERVICE__TEAM:
				return basicGetTeam() != null;
			case ServicePackage.TASK_SERVICE__STARTED:
				return isStarted() != STARTED_EDEFAULT;
			case ServicePackage.TASK_SERVICE__FINISHED:
				return isFinished() != FINISHED_EDEFAULT;
			case ServicePackage.TASK_SERVICE__RESULT:
				return RESULT_EDEFAULT == null ? getResult() != null : !RESULT_EDEFAULT.equals(getResult());
		}
		return super.eIsSet(featureID);
	}

} //TaskServiceImpl
