/**
 */
package no.hal.pokemongo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pokemon</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.Pokemon#getSpecies <em>Species</em>}</li>
 *   <li>{@link no.hal.pokemongo.Pokemon#getCp <em>Cp</em>}</li>
 *   <li>{@link no.hal.pokemongo.Pokemon#getHp <em>Hp</em>}</li>
 *   <li>{@link no.hal.pokemongo.Pokemon#getEvolvesTo <em>Evolves To</em>}</li>
 *   <li>{@link no.hal.pokemongo.Pokemon#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link no.hal.pokemongo.Pokemon#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see no.hal.pokemongo.PokemongoPackage#getPokemon()
 * @model
 * @generated
 */
public interface Pokemon extends EObject {
	/**
	 * Returns the value of the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Species</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Species</em>' reference.
	 * @see #setSpecies(PokemonSpecies)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_Species()
	 * @model
	 * @generated
	 */
	PokemonSpecies getSpecies();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getSpecies <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Species</em>' reference.
	 * @see #getSpecies()
	 * @generated
	 */
	void setSpecies(PokemonSpecies value);

	/**
	 * Returns the value of the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cp</em>' attribute.
	 * @see #setCp(int)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_Cp()
	 * @model
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getCp <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cp</em>' attribute.
	 * @see #getCp()
	 * @generated
	 */
	void setCp(int value);

	/**
	 * Returns the value of the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hp</em>' attribute.
	 * @see #setHp(int)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_Hp()
	 * @model
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getHp <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp</em>' attribute.
	 * @see #getHp()
	 * @generated
	 */
	void setHp(int value);

	/**
	 * Returns the value of the '<em><b>Evolves To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evolves To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evolves To</em>' reference.
	 * @see #setEvolvesTo(Pokemon)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_EvolvesTo()
	 * @model
	 * @generated
	 */
	Pokemon getEvolvesTo();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getEvolvesTo <em>Evolves To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evolves To</em>' reference.
	 * @see #getEvolvesTo()
	 * @generated
	 */
	void setEvolvesTo(Pokemon value);

	/**
	 * Returns the value of the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Url</em>' attribute.
	 * @see #setImageUrl(String)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_ImageUrl()
	 * @model
	 * @generated
	 */
	String getImageUrl();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getImageUrl <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image Url</em>' attribute.
	 * @see #getImageUrl()
	 * @generated
	 */
	void setImageUrl(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemon_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.Pokemon#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Pokemon
