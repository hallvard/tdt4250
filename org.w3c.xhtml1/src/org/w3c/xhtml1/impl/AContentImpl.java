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
import org.w3c.xhtml1.AContent;
import org.w3c.xhtml1.AbbrType;
import org.w3c.xhtml1.AcronymType;
import org.w3c.xhtml1.BType;
import org.w3c.xhtml1.BdoType;
import org.w3c.xhtml1.BigType;
import org.w3c.xhtml1.BrType;
import org.w3c.xhtml1.ButtonType;
import org.w3c.xhtml1.CiteType;
import org.w3c.xhtml1.CodeType;
import org.w3c.xhtml1.DelType;
import org.w3c.xhtml1.DfnType;
import org.w3c.xhtml1.EmType;
import org.w3c.xhtml1.IType;
import org.w3c.xhtml1.ImgType;
import org.w3c.xhtml1.InputType1;
import org.w3c.xhtml1.InsType;
import org.w3c.xhtml1.KbdType;
import org.w3c.xhtml1.LabelType;
import org.w3c.xhtml1.MapType;
import org.w3c.xhtml1.ObjectType;
import org.w3c.xhtml1.QType;
import org.w3c.xhtml1.SampType;
import org.w3c.xhtml1.ScriptType;
import org.w3c.xhtml1.SelectType;
import org.w3c.xhtml1.SmallType;
import org.w3c.xhtml1.SpanType;
import org.w3c.xhtml1.StrongType;
import org.w3c.xhtml1.SubType;
import org.w3c.xhtml1.SupType;
import org.w3c.xhtml1.TextareaType;
import org.w3c.xhtml1.TtType;
import org.w3c.xhtml1.VarType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AContent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getButton <em>Button</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.AContentImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AContentImpl extends XMLTypeDocumentRootImpl implements AContent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getAContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Xhtml1Package.eINSTANCE.getAContent_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrType> getBr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BdoType> getBdo() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImgType> getImg() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Img());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TtType> getTt() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getI() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BType> getB() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigType> getBig() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallType> getSmall() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmType> getEm() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrongType> getStrong() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DfnType> getDfn() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getCode() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QType> getQ() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampType> getSamp() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KbdType> getKbd() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getVar() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CiteType> getCite() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbrType> getAbbr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcronymType> getAcronym() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSub() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupType> getSup() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputType1> getInput() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Input());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSelect() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Select());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextareaType> getTextarea() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Textarea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonType> getButton() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Button());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getAContent_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.ACONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__TEXTAREA:
				return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__BUTTON:
				return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.ACONTENT__SCRIPT:
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
			case Xhtml1Package.ACONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xhtml1Package.ACONTENT__BR:
				return getBr();
			case Xhtml1Package.ACONTENT__SPAN:
				return getSpan();
			case Xhtml1Package.ACONTENT__BDO:
				return getBdo();
			case Xhtml1Package.ACONTENT__MAP:
				return getMap();
			case Xhtml1Package.ACONTENT__OBJECT:
				return getObject();
			case Xhtml1Package.ACONTENT__IMG:
				return getImg();
			case Xhtml1Package.ACONTENT__TT:
				return getTt();
			case Xhtml1Package.ACONTENT__I:
				return getI();
			case Xhtml1Package.ACONTENT__B:
				return getB();
			case Xhtml1Package.ACONTENT__BIG:
				return getBig();
			case Xhtml1Package.ACONTENT__SMALL:
				return getSmall();
			case Xhtml1Package.ACONTENT__EM:
				return getEm();
			case Xhtml1Package.ACONTENT__STRONG:
				return getStrong();
			case Xhtml1Package.ACONTENT__DFN:
				return getDfn();
			case Xhtml1Package.ACONTENT__CODE:
				return getCode();
			case Xhtml1Package.ACONTENT__Q:
				return getQ();
			case Xhtml1Package.ACONTENT__SAMP:
				return getSamp();
			case Xhtml1Package.ACONTENT__KBD:
				return getKbd();
			case Xhtml1Package.ACONTENT__VAR:
				return getVar();
			case Xhtml1Package.ACONTENT__CITE:
				return getCite();
			case Xhtml1Package.ACONTENT__ABBR:
				return getAbbr();
			case Xhtml1Package.ACONTENT__ACRONYM:
				return getAcronym();
			case Xhtml1Package.ACONTENT__SUB:
				return getSub();
			case Xhtml1Package.ACONTENT__SUP:
				return getSup();
			case Xhtml1Package.ACONTENT__INPUT:
				return getInput();
			case Xhtml1Package.ACONTENT__SELECT:
				return getSelect();
			case Xhtml1Package.ACONTENT__TEXTAREA:
				return getTextarea();
			case Xhtml1Package.ACONTENT__LABEL:
				return getLabel();
			case Xhtml1Package.ACONTENT__BUTTON:
				return getButton();
			case Xhtml1Package.ACONTENT__INS:
				return getIns();
			case Xhtml1Package.ACONTENT__DEL:
				return getDel();
			case Xhtml1Package.ACONTENT__SCRIPT:
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
			case Xhtml1Package.ACONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xhtml1Package.ACONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputType1>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends SelectType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__TEXTAREA:
				getTextarea().clear();
				getTextarea().addAll((Collection<? extends TextareaType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__BUTTON:
				getButton().clear();
				getButton().addAll((Collection<? extends ButtonType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
			case Xhtml1Package.ACONTENT__SCRIPT:
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
			case Xhtml1Package.ACONTENT__GROUP:
				getGroup().clear();
				return;
			case Xhtml1Package.ACONTENT__BR:
				getBr().clear();
				return;
			case Xhtml1Package.ACONTENT__SPAN:
				getSpan().clear();
				return;
			case Xhtml1Package.ACONTENT__BDO:
				getBdo().clear();
				return;
			case Xhtml1Package.ACONTENT__MAP:
				getMap().clear();
				return;
			case Xhtml1Package.ACONTENT__OBJECT:
				getObject().clear();
				return;
			case Xhtml1Package.ACONTENT__IMG:
				getImg().clear();
				return;
			case Xhtml1Package.ACONTENT__TT:
				getTt().clear();
				return;
			case Xhtml1Package.ACONTENT__I:
				getI().clear();
				return;
			case Xhtml1Package.ACONTENT__B:
				getB().clear();
				return;
			case Xhtml1Package.ACONTENT__BIG:
				getBig().clear();
				return;
			case Xhtml1Package.ACONTENT__SMALL:
				getSmall().clear();
				return;
			case Xhtml1Package.ACONTENT__EM:
				getEm().clear();
				return;
			case Xhtml1Package.ACONTENT__STRONG:
				getStrong().clear();
				return;
			case Xhtml1Package.ACONTENT__DFN:
				getDfn().clear();
				return;
			case Xhtml1Package.ACONTENT__CODE:
				getCode().clear();
				return;
			case Xhtml1Package.ACONTENT__Q:
				getQ().clear();
				return;
			case Xhtml1Package.ACONTENT__SAMP:
				getSamp().clear();
				return;
			case Xhtml1Package.ACONTENT__KBD:
				getKbd().clear();
				return;
			case Xhtml1Package.ACONTENT__VAR:
				getVar().clear();
				return;
			case Xhtml1Package.ACONTENT__CITE:
				getCite().clear();
				return;
			case Xhtml1Package.ACONTENT__ABBR:
				getAbbr().clear();
				return;
			case Xhtml1Package.ACONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case Xhtml1Package.ACONTENT__SUB:
				getSub().clear();
				return;
			case Xhtml1Package.ACONTENT__SUP:
				getSup().clear();
				return;
			case Xhtml1Package.ACONTENT__INPUT:
				getInput().clear();
				return;
			case Xhtml1Package.ACONTENT__SELECT:
				getSelect().clear();
				return;
			case Xhtml1Package.ACONTENT__TEXTAREA:
				getTextarea().clear();
				return;
			case Xhtml1Package.ACONTENT__LABEL:
				getLabel().clear();
				return;
			case Xhtml1Package.ACONTENT__BUTTON:
				getButton().clear();
				return;
			case Xhtml1Package.ACONTENT__INS:
				getIns().clear();
				return;
			case Xhtml1Package.ACONTENT__DEL:
				getDel().clear();
				return;
			case Xhtml1Package.ACONTENT__SCRIPT:
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
			case Xhtml1Package.ACONTENT__GROUP:
				return !getGroup().isEmpty();
			case Xhtml1Package.ACONTENT__BR:
				return !getBr().isEmpty();
			case Xhtml1Package.ACONTENT__SPAN:
				return !getSpan().isEmpty();
			case Xhtml1Package.ACONTENT__BDO:
				return !getBdo().isEmpty();
			case Xhtml1Package.ACONTENT__MAP:
				return !getMap().isEmpty();
			case Xhtml1Package.ACONTENT__OBJECT:
				return !getObject().isEmpty();
			case Xhtml1Package.ACONTENT__IMG:
				return !getImg().isEmpty();
			case Xhtml1Package.ACONTENT__TT:
				return !getTt().isEmpty();
			case Xhtml1Package.ACONTENT__I:
				return !getI().isEmpty();
			case Xhtml1Package.ACONTENT__B:
				return !getB().isEmpty();
			case Xhtml1Package.ACONTENT__BIG:
				return !getBig().isEmpty();
			case Xhtml1Package.ACONTENT__SMALL:
				return !getSmall().isEmpty();
			case Xhtml1Package.ACONTENT__EM:
				return !getEm().isEmpty();
			case Xhtml1Package.ACONTENT__STRONG:
				return !getStrong().isEmpty();
			case Xhtml1Package.ACONTENT__DFN:
				return !getDfn().isEmpty();
			case Xhtml1Package.ACONTENT__CODE:
				return !getCode().isEmpty();
			case Xhtml1Package.ACONTENT__Q:
				return !getQ().isEmpty();
			case Xhtml1Package.ACONTENT__SAMP:
				return !getSamp().isEmpty();
			case Xhtml1Package.ACONTENT__KBD:
				return !getKbd().isEmpty();
			case Xhtml1Package.ACONTENT__VAR:
				return !getVar().isEmpty();
			case Xhtml1Package.ACONTENT__CITE:
				return !getCite().isEmpty();
			case Xhtml1Package.ACONTENT__ABBR:
				return !getAbbr().isEmpty();
			case Xhtml1Package.ACONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case Xhtml1Package.ACONTENT__SUB:
				return !getSub().isEmpty();
			case Xhtml1Package.ACONTENT__SUP:
				return !getSup().isEmpty();
			case Xhtml1Package.ACONTENT__INPUT:
				return !getInput().isEmpty();
			case Xhtml1Package.ACONTENT__SELECT:
				return !getSelect().isEmpty();
			case Xhtml1Package.ACONTENT__TEXTAREA:
				return !getTextarea().isEmpty();
			case Xhtml1Package.ACONTENT__LABEL:
				return !getLabel().isEmpty();
			case Xhtml1Package.ACONTENT__BUTTON:
				return !getButton().isEmpty();
			case Xhtml1Package.ACONTENT__INS:
				return !getIns().isEmpty();
			case Xhtml1Package.ACONTENT__DEL:
				return !getDel().isEmpty();
			case Xhtml1Package.ACONTENT__SCRIPT:
				return !getScript().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AContentImpl
