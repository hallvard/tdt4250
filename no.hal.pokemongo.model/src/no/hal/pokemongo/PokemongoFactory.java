/**
 */
package no.hal.pokemongo;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pokemongo.PokemongoPackage
 * @generated
 */
public interface PokemongoFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PokemongoFactory eINSTANCE = no.hal.pokemongo.impl.PokemongoFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Pokemon Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pokemon Type</em>'.
	 * @generated
	 */
	PokemonType createPokemonType();

	/**
	 * Returns a new object of class '<em>Pokemon Species</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pokemon Species</em>'.
	 * @generated
	 */
	PokemonSpecies createPokemonSpecies();

	/**
	 * Returns a new object of class '<em>Pokemon</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pokemon</em>'.
	 * @generated
	 */
	Pokemon createPokemon();

	/**
	 * Returns a new object of class '<em>Pokemon World</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pokemon World</em>'.
	 * @generated
	 */
	PokemonWorld createPokemonWorld();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PokemongoPackage getPokemongoPackage();

} //PokemongoFactory
