/**
 */
package no.hal.sokoban.model.util;

import java.util.Map;
import no.hal.gridgame.model.GameCommand;
import no.hal.gridgame.model.Grid;
import no.hal.gridgame.model.GridGame;
import no.hal.gridgame.model.GridListener;
import no.hal.sokoban.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.sokoban.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseUoD(UoD object) {
				return createUoDAdapter();
			}
			@Override
			public Adapter caseSokobanGrid(SokobanGrid object) {
				return createSokobanGridAdapter();
			}
			@Override
			public Adapter caseSokobanGame(SokobanGame object) {
				return createSokobanGameAdapter();
			}
			@Override
			public Adapter caseMovePlayerCommand(MovePlayerCommand object) {
				return createMovePlayerCommandAdapter();
			}
			@Override
			public Adapter caseSokobanLevel(SokobanLevel object) {
				return createSokobanLevelAdapter();
			}
			@Override
			public Adapter caseString2StringMapEntry(Map.Entry<String, String> object) {
				return createString2StringMapEntryAdapter();
			}
			@Override
			public <V extends Object, O extends EObject> Adapter caseGrid(Grid<V, O> object) {
				return createGridAdapter();
			}
			@Override
			public <G extends Grid<?, ?>, C extends GameCommand> Adapter caseGridGame(GridGame<G, C> object) {
				return createGridGameAdapter();
			}
			@Override
			public Adapter caseGridListener(GridListener object) {
				return createGridListenerAdapter();
			}
			@Override
			public Adapter caseGameCommand(GameCommand object) {
				return createGameCommandAdapter();
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
	 * Creates a new adapter for an object of class '{@link no.hal.sokoban.model.UoD <em>Uo D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.sokoban.model.UoD
	 * @generated
	 */
	public Adapter createUoDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.sokoban.model.SokobanGrid <em>Sokoban Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.sokoban.model.SokobanGrid
	 * @generated
	 */
	public Adapter createSokobanGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.sokoban.model.SokobanGame <em>Sokoban Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.sokoban.model.SokobanGame
	 * @generated
	 */
	public Adapter createSokobanGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.sokoban.model.MovePlayerCommand <em>Move Player Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.sokoban.model.MovePlayerCommand
	 * @generated
	 */
	public Adapter createMovePlayerCommandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.sokoban.model.SokobanLevel <em>Sokoban Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.sokoban.model.SokobanLevel
	 * @generated
	 */
	public Adapter createSokobanLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>String2 String Map Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see java.util.Map.Entry
	 * @generated
	 */
	public Adapter createString2StringMapEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.gridgame.model.Grid <em>Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.gridgame.model.Grid
	 * @generated
	 */
	public Adapter createGridAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.gridgame.model.GridGame <em>Grid Game</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.gridgame.model.GridGame
	 * @generated
	 */
	public Adapter createGridGameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.gridgame.model.GridListener <em>Grid Listener</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.gridgame.model.GridListener
	 * @generated
	 */
	public Adapter createGridListenerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.gridgame.model.GameCommand <em>Game Command</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.gridgame.model.GameCommand
	 * @generated
	 */
	public Adapter createGameCommandAdapter() {
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

} //ModelAdapterFactory
