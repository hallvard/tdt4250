/**
 */
package org.w3c.xhtml1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.w3c.xhtml1.AType;
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
import org.w3c.xhtml1.InputType1;
import org.w3c.xhtml1.InsType;
import org.w3c.xhtml1.KbdType;
import org.w3c.xhtml1.LabelType;
import org.w3c.xhtml1.MapType;
import org.w3c.xhtml1.PreContent;
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
 * An implementation of the model object '<em><b>Pre Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getA <em>A</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getI <em>I</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getB <em>B</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getBdo <em>Bdo</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getMap <em>Map</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getScript <em>Script</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getTextarea <em>Textarea</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.PreContentImpl#getButton <em>Button</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PreContentImpl extends EObjectImpl implements PreContent {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PreContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getPreContent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, Xhtml1Package.PRE_CONTENT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(Xhtml1Package.eINSTANCE.getPreContent_Group());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TtType> getTt() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getI() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BType> getB() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigType> getBig() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallType> getSmall() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmType> getEm() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrongType> getStrong() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DfnType> getDfn() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getCode() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QType> getQ() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampType> getSamp() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KbdType> getKbd() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getVar() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CiteType> getCite() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbrType> getAbbr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcronymType> getAcronym() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSub() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupType> getSup() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrType> getBr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BdoType> getBdo() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Bdo());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MapType> getMap() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Map());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputType1> getInput() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Input());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SelectType> getSelect() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Select());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TextareaType> getTextarea() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Textarea());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LabelType> getLabel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Label());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ButtonType> getButton() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getPreContent_Button());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.PRE_CONTENT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__BDO:
				return ((InternalEList<?>)getBdo()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__MAP:
				return ((InternalEList<?>)getMap()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SCRIPT:
				return ((InternalEList<?>)getScript()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__SELECT:
				return ((InternalEList<?>)getSelect()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__TEXTAREA:
				return ((InternalEList<?>)getTextarea()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__LABEL:
				return ((InternalEList<?>)getLabel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.PRE_CONTENT__BUTTON:
				return ((InternalEList<?>)getButton()).basicRemove(otherEnd, msgs);
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
			case Xhtml1Package.PRE_CONTENT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case Xhtml1Package.PRE_CONTENT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xhtml1Package.PRE_CONTENT__A:
				return getA();
			case Xhtml1Package.PRE_CONTENT__TT:
				return getTt();
			case Xhtml1Package.PRE_CONTENT__I:
				return getI();
			case Xhtml1Package.PRE_CONTENT__B:
				return getB();
			case Xhtml1Package.PRE_CONTENT__BIG:
				return getBig();
			case Xhtml1Package.PRE_CONTENT__SMALL:
				return getSmall();
			case Xhtml1Package.PRE_CONTENT__EM:
				return getEm();
			case Xhtml1Package.PRE_CONTENT__STRONG:
				return getStrong();
			case Xhtml1Package.PRE_CONTENT__DFN:
				return getDfn();
			case Xhtml1Package.PRE_CONTENT__CODE:
				return getCode();
			case Xhtml1Package.PRE_CONTENT__Q:
				return getQ();
			case Xhtml1Package.PRE_CONTENT__SAMP:
				return getSamp();
			case Xhtml1Package.PRE_CONTENT__KBD:
				return getKbd();
			case Xhtml1Package.PRE_CONTENT__VAR:
				return getVar();
			case Xhtml1Package.PRE_CONTENT__CITE:
				return getCite();
			case Xhtml1Package.PRE_CONTENT__ABBR:
				return getAbbr();
			case Xhtml1Package.PRE_CONTENT__ACRONYM:
				return getAcronym();
			case Xhtml1Package.PRE_CONTENT__SUB:
				return getSub();
			case Xhtml1Package.PRE_CONTENT__SUP:
				return getSup();
			case Xhtml1Package.PRE_CONTENT__BR:
				return getBr();
			case Xhtml1Package.PRE_CONTENT__SPAN:
				return getSpan();
			case Xhtml1Package.PRE_CONTENT__BDO:
				return getBdo();
			case Xhtml1Package.PRE_CONTENT__MAP:
				return getMap();
			case Xhtml1Package.PRE_CONTENT__INS:
				return getIns();
			case Xhtml1Package.PRE_CONTENT__DEL:
				return getDel();
			case Xhtml1Package.PRE_CONTENT__SCRIPT:
				return getScript();
			case Xhtml1Package.PRE_CONTENT__INPUT:
				return getInput();
			case Xhtml1Package.PRE_CONTENT__SELECT:
				return getSelect();
			case Xhtml1Package.PRE_CONTENT__TEXTAREA:
				return getTextarea();
			case Xhtml1Package.PRE_CONTENT__LABEL:
				return getLabel();
			case Xhtml1Package.PRE_CONTENT__BUTTON:
				return getButton();
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
			case Xhtml1Package.PRE_CONTENT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__BDO:
				getBdo().clear();
				getBdo().addAll((Collection<? extends BdoType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__MAP:
				getMap().clear();
				getMap().addAll((Collection<? extends MapType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SCRIPT:
				getScript().clear();
				getScript().addAll((Collection<? extends ScriptType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends InputType1>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__SELECT:
				getSelect().clear();
				getSelect().addAll((Collection<? extends SelectType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__TEXTAREA:
				getTextarea().clear();
				getTextarea().addAll((Collection<? extends TextareaType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__LABEL:
				getLabel().clear();
				getLabel().addAll((Collection<? extends LabelType>)newValue);
				return;
			case Xhtml1Package.PRE_CONTENT__BUTTON:
				getButton().clear();
				getButton().addAll((Collection<? extends ButtonType>)newValue);
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
			case Xhtml1Package.PRE_CONTENT__MIXED:
				getMixed().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__GROUP:
				getGroup().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__A:
				getA().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__TT:
				getTt().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__I:
				getI().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__B:
				getB().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__BIG:
				getBig().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SMALL:
				getSmall().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__EM:
				getEm().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__STRONG:
				getStrong().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__DFN:
				getDfn().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__CODE:
				getCode().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__Q:
				getQ().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SAMP:
				getSamp().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__KBD:
				getKbd().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__VAR:
				getVar().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__CITE:
				getCite().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__ABBR:
				getAbbr().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__ACRONYM:
				getAcronym().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SUB:
				getSub().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SUP:
				getSup().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__BR:
				getBr().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SPAN:
				getSpan().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__BDO:
				getBdo().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__MAP:
				getMap().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__INS:
				getIns().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__DEL:
				getDel().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SCRIPT:
				getScript().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__INPUT:
				getInput().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__SELECT:
				getSelect().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__TEXTAREA:
				getTextarea().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__LABEL:
				getLabel().clear();
				return;
			case Xhtml1Package.PRE_CONTENT__BUTTON:
				getButton().clear();
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
			case Xhtml1Package.PRE_CONTENT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case Xhtml1Package.PRE_CONTENT__GROUP:
				return !getGroup().isEmpty();
			case Xhtml1Package.PRE_CONTENT__A:
				return !getA().isEmpty();
			case Xhtml1Package.PRE_CONTENT__TT:
				return !getTt().isEmpty();
			case Xhtml1Package.PRE_CONTENT__I:
				return !getI().isEmpty();
			case Xhtml1Package.PRE_CONTENT__B:
				return !getB().isEmpty();
			case Xhtml1Package.PRE_CONTENT__BIG:
				return !getBig().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SMALL:
				return !getSmall().isEmpty();
			case Xhtml1Package.PRE_CONTENT__EM:
				return !getEm().isEmpty();
			case Xhtml1Package.PRE_CONTENT__STRONG:
				return !getStrong().isEmpty();
			case Xhtml1Package.PRE_CONTENT__DFN:
				return !getDfn().isEmpty();
			case Xhtml1Package.PRE_CONTENT__CODE:
				return !getCode().isEmpty();
			case Xhtml1Package.PRE_CONTENT__Q:
				return !getQ().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SAMP:
				return !getSamp().isEmpty();
			case Xhtml1Package.PRE_CONTENT__KBD:
				return !getKbd().isEmpty();
			case Xhtml1Package.PRE_CONTENT__VAR:
				return !getVar().isEmpty();
			case Xhtml1Package.PRE_CONTENT__CITE:
				return !getCite().isEmpty();
			case Xhtml1Package.PRE_CONTENT__ABBR:
				return !getAbbr().isEmpty();
			case Xhtml1Package.PRE_CONTENT__ACRONYM:
				return !getAcronym().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SUB:
				return !getSub().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SUP:
				return !getSup().isEmpty();
			case Xhtml1Package.PRE_CONTENT__BR:
				return !getBr().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SPAN:
				return !getSpan().isEmpty();
			case Xhtml1Package.PRE_CONTENT__BDO:
				return !getBdo().isEmpty();
			case Xhtml1Package.PRE_CONTENT__MAP:
				return !getMap().isEmpty();
			case Xhtml1Package.PRE_CONTENT__INS:
				return !getIns().isEmpty();
			case Xhtml1Package.PRE_CONTENT__DEL:
				return !getDel().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SCRIPT:
				return !getScript().isEmpty();
			case Xhtml1Package.PRE_CONTENT__INPUT:
				return !getInput().isEmpty();
			case Xhtml1Package.PRE_CONTENT__SELECT:
				return !getSelect().isEmpty();
			case Xhtml1Package.PRE_CONTENT__TEXTAREA:
				return !getTextarea().isEmpty();
			case Xhtml1Package.PRE_CONTENT__LABEL:
				return !getLabel().isEmpty();
			case Xhtml1Package.PRE_CONTENT__BUTTON:
				return !getButton().isEmpty();
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //PreContentImpl
