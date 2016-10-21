/**
 */
package no.hal.pokemongo;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pokemon Species</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.PokemonSpecies#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.pokemongo.PokemonSpecies#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pokemongo.PokemonSpecies#getCp <em>Cp</em>}</li>
 *   <li>{@link no.hal.pokemongo.PokemonSpecies#getHp <em>Hp</em>}</li>
 * </ul>
 *
 * @see no.hal.pokemongo.PokemongoPackage#getPokemonSpecies()
 * @model
 * @generated
 */
public interface PokemonSpecies extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link no.hal.pokemongo.PokemonType#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' container reference.
	 * @see #setType(PokemonType)
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonSpecies_Type()
	 * @see no.hal.pokemongo.PokemonType#getSpecies
	 * @model opposite="species" transient="false"
	 * @generated
	 */
	PokemonType getType();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.PokemonSpecies#getType <em>Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' container reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(PokemonType value);

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
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonSpecies_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.PokemonSpecies#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonSpecies_Cp()
	 * @model
	 * @generated
	 */
	int getCp();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.PokemonSpecies#getCp <em>Cp</em>}' attribute.
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
	 * @see no.hal.pokemongo.PokemongoPackage#getPokemonSpecies_Hp()
	 * @model
	 * @generated
	 */
	int getHp();

	/**
	 * Sets the value of the '{@link no.hal.pokemongo.PokemonSpecies#getHp <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp</em>' attribute.
	 * @see #getHp()
	 * @generated
	 */
	void setHp(int value);

} // PokemonSpecies
