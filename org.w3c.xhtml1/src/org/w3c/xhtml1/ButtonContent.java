/**
 */
package org.w3c.xhtml1;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * 
 *       button uses "Flow" but excludes a, form and form controls
 *       
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getIns <em>Ins</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getDel <em>Del</em>}</li>
 *   <li>{@link org.w3c.xhtml1.ButtonContent#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent()
 * @model extendedMetaData="name='button.content' kind='mixed'"
 * @generated
 */
public interface ButtonContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='group' name='group:1'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.PType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>P</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_P()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='p' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PType> getP();

	/**
	 * Returns the value of the '<em><b>H1</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H1</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H1()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h1' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H1Type> getH1();

	/**
	 * Returns the value of the '<em><b>H2</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H2Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H2</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h2' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H2Type> getH2();

	/**
	 * Returns the value of the '<em><b>H3</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H3Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H3</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H3</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H3()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h3' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H3Type> getH3();

	/**
	 * Returns the value of the '<em><b>H4</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H4Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H4</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H4</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H4()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h4' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H4Type> getH4();

	/**
	 * Returns the value of the '<em><b>H5</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H5Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H5</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H5</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H5()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h5' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H5Type> getH5();

	/**
	 * Returns the value of the '<em><b>H6</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.H6Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>H6</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>H6</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_H6()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='h6' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<H6Type> getH6();

	/**
	 * Returns the value of the '<em><b>Div</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.DivType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container      
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Div</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Div()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='div' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DivType> getDiv();

	/**
	 * Returns the value of the '<em><b>Ul</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.UlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Unordered list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ul</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Ul()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ul' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<UlType> getUl();

	/**
	 * Returns the value of the '<em><b>Ol</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.OlType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       Ordered (numbered) list
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ol</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Ol()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ol' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<OlType> getOl();

	/**
	 * Returns the value of the '<em><b>Dl</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.DlType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dl</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dl</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Dl()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dl' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DlType> getDl();

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.PreType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       content is "Inline" excluding "img|object|big|small|sub|sup"
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Pre()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='pre' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<PreType> getPre();

	/**
	 * Returns the value of the '<em><b>Hr</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.HrType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Hr</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hr</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Hr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='hr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<HrType> getHr();

	/**
	 * Returns the value of the '<em><b>Blockquote</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.BlockquoteType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blockquote</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blockquote</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Blockquote()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='blockquote' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BlockquoteType> getBlockquote();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.AddressType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       information on author
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Address()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AddressType> getAddress();

	/**
	 * Returns the value of the '<em><b>Table</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.TableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Table()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='table' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TableType> getTable();

	/**
	 * Returns the value of the '<em><b>Br</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.BrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       forced line break
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Br</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Br()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='br' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BrType> getBr();

	/**
	 * Returns the value of the '<em><b>Span</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.SpanType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       generic language/style container
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Span</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Span()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='span' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SpanType> getSpan();

	/**
	 * Returns the value of the '<em><b>Bdo</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.BdoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       I18N BiDi over-ride
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bdo</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Bdo()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bdo' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BdoType> getBdo();

	/**
	 * Returns the value of the '<em><b>Map</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.MapType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Map()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='map' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<MapType> getMap();

	/**
	 * Returns the value of the '<em><b>Object</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.ObjectType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Object()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='object' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ObjectType> getObject();

	/**
	 * Returns the value of the '<em><b>Img</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.ImgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Img</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Img</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Img()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='img' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ImgType> getImg();

	/**
	 * Returns the value of the '<em><b>Tt</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.TtType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       fixed pitch font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tt</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Tt()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='tt' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<TtType> getTt();

	/**
	 * Returns the value of the '<em><b>I</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.IType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       italic font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>I</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_I()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='i' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<IType> getI();

	/**
	 * Returns the value of the '<em><b>B</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.BType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bold font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>B</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_B()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='b' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BType> getB();

	/**
	 * Returns the value of the '<em><b>Big</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.BigType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       bigger font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Big</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Big()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='big' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<BigType> getBig();

	/**
	 * Returns the value of the '<em><b>Small</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.SmallType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       smaller font
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Small</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Small()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='small' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SmallType> getSmall();

	/**
	 * Returns the value of the '<em><b>Em</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.EmType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Em</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Em()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='em' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<EmType> getEm();

	/**
	 * Returns the value of the '<em><b>Strong</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.StrongType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       strong emphasis
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strong</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Strong()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='strong' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<StrongType> getStrong();

	/**
	 * Returns the value of the '<em><b>Dfn</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.DfnType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       definitional
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dfn</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Dfn()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='dfn' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DfnType> getDfn();

	/**
	 * Returns the value of the '<em><b>Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.CodeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       program code
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Code()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='code' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CodeType> getCode();

	/**
	 * Returns the value of the '<em><b>Q</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.QType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       inlined quote
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Q()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='q' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<QType> getQ();

	/**
	 * Returns the value of the '<em><b>Samp</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.SampType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       sample
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Samp</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Samp()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='samp' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SampType> getSamp();

	/**
	 * Returns the value of the '<em><b>Kbd</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.KbdType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       something user would type
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kbd</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Kbd()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='kbd' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<KbdType> getKbd();

	/**
	 * Returns the value of the '<em><b>Var</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.VarType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       variable
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Var</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Var()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='var' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<VarType> getVar();

	/**
	 * Returns the value of the '<em><b>Cite</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.CiteType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       citation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cite</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Cite()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='cite' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<CiteType> getCite();

	/**
	 * Returns the value of the '<em><b>Abbr</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.AbbrType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       abbreviation
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abbr</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Abbr()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='abbr' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AbbrType> getAbbr();

	/**
	 * Returns the value of the '<em><b>Acronym</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.AcronymType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       acronym
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Acronym</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Acronym()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='acronym' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<AcronymType> getAcronym();

	/**
	 * Returns the value of the '<em><b>Sub</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.SubType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       subscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sub</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Sub()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sub' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SubType> getSub();

	/**
	 * Returns the value of the '<em><b>Sup</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.SupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       superscript
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sup</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Sup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='sup' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<SupType> getSup();

	/**
	 * Returns the value of the '<em><b>Noscript</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.NoscriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       alternate content container for non script-based rendering
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Noscript</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Noscript()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='noscript' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<NoscriptType> getNoscript();

	/**
	 * Returns the value of the '<em><b>Ins</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.InsType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ins</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ins</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Ins()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ins' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<InsType> getIns();

	/**
	 * Returns the value of the '<em><b>Del</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.DelType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Del</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Del</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Del()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='del' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<DelType> getDel();

	/**
	 * Returns the value of the '<em><b>Script</b></em>' containment reference list.
	 * The list contents are of type {@link org.w3c.xhtml1.ScriptType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *       script statements, which may include CDATA sections
	 *       
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Script</em>' containment reference list.
	 * @see org.w3c.xhtml1.Xhtml1Package#getButtonContent_Script()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='script' namespace='##targetNamespace' group='#group:1'"
	 * @generated
	 */
	EList<ScriptType> getScript();

} // ButtonContent
