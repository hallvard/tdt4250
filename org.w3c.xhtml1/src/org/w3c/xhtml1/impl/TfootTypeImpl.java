/**
 */
package org.w3c.xhtml1.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.xhtml1.AlignType;
import org.w3c.xhtml1.DirType;
import org.w3c.xhtml1.TfootType;
import org.w3c.xhtml1.TrType;
import org.w3c.xhtml1.ValignType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tfoot Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getTr <em>Tr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.TfootTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TfootTypeImpl extends EObjectImpl implements TfootType {
	/**
	 * The cached value of the '{@link #getTr() <em>Tr</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTr()
	 * @generated
	 * @ordered
	 */
	protected EList<TrType> tr;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected String charoff = CHAROFF_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected List<String> class_ = CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected static final String ONCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnclick() <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnclick()
	 * @generated
	 * @ordered
	 */
	protected String onclick = ONCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected static final String ONDBLCLICK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOndblclick() <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOndblclick()
	 * @generated
	 * @ordered
	 */
	protected String ondblclick = ONDBLCLICK_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeydown() <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeydown()
	 * @generated
	 * @ordered
	 */
	protected String onkeydown = ONKEYDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYPRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeypress() <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeypress()
	 * @generated
	 * @ordered
	 */
	protected String onkeypress = ONKEYPRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected static final String ONKEYUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnkeyup() <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnkeyup()
	 * @generated
	 * @ordered
	 */
	protected String onkeyup = ONKEYUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEDOWN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousedown() <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousedown()
	 * @generated
	 * @ordered
	 */
	protected String onmousedown = ONMOUSEDOWN_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmousemove() <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmousemove()
	 * @generated
	 * @ordered
	 */
	protected String onmousemove = ONMOUSEMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEOUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseout() <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseout()
	 * @generated
	 * @ordered
	 */
	protected String onmouseout = ONMOUSEOUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEOVER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseover() <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseover()
	 * @generated
	 * @ordered
	 */
	protected String onmouseover = ONMOUSEOVER_EDEFAULT;

	/**
	 * The default value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected static final String ONMOUSEUP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOnmouseup() <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnmouseup()
	 * @generated
	 * @ordered
	 */
	protected String onmouseup = ONMOUSEUP_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType VALIGN_EDEFAULT = ValignType.TOP;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TfootTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getTfootType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TrType> getTr() {
		if (tr == null) {
			tr = new EObjectContainmentEList<TrType>(TrType.class, this, Xhtml1Package.TFOOT_TYPE__TR);
		}
		return tr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xhtml1Package.TFOOT_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharoff(String newCharoff) {
		String oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__CHAROFF, oldCharoff, charoff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(List<String> newClass) {
		List<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__DIR, oldDir, dir, !oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xhtml1Package.TFOOT_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__LANG1, oldLang1, lang1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnclick() {
		return onclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnclick(String newOnclick) {
		String oldOnclick = onclick;
		onclick = newOnclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONCLICK, oldOnclick, onclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOndblclick() {
		return ondblclick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOndblclick(String newOndblclick) {
		String oldOndblclick = ondblclick;
		ondblclick = newOndblclick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONDBLCLICK, oldOndblclick, ondblclick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeydown() {
		return onkeydown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeydown(String newOnkeydown) {
		String oldOnkeydown = onkeydown;
		onkeydown = newOnkeydown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONKEYDOWN, oldOnkeydown, onkeydown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeypress() {
		return onkeypress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeypress(String newOnkeypress) {
		String oldOnkeypress = onkeypress;
		onkeypress = newOnkeypress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONKEYPRESS, oldOnkeypress, onkeypress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnkeyup() {
		return onkeyup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnkeyup(String newOnkeyup) {
		String oldOnkeyup = onkeyup;
		onkeyup = newOnkeyup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONKEYUP, oldOnkeyup, onkeyup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmousedown() {
		return onmousedown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmousedown(String newOnmousedown) {
		String oldOnmousedown = onmousedown;
		onmousedown = newOnmousedown;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONMOUSEDOWN, oldOnmousedown, onmousedown));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmousemove() {
		return onmousemove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmousemove(String newOnmousemove) {
		String oldOnmousemove = onmousemove;
		onmousemove = newOnmousemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONMOUSEMOVE, oldOnmousemove, onmousemove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseout() {
		return onmouseout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseout(String newOnmouseout) {
		String oldOnmouseout = onmouseout;
		onmouseout = newOnmouseout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONMOUSEOUT, oldOnmouseout, onmouseout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseover() {
		return onmouseover;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseover(String newOnmouseover) {
		String oldOnmouseover = onmouseover;
		onmouseover = newOnmouseover;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONMOUSEOVER, oldOnmouseover, onmouseover));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOnmouseup() {
		return onmouseup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnmouseup(String newOnmouseup) {
		String oldOnmouseup = onmouseup;
		onmouseup = newOnmouseup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__ONMOUSEUP, oldOnmouseup, onmouseup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(ValignType newValign) {
		ValignType oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Xhtml1Package.TFOOT_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValign() {
		ValignType oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, Xhtml1Package.TFOOT_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValign() {
		return valignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.TFOOT_TYPE__TR:
				return ((InternalEList<?>)getTr()).basicRemove(otherEnd, msgs);
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
			case Xhtml1Package.TFOOT_TYPE__TR:
				return getTr();
			case Xhtml1Package.TFOOT_TYPE__ALIGN:
				return getAlign();
			case Xhtml1Package.TFOOT_TYPE__CHAR:
				return getChar();
			case Xhtml1Package.TFOOT_TYPE__CHAROFF:
				return getCharoff();
			case Xhtml1Package.TFOOT_TYPE__CLASS:
				return getClass_();
			case Xhtml1Package.TFOOT_TYPE__DIR:
				return getDir();
			case Xhtml1Package.TFOOT_TYPE__ID:
				return getId();
			case Xhtml1Package.TFOOT_TYPE__LANG:
				return getLang();
			case Xhtml1Package.TFOOT_TYPE__LANG1:
				return getLang1();
			case Xhtml1Package.TFOOT_TYPE__ONCLICK:
				return getOnclick();
			case Xhtml1Package.TFOOT_TYPE__ONDBLCLICK:
				return getOndblclick();
			case Xhtml1Package.TFOOT_TYPE__ONKEYDOWN:
				return getOnkeydown();
			case Xhtml1Package.TFOOT_TYPE__ONKEYPRESS:
				return getOnkeypress();
			case Xhtml1Package.TFOOT_TYPE__ONKEYUP:
				return getOnkeyup();
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEDOWN:
				return getOnmousedown();
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEMOVE:
				return getOnmousemove();
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOUT:
				return getOnmouseout();
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOVER:
				return getOnmouseover();
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEUP:
				return getOnmouseup();
			case Xhtml1Package.TFOOT_TYPE__STYLE:
				return getStyle();
			case Xhtml1Package.TFOOT_TYPE__TITLE:
				return getTitle();
			case Xhtml1Package.TFOOT_TYPE__VALIGN:
				return getValign();
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
			case Xhtml1Package.TFOOT_TYPE__TR:
				getTr().clear();
				getTr().addAll((Collection<? extends TrType>)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ALIGN:
				setAlign((AlignType)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__DIR:
				setDir((DirType)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ID:
				setId((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__LANG:
				setLang((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__LANG1:
				setLang1((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONCLICK:
				setOnclick((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONDBLCLICK:
				setOndblclick((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYDOWN:
				setOnkeydown((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYPRESS:
				setOnkeypress((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYUP:
				setOnkeyup((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEDOWN:
				setOnmousedown((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEMOVE:
				setOnmousemove((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOUT:
				setOnmouseout((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOVER:
				setOnmouseover((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEUP:
				setOnmouseup((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case Xhtml1Package.TFOOT_TYPE__VALIGN:
				setValign((ValignType)newValue);
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
			case Xhtml1Package.TFOOT_TYPE__TR:
				getTr().clear();
				return;
			case Xhtml1Package.TFOOT_TYPE__ALIGN:
				unsetAlign();
				return;
			case Xhtml1Package.TFOOT_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__DIR:
				unsetDir();
				return;
			case Xhtml1Package.TFOOT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__LANG1:
				setLang1(LANG1_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONCLICK:
				setOnclick(ONCLICK_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONDBLCLICK:
				setOndblclick(ONDBLCLICK_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYDOWN:
				setOnkeydown(ONKEYDOWN_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYPRESS:
				setOnkeypress(ONKEYPRESS_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONKEYUP:
				setOnkeyup(ONKEYUP_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEDOWN:
				setOnmousedown(ONMOUSEDOWN_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEMOVE:
				setOnmousemove(ONMOUSEMOVE_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOUT:
				setOnmouseout(ONMOUSEOUT_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOVER:
				setOnmouseover(ONMOUSEOVER_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEUP:
				setOnmouseup(ONMOUSEUP_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case Xhtml1Package.TFOOT_TYPE__VALIGN:
				unsetValign();
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
			case Xhtml1Package.TFOOT_TYPE__TR:
				return tr != null && !tr.isEmpty();
			case Xhtml1Package.TFOOT_TYPE__ALIGN:
				return isSetAlign();
			case Xhtml1Package.TFOOT_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case Xhtml1Package.TFOOT_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case Xhtml1Package.TFOOT_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case Xhtml1Package.TFOOT_TYPE__DIR:
				return isSetDir();
			case Xhtml1Package.TFOOT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case Xhtml1Package.TFOOT_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Xhtml1Package.TFOOT_TYPE__LANG1:
				return LANG1_EDEFAULT == null ? lang1 != null : !LANG1_EDEFAULT.equals(lang1);
			case Xhtml1Package.TFOOT_TYPE__ONCLICK:
				return ONCLICK_EDEFAULT == null ? onclick != null : !ONCLICK_EDEFAULT.equals(onclick);
			case Xhtml1Package.TFOOT_TYPE__ONDBLCLICK:
				return ONDBLCLICK_EDEFAULT == null ? ondblclick != null : !ONDBLCLICK_EDEFAULT.equals(ondblclick);
			case Xhtml1Package.TFOOT_TYPE__ONKEYDOWN:
				return ONKEYDOWN_EDEFAULT == null ? onkeydown != null : !ONKEYDOWN_EDEFAULT.equals(onkeydown);
			case Xhtml1Package.TFOOT_TYPE__ONKEYPRESS:
				return ONKEYPRESS_EDEFAULT == null ? onkeypress != null : !ONKEYPRESS_EDEFAULT.equals(onkeypress);
			case Xhtml1Package.TFOOT_TYPE__ONKEYUP:
				return ONKEYUP_EDEFAULT == null ? onkeyup != null : !ONKEYUP_EDEFAULT.equals(onkeyup);
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEDOWN:
				return ONMOUSEDOWN_EDEFAULT == null ? onmousedown != null : !ONMOUSEDOWN_EDEFAULT.equals(onmousedown);
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEMOVE:
				return ONMOUSEMOVE_EDEFAULT == null ? onmousemove != null : !ONMOUSEMOVE_EDEFAULT.equals(onmousemove);
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOUT:
				return ONMOUSEOUT_EDEFAULT == null ? onmouseout != null : !ONMOUSEOUT_EDEFAULT.equals(onmouseout);
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEOVER:
				return ONMOUSEOVER_EDEFAULT == null ? onmouseover != null : !ONMOUSEOVER_EDEFAULT.equals(onmouseover);
			case Xhtml1Package.TFOOT_TYPE__ONMOUSEUP:
				return ONMOUSEUP_EDEFAULT == null ? onmouseup != null : !ONMOUSEUP_EDEFAULT.equals(onmouseup);
			case Xhtml1Package.TFOOT_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case Xhtml1Package.TFOOT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case Xhtml1Package.TFOOT_TYPE__VALIGN:
				return isSetValign();
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
		result.append(" (align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", class: ");
		result.append(class_);
		result.append(", dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", lang1: ");
		result.append(lang1);
		result.append(", onclick: ");
		result.append(onclick);
		result.append(", ondblclick: ");
		result.append(ondblclick);
		result.append(", onkeydown: ");
		result.append(onkeydown);
		result.append(", onkeypress: ");
		result.append(onkeypress);
		result.append(", onkeyup: ");
		result.append(onkeyup);
		result.append(", onmousedown: ");
		result.append(onmousedown);
		result.append(", onmousemove: ");
		result.append(onmousemove);
		result.append(", onmouseout: ");
		result.append(onmouseout);
		result.append(", onmouseover: ");
		result.append(onmouseover);
		result.append(", onmouseup: ");
		result.append(onmouseup);
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TfootTypeImpl
