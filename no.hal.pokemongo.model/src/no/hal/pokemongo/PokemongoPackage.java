/**
 */
package no.hal.pokemongo;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pokemongo.PokemongoFactory
 * @model kind="package"
 * @generated
 */
public interface PokemongoPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "pokemongo";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pokemongo.model/model/pokemongo.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pokemongo";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PokemongoPackage eINSTANCE = no.hal.pokemongo.impl.PokemongoPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pokemongo.impl.PokemonTypeImpl <em>Pokemon Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pokemongo.impl.PokemonTypeImpl
	 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonType()
	 * @generated
	 */
	int POKEMON_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Species</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_TYPE__SPECIES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_TYPE__NAME = 1;

	/**
	 * The number of structural features of the '<em>Pokemon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pokemon Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pokemongo.impl.PokemonSpeciesImpl <em>Pokemon Species</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pokemongo.impl.PokemonSpeciesImpl
	 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonSpecies()
	 * @generated
	 */
	int POKEMON_SPECIES = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES__NAME = 1;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES__CP = 2;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES__HP = 3;

	/**
	 * The number of structural features of the '<em>Pokemon Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Pokemon Species</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_SPECIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pokemongo.impl.PokemonImpl <em>Pokemon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pokemongo.impl.PokemonImpl
	 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemon()
	 * @generated
	 */
	int POKEMON = 2;

	/**
	 * The feature id for the '<em><b>Species</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__SPECIES = 0;

	/**
	 * The feature id for the '<em><b>Cp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__CP = 1;

	/**
	 * The feature id for the '<em><b>Hp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__HP = 2;

	/**
	 * The feature id for the '<em><b>Evolves To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__EVOLVES_TO = 3;

	/**
	 * The feature id for the '<em><b>Image Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__IMAGE_URL = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON__NAME = 5;

	/**
	 * The number of structural features of the '<em>Pokemon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Pokemon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.pokemongo.impl.PokemonWorldImpl <em>Pokemon World</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pokemongo.impl.PokemonWorldImpl
	 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonWorld()
	 * @generated
	 */
	int POKEMON_WORLD = 3;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_WORLD__TYPES = 0;

	/**
	 * The feature id for the '<em><b>Pokemons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_WORLD__POKEMONS = 1;

	/**
	 * The number of structural features of the '<em>Pokemon World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_WORLD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Pokemon World</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POKEMON_WORLD_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pokemongo.PokemonType <em>Pokemon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pokemon Type</em>'.
	 * @see no.hal.pokemongo.PokemonType
	 * @generated
	 */
	EClass getPokemonType();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pokemongo.PokemonType#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Species</em>'.
	 * @see no.hal.pokemongo.PokemonType#getSpecies()
	 * @see #getPokemonType()
	 * @generated
	 */
	EReference getPokemonType_Species();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.PokemonType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pokemongo.PokemonType#getName()
	 * @see #getPokemonType()
	 * @generated
	 */
	EAttribute getPokemonType_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.pokemongo.PokemonSpecies <em>Pokemon Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pokemon Species</em>'.
	 * @see no.hal.pokemongo.PokemonSpecies
	 * @generated
	 */
	EClass getPokemonSpecies();

	/**
	 * Returns the meta object for the container reference '{@link no.hal.pokemongo.PokemonSpecies#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Type</em>'.
	 * @see no.hal.pokemongo.PokemonSpecies#getType()
	 * @see #getPokemonSpecies()
	 * @generated
	 */
	EReference getPokemonSpecies_Type();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.PokemonSpecies#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pokemongo.PokemonSpecies#getName()
	 * @see #getPokemonSpecies()
	 * @generated
	 */
	EAttribute getPokemonSpecies_Name();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.PokemonSpecies#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see no.hal.pokemongo.PokemonSpecies#getCp()
	 * @see #getPokemonSpecies()
	 * @generated
	 */
	EAttribute getPokemonSpecies_Cp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.PokemonSpecies#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see no.hal.pokemongo.PokemonSpecies#getHp()
	 * @see #getPokemonSpecies()
	 * @generated
	 */
	EAttribute getPokemonSpecies_Hp();

	/**
	 * Returns the meta object for class '{@link no.hal.pokemongo.Pokemon <em>Pokemon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pokemon</em>'.
	 * @see no.hal.pokemongo.Pokemon
	 * @generated
	 */
	EClass getPokemon();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pokemongo.Pokemon#getSpecies <em>Species</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Species</em>'.
	 * @see no.hal.pokemongo.Pokemon#getSpecies()
	 * @see #getPokemon()
	 * @generated
	 */
	EReference getPokemon_Species();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.Pokemon#getCp <em>Cp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cp</em>'.
	 * @see no.hal.pokemongo.Pokemon#getCp()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Cp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.Pokemon#getHp <em>Hp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hp</em>'.
	 * @see no.hal.pokemongo.Pokemon#getHp()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Hp();

	/**
	 * Returns the meta object for the reference '{@link no.hal.pokemongo.Pokemon#getEvolvesTo <em>Evolves To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evolves To</em>'.
	 * @see no.hal.pokemongo.Pokemon#getEvolvesTo()
	 * @see #getPokemon()
	 * @generated
	 */
	EReference getPokemon_EvolvesTo();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.Pokemon#getImageUrl <em>Image Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Image Url</em>'.
	 * @see no.hal.pokemongo.Pokemon#getImageUrl()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_ImageUrl();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.pokemongo.Pokemon#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see no.hal.pokemongo.Pokemon#getName()
	 * @see #getPokemon()
	 * @generated
	 */
	EAttribute getPokemon_Name();

	/**
	 * Returns the meta object for class '{@link no.hal.pokemongo.PokemonWorld <em>Pokemon World</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pokemon World</em>'.
	 * @see no.hal.pokemongo.PokemonWorld
	 * @generated
	 */
	EClass getPokemonWorld();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pokemongo.PokemonWorld#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see no.hal.pokemongo.PokemonWorld#getTypes()
	 * @see #getPokemonWorld()
	 * @generated
	 */
	EReference getPokemonWorld_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.pokemongo.PokemonWorld#getPokemons <em>Pokemons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pokemons</em>'.
	 * @see no.hal.pokemongo.PokemonWorld#getPokemons()
	 * @see #getPokemonWorld()
	 * @generated
	 */
	EReference getPokemonWorld_Pokemons();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PokemongoFactory getPokemongoFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pokemongo.impl.PokemonTypeImpl <em>Pokemon Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pokemongo.impl.PokemonTypeImpl
		 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonType()
		 * @generated
		 */
		EClass POKEMON_TYPE = eINSTANCE.getPokemonType();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_TYPE__SPECIES = eINSTANCE.getPokemonType_Species();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON_TYPE__NAME = eINSTANCE.getPokemonType_Name();

		/**
		 * The meta object literal for the '{@link no.hal.pokemongo.impl.PokemonSpeciesImpl <em>Pokemon Species</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pokemongo.impl.PokemonSpeciesImpl
		 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonSpecies()
		 * @generated
		 */
		EClass POKEMON_SPECIES = eINSTANCE.getPokemonSpecies();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_SPECIES__TYPE = eINSTANCE.getPokemonSpecies_Type();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON_SPECIES__NAME = eINSTANCE.getPokemonSpecies_Name();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON_SPECIES__CP = eINSTANCE.getPokemonSpecies_Cp();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON_SPECIES__HP = eINSTANCE.getPokemonSpecies_Hp();

		/**
		 * The meta object literal for the '{@link no.hal.pokemongo.impl.PokemonImpl <em>Pokemon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pokemongo.impl.PokemonImpl
		 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemon()
		 * @generated
		 */
		EClass POKEMON = eINSTANCE.getPokemon();

		/**
		 * The meta object literal for the '<em><b>Species</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON__SPECIES = eINSTANCE.getPokemon_Species();

		/**
		 * The meta object literal for the '<em><b>Cp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__CP = eINSTANCE.getPokemon_Cp();

		/**
		 * The meta object literal for the '<em><b>Hp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__HP = eINSTANCE.getPokemon_Hp();

		/**
		 * The meta object literal for the '<em><b>Evolves To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON__EVOLVES_TO = eINSTANCE.getPokemon_EvolvesTo();

		/**
		 * The meta object literal for the '<em><b>Image Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__IMAGE_URL = eINSTANCE.getPokemon_ImageUrl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POKEMON__NAME = eINSTANCE.getPokemon_Name();

		/**
		 * The meta object literal for the '{@link no.hal.pokemongo.impl.PokemonWorldImpl <em>Pokemon World</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pokemongo.impl.PokemonWorldImpl
		 * @see no.hal.pokemongo.impl.PokemongoPackageImpl#getPokemonWorld()
		 * @generated
		 */
		EClass POKEMON_WORLD = eINSTANCE.getPokemonWorld();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_WORLD__TYPES = eINSTANCE.getPokemonWorld_Types();

		/**
		 * The meta object literal for the '<em><b>Pokemons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference POKEMON_WORLD__POKEMONS = eINSTANCE.getPokemonWorld_Pokemons();

	}

} //PokemongoPackage
