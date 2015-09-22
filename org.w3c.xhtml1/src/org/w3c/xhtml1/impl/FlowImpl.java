/**
 */
package org.w3c.xhtml1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.emf.ecore.xml.type.impl.XMLTypeDocumentRootImpl;
import org.w3c.xhtml1.AType;
import org.w3c.xhtml1.AbbrType;
import org.w3c.xhtml1.AcronymType;
import org.w3c.xhtml1.AddressType;
import org.w3c.xhtml1.BType;
import org.w3c.xhtml1.BdoType;
import org.w3c.xhtml1.BigType;
import org.w3c.xhtml1.BlockquoteType;
import org.w3c.xhtml1.BrType;
import org.w3c.xhtml1.ButtonType;
import org.w3c.xhtml1.CiteType;
import org.w3c.xhtml1.CodeType;
import org.w3c.xhtml1.DelType;
import org.w3c.xhtml1.DfnType;
import org.w3c.xhtml1.DivType;
import org.w3c.xhtml1.DlType;
import org.w3c.xhtml1.EmType;
import org.w3c.xhtml1.FieldsetType;
import org.w3c.xhtml1.Flow;
import org.w3c.xhtml1.FormType;
import org.w3c.xhtml1.H1Type;
import org.w3c.xhtml1.H2Type;
import org.w3c.xhtml1.H3Type;
import org.w3c.xhtml1.H4Type;
import org.w3c.xhtml1.H5Type;
import org.w3c.xhtml1.H6Type;
import org.w3c.xhtml1.HrType;
import org.w3c.xhtml1.IType;
import org.w3c.xhtml1.ImgType;
import org.w3c.xhtml1.InputType1;
import org.w3c.xhtml1.InsType;
import org.w3c.xhtml1.KbdType;
import org.w3c.xhtml1.LabelType;
import org.w3c.xhtml1.MapType;
import org.w3c.xhtml1.NoscriptType;
import org.w3c.xhtml1.ObjectType;
import org.w3c.xhtml1.OlType;
import org.w3c.xhtml1.PType;
import org.w3c.xhtml1.PreType;
import org.w3c.xhtml1.QType;
import org.w3c.xhtml1.SampType;
import org.w3c.xhtml1.ScriptType;
import org.w3c.xhtml1.SelectType;
import org.w3c.xhtml1.SmallType;
import org.w3c.xhtml1.SpanType;
import org.w3c.xhtml1.StrongType;
import org.w3c.xhtml1.SubType;
import org.w3c.xhtml1.SupType;
import org.w3c.xhtml1.TableType;
import org.w3c.xhtml1.TextareaType;
import org.w3c.xhtml1.TtType;
import org.w3c.xhtml1.UlType;
import org.w3c.xhtml1.VarType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.FlowImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FlowImpl extends XMLTypeDocumentRootImpl implements Flow {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Xhtml1Package.eINSTANCE.getFlow_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H1Type> getH1() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H2Type> getH2() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H3Type> getH3() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H4Type> getH4() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H5Type> getH5() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H6Type> getH6() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DivType> getDiv() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UlType> getUl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OlType> getOl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DlType> getDl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Dl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreType> getPre() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HrType> getHr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressType> getAddress() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldsetType> getFieldset() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Fieldset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormType> getForm() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Form());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrType> getBr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BdoType> getBdo() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImgType> getImg() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TtType> getTt() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getI() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BType> getB() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigType> getBig() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallType> getSmall() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmType> getEm() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrongType> getStrong() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DfnType> getDfn() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getCode() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QType> getQ() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampType> getSamp() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KbdType> getKbd() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getVar() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CiteType> getCite() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbrType> getAbbr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcronymType> getAcronym() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSub() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupType> getSup() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputType1> getInput() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Input());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSelect() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Select());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextareaType> getTextarea() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Textarea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonType> getButton() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Button());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoscriptType> getNoscript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Noscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getFlow_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.FLOW__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__FIELDSET:
				return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__TEXTAREA:
				return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__BUTTON:
				return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__NOSCRIPT:
				return ((InternalEList<?>)getNoscript()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.FLOW__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
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
			case Xhtml1Package.FLOW__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xhtml1Package.FLOW__P:
				return getP();
			case Xhtml1Package.FLOW__H1:
				return getH1();
			case Xhtml1Package.FLOW__H2:
				return getH2();
			case Xhtml1Package.FLOW__H3:
				return getH3();
			case Xhtml1Package.FLOW__H4:
				return getH4();
			case Xhtml1Package.FLOW__H5:
				return getH5();
			case Xhtml1Package.FLOW__H6:
				return getH6();
			case Xhtml1Package.FLOW__DIV:
				return getDiv();
			case Xhtml1Package.FLOW__UL:
				return getUl();
			case Xhtml1Package.FLOW__OL:
				return getOl();
			case Xhtml1Package.FLOW__DL:
				return getDl();
			case Xhtml1Package.FLOW__PRE:
				return getPre();
			case Xhtml1Package.FLOW__HR:
				return getHr();
			case Xhtml1Package.FLOW__BLOCKQUOTE:
				return getBlockquote();
			case Xhtml1Package.FLOW__ADDRESS:
				return getAddress();
			case Xhtml1Package.FLOW__FIELDSET:
				return getFieldset();
			case Xhtml1Package.FLOW__TABLE:
				return getTable();
			case Xhtml1Package.FLOW__FORM:
				return getForm();
			case Xhtml1Package.FLOW__A:
				return getA();
			case Xhtml1Package.FLOW__BR:
				return getBr();
			case Xhtml1Package.FLOW__SPAN:
				return getSpan();
			case Xhtml1Package.FLOW__BDO:
				return getBdo();
			case Xhtml1Package.FLOW__MAP:
				return getMap();
			case Xhtml1Package.FLOW__OBJECT:
				return getObject();
			case Xhtml1Package.FLOW__IMG:
				return getImg();
			case Xhtml1Package.FLOW__TT:
				return getTt();
			case Xhtml1Package.FLOW__I:
				return getI();
			case Xhtml1Package.FLOW__B:
				return getB();
			case Xhtml1Package.FLOW__BIG:
				return getBig();
			case Xhtml1Package.FLOW__SMALL:
				return getSmall();
			case Xhtml1Package.FLOW__EM:
				return getEm();
			case Xhtml1Package.FLOW__STRONG:
				return getStrong();
			case Xhtml1Package.FLOW__DFN:
				return getDfn();
			case Xhtml1Package.FLOW__CODE:
				return getCode();
			case Xhtml1Package.FLOW__Q:
				return getQ();
			case Xhtml1Package.FLOW__SAMP:
				return getSamp();
			case Xhtml1Package.FLOW__KBD:
				return getKbd();
			case Xhtml1Package.FLOW__VAR:
				return getVar();
			case Xhtml1Package.FLOW__CITE:
				return getCite();
			case Xhtml1Package.FLOW__ABBR:
				return getAbbr();
			case Xhtml1Package.FLOW__ACRONYM:
				return getAcronym();
			case Xhtml1Package.FLOW__SUB:
				return getSub();
			case Xhtml1Package.FLOW__SUP:
				return getSup();
			case Xhtml1Package.FLOW__INPUT:
				return getInput();
			case Xhtml1Package.FLOW__SELECT:
				return getSelect();
			case Xhtml1Package.FLOW__TEXTAREA:
				return getTextarea();
			case Xhtml1Package.FLOW__LABEL:
				return getLabel();
			case Xhtml1Package.FLOW__BUTTON:
				return getButton();
			case Xhtml1Package.FLOW__NOSCRIPT:
				return getNoscript();
			case Xhtml1Package.FLOW__INS:
				return getIns();
			case Xhtml1Package.FLOW__DEL:
				return getDel();
			case Xhtml1Package.FLOW__SCRIPT:
				return getScript();
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
			case Xhtml1Package.FLOW__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xhtml1Package.FLOW__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Xhtml1Package.FLOW__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case Xhtml1Package.FLOW__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case Xhtml1Package.FLOW__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case Xhtml1Package.FLOW__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case Xhtml1Package.FLOW__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case Xhtml1Package.FLOW__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case Xhtml1Package.FLOW__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case Xhtml1Package.FLOW__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case Xhtml1Package.FLOW__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case Xhtml1Package.FLOW__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case Xhtml1Package.FLOW__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case Xhtml1Package.FLOW__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case Xhtml1Package.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case Xhtml1Package.FLOW__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Xhtml1Package.FLOW__FIELDSET:
				getFieldset().clear();
				getFieldset().addAll((Collection<? extends FieldsetType>)newValue);
				return;
			case Xhtml1Package.FLOW__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case Xhtml1Package.FLOW__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends FormType>)newValue);
				return;
			case Xhtml1Package.FLOW__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case Xhtml1Package.FLOW__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case Xhtml1Package.FLOW__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case Xhtml1Package.FLOW__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case Xhtml1Package.FLOW__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case Xhtml1Package.FLOW__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType>)newValue);
				return;
			case Xhtml1Package.FLOW__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case Xhtml1Package.FLOW__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case Xhtml1Package.FLOW__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case Xhtml1Package.FLOW__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case Xhtml1Package.FLOW__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case Xhtml1Package.FLOW__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case Xhtml1Package.FLOW__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case Xhtml1Package.FLOW__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case Xhtml1Package.FLOW__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case Xhtml1Package.FLOW__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Xhtml1Package.FLOW__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case Xhtml1Package.FLOW__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case Xhtml1Package.FLOW__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case Xhtml1Package.FLOW__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case Xhtml1Package.FLOW__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case Xhtml1Package.FLOW__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case Xhtml1Package.FLOW__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case Xhtml1Package.FLOW__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Xhtml1Package.FLOW__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Xhtml1Package.FLOW__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputType1>)newValue);
				return;
			case Xhtml1Package.FLOW__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends SelectType>)newValue);
				return;
			case Xhtml1Package.FLOW__TEXTAREA:
				getTextarea().clear();
				getTextarea().addAll((Collection<? extends TextareaType>)newValue);
				return;
			case Xhtml1Package.FLOW__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Xhtml1Package.FLOW__BUTTON:
				getButton().clear();
				getButton().addAll((Collection<? extends ButtonType>)newValue);
				return;
			case Xhtml1Package.FLOW__NOSCRIPT:
				getNoscript().clear();
				getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
				return;
			case Xhtml1Package.FLOW__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case Xhtml1Package.FLOW__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
			case Xhtml1Package.FLOW__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
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
			case Xhtml1Package.FLOW__GROUP:
				getGroup().clear();
				return;
			case Xhtml1Package.FLOW__P:
				getP().clear();
				return;
			case Xhtml1Package.FLOW__H1:
				getH1().clear();
				return;
			case Xhtml1Package.FLOW__H2:
				getH2().clear();
				return;
			case Xhtml1Package.FLOW__H3:
				getH3().clear();
				return;
			case Xhtml1Package.FLOW__H4:
				getH4().clear();
				return;
			case Xhtml1Package.FLOW__H5:
				getH5().clear();
				return;
			case Xhtml1Package.FLOW__H6:
				getH6().clear();
				return;
			case Xhtml1Package.FLOW__DIV:
				getDiv().clear();
				return;
			case Xhtml1Package.FLOW__UL:
				getUl().clear();
				return;
			case Xhtml1Package.FLOW__OL:
				getOl().clear();
				return;
			case Xhtml1Package.FLOW__DL:
				getDl().clear();
				return;
			case Xhtml1Package.FLOW__PRE:
				getPre().clear();
				return;
			case Xhtml1Package.FLOW__HR:
				getHr().clear();
				return;
			case Xhtml1Package.FLOW__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case Xhtml1Package.FLOW__ADDRESS:
				getAddress().clear();
				return;
			case Xhtml1Package.FLOW__FIELDSET:
				getFieldset().clear();
				return;
			case Xhtml1Package.FLOW__TABLE:
				getTable().clear();
				return;
			case Xhtml1Package.FLOW__FORM:
				getForm().clear();
				return;
			case Xhtml1Package.FLOW__A:
				getA().clear();
				return;
			case Xhtml1Package.FLOW__BR:
				getBr().clear();
				return;
			case Xhtml1Package.FLOW__SPAN:
				getSpan().clear();
				return;
			case Xhtml1Package.FLOW__BDO:
				getBdo().clear();
				return;
			case Xhtml1Package.FLOW__MAP:
				getMap().clear();
				return;
			case Xhtml1Package.FLOW__OBJECT:
				getObject().clear();
				return;
			case Xhtml1Package.FLOW__IMG:
				getImg().clear();
				return;
			case Xhtml1Package.FLOW__TT:
				getTt().clear();
				return;
			case Xhtml1Package.FLOW__I:
				getI().clear();
				return;
			case Xhtml1Package.FLOW__B:
				getB().clear();
				return;
			case Xhtml1Package.FLOW__BIG:
				getBig().clear();
				return;
			case Xhtml1Package.FLOW__SMALL:
				getSmall().clear();
				return;
			case Xhtml1Package.FLOW__EM:
				getEm().clear();
				return;
			case Xhtml1Package.FLOW__STRONG:
				getStrong().clear();
				return;
			case Xhtml1Package.FLOW__DFN:
				getDfn().clear();
				return;
			case Xhtml1Package.FLOW__CODE:
				getCode().clear();
				return;
			case Xhtml1Package.FLOW__Q:
				getQ().clear();
				return;
			case Xhtml1Package.FLOW__SAMP:
				getSamp().clear();
				return;
			case Xhtml1Package.FLOW__KBD:
				getKbd().clear();
				return;
			case Xhtml1Package.FLOW__VAR:
				getVar().clear();
				return;
			case Xhtml1Package.FLOW__CITE:
				getCite().clear();
				return;
			case Xhtml1Package.FLOW__ABBR:
				getAbbr().clear();
				return;
			case Xhtml1Package.FLOW__ACRONYM:
				getAcronym().clear();
				return;
			case Xhtml1Package.FLOW__SUB:
				getSub().clear();
				return;
			case Xhtml1Package.FLOW__SUP:
				getSup().clear();
				return;
			case Xhtml1Package.FLOW__INPUT:
				getInput().clear();
				return;
			case Xhtml1Package.FLOW__SELECT:
				getSelect().clear();
				return;
			case Xhtml1Package.FLOW__TEXTAREA:
				getTextarea().clear();
				return;
			case Xhtml1Package.FLOW__LABEL:
				getLabel().clear();
				return;
			case Xhtml1Package.FLOW__BUTTON:
				getButton().clear();
				return;
			case Xhtml1Package.FLOW__NOSCRIPT:
				getNoscript().clear();
				return;
			case Xhtml1Package.FLOW__INS:
				getIns().clear();
				return;
			case Xhtml1Package.FLOW__DEL:
				getDel().clear();
				return;
			case Xhtml1Package.FLOW__SCRIPT:
				getScript().clear();
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
			case Xhtml1Package.FLOW__GROUP:
				return !getGroup().isEmpty();
			case Xhtml1Package.FLOW__P:
				return !getP().isEmpty();
			case Xhtml1Package.FLOW__H1:
				return !getH1().isEmpty();
			case Xhtml1Package.FLOW__H2:
				return !getH2().isEmpty();
			case Xhtml1Package.FLOW__H3:
				return !getH3().isEmpty();
			case Xhtml1Package.FLOW__H4:
				return !getH4().isEmpty();
			case Xhtml1Package.FLOW__H5:
				return !getH5().isEmpty();
			case Xhtml1Package.FLOW__H6:
				return !getH6().isEmpty();
			case Xhtml1Package.FLOW__DIV:
				return !getDiv().isEmpty();
			case Xhtml1Package.FLOW__UL:
				return !getUl().isEmpty();
			case Xhtml1Package.FLOW__OL:
				return !getOl().isEmpty();
			case Xhtml1Package.FLOW__DL:
				return !getDl().isEmpty();
			case Xhtml1Package.FLOW__PRE:
				return !getPre().isEmpty();
			case Xhtml1Package.FLOW__HR:
				return !getHr().isEmpty();
			case Xhtml1Package.FLOW__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case Xhtml1Package.FLOW__ADDRESS:
				return !getAddress().isEmpty();
			case Xhtml1Package.FLOW__FIELDSET:
				return !getFieldset().isEmpty();
			case Xhtml1Package.FLOW__TABLE:
				return !getTable().isEmpty();
			case Xhtml1Package.FLOW__FORM:
				return !getForm().isEmpty();
			case Xhtml1Package.FLOW__A:
				return !getA().isEmpty();
			case Xhtml1Package.FLOW__BR:
				return !getBr().isEmpty();
			case Xhtml1Package.FLOW__SPAN:
				return !getSpan().isEmpty();
			case Xhtml1Package.FLOW__BDO:
				return !getBdo().isEmpty();
			case Xhtml1Package.FLOW__MAP:
				return !getMap().isEmpty();
			case Xhtml1Package.FLOW__OBJECT:
				return !getObject().isEmpty();
			case Xhtml1Package.FLOW__IMG:
				return !getImg().isEmpty();
			case Xhtml1Package.FLOW__TT:
				return !getTt().isEmpty();
			case Xhtml1Package.FLOW__I:
				return !getI().isEmpty();
			case Xhtml1Package.FLOW__B:
				return !getB().isEmpty();
			case Xhtml1Package.FLOW__BIG:
				return !getBig().isEmpty();
			case Xhtml1Package.FLOW__SMALL:
				return !getSmall().isEmpty();
			case Xhtml1Package.FLOW__EM:
				return !getEm().isEmpty();
			case Xhtml1Package.FLOW__STRONG:
				return !getStrong().isEmpty();
			case Xhtml1Package.FLOW__DFN:
				return !getDfn().isEmpty();
			case Xhtml1Package.FLOW__CODE:
				return !getCode().isEmpty();
			case Xhtml1Package.FLOW__Q:
				return !getQ().isEmpty();
			case Xhtml1Package.FLOW__SAMP:
				return !getSamp().isEmpty();
			case Xhtml1Package.FLOW__KBD:
				return !getKbd().isEmpty();
			case Xhtml1Package.FLOW__VAR:
				return !getVar().isEmpty();
			case Xhtml1Package.FLOW__CITE:
				return !getCite().isEmpty();
			case Xhtml1Package.FLOW__ABBR:
				return !getAbbr().isEmpty();
			case Xhtml1Package.FLOW__ACRONYM:
				return !getAcronym().isEmpty();
			case Xhtml1Package.FLOW__SUB:
				return !getSub().isEmpty();
			case Xhtml1Package.FLOW__SUP:
				return !getSup().isEmpty();
			case Xhtml1Package.FLOW__INPUT:
				return !getInput().isEmpty();
			case Xhtml1Package.FLOW__SELECT:
				return !getSelect().isEmpty();
			case Xhtml1Package.FLOW__TEXTAREA:
				return !getTextarea().isEmpty();
			case Xhtml1Package.FLOW__LABEL:
				return !getLabel().isEmpty();
			case Xhtml1Package.FLOW__BUTTON:
				return !getButton().isEmpty();
			case Xhtml1Package.FLOW__NOSCRIPT:
				return !getNoscript().isEmpty();
			case Xhtml1Package.FLOW__INS:
				return !getIns().isEmpty();
			case Xhtml1Package.FLOW__DEL:
				return !getDel().isEmpty();
			case Xhtml1Package.FLOW__SCRIPT:
				return !getScript().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FlowImpl
