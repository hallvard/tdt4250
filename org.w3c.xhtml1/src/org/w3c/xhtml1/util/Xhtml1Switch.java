/**
 */
package org.w3c.xhtml1.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot;
import org.w3c.xhtml1.AContent;
import org.w3c.xhtml1.AType;
import org.w3c.xhtml1.AbbrType;
import org.w3c.xhtml1.AcronymType;
import org.w3c.xhtml1.AddressType;
import org.w3c.xhtml1.AreaType;
import org.w3c.xhtml1.BType;
import org.w3c.xhtml1.BaseType;
import org.w3c.xhtml1.BdoType;
import org.w3c.xhtml1.BigType;
import org.w3c.xhtml1.Block;
import org.w3c.xhtml1.BlockquoteType;
import org.w3c.xhtml1.BodyType;
import org.w3c.xhtml1.BrType;
import org.w3c.xhtml1.ButtonContent;
import org.w3c.xhtml1.ButtonType;
import org.w3c.xhtml1.CaptionType;
import org.w3c.xhtml1.CiteType;
import org.w3c.xhtml1.CodeType;
import org.w3c.xhtml1.ColType;
import org.w3c.xhtml1.ColgroupType;
import org.w3c.xhtml1.DdType;
import org.w3c.xhtml1.DelType;
import org.w3c.xhtml1.DfnType;
import org.w3c.xhtml1.DivType;
import org.w3c.xhtml1.DlType;
import org.w3c.xhtml1.DocumentRoot;
import org.w3c.xhtml1.DtType;
import org.w3c.xhtml1.EmType;
import org.w3c.xhtml1.FieldsetType;
import org.w3c.xhtml1.Flow;
import org.w3c.xhtml1.FormContent;
import org.w3c.xhtml1.FormType;
import org.w3c.xhtml1.H1Type;
import org.w3c.xhtml1.H2Type;
import org.w3c.xhtml1.H3Type;
import org.w3c.xhtml1.H4Type;
import org.w3c.xhtml1.H5Type;
import org.w3c.xhtml1.H6Type;
import org.w3c.xhtml1.HeadType;
import org.w3c.xhtml1.HrType;
import org.w3c.xhtml1.HtmlType;
import org.w3c.xhtml1.IType;
import org.w3c.xhtml1.ImgType;
import org.w3c.xhtml1.Inline;
import org.w3c.xhtml1.InputType1;
import org.w3c.xhtml1.InsType;
import org.w3c.xhtml1.KbdType;
import org.w3c.xhtml1.LabelType;
import org.w3c.xhtml1.LegendType;
import org.w3c.xhtml1.LiType;
import org.w3c.xhtml1.LinkType;
import org.w3c.xhtml1.MapType;
import org.w3c.xhtml1.MetaType;
import org.w3c.xhtml1.NoscriptType;
import org.w3c.xhtml1.ObjectType;
import org.w3c.xhtml1.OlType;
import org.w3c.xhtml1.OptgroupType;
import org.w3c.xhtml1.OptionType;
import org.w3c.xhtml1.PType;
import org.w3c.xhtml1.ParamType;
import org.w3c.xhtml1.PreContent;
import org.w3c.xhtml1.PreType;
import org.w3c.xhtml1.QType;
import org.w3c.xhtml1.SampType;
import org.w3c.xhtml1.ScriptType;
import org.w3c.xhtml1.SelectType;
import org.w3c.xhtml1.SmallType;
import org.w3c.xhtml1.SpanType;
import org.w3c.xhtml1.StrongType;
import org.w3c.xhtml1.StyleType;
import org.w3c.xhtml1.SubType;
import org.w3c.xhtml1.SupType;
import org.w3c.xhtml1.TableType;
import org.w3c.xhtml1.TbodyType;
import org.w3c.xhtml1.TdType;
import org.w3c.xhtml1.TextareaType;
import org.w3c.xhtml1.TfootType;
import org.w3c.xhtml1.ThType;
import org.w3c.xhtml1.TheadType;
import org.w3c.xhtml1.TitleType;
import org.w3c.xhtml1.TrType;
import org.w3c.xhtml1.TtType;
import org.w3c.xhtml1.UlType;
import org.w3c.xhtml1.VarType;
import org.w3c.xhtml1.Xhtml1Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.w3c.xhtml1.Xhtml1Package
 * @generated
 */
public class Xhtml1Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xhtml1Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml1Switch() {
		if (modelPackage == null) {
			modelPackage = Xhtml1Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Xhtml1Package.ABBR_TYPE: {
				AbbrType abbrType = (AbbrType)theEObject;
				T result = caseAbbrType(abbrType);
				if (result == null) result = caseInline(abbrType);
				if (result == null) result = caseXMLTypeDocumentRoot(abbrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.ACONTENT: {
				AContent aContent = (AContent)theEObject;
				T result = caseAContent(aContent);
				if (result == null) result = caseXMLTypeDocumentRoot(aContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.ACRONYM_TYPE: {
				AcronymType acronymType = (AcronymType)theEObject;
				T result = caseAcronymType(acronymType);
				if (result == null) result = caseInline(acronymType);
				if (result == null) result = caseXMLTypeDocumentRoot(acronymType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = caseInline(addressType);
				if (result == null) result = caseXMLTypeDocumentRoot(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.AREA_TYPE: {
				AreaType areaType = (AreaType)theEObject;
				T result = caseAreaType(areaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.ATYPE: {
				AType aType = (AType)theEObject;
				T result = caseAType(aType);
				if (result == null) result = caseAContent(aType);
				if (result == null) result = caseXMLTypeDocumentRoot(aType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BASE_TYPE: {
				BaseType baseType = (BaseType)theEObject;
				T result = caseBaseType(baseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BDO_TYPE: {
				BdoType bdoType = (BdoType)theEObject;
				T result = caseBdoType(bdoType);
				if (result == null) result = caseInline(bdoType);
				if (result == null) result = caseXMLTypeDocumentRoot(bdoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BIG_TYPE: {
				BigType bigType = (BigType)theEObject;
				T result = caseBigType(bigType);
				if (result == null) result = caseInline(bigType);
				if (result == null) result = caseXMLTypeDocumentRoot(bigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BLOCKQUOTE_TYPE: {
				BlockquoteType blockquoteType = (BlockquoteType)theEObject;
				T result = caseBlockquoteType(blockquoteType);
				if (result == null) result = caseBlock(blockquoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BODY_TYPE: {
				BodyType bodyType = (BodyType)theEObject;
				T result = caseBodyType(bodyType);
				if (result == null) result = caseBlock(bodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BR_TYPE: {
				BrType brType = (BrType)theEObject;
				T result = caseBrType(brType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BTYPE: {
				BType bType = (BType)theEObject;
				T result = caseBType(bType);
				if (result == null) result = caseInline(bType);
				if (result == null) result = caseXMLTypeDocumentRoot(bType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BUTTON_CONTENT: {
				ButtonContent buttonContent = (ButtonContent)theEObject;
				T result = caseButtonContent(buttonContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.BUTTON_TYPE: {
				ButtonType buttonType = (ButtonType)theEObject;
				T result = caseButtonType(buttonType);
				if (result == null) result = caseButtonContent(buttonType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.CAPTION_TYPE: {
				CaptionType captionType = (CaptionType)theEObject;
				T result = caseCaptionType(captionType);
				if (result == null) result = caseInline(captionType);
				if (result == null) result = caseXMLTypeDocumentRoot(captionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.CITE_TYPE: {
				CiteType citeType = (CiteType)theEObject;
				T result = caseCiteType(citeType);
				if (result == null) result = caseInline(citeType);
				if (result == null) result = caseXMLTypeDocumentRoot(citeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.CODE_TYPE: {
				CodeType codeType = (CodeType)theEObject;
				T result = caseCodeType(codeType);
				if (result == null) result = caseInline(codeType);
				if (result == null) result = caseXMLTypeDocumentRoot(codeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.COLGROUP_TYPE: {
				ColgroupType colgroupType = (ColgroupType)theEObject;
				T result = caseColgroupType(colgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.COL_TYPE: {
				ColType colType = (ColType)theEObject;
				T result = caseColType(colType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DD_TYPE: {
				DdType ddType = (DdType)theEObject;
				T result = caseDdType(ddType);
				if (result == null) result = caseFlow(ddType);
				if (result == null) result = caseXMLTypeDocumentRoot(ddType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DEL_TYPE: {
				DelType delType = (DelType)theEObject;
				T result = caseDelType(delType);
				if (result == null) result = caseFlow(delType);
				if (result == null) result = caseXMLTypeDocumentRoot(delType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DFN_TYPE: {
				DfnType dfnType = (DfnType)theEObject;
				T result = caseDfnType(dfnType);
				if (result == null) result = caseInline(dfnType);
				if (result == null) result = caseXMLTypeDocumentRoot(dfnType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DIV_TYPE: {
				DivType divType = (DivType)theEObject;
				T result = caseDivType(divType);
				if (result == null) result = caseFlow(divType);
				if (result == null) result = caseXMLTypeDocumentRoot(divType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DL_TYPE: {
				DlType dlType = (DlType)theEObject;
				T result = caseDlType(dlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.DT_TYPE: {
				DtType dtType = (DtType)theEObject;
				T result = caseDtType(dtType);
				if (result == null) result = caseInline(dtType);
				if (result == null) result = caseXMLTypeDocumentRoot(dtType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.EM_TYPE: {
				EmType emType = (EmType)theEObject;
				T result = caseEmType(emType);
				if (result == null) result = caseInline(emType);
				if (result == null) result = caseXMLTypeDocumentRoot(emType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.FIELDSET_TYPE: {
				FieldsetType fieldsetType = (FieldsetType)theEObject;
				T result = caseFieldsetType(fieldsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.FLOW: {
				Flow flow = (Flow)theEObject;
				T result = caseFlow(flow);
				if (result == null) result = caseXMLTypeDocumentRoot(flow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.FORM_CONTENT: {
				FormContent formContent = (FormContent)theEObject;
				T result = caseFormContent(formContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.FORM_TYPE: {
				FormType formType = (FormType)theEObject;
				T result = caseFormType(formType);
				if (result == null) result = caseFormContent(formType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H1_TYPE: {
				H1Type h1Type = (H1Type)theEObject;
				T result = caseH1Type(h1Type);
				if (result == null) result = caseInline(h1Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H2_TYPE: {
				H2Type h2Type = (H2Type)theEObject;
				T result = caseH2Type(h2Type);
				if (result == null) result = caseInline(h2Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h2Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H3_TYPE: {
				H3Type h3Type = (H3Type)theEObject;
				T result = caseH3Type(h3Type);
				if (result == null) result = caseInline(h3Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h3Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H4_TYPE: {
				H4Type h4Type = (H4Type)theEObject;
				T result = caseH4Type(h4Type);
				if (result == null) result = caseInline(h4Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h4Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H5_TYPE: {
				H5Type h5Type = (H5Type)theEObject;
				T result = caseH5Type(h5Type);
				if (result == null) result = caseInline(h5Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h5Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.H6_TYPE: {
				H6Type h6Type = (H6Type)theEObject;
				T result = caseH6Type(h6Type);
				if (result == null) result = caseInline(h6Type);
				if (result == null) result = caseXMLTypeDocumentRoot(h6Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.HEAD_TYPE: {
				HeadType headType = (HeadType)theEObject;
				T result = caseHeadType(headType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.HR_TYPE: {
				HrType hrType = (HrType)theEObject;
				T result = caseHrType(hrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.HTML_TYPE: {
				HtmlType htmlType = (HtmlType)theEObject;
				T result = caseHtmlType(htmlType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.IMG_TYPE: {
				ImgType imgType = (ImgType)theEObject;
				T result = caseImgType(imgType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.INLINE: {
				Inline inline = (Inline)theEObject;
				T result = caseInline(inline);
				if (result == null) result = caseXMLTypeDocumentRoot(inline);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.INPUT_TYPE1: {
				InputType1 inputType1 = (InputType1)theEObject;
				T result = caseInputType1(inputType1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.INS_TYPE: {
				InsType insType = (InsType)theEObject;
				T result = caseInsType(insType);
				if (result == null) result = caseFlow(insType);
				if (result == null) result = caseXMLTypeDocumentRoot(insType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.ITYPE: {
				IType iType = (IType)theEObject;
				T result = caseIType(iType);
				if (result == null) result = caseInline(iType);
				if (result == null) result = caseXMLTypeDocumentRoot(iType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.KBD_TYPE: {
				KbdType kbdType = (KbdType)theEObject;
				T result = caseKbdType(kbdType);
				if (result == null) result = caseInline(kbdType);
				if (result == null) result = caseXMLTypeDocumentRoot(kbdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.LABEL_TYPE: {
				LabelType labelType = (LabelType)theEObject;
				T result = caseLabelType(labelType);
				if (result == null) result = caseInline(labelType);
				if (result == null) result = caseXMLTypeDocumentRoot(labelType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.LEGEND_TYPE: {
				LegendType legendType = (LegendType)theEObject;
				T result = caseLegendType(legendType);
				if (result == null) result = caseInline(legendType);
				if (result == null) result = caseXMLTypeDocumentRoot(legendType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.LI_TYPE: {
				LiType liType = (LiType)theEObject;
				T result = caseLiType(liType);
				if (result == null) result = caseFlow(liType);
				if (result == null) result = caseXMLTypeDocumentRoot(liType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.MAP_TYPE: {
				MapType mapType = (MapType)theEObject;
				T result = caseMapType(mapType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.META_TYPE: {
				MetaType metaType = (MetaType)theEObject;
				T result = caseMetaType(metaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.NOSCRIPT_TYPE: {
				NoscriptType noscriptType = (NoscriptType)theEObject;
				T result = caseNoscriptType(noscriptType);
				if (result == null) result = caseBlock(noscriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.OBJECT_TYPE: {
				ObjectType objectType = (ObjectType)theEObject;
				T result = caseObjectType(objectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.OL_TYPE: {
				OlType olType = (OlType)theEObject;
				T result = caseOlType(olType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.OPTGROUP_TYPE: {
				OptgroupType optgroupType = (OptgroupType)theEObject;
				T result = caseOptgroupType(optgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.OPTION_TYPE: {
				OptionType optionType = (OptionType)theEObject;
				T result = caseOptionType(optionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.PARAM_TYPE: {
				ParamType paramType = (ParamType)theEObject;
				T result = caseParamType(paramType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.PRE_CONTENT: {
				PreContent preContent = (PreContent)theEObject;
				T result = casePreContent(preContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.PRE_TYPE: {
				PreType preType = (PreType)theEObject;
				T result = casePreType(preType);
				if (result == null) result = casePreContent(preType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.PTYPE: {
				PType pType = (PType)theEObject;
				T result = casePType(pType);
				if (result == null) result = caseInline(pType);
				if (result == null) result = caseXMLTypeDocumentRoot(pType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.QTYPE: {
				QType qType = (QType)theEObject;
				T result = caseQType(qType);
				if (result == null) result = caseInline(qType);
				if (result == null) result = caseXMLTypeDocumentRoot(qType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SAMP_TYPE: {
				SampType sampType = (SampType)theEObject;
				T result = caseSampType(sampType);
				if (result == null) result = caseInline(sampType);
				if (result == null) result = caseXMLTypeDocumentRoot(sampType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SCRIPT_TYPE: {
				ScriptType scriptType = (ScriptType)theEObject;
				T result = caseScriptType(scriptType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SELECT_TYPE: {
				SelectType selectType = (SelectType)theEObject;
				T result = caseSelectType(selectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SMALL_TYPE: {
				SmallType smallType = (SmallType)theEObject;
				T result = caseSmallType(smallType);
				if (result == null) result = caseInline(smallType);
				if (result == null) result = caseXMLTypeDocumentRoot(smallType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SPAN_TYPE: {
				SpanType spanType = (SpanType)theEObject;
				T result = caseSpanType(spanType);
				if (result == null) result = caseInline(spanType);
				if (result == null) result = caseXMLTypeDocumentRoot(spanType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.STRONG_TYPE: {
				StrongType strongType = (StrongType)theEObject;
				T result = caseStrongType(strongType);
				if (result == null) result = caseInline(strongType);
				if (result == null) result = caseXMLTypeDocumentRoot(strongType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.STYLE_TYPE: {
				StyleType styleType = (StyleType)theEObject;
				T result = caseStyleType(styleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SUB_TYPE: {
				SubType subType = (SubType)theEObject;
				T result = caseSubType(subType);
				if (result == null) result = caseInline(subType);
				if (result == null) result = caseXMLTypeDocumentRoot(subType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.SUP_TYPE: {
				SupType supType = (SupType)theEObject;
				T result = caseSupType(supType);
				if (result == null) result = caseInline(supType);
				if (result == null) result = caseXMLTypeDocumentRoot(supType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TBODY_TYPE: {
				TbodyType tbodyType = (TbodyType)theEObject;
				T result = caseTbodyType(tbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TD_TYPE: {
				TdType tdType = (TdType)theEObject;
				T result = caseTdType(tdType);
				if (result == null) result = caseFlow(tdType);
				if (result == null) result = caseXMLTypeDocumentRoot(tdType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TEXTAREA_TYPE: {
				TextareaType textareaType = (TextareaType)theEObject;
				T result = caseTextareaType(textareaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TFOOT_TYPE: {
				TfootType tfootType = (TfootType)theEObject;
				T result = caseTfootType(tfootType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.THEAD_TYPE: {
				TheadType theadType = (TheadType)theEObject;
				T result = caseTheadType(theadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TH_TYPE: {
				ThType thType = (ThType)theEObject;
				T result = caseThType(thType);
				if (result == null) result = caseFlow(thType);
				if (result == null) result = caseXMLTypeDocumentRoot(thType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = caseXMLTypeDocumentRoot(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TR_TYPE: {
				TrType trType = (TrType)theEObject;
				T result = caseTrType(trType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.TT_TYPE: {
				TtType ttType = (TtType)theEObject;
				T result = caseTtType(ttType);
				if (result == null) result = caseInline(ttType);
				if (result == null) result = caseXMLTypeDocumentRoot(ttType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.UL_TYPE: {
				UlType ulType = (UlType)theEObject;
				T result = caseUlType(ulType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Xhtml1Package.VAR_TYPE: {
				VarType varType = (VarType)theEObject;
				T result = caseVarType(varType);
				if (result == null) result = caseInline(varType);
				if (result == null) result = caseXMLTypeDocumentRoot(varType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abbr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbbrType(AbbrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AContent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAContent(AContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Acronym Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcronymType(AcronymType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Area Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAreaType(AreaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>AType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>AType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAType(AType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Base Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Base Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBaseType(BaseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bdo Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bdo Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBdoType(BdoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Big Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Big Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBigType(BigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blockquote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockquoteType(BlockquoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Body Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBodyType(BodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Br Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Br Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBrType(BrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBType(BType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonContent(ButtonContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Button Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Button Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseButtonType(ButtonType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Caption Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCaptionType(CaptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cite Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cite Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCiteType(CiteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Code Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodeType(CodeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColgroupType(ColgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Col Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColType(ColType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDdType(DdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Del Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Del Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDelType(DelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dfn Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDfnType(DfnType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDivType(DivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dl Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dl Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDlType(DlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDtType(DtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Em Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Em Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmType(EmType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fieldset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fieldset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFieldsetType(FieldsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Flow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFlow(Flow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormContent(FormContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Form Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Form Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFormType(FormType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH1Type(H1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H2 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H2 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH2Type(H2Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H3 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H3 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH3Type(H3Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H4 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H4 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH4Type(H4Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H5 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H5 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH5Type(H5Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>H6 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>H6 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseH6Type(H6Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Head Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Head Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeadType(HeadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHrType(HrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Html Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Html Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHtmlType(HtmlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Img Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImgType(ImgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inline</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInline(Inline object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Type1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Type1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputType1(InputType1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ins Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ins Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsType(InsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIType(IType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kbd Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKbdType(KbdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabelType(LabelType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legend Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legend Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegendType(LegendType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Li Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Li Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiType(LiType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMapType(MapType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMetaType(MetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Noscript Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Noscript Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoscriptType(NoscriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Object Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObjectType(ObjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ol Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ol Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOlType(OlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptgroupType(OptgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionType(OptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Param Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamType(ParamType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreContent(PreContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pre Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pre Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePreType(PreType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>PType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>PType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePType(PType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QType</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QType</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQType(QType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Samp Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Samp Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSampType(SampType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptType(ScriptType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Select Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Select Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelectType(SelectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Small Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Small Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSmallType(SmallType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Span Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpanType(SpanType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Strong Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Strong Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStrongType(StrongType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Style Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStyleType(StyleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubType(SubType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSupType(SupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbodyType(TbodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Td Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTdType(TdType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Textarea Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTextareaType(TextareaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tfoot Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTfootType(TfootType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheadType(TheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Th Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseThType(ThType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrType(TrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tt Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tt Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTtType(TtType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ul Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ul Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUlType(UlType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarType(VarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLTypeDocumentRoot(XMLTypeDocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Xhtml1Switch
