/**
 */
package no.hal.pokemongo.impl;

import no.hal.pokemongo.PokemonSpecies;
import no.hal.pokemongo.PokemonType;
import no.hal.pokemongo.PokemongoPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pokemon Species</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.impl.PokemonSpeciesImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonSpeciesImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonSpeciesImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonSpeciesImpl#getHp <em>Hp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonSpeciesImpl extends MinimalEObjectImpl.Container implements PokemonSpecies {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected static final int CP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCp() <em>Cp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCp()
	 * @generated
	 * @ordered
	 */
	protected int cp = CP_EDEFAULT;

	/**
	 * The default value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHp() <em>Hp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHp()
	 * @generated
	 * @ordered
	 */
	protected int hp = HP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PokemonSpeciesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemongoPackage.Literals.POKEMON_SPECIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonType getType() {
		if (eContainerFeatureID() != PokemongoPackage.POKEMON_SPECIES__TYPE) return null;
		return (PokemonType)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(PokemonType newType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newType, PokemongoPackage.POKEMON_SPECIES__TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(PokemonType newType) {
		if (newType != eInternalContainer() || (eContainerFeatureID() != PokemongoPackage.POKEMON_SPECIES__TYPE && newType != null)) {
			if (EcoreUtil.isAncestor(this, newType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, PokemongoPackage.POKEMON_TYPE__SPECIES, PokemonType.class, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON_SPECIES__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON_SPECIES__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCp() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCp(int newCp) {
		int oldCp = cp;
		cp = newCp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON_SPECIES__CP, oldCp, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHp() {
		return hp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHp(int newHp) {
		int oldHp = hp;
		hp = newHp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON_SPECIES__HP, oldHp, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetType((PokemonType)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				return basicSetType(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				return eInternalContainer().eInverseRemove(this, PokemongoPackage.POKEMON_TYPE__SPECIES, PokemonType.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				return getType();
			case PokemongoPackage.POKEMON_SPECIES__NAME:
				return getName();
			case PokemongoPackage.POKEMON_SPECIES__CP:
				return getCp();
			case PokemongoPackage.POKEMON_SPECIES__HP:
				return getHp();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				setType((PokemonType)newValue);
				return;
			case PokemongoPackage.POKEMON_SPECIES__NAME:
				setName((String)newValue);
				return;
			case PokemongoPackage.POKEMON_SPECIES__CP:
				setCp((Integer)newValue);
				return;
			case PokemongoPackage.POKEMON_SPECIES__HP:
				setHp((Integer)newValue);
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
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				setType((PokemonType)null);
				return;
			case PokemongoPackage.POKEMON_SPECIES__NAME:
				setName(NAME_EDEFAULT);
				return;
			case PokemongoPackage.POKEMON_SPECIES__CP:
				setCp(CP_EDEFAULT);
				return;
			case PokemongoPackage.POKEMON_SPECIES__HP:
				setHp(HP_EDEFAULT);
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
			case PokemongoPackage.POKEMON_SPECIES__TYPE:
				return getType() != null;
			case PokemongoPackage.POKEMON_SPECIES__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case PokemongoPackage.POKEMON_SPECIES__CP:
				return cp != CP_EDEFAULT;
			case PokemongoPackage.POKEMON_SPECIES__HP:
				return hp != HP_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", cp: ");
		result.append(cp);
		result.append(", hp: ");
		result.append(hp);
		result.append(')');
		return result.toString();
	}

} //PokemonSpeciesImpl
