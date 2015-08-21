/**
 */
package no.hal.pg.runtime.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.GameService;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Ref;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.ServiceInvocation;
import no.hal.pg.runtime.ServiceInvokationListener;
import no.hal.pg.runtime.Task;
import no.hal.pg.runtime.util.Util;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Game Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pg.runtime.impl.GameServiceImpl#getServiceListeners <em>Service Listeners</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameServiceImpl#getContext <em>Context</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameServiceImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link no.hal.pg.runtime.impl.GameServiceImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GameServiceImpl extends MinimalEObjectImpl.Container implements GameService {
	/**
	 * The cached value of the '{@link #getServiceListeners() <em>Service Listeners</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceListeners()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceInvokationListener> serviceListeners;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected Game context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GameServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RuntimePackage.Literals.GAME_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceInvokationListener> getServiceListeners() {
		if (serviceListeners == null) {
			serviceListeners = new EObjectResolvingEList<ServiceInvokationListener>(ServiceInvokationListener.class, this, RuntimePackage.GAME_SERVICE__SERVICE_LISTENERS);
		}
		return serviceListeners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game getContext() {
		if (context != null && ((EObject)context).eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (Game)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RuntimePackage.GAME_SERVICE__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(Game newContext) {
		Game oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RuntimePackage.GAME_SERVICE__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Player> getPlayers() {
		return getContext().getPlayers();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Task<?, ?>> getTasks() {
		return getContext().getTasks();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Task<?, ?>> getTasks(Ref<Player> player) {
		Game game = getContext();
		EList<Task<?, ?>> playerTasks = new BasicEList<Task<?,?>>();
		for (Task<?, ?> task : game.getTasks()) {
			if (Util.containsPlayer(task, player.get(game), false)) {
				playerTasks.add(task);
			}
		}
		return playerTasks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void invokeService(ServiceInvocation invocation) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RuntimePackage.GAME_SERVICE__SERVICE_LISTENERS:
				return getServiceListeners();
			case RuntimePackage.GAME_SERVICE__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
			case RuntimePackage.GAME_SERVICE__PLAYERS:
				return getPlayers();
			case RuntimePackage.GAME_SERVICE__TASKS:
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
			case RuntimePackage.GAME_SERVICE__SERVICE_LISTENERS:
				getServiceListeners().clear();
				getServiceListeners().addAll((Collection<? extends ServiceInvokationListener>)newValue);
				return;
			case RuntimePackage.GAME_SERVICE__CONTEXT:
				setContext((Game)newValue);
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
			case RuntimePackage.GAME_SERVICE__SERVICE_LISTENERS:
				getServiceListeners().clear();
				return;
			case RuntimePackage.GAME_SERVICE__CONTEXT:
				setContext((Game)null);
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
			case RuntimePackage.GAME_SERVICE__SERVICE_LISTENERS:
				return serviceListeners != null && !serviceListeners.isEmpty();
			case RuntimePackage.GAME_SERVICE__CONTEXT:
				return context != null;
			case RuntimePackage.GAME_SERVICE__PLAYERS:
				return !getPlayers().isEmpty();
			case RuntimePackage.GAME_SERVICE__TASKS:
				return !getTasks().isEmpty();
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
			case RuntimePackage.GAME_SERVICE___GET_TASKS__PERSON:
				return getTasks((Ref<Player>)arguments.get(0));
			case RuntimePackage.GAME_SERVICE___INVOKE_SERVICE__SERVICEINVOCATION:
				invokeService((ServiceInvocation)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GameServiceImpl
