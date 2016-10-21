/**
 */
package no.hal.pokemongo.impl;

import no.hal.pokemongo.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PokemongoFactoryImpl extends EFactoryImpl implements PokemongoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PokemongoFactory init() {
		try {
			PokemongoFactory thePokemongoFactory = (PokemongoFactory)EPackage.Registry.INSTANCE.getEFactory(PokemongoPackage.eNS_URI);
			if (thePokemongoFactory != null) {
				return thePokemongoFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PokemongoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemongoFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PokemongoPackage.POKEMON_TYPE: return createPokemonType();
			case PokemongoPackage.POKEMON_SPECIES: return createPokemonSpecies();
			case PokemongoPackage.POKEMON: return createPokemon();
			case PokemongoPackage.POKEMON_WORLD: return createPokemonWorld();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonType createPokemonType() {
		PokemonTypeImpl pokemonType = new PokemonTypeImpl();
		return pokemonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonSpecies createPokemonSpecies() {
		PokemonSpeciesImpl pokemonSpecies = new PokemonSpeciesImpl();
		return pokemonSpecies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pokemon createPokemon() {
		PokemonImpl pokemon = new PokemonImpl();
		return pokemon;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonWorld createPokemonWorld() {
		PokemonWorldImpl pokemonWorld = new PokemonWorldImpl();
		return pokemonWorld;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemongoPackage getPokemongoPackage() {
		return (PokemongoPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PokemongoPackage getPackage() {
		return PokemongoPackage.eINSTANCE;
	}

} //PokemongoFactoryImpl
