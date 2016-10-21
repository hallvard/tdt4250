/**
 */
package no.hal.pokemongo.impl;

import no.hal.pokemongo.Pokemon;
import no.hal.pokemongo.PokemonSpecies;
import no.hal.pokemongo.PokemongoPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pokemon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getSpecies <em>Species</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getCp <em>Cp</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getHp <em>Hp</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getEvolvesTo <em>Evolves To</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getImageUrl <em>Image Url</em>}</li>
 *   <li>{@link no.hal.pokemongo.impl.PokemonImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PokemonImpl extends MinimalEObjectImpl.Container implements Pokemon {
	/**
	 * The cached value of the '{@link #getSpecies() <em>Species</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecies()
	 * @generated
	 * @ordered
	 */
	protected PokemonSpecies species;

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
	 * The cached value of the '{@link #getEvolvesTo() <em>Evolves To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvesTo()
	 * @generated
	 * @ordered
	 */
	protected Pokemon evolvesTo;

	/**
	 * The default value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImageUrl() <em>Image Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageUrl()
	 * @generated
	 * @ordered
	 */
	protected String imageUrl = IMAGE_URL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PokemonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PokemongoPackage.Literals.POKEMON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonSpecies getSpecies() {
		if (species != null && species.eIsProxy()) {
			InternalEObject oldSpecies = (InternalEObject)species;
			species = (PokemonSpecies)eResolveProxy(oldSpecies);
			if (species != oldSpecies) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PokemongoPackage.POKEMON__SPECIES, oldSpecies, species));
			}
		}
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PokemonSpecies basicGetSpecies() {
		return species;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecies(PokemonSpecies newSpecies) {
		PokemonSpecies oldSpecies = species;
		species = newSpecies;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__SPECIES, oldSpecies, species));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__CP, oldCp, cp));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__HP, oldHp, hp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pokemon getEvolvesTo() {
		if (evolvesTo != null && evolvesTo.eIsProxy()) {
			InternalEObject oldEvolvesTo = (InternalEObject)evolvesTo;
			evolvesTo = (Pokemon)eResolveProxy(oldEvolvesTo);
			if (evolvesTo != oldEvolvesTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PokemongoPackage.POKEMON__EVOLVES_TO, oldEvolvesTo, evolvesTo));
			}
		}
		return evolvesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pokemon basicGetEvolvesTo() {
		return evolvesTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvolvesTo(Pokemon newEvolvesTo) {
		Pokemon oldEvolvesTo = evolvesTo;
		evolvesTo = newEvolvesTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__EVOLVES_TO, oldEvolvesTo, evolvesTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImageUrl(String newImageUrl) {
		String oldImageUrl = imageUrl;
		imageUrl = newImageUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__IMAGE_URL, oldImageUrl, imageUrl));
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
			eNotify(new ENotificationImpl(this, Notification.SET, PokemongoPackage.POKEMON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PokemongoPackage.POKEMON__SPECIES:
				if (resolve) return getSpecies();
				return basicGetSpecies();
			case PokemongoPackage.POKEMON__CP:
				return getCp();
			case PokemongoPackage.POKEMON__HP:
				return getHp();
			case PokemongoPackage.POKEMON__EVOLVES_TO:
				if (resolve) return getEvolvesTo();
				return basicGetEvolvesTo();
			case PokemongoPackage.POKEMON__IMAGE_URL:
				return getImageUrl();
			case PokemongoPackage.POKEMON__NAME:
				return getName();
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
			case PokemongoPackage.POKEMON__SPECIES:
				setSpecies((PokemonSpecies)newValue);
				return;
			case PokemongoPackage.POKEMON__CP:
				setCp((Integer)newValue);
				return;
			case PokemongoPackage.POKEMON__HP:
				setHp((Integer)newValue);
				return;
			case PokemongoPackage.POKEMON__EVOLVES_TO:
				setEvolvesTo((Pokemon)newValue);
				return;
			case PokemongoPackage.POKEMON__IMAGE_URL:
				setImageUrl((String)newValue);
				return;
			case PokemongoPackage.POKEMON__NAME:
				setName((String)newValue);
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
			case PokemongoPackage.POKEMON__SPECIES:
				setSpecies((PokemonSpecies)null);
				return;
			case PokemongoPackage.POKEMON__CP:
				setCp(CP_EDEFAULT);
				return;
			case PokemongoPackage.POKEMON__HP:
				setHp(HP_EDEFAULT);
				return;
			case PokemongoPackage.POKEMON__EVOLVES_TO:
				setEvolvesTo((Pokemon)null);
				return;
			case PokemongoPackage.POKEMON__IMAGE_URL:
				setImageUrl(IMAGE_URL_EDEFAULT);
				return;
			case PokemongoPackage.POKEMON__NAME:
				setName(NAME_EDEFAULT);
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
			case PokemongoPackage.POKEMON__SPECIES:
				return species != null;
			case PokemongoPackage.POKEMON__CP:
				return cp != CP_EDEFAULT;
			case PokemongoPackage.POKEMON__HP:
				return hp != HP_EDEFAULT;
			case PokemongoPackage.POKEMON__EVOLVES_TO:
				return evolvesTo != null;
			case PokemongoPackage.POKEMON__IMAGE_URL:
				return IMAGE_URL_EDEFAULT == null ? imageUrl != null : !IMAGE_URL_EDEFAULT.equals(imageUrl);
			case PokemongoPackage.POKEMON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (cp: ");
		result.append(cp);
		result.append(", hp: ");
		result.append(hp);
		result.append(", imageUrl: ");
		result.append(imageUrl);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PokemonImpl
