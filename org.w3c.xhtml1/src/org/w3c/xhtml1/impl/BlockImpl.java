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
import org.w3c.xhtml1.AddressType;
import org.w3c.xhtml1.Block;
import org.w3c.xhtml1.BlockquoteType;
import org.w3c.xhtml1.DelType;
import org.w3c.xhtml1.DivType;
import org.w3c.xhtml1.DlType;
import org.w3c.xhtml1.FieldsetType;
import org.w3c.xhtml1.FormType;
import org.w3c.xhtml1.H1Type;
import org.w3c.xhtml1.H2Type;
import org.w3c.xhtml1.H3Type;
import org.w3c.xhtml1.H4Type;
import org.w3c.xhtml1.H5Type;
import org.w3c.xhtml1.H6Type;
import org.w3c.xhtml1.HrType;
import org.w3c.xhtml1.InsType;
import org.w3c.xhtml1.NoscriptType;
import org.w3c.xhtml1.OlType;
import org.w3c.xhtml1.PType;
import org.w3c.xhtml1.PreType;
import org.w3c.xhtml1.ScriptType;
import org.w3c.xhtml1.TableType;
import org.w3c.xhtml1.UlType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getP <em>P</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getFieldset <em>Fieldset</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getForm <em>Form</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getNoscript <em>Noscript</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.w3c.xhtml1.impl.BlockImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BlockImpl extends EObjectImpl implements Block {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Xhtml1Package.eINSTANCE.getBlock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, Xhtml1Package.BLOCK__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H1Type> getH1() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H2Type> getH2() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H3Type> getH3() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H4Type> getH4() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H5Type> getH5() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H6Type> getH6() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DivType> getDiv() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UlType> getUl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OlType> getOl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DlType> getDl() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Dl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreType> getPre() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HrType> getHr() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressType> getAddress() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FieldsetType> getFieldset() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Fieldset());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FormType> getForm() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Form());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NoscriptType> getNoscript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Noscript());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ScriptType> getScript() {
		return getGroup().list(Xhtml1Package.eINSTANCE.getBlock_Script());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Xhtml1Package.BLOCK__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__FIELDSET:
				return ((InternalEList<?>)getFieldset()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__FORM:
				return ((InternalEList<?>)getForm()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__NOSCRIPT:
				return ((InternalEList<?>)getNoscript()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
			case Xhtml1Package.BLOCK__SCRIPT:
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
			case Xhtml1Package.BLOCK__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case Xhtml1Package.BLOCK__P:
				return getP();
			case Xhtml1Package.BLOCK__H1:
				return getH1();
			case Xhtml1Package.BLOCK__H2:
				return getH2();
			case Xhtml1Package.BLOCK__H3:
				return getH3();
			case Xhtml1Package.BLOCK__H4:
				return getH4();
			case Xhtml1Package.BLOCK__H5:
				return getH5();
			case Xhtml1Package.BLOCK__H6:
				return getH6();
			case Xhtml1Package.BLOCK__DIV:
				return getDiv();
			case Xhtml1Package.BLOCK__UL:
				return getUl();
			case Xhtml1Package.BLOCK__OL:
				return getOl();
			case Xhtml1Package.BLOCK__DL:
				return getDl();
			case Xhtml1Package.BLOCK__PRE:
				return getPre();
			case Xhtml1Package.BLOCK__HR:
				return getHr();
			case Xhtml1Package.BLOCK__BLOCKQUOTE:
				return getBlockquote();
			case Xhtml1Package.BLOCK__ADDRESS:
				return getAddress();
			case Xhtml1Package.BLOCK__FIELDSET:
				return getFieldset();
			case Xhtml1Package.BLOCK__TABLE:
				return getTable();
			case Xhtml1Package.BLOCK__FORM:
				return getForm();
			case Xhtml1Package.BLOCK__NOSCRIPT:
				return getNoscript();
			case Xhtml1Package.BLOCK__INS:
				return getIns();
			case Xhtml1Package.BLOCK__DEL:
				return getDel();
			case Xhtml1Package.BLOCK__SCRIPT:
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
			case Xhtml1Package.BLOCK__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case Xhtml1Package.BLOCK__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case Xhtml1Package.BLOCK__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case Xhtml1Package.BLOCK__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case Xhtml1Package.BLOCK__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case Xhtml1Package.BLOCK__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case Xhtml1Package.BLOCK__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case Xhtml1Package.BLOCK__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case Xhtml1Package.BLOCK__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case Xhtml1Package.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case Xhtml1Package.BLOCK__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case Xhtml1Package.BLOCK__FIELDSET:
				getFieldset().clear();
				getFieldset().addAll((Collection<? extends FieldsetType>)newValue);
				return;
			case Xhtml1Package.BLOCK__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case Xhtml1Package.BLOCK__FORM:
				getForm().clear();
				getForm().addAll((Collection<? extends FormType>)newValue);
				return;
			case Xhtml1Package.BLOCK__NOSCRIPT:
				getNoscript().clear();
				getNoscript().addAll((Collection<? extends NoscriptType>)newValue);
				return;
			case Xhtml1Package.BLOCK__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case Xhtml1Package.BLOCK__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
			case Xhtml1Package.BLOCK__SCRIPT:
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
			case Xhtml1Package.BLOCK__GROUP:
				getGroup().clear();
				return;
			case Xhtml1Package.BLOCK__P:
				getP().clear();
				return;
			case Xhtml1Package.BLOCK__H1:
				getH1().clear();
				return;
			case Xhtml1Package.BLOCK__H2:
				getH2().clear();
				return;
			case Xhtml1Package.BLOCK__H3:
				getH3().clear();
				return;
			case Xhtml1Package.BLOCK__H4:
				getH4().clear();
				return;
			case Xhtml1Package.BLOCK__H5:
				getH5().clear();
				return;
			case Xhtml1Package.BLOCK__H6:
				getH6().clear();
				return;
			case Xhtml1Package.BLOCK__DIV:
				getDiv().clear();
				return;
			case Xhtml1Package.BLOCK__UL:
				getUl().clear();
				return;
			case Xhtml1Package.BLOCK__OL:
				getOl().clear();
				return;
			case Xhtml1Package.BLOCK__DL:
				getDl().clear();
				return;
			case Xhtml1Package.BLOCK__PRE:
				getPre().clear();
				return;
			case Xhtml1Package.BLOCK__HR:
				getHr().clear();
				return;
			case Xhtml1Package.BLOCK__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case Xhtml1Package.BLOCK__ADDRESS:
				getAddress().clear();
				return;
			case Xhtml1Package.BLOCK__FIELDSET:
				getFieldset().clear();
				return;
			case Xhtml1Package.BLOCK__TABLE:
				getTable().clear();
				return;
			case Xhtml1Package.BLOCK__FORM:
				getForm().clear();
				return;
			case Xhtml1Package.BLOCK__NOSCRIPT:
				getNoscript().clear();
				return;
			case Xhtml1Package.BLOCK__INS:
				getIns().clear();
				return;
			case Xhtml1Package.BLOCK__DEL:
				getDel().clear();
				return;
			case Xhtml1Package.BLOCK__SCRIPT:
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
			case Xhtml1Package.BLOCK__GROUP:
				return group != null && !group.isEmpty();
			case Xhtml1Package.BLOCK__P:
				return !getP().isEmpty();
			case Xhtml1Package.BLOCK__H1:
				return !getH1().isEmpty();
			case Xhtml1Package.BLOCK__H2:
				return !getH2().isEmpty();
			case Xhtml1Package.BLOCK__H3:
				return !getH3().isEmpty();
			case Xhtml1Package.BLOCK__H4:
				return !getH4().isEmpty();
			case Xhtml1Package.BLOCK__H5:
				return !getH5().isEmpty();
			case Xhtml1Package.BLOCK__H6:
				return !getH6().isEmpty();
			case Xhtml1Package.BLOCK__DIV:
				return !getDiv().isEmpty();
			case Xhtml1Package.BLOCK__UL:
				return !getUl().isEmpty();
			case Xhtml1Package.BLOCK__OL:
				return !getOl().isEmpty();
			case Xhtml1Package.BLOCK__DL:
				return !getDl().isEmpty();
			case Xhtml1Package.BLOCK__PRE:
				return !getPre().isEmpty();
			case Xhtml1Package.BLOCK__HR:
				return !getHr().isEmpty();
			case Xhtml1Package.BLOCK__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case Xhtml1Package.BLOCK__ADDRESS:
				return !getAddress().isEmpty();
			case Xhtml1Package.BLOCK__FIELDSET:
				return !getFieldset().isEmpty();
			case Xhtml1Package.BLOCK__TABLE:
				return !getTable().isEmpty();
			case Xhtml1Package.BLOCK__FORM:
				return !getForm().isEmpty();
			case Xhtml1Package.BLOCK__NOSCRIPT:
				return !getNoscript().isEmpty();
			case Xhtml1Package.BLOCK__INS:
				return !getIns().isEmpty();
			case Xhtml1Package.BLOCK__DEL:
				return !getDel().isEmpty();
			case Xhtml1Package.BLOCK__SCRIPT:
				return !getScript().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //BlockImpl
