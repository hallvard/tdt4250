/**
 */
package org.w3c.xhtml1;

import java.math.BigInteger;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.AType#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getCoords <em>Coords</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getHref <em>Href</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getName <em>Name</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnblur <em>Onblur</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnfocus <em>Onfocus</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getRel <em>Rel</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getRev <em>Rev</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getShape <em>Shape</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3c.xhtml1.AType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3c.xhtml1.Xhtml1Package#getAType()
 * @model extendedMetaData="name='a_._type' kind='mixed'"
 * @generated
 */
public interface AType extends AContent {
	/**
	 * Returns the value of the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accesskey</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accesskey</em>' attribute.
	 * @see #setAccesskey(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Accesskey()
	 * @model dataType="org.w3c.xhtml1.Character"
	 *        extendedMetaData="kind='attribute' name='accesskey'"
	 * @generated
	 */
	String getAccesskey();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getAccesskey <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accesskey</em>' attribute.
	 * @see #getAccesskey()
	 * @generated
	 */
	void setAccesskey(String value);

	/**
	 * Returns the value of the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charset</em>' attribute.
	 * @see #setCharset(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Charset()
	 * @model dataType="org.w3c.xhtml1.Charset"
	 *        extendedMetaData="kind='attribute' name='charset'"
	 * @generated
	 */
	String getCharset();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getCharset <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charset</em>' attribute.
	 * @see #getCharset()
	 * @generated
	 */
	void setCharset(String value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(List)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coords</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coords</em>' attribute.
	 * @see #setCoords(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Coords()
	 * @model dataType="org.w3c.xhtml1.Coords"
	 *        extendedMetaData="kind='attribute' name='coords'"
	 * @generated
	 */
	String getCoords();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getCoords <em>Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coords</em>' attribute.
	 * @see #getCoords()
	 * @generated
	 */
	void setCoords(String value);

	/**
	 * Returns the value of the '<em><b>Dir</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.DirType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dir</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml1.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #setDir(DirType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dir</em>' attribute.
	 * @see org.w3c.xhtml1.DirType
	 * @see #isSetDir()
	 * @see #unsetDir()
	 * @see #getDir()
	 * @generated
	 */
	void setDir(DirType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.AType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.AType#getDir <em>Dir</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Dir</em>' attribute is set.
	 * @see #unsetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	boolean isSetDir();

	/**
	 * Returns the value of the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Href</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Href</em>' attribute.
	 * @see #setHref(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Href()
	 * @model dataType="org.w3c.xhtml1.URI"
	 *        extendedMetaData="kind='attribute' name='href'"
	 * @generated
	 */
	String getHref();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getHref <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Href</em>' attribute.
	 * @see #getHref()
	 * @generated
	 */
	void setHref(String value);

	/**
	 * Returns the value of the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hreflang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hreflang</em>' attribute.
	 * @see #setHreflang(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Hreflang()
	 * @model dataType="org.w3c.xhtml1.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='hreflang'"
	 * @generated
	 */
	String getHreflang();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getHreflang <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hreflang</em>' attribute.
	 * @see #getHreflang()
	 * @generated
	 */
	void setHreflang(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lang</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lang</em>' attribute.
	 * @see #setLang(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Lang()
	 * @model dataType="org.w3c.xhtml1.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getLang <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang</em>' attribute.
	 * @see #getLang()
	 * @generated
	 */
	void setLang(String value);

	/**
	 * Returns the value of the '<em><b>Lang1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content of the lang attribute is a hyphen-separated list of case-insensitive tokens where the first token, if one character, is "i" or "x"; if two characters, is an ISO 639-1 language code; if three characters, is an ISO 639-2 language code. The second token, if two characters, is an ISO 3166-1 country code; if from three to eight characters, is an IANA-registered language code. The meaning of other tokens is undefined. This documentation briefly summarizes  RFC3066, which obseletes RFC1766.
	 * 
	 * 	 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lang1</em>' attribute.
	 * @see #setLang1(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(String value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Onblur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onblur</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onblur</em>' attribute.
	 * @see #setOnblur(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onblur()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onblur'"
	 * @generated
	 */
	String getOnblur();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnblur <em>Onblur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onblur</em>' attribute.
	 * @see #getOnblur()
	 * @generated
	 */
	void setOnblur(String value);

	/**
	 * Returns the value of the '<em><b>Onclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onclick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onclick</em>' attribute.
	 * @see #setOnclick(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onclick'"
	 * @generated
	 */
	String getOnclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnclick <em>Onclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onclick</em>' attribute.
	 * @see #getOnclick()
	 * @generated
	 */
	void setOnclick(String value);

	/**
	 * Returns the value of the '<em><b>Ondblclick</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ondblclick</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ondblclick</em>' attribute.
	 * @see #setOndblclick(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Ondblclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='ondblclick'"
	 * @generated
	 */
	String getOndblclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOndblclick <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ondblclick</em>' attribute.
	 * @see #getOndblclick()
	 * @generated
	 */
	void setOndblclick(String value);

	/**
	 * Returns the value of the '<em><b>Onfocus</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onfocus</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onfocus</em>' attribute.
	 * @see #setOnfocus(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onfocus()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onfocus'"
	 * @generated
	 */
	String getOnfocus();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnfocus <em>Onfocus</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onfocus</em>' attribute.
	 * @see #getOnfocus()
	 * @generated
	 */
	void setOnfocus(String value);

	/**
	 * Returns the value of the '<em><b>Onkeydown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeydown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeydown</em>' attribute.
	 * @see #setOnkeydown(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onkeydown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeydown'"
	 * @generated
	 */
	String getOnkeydown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnkeydown <em>Onkeydown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeydown</em>' attribute.
	 * @see #getOnkeydown()
	 * @generated
	 */
	void setOnkeydown(String value);

	/**
	 * Returns the value of the '<em><b>Onkeypress</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeypress</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeypress</em>' attribute.
	 * @see #setOnkeypress(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onkeypress()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeypress'"
	 * @generated
	 */
	String getOnkeypress();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnkeypress <em>Onkeypress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeypress</em>' attribute.
	 * @see #getOnkeypress()
	 * @generated
	 */
	void setOnkeypress(String value);

	/**
	 * Returns the value of the '<em><b>Onkeyup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onkeyup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onkeyup</em>' attribute.
	 * @see #setOnkeyup(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onkeyup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeyup'"
	 * @generated
	 */
	String getOnkeyup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnkeyup <em>Onkeyup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onkeyup</em>' attribute.
	 * @see #getOnkeyup()
	 * @generated
	 */
	void setOnkeyup(String value);

	/**
	 * Returns the value of the '<em><b>Onmousedown</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmousedown</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousedown</em>' attribute.
	 * @see #setOnmousedown(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onmousedown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousedown'"
	 * @generated
	 */
	String getOnmousedown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnmousedown <em>Onmousedown</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousedown</em>' attribute.
	 * @see #getOnmousedown()
	 * @generated
	 */
	void setOnmousedown(String value);

	/**
	 * Returns the value of the '<em><b>Onmousemove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmousemove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmousemove</em>' attribute.
	 * @see #setOnmousemove(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onmousemove()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousemove'"
	 * @generated
	 */
	String getOnmousemove();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnmousemove <em>Onmousemove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmousemove</em>' attribute.
	 * @see #getOnmousemove()
	 * @generated
	 */
	void setOnmousemove(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseout</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseout</em>' attribute.
	 * @see #setOnmouseout(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onmouseout()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseout'"
	 * @generated
	 */
	String getOnmouseout();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnmouseout <em>Onmouseout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseout</em>' attribute.
	 * @see #getOnmouseout()
	 * @generated
	 */
	void setOnmouseout(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseover</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseover</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseover</em>' attribute.
	 * @see #setOnmouseover(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onmouseover()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseover'"
	 * @generated
	 */
	String getOnmouseover();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnmouseover <em>Onmouseover</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseover</em>' attribute.
	 * @see #getOnmouseover()
	 * @generated
	 */
	void setOnmouseover(String value);

	/**
	 * Returns the value of the '<em><b>Onmouseup</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Onmouseup</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Onmouseup</em>' attribute.
	 * @see #setOnmouseup(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Onmouseup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseup'"
	 * @generated
	 */
	String getOnmouseup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getOnmouseup <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseup</em>' attribute.
	 * @see #getOnmouseup()
	 * @generated
	 */
	void setOnmouseup(String value);

	/**
	 * Returns the value of the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rel</em>' attribute.
	 * @see #setRel(List)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Rel()
	 * @model dataType="org.w3c.xhtml1.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rel'"
	 * @generated
	 */
	List<String> getRel();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getRel <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rel</em>' attribute.
	 * @see #getRel()
	 * @generated
	 */
	void setRel(List<String> value);

	/**
	 * Returns the value of the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rev</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rev</em>' attribute.
	 * @see #setRev(List)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Rev()
	 * @model dataType="org.w3c.xhtml1.LinkTypes" many="false"
	 *        extendedMetaData="kind='attribute' name='rev'"
	 * @generated
	 */
	List<String> getRev();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getRev <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rev</em>' attribute.
	 * @see #getRev()
	 * @generated
	 */
	void setRev(List<String> value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * The default value is <code>"rect"</code>.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.Shape}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see org.w3c.xhtml1.Shape
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #setShape(Shape)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Shape()
	 * @model default="rect" unsettable="true"
	 *        extendedMetaData="kind='attribute' name='shape'"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see org.w3c.xhtml1.Shape
	 * @see #isSetShape()
	 * @see #unsetShape()
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.AType#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetShape()
	 * @see #getShape()
	 * @see #setShape(Shape)
	 * @generated
	 */
	void unsetShape();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.AType#getShape <em>Shape</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Shape</em>' attribute is set.
	 * @see #unsetShape()
	 * @see #getShape()
	 * @see #setShape(Shape)
	 * @generated
	 */
	boolean isSetShape();

	/**
	 * Returns the value of the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' attribute.
	 * @see #setStyle(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Style()
	 * @model dataType="org.w3c.xhtml1.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

	/**
	 * Returns the value of the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tabindex</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tabindex</em>' attribute.
	 * @see #setTabindex(BigInteger)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Tabindex()
	 * @model dataType="org.w3c.xhtml1.TabindexNumber"
	 *        extendedMetaData="kind='attribute' name='tabindex'"
	 * @generated
	 */
	BigInteger getTabindex();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getTabindex <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tabindex</em>' attribute.
	 * @see #getTabindex()
	 * @generated
	 */
	void setTabindex(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Title()
	 * @model dataType="org.w3c.xhtml1.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getAType_Type()
	 * @model dataType="org.w3c.xhtml1.ContentType"
	 *        extendedMetaData="kind='attribute' name='type'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.AType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // AType
