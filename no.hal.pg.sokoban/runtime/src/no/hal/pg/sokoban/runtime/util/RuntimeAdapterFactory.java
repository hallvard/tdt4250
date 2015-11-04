/**
 */
package no.hal.pg.sokoban.runtime.util;

import no.hal.gridgame.model.GridRectangle;
import no.hal.pg.model.TaskDef;

import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.Task;

import no.hal.pg.sokoban.runtime.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.sokoban.runtime.RuntimePackage
 * @generated
 */
public class RuntimeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RuntimePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RuntimePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RuntimeSwitch<Adapter> modelSwitch =
		new RuntimeSwitch<Adapter>() {
			@Override
			public Adapter caseSokobanTask(SokobanTask object) {
				return createSokobanTaskAdapter();
			}
			@Override
			public Adapter caseSokobanService(SokobanService object) {
				return createSokobanServiceAdapter();
			}
			@Override
			public Adapter caseGridRectangleValues(GridRectangleValues object) {
				return createGridRectangleValuesAdapter();
			}
			@Override
			public Adapter caseSokobanGameService(SokobanGameService object) {
				return createSokobanGameServiceAdapter();
			}
			@Override
			public Adapter caseSokobanGridService(SokobanGridService object) {
				return createSokobanGridServiceAdapter();
			}
			@Override
			public Adapter casePlayers(Players object) {
				return createPlayersAdapter();
			}
			@Override
			public <T extends TaskDef, R> Adapter caseTask(Task<T, R> object) {
				return createTaskAdapter();
			}
			@Override
			public <T> Adapter caseService(Service<T> object) {
				return createServiceAdapter();
			}
			@Override
			public Adapter caseGridRectangle(GridRectangle object) {
				return createGridRectangleAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.sokoban.runtime.SokobanTask <em>Sokoban Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.sokoban.runtime.SokobanTask
	 * @generated
	 */
	public Adapter createSokobanTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.sokoban.runtime.SokobanService <em>Sokoban Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.sokoban.runtime.SokobanService
	 * @generated
	 */
	public Adapter createSokobanServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.sokoban.runtime.GridRectangleValues <em>Grid Rectangle Values</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.sokoban.runtime.GridRectangleValues
	 * @generated
	 */
	public Adapter createGridRectangleValuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.sokoban.runtime.SokobanGameService <em>Sokoban Game Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.sokoban.runtime.SokobanGameService
	 * @generated
	 */
	public Adapter createSokobanGameServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.sokoban.runtime.SokobanGridService <em>Sokoban Grid Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.sokoban.runtime.SokobanGridService
	 * @generated
	 */
	public Adapter createSokobanGridServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Players <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Players
	 * @generated
	 */
	public Adapter createPlayersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pg.runtime.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pg.runtime.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.gridgame.model.GridRectangle <em>Grid Rectangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.gridgame.model.GridRectangle
	 * @generated
	 */
	public Adapter createGridRectangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RuntimeAdapterFactory
