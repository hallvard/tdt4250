/**
 */
package no.hal.pokemongo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pokemon World</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.PokemonWorld#getTypes <em>Types</em>}</li>
 *   <li>{@link no.hal.pokemongo.PokemonWorld#getPokemons <em>Pokemons</em>}</li>
 * </ul>
 *
 * @see no.hal.pokemongo.PokemongoPackage#getPokemonWorld()
 * @model
 * @generated
 */
public interface PokemonWorld extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pokemongo.PokemonType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonWorld_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<PokemonType> getTypes();

	/**
	 * Returns the value of the '<em><b>Pokemons</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.pokemongo.Pokemon}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pokemons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pokemons</em>' containment reference list.
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonWorld_Pokemons()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pokemon> getPokemons();

} // PokemonWorld
