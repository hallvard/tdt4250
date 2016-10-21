/**
 */
package no.hal.pokemongo.util;

import no.hal.pokemongo.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pokemongo.PokemongoPackage
 * @generated
 */
public class PokemongoAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PokemongoPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemongoAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PokemongoPackage.eINSTANCE;
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
	protected PokemongoSwitch<Adapter> modelSwitch =
		new PokemongoSwitch<Adapter>() {
			@Override
			public Adapter casePokemonType(PokemonType object) {
				return createPokemonTypeAdapter();
			}
			@Override
			public Adapter casePokemonSpecies(PokemonSpecies object) {
				return createPokemonSpeciesAdapter();
			}
			@Override
			public Adapter casePokemon(Pokemon object) {
				return createPokemonAdapter();
			}
			@Override
			public Adapter casePokemonWorld(PokemonWorld object) {
				return createPokemonWorldAdapter();
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
	 * Creates a new adapter for an object of class '{@link no.hal.pokemongo.PokemonType <em>Pokemon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pokemongo.PokemonType
	 * @generated
	 */
	public Adapter createPokemonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pokemongo.PokemonSpecies <em>Pokemon Species</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pokemongo.PokemonSpecies
	 * @generated
	 */
	public Adapter createPokemonSpeciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pokemongo.Pokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pokemongo.Pokemon
	 * @generated
	 */
	public Adapter createPokemonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.pokemongo.PokemonWorld <em>Pokemon World</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.pokemongo.PokemonWorld
	 * @generated
	 */
	public Adapter createPokemonWorldAdapter() {
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

} //PokemongoAdapterFactory
