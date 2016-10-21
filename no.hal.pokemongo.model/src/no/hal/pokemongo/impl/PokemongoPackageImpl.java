/**
 */
package no.hal.pokemongo.impl;

import no.hal.pokemongo.Pokemon;
import no.hal.pokemongo.PokemonSpecies;
import no.hal.pokemongo.PokemonType;
import no.hal.pokemongo.PokemonWorld;
import no.hal.pokemongo.PokemongoFactory;
import no.hal.pokemongo.PokemongoPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PokemongoPackageImpl extends EPackageImpl implements PokemongoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonSpeciesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pokemonWorldEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.pokemongo.PokemongoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PokemongoPackageImpl() {
		super(eNS_URI, PokemongoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PokemongoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PokemongoPackage init() {
		if (isInited) return (PokemongoPackage)EPackage.Registry.INSTANCE.getEPackage(PokemongoPackage.eNS_URI);

		// Obtain or create and register package
		PokemongoPackageImpl thePokemongoPackage = (PokemongoPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PokemongoPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PokemongoPackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePokemongoPackage.createPackageContents();

		// Initialize created meta-data
		thePokemongoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePokemongoPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PokemongoPackage.eNS_URI, thePokemongoPackage);
		return thePokemongoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemonType() {
		return pokemonTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonType_Species() {
		return (EReference)pokemonTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemonType_Name() {
		return (EAttribute)pokemonTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemonSpecies() {
		return pokemonSpeciesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonSpecies_Type() {
		return (EReference)pokemonSpeciesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemonSpecies_Name() {
		return (EAttribute)pokemonSpeciesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemonSpecies_Cp() {
		return (EAttribute)pokemonSpeciesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemonSpecies_Hp() {
		return (EAttribute)pokemonSpeciesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemon() {
		return pokemonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemon_Species() {
		return (EReference)pokemonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Cp() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Hp() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemon_EvolvesTo() {
		return (EReference)pokemonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_ImageUrl() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPokemon_Name() {
		return (EAttribute)pokemonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPokemonWorld() {
		return pokemonWorldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonWorld_Types() {
		return (EReference)pokemonWorldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPokemonWorld_Pokemons() {
		return (EReference)pokemonWorldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemongoFactory getPokemongoFactory() {
		return (PokemongoFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		pokemonTypeEClass = createEClass(POKEMON_TYPE);
		createEReference(pokemonTypeEClass, POKEMON_TYPE__SPECIES);
		createEAttribute(pokemonTypeEClass, POKEMON_TYPE__NAME);

		pokemonSpeciesEClass = createEClass(POKEMON_SPECIES);
		createEReference(pokemonSpeciesEClass, POKEMON_SPECIES__TYPE);
		createEAttribute(pokemonSpeciesEClass, POKEMON_SPECIES__NAME);
		createEAttribute(pokemonSpeciesEClass, POKEMON_SPECIES__CP);
		createEAttribute(pokemonSpeciesEClass, POKEMON_SPECIES__HP);

		pokemonEClass = createEClass(POKEMON);
		createEReference(pokemonEClass, POKEMON__SPECIES);
		createEAttribute(pokemonEClass, POKEMON__CP);
		createEAttribute(pokemonEClass, POKEMON__HP);
		createEReference(pokemonEClass, POKEMON__EVOLVES_TO);
		createEAttribute(pokemonEClass, POKEMON__IMAGE_URL);
		createEAttribute(pokemonEClass, POKEMON__NAME);

		pokemonWorldEClass = createEClass(POKEMON_WORLD);
		createEReference(pokemonWorldEClass, POKEMON_WORLD__TYPES);
		createEReference(pokemonWorldEClass, POKEMON_WORLD__POKEMONS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(pokemonTypeEClass, PokemonType.class, "PokemonType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPokemonType_Species(), this.getPokemonSpecies(), this.getPokemonSpecies_Type(), "species", null, 0, -1, PokemonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemonType_Name(), ecorePackage.getEString(), "name", null, 0, 1, PokemonType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pokemonSpeciesEClass, PokemonSpecies.class, "PokemonSpecies", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPokemonSpecies_Type(), this.getPokemonType(), this.getPokemonType_Species(), "type", null, 0, 1, PokemonSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemonSpecies_Name(), ecorePackage.getEString(), "name", null, 0, 1, PokemonSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemonSpecies_Cp(), ecorePackage.getEInt(), "cp", null, 0, 1, PokemonSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemonSpecies_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, PokemonSpecies.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pokemonEClass, Pokemon.class, "Pokemon", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPokemon_Species(), this.getPokemonSpecies(), null, "species", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Cp(), ecorePackage.getEInt(), "cp", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Hp(), ecorePackage.getEInt(), "hp", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemon_EvolvesTo(), this.getPokemon(), null, "evolvesTo", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_ImageUrl(), ecorePackage.getEString(), "imageUrl", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPokemon_Name(), ecorePackage.getEString(), "name", null, 0, 1, Pokemon.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pokemonWorldEClass, PokemonWorld.class, "PokemonWorld", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPokemonWorld_Types(), this.getPokemonType(), null, "types", null, 0, -1, PokemonWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPokemonWorld_Pokemons(), this.getPokemon(), null, "pokemons", null, 0, -1, PokemonWorld.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PokemongoPackageImpl
