/**
 */
package no.hal.pokemongo.impl;

import java.util.Collection;

import no.hal.pokemongo.Pokemon;
import no.hal.pokemongo.PokemonType;
import no.hal.pokemongo.PokemonWorld;
import no.hal.pokemongo.PokemongoPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pokemon World</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.impl.PokemonWorldImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonWorldImpl#getPokemons <em>Pokemons</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonWorldImpl extends MinimalEObjectImpl.Container implements PokemonWorld {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<PokemonType> types;

	/**
	 * The cached value of the '{@link #getPokemons() <em>Pokemons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPokemons()
	 * @generated
	 * @ordered
	 */
	protected EList<Pokemon> pokemons;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PokemonWorldImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemongoPackage.Literals.POKEMON_WORLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PokemonType> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<PokemonType>(PokemonType.class, this, PokemongoPackage.POKEMON_WORLD__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Pokemon> getPokemons() {
		if (pokemons == null) {
			pokemons = new EObjectContainmentEList<Pokemon>(Pokemon.class, this, PokemongoPackage.POKEMON_WORLD__POKEMONS);
		}
		return pokemons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_WORLD__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case PokemongoPackage.POKEMON_WORLD__POKEMONS:
				return ((InternalEList<?>)getPokemons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_WORLD__TYPES:
				return getTypes();
			case PokemongoPackage.POKEMON_WORLD__POKEMONS:
				return getPokemons();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_WORLD__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends PokemonType>)newValue);
				return;
			case PokemongoPackage.POKEMON_WORLD__POKEMONS:
				getPokemons().clear();
				getPokemons().addAll((Collection<? extends Pokemon>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_WORLD__TYPES:
				getTypes().clear();
				return;
			case PokemongoPackage.POKEMON_WORLD__POKEMONS:
				getPokemons().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_WORLD__TYPES:
				return types != null && !types.isEmpty();
			case PokemongoPackage.POKEMON_WORLD__POKEMONS:
				return pokemons != null && !pokemons.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PokemonWorldImpl
