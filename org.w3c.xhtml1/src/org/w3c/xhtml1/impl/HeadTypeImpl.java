/**
 */
package org.w3c.xhtml1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.xhtml1.BaseType;
import org.w3c.xhtml1.DirType;
import org.w3c.xhtml1.HeadType;
import org.w3c.xhtml1.LinkType;
import org.w3c.xhtml1.MetaType;
import org.w3c.xhtml1.ObjectType;
import org.w3c.xhtml1.ScriptType;
import org.w3c.xhtml1.StyleType;
import org.w3c.xhtml1.TitleType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Head Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getMeta <em>Meta</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getBase <em>Base</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.HeadTypeImpl#getProfile <em>Profile</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HeadTypeImpl extends EObjectImpl implements HeadType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getBase() <em>Base</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase()
	 * @generated
	 * @ordered
	 */
	protected BaseType base;

	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType DIR_EDEFAULT = DirType.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang1() <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang1()
	 * @generated
	 * @ordered
	 */
	protected String lang1 = LANG1_EDEFAULT;

	/**
	 * The default value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected static final String PROFILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getProfile() <em>Profile</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfile()
	 * @generated
	 * @ordered
	 */
	protected String profile = PROFILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeadTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getHeadType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Xhtml1Package.HEAD_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getHeadType_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyleType> getStyle() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getHeadType_Style());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MetaType> getMeta() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getHeadType_Meta());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkType> getLink() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getHeadType_Link());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getHeadType_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xhtml1Package.HEAD_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xhtml1Package.HEAD_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseType getBase() {
		return base;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase(BaseType newBase, NotificationChain msgs) {
		BaseType oldBase = base;
		base = newBase;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__BASE, oldBase, newBase);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase(BaseType newBase) {
		if (newBase != base) {
			NotificationChain msgs = null;
			if (base != null)
				msgs = ((InternalEObject)base).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Xhtml1Package.HEAD_TYPE__BASE, null, msgs);
			if (newBase != null)
				msgs = ((InternalEObject)newBase).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Xhtml1Package.HEAD_TYPE__BASE, null, msgs);
			msgs = basicSetBase(newBase, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__BASE, newBase, newBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirType newDir) {
		DirType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDir() {
		DirType oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xhtml1Package.HEAD_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang1() {
		return lang1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang1(String newLang1) {
		String oldLang1 = lang1;
		lang1 = newLang1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__LANG1, oldLang1, lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProfile() {
		return profile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProfile(String newProfile) {
		String oldProfile = profile;
		profile = newProfile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.HEAD_TYPE__PROFILE, oldProfile, profile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.HEAD_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__STYLE:
				return ((InternalEList<?>)getStyle()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__META:
				return ((InternalEList<?>)getMeta()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.HEAD_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case Xhtml1Package.HEAD_TYPE__BASE:
				return basicSetBase(null, msgs);
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
			case Xhtml1Package.HEAD_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xhtml1Package.HEAD_TYPE__SCRIPT:
				return getScript();
			case Xhtml1Package.HEAD_TYPE__STYLE:
				return getStyle();
			case Xhtml1Package.HEAD_TYPE__META:
				return getMeta();
			case Xhtml1Package.HEAD_TYPE__LINK:
				return getLink();
			case Xhtml1Package.HEAD_TYPE__OBJECT:
				return getObject();
			case Xhtml1Package.HEAD_TYPE__TITLE:
				return getTitle();
			case Xhtml1Package.HEAD_TYPE__BASE:
				return getBase();
			case Xhtml1Package.HEAD_TYPE__DIR:
				return getDir();
			case Xhtml1Package.HEAD_TYPE__ID:
				return getId();
			case Xhtml1Package.HEAD_TYPE__LANG:
				return getLang();
			case Xhtml1Package.HEAD_TYPE__LANG1:
				return getLang1();
			case Xhtml1Package.HEAD_TYPE__PROFILE:
				return getProfile();
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
			case Xhtml1Package.HEAD_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__STYLE:
				getStyle().clear();
				getStyle().addAll((Collection<? extends StyleType>)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__META:
				getMeta().clear();
				getMeta().addAll((Collection<? extends MetaType>)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends LinkType>)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType>)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__BASE:
				setBase((BaseType)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__ID:
				setId((String)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__LANG:
				setLang((String)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__LANG1:
				setLang1((String)newValue);
				return;
			case Xhtml1Package.HEAD_TYPE__PROFILE:
				setProfile((String)newValue);
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
			case Xhtml1Package.HEAD_TYPE__GROUP:
				getGroup().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__SCRIPT:
				getScript().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__STYLE:
				getStyle().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__META:
				getMeta().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__LINK:
				getLink().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__OBJECT:
				getObject().clear();
				return;
			case Xhtml1Package.HEAD_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case Xhtml1Package.HEAD_TYPE__BASE:
				setBase((BaseType)null);
				return;
			case Xhtml1Package.HEAD_TYPE__DIR:
				unsetDir();
				return;
			case Xhtml1Package.HEAD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Xhtml1Package.HEAD_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Xhtml1Package.HEAD_TYPE__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case Xhtml1Package.HEAD_TYPE__PROFILE:
				setProfile(PROFILE_EDEFAULT);
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
			case Xhtml1Package.HEAD_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case Xhtml1Package.HEAD_TYPE__SCRIPT:
				return !getScript().isEmpty();
			case Xhtml1Package.HEAD_TYPE__STYLE:
				return !getStyle().isEmpty();
			case Xhtml1Package.HEAD_TYPE__META:
				return !getMeta().isEmpty();
			case Xhtml1Package.HEAD_TYPE__LINK:
				return !getLink().isEmpty();
			case Xhtml1Package.HEAD_TYPE__OBJECT:
				return !getObject().isEmpty();
			case Xhtml1Package.HEAD_TYPE__TITLE:
				return title != null;
			case Xhtml1Package.HEAD_TYPE__BASE:
				return base != null;
			case Xhtml1Package.HEAD_TYPE__DIR:
				return isSetDir();
			case Xhtml1Package.HEAD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Xhtml1Package.HEAD_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Xhtml1Package.HEAD_TYPE__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case Xhtml1Package.HEAD_TYPE__PROFILE:
				return PROFILE_EDEFAULT == null ? profile != null : !PROFILE_EDEFAULT.equals(profile);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", profile: ");
		result.append(profile);
		result.append(')');
		return result.toString();
	}

} //HeadTypeImpl
