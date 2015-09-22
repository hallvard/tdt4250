/**
 */
package org.w3c.xhtml1;

import java.math.BigInteger;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Th Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.ThType#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getAlign <em>Align</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getChar <em>Char</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getDir <em>Dir</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getId <em>Id</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getLang <em>Lang</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getLang1 <em>Lang1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnclick <em>Onclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOndblclick <em>Ondblclick</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnkeydown <em>Onkeydown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnkeypress <em>Onkeypress</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnkeyup <em>Onkeyup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnmousedown <em>Onmousedown</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnmousemove <em>Onmousemove</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnmouseout <em>Onmouseout</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnmouseover <em>Onmouseover</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getOnmouseup <em>Onmouseup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getScope <em>Scope</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getStyle <em>Style</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ThType#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3c.xhtml1.Xhtml1Package#getThType()
 * @model extendedMetaData="name='th_._type' kind='mixed'"
 * @generated
 */
public interface ThType extends Flow {
	/**
	 * Returns the value of the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abbr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abbr1</em>' attribute.
	 * @see #setAbbr1(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Abbr1()
	 * @model dataType="org.w3c.xhtml1.Text"
	 *        extendedMetaData="kind='attribute' name='abbr'"
	 * @generated
	 */
	String getAbbr1();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getAbbr1 <em>Abbr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abbr1</em>' attribute.
	 * @see #getAbbr1()
	 * @generated
	 */
	void setAbbr1(String value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.AlignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.w3c.xhtml1.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #setAlign(AlignType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Align()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='align'"
	 * @generated
	 */
	AlignType getAlign();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.w3c.xhtml1.AlignType
	 * @see #isSetAlign()
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(AlignType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	void unsetAlign();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getAlign <em>Align</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Align</em>' attribute is set.
	 * @see #unsetAlign()
	 * @see #getAlign()
	 * @see #setAlign(AlignType)
	 * @generated
	 */
	boolean isSetAlign();

	/**
	 * Returns the value of the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Axis</em>' attribute.
	 * @see #setAxis(Object)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Axis()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnySimpleType"
	 *        extendedMetaData="kind='attribute' name='axis'"
	 * @generated
	 */
	Object getAxis();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getAxis <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Axis</em>' attribute.
	 * @see #getAxis()
	 * @generated
	 */
	void setAxis(Object value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Char()
	 * @model dataType="org.w3c.xhtml1.Character"
	 *        extendedMetaData="kind='attribute' name='char'"
	 * @generated
	 */
	String getChar();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(String value);

	/**
	 * Returns the value of the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Charoff</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Charoff</em>' attribute.
	 * @see #setCharoff(String)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Charoff()
	 * @model dataType="org.w3c.xhtml1.Length"
	 *        extendedMetaData="kind='attribute' name='charoff'"
	 * @generated
	 */
	String getCharoff();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getCharoff <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Charoff</em>' attribute.
	 * @see #getCharoff()
	 * @generated
	 */
	void setCharoff(String value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Class()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKENS" many="false"
	 *        extendedMetaData="kind='attribute' name='class'"
	 * @generated
	 */
	List<String> getClass_();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(List<String> value);

	/**
	 * Returns the value of the '<em><b>Colspan</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspan</em>' attribute.
	 * @see #isSetColspan()
	 * @see #unsetColspan()
	 * @see #setColspan(BigInteger)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Colspan()
	 * @model default="1" unsettable="true" dataType="org.w3c.xhtml1.Number"
	 *        extendedMetaData="kind='attribute' name='colspan'"
	 * @generated
	 */
	BigInteger getColspan();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colspan</em>' attribute.
	 * @see #isSetColspan()
	 * @see #unsetColspan()
	 * @see #getColspan()
	 * @generated
	 */
	void setColspan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getColspan <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetColspan()
	 * @see #getColspan()
	 * @see #setColspan(BigInteger)
	 * @generated
	 */
	void unsetColspan();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getColspan <em>Colspan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Colspan</em>' attribute is set.
	 * @see #unsetColspan()
	 * @see #getColspan()
	 * @see #setColspan(BigInteger)
	 * @generated
	 */
	boolean isSetColspan();

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Dir()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='dir'"
	 * @generated
	 */
	DirType getDir();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getDir <em>Dir</em>}' attribute.
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
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getDir <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDir()
	 * @see #getDir()
	 * @see #setDir(DirType)
	 * @generated
	 */
	void unsetDir();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getDir <em>Dir</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Headers</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Headers</em>' attribute.
	 * @see #setHeaders(List)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Headers()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='headers'"
	 * @generated
	 */
	List<String> getHeaders();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getHeaders <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Headers</em>' attribute.
	 * @see #getHeaders()
	 * @generated
	 */
	void setHeaders(List<String> value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Id()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='id'"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getId <em>Id</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Lang()
	 * @model dataType="org.w3c.xhtml1.LanguageCode"
	 *        extendedMetaData="kind='attribute' name='lang'"
	 * @generated
	 */
	String getLang();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getLang <em>Lang</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Lang1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN"
	 *        extendedMetaData="kind='attribute' name='lang' namespace='http://www.w3.org/XML/1998/namespace'"
	 * @generated
	 */
	String getLang1();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getLang1 <em>Lang1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lang1</em>' attribute.
	 * @see #getLang1()
	 * @generated
	 */
	void setLang1(String value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onclick'"
	 * @generated
	 */
	String getOnclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnclick <em>Onclick</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Ondblclick()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='ondblclick'"
	 * @generated
	 */
	String getOndblclick();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOndblclick <em>Ondblclick</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ondblclick</em>' attribute.
	 * @see #getOndblclick()
	 * @generated
	 */
	void setOndblclick(String value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onkeydown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeydown'"
	 * @generated
	 */
	String getOnkeydown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnkeydown <em>Onkeydown</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onkeypress()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeypress'"
	 * @generated
	 */
	String getOnkeypress();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnkeypress <em>Onkeypress</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onkeyup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onkeyup'"
	 * @generated
	 */
	String getOnkeyup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnkeyup <em>Onkeyup</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onmousedown()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousedown'"
	 * @generated
	 */
	String getOnmousedown();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnmousedown <em>Onmousedown</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onmousemove()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmousemove'"
	 * @generated
	 */
	String getOnmousemove();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnmousemove <em>Onmousemove</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onmouseout()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseout'"
	 * @generated
	 */
	String getOnmouseout();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnmouseout <em>Onmouseout</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onmouseover()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseover'"
	 * @generated
	 */
	String getOnmouseover();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnmouseover <em>Onmouseover</em>}' attribute.
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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Onmouseup()
	 * @model dataType="org.w3c.xhtml1.Script"
	 *        extendedMetaData="kind='attribute' name='onmouseup'"
	 * @generated
	 */
	String getOnmouseup();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getOnmouseup <em>Onmouseup</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Onmouseup</em>' attribute.
	 * @see #getOnmouseup()
	 * @generated
	 */
	void setOnmouseup(String value);

	/**
	 * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowspan</em>' attribute.
	 * @see #isSetRowspan()
	 * @see #unsetRowspan()
	 * @see #setRowspan(BigInteger)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Rowspan()
	 * @model default="1" unsettable="true" dataType="org.w3c.xhtml1.Number"
	 *        extendedMetaData="kind='attribute' name='rowspan'"
	 * @generated
	 */
	BigInteger getRowspan();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowspan</em>' attribute.
	 * @see #isSetRowspan()
	 * @see #unsetRowspan()
	 * @see #getRowspan()
	 * @generated
	 */
	void setRowspan(BigInteger value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getRowspan <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetRowspan()
	 * @see #getRowspan()
	 * @see #setRowspan(BigInteger)
	 * @generated
	 */
	void unsetRowspan();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getRowspan <em>Rowspan</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Rowspan</em>' attribute is set.
	 * @see #unsetRowspan()
	 * @see #getRowspan()
	 * @see #setRowspan(BigInteger)
	 * @generated
	 */
	boolean isSetRowspan();

	/**
	 * Returns the value of the '<em><b>Scope</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.Scope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scope</em>' attribute.
	 * @see org.w3c.xhtml1.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #setScope(Scope)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Scope()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='scope'"
	 * @generated
	 */
	Scope getScope();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scope</em>' attribute.
	 * @see org.w3c.xhtml1.Scope
	 * @see #isSetScope()
	 * @see #unsetScope()
	 * @see #getScope()
	 * @generated
	 */
	void setScope(Scope value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getScope <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	void unsetScope();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getScope <em>Scope</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Scope</em>' attribute is set.
	 * @see #unsetScope()
	 * @see #getScope()
	 * @see #setScope(Scope)
	 * @generated
	 */
	boolean isSetScope();

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Style()
	 * @model dataType="org.w3c.xhtml1.StyleSheet"
	 *        extendedMetaData="kind='attribute' name='style'"
	 * @generated
	 */
	String getStyle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getStyle <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' attribute.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(String value);

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
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Title()
	 * @model dataType="org.w3c.xhtml1.Text"
	 *        extendedMetaData="kind='attribute' name='title'"
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Valign</b></em>' attribute.
	 * The literals are from the enumeration {@link org.w3c.xhtml1.ValignType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valign</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valign</em>' attribute.
	 * @see org.w3c.xhtml1.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #setValign(ValignType)
	 * @see org.w3c.xhtml1.Xhtml1Package#getThType_Valign()
	 * @model unsettable="true"
	 *        extendedMetaData="kind='attribute' name='valign'"
	 * @generated
	 */
	ValignType getValign();

	/**
	 * Sets the value of the '{@link org.w3c.xhtml1.ThType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valign</em>' attribute.
	 * @see org.w3c.xhtml1.ValignType
	 * @see #isSetValign()
	 * @see #unsetValign()
	 * @see #getValign()
	 * @generated
	 */
	void setValign(ValignType value);

	/**
	 * Unsets the value of the '{@link org.w3c.xhtml1.ThType#getValign <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	void unsetValign();

	/**
	 * Returns whether the value of the '{@link org.w3c.xhtml1.ThType#getValign <em>Valign</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Valign</em>' attribute is set.
	 * @see #unsetValign()
	 * @see #getValign()
	 * @see #setValign(ValignType)
	 * @generated
	 */
	boolean isSetValign();

} // ThType
