/**
 */
package org.w3c.xhtml1.util;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;
import org.w3c.xhtml1.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.w3c.xhtml1.Xhtml1Package
 * @generated
 */
public class Xhtml1Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Xhtml1Validator INSTANCE = new Xhtml1Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.w3c.xhtml1";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml1Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Xhtml1Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Xhtml1Package.ABBR_TYPE:
				return validateAbbrType((AbbrType)value, diagnostics, context);
			case Xhtml1Package.ACONTENT:
				return validateAContent((AContent)value, diagnostics, context);
			case Xhtml1Package.ACRONYM_TYPE:
				return validateAcronymType((AcronymType)value, diagnostics, context);
			case Xhtml1Package.ADDRESS_TYPE:
				return validateAddressType((AddressType)value, diagnostics, context);
			case Xhtml1Package.AREA_TYPE:
				return validateAreaType((AreaType)value, diagnostics, context);
			case Xhtml1Package.ATYPE:
				return validateAType((AType)value, diagnostics, context);
			case Xhtml1Package.BASE_TYPE:
				return validateBaseType((BaseType)value, diagnostics, context);
			case Xhtml1Package.BDO_TYPE:
				return validateBdoType((BdoType)value, diagnostics, context);
			case Xhtml1Package.BIG_TYPE:
				return validateBigType((BigType)value, diagnostics, context);
			case Xhtml1Package.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case Xhtml1Package.BLOCKQUOTE_TYPE:
				return validateBlockquoteType((BlockquoteType)value, diagnostics, context);
			case Xhtml1Package.BODY_TYPE:
				return validateBodyType((BodyType)value, diagnostics, context);
			case Xhtml1Package.BR_TYPE:
				return validateBrType((BrType)value, diagnostics, context);
			case Xhtml1Package.BTYPE:
				return validateBType((BType)value, diagnostics, context);
			case Xhtml1Package.BUTTON_CONTENT:
				return validateButtonContent((ButtonContent)value, diagnostics, context);
			case Xhtml1Package.BUTTON_TYPE:
				return validateButtonType((ButtonType)value, diagnostics, context);
			case Xhtml1Package.CAPTION_TYPE:
				return validateCaptionType((CaptionType)value, diagnostics, context);
			case Xhtml1Package.CITE_TYPE:
				return validateCiteType((CiteType)value, diagnostics, context);
			case Xhtml1Package.CODE_TYPE:
				return validateCodeType((CodeType)value, diagnostics, context);
			case Xhtml1Package.COLGROUP_TYPE:
				return validateColgroupType((ColgroupType)value, diagnostics, context);
			case Xhtml1Package.COL_TYPE:
				return validateColType((ColType)value, diagnostics, context);
			case Xhtml1Package.DD_TYPE:
				return validateDdType((DdType)value, diagnostics, context);
			case Xhtml1Package.DEL_TYPE:
				return validateDelType((DelType)value, diagnostics, context);
			case Xhtml1Package.DFN_TYPE:
				return validateDfnType((DfnType)value, diagnostics, context);
			case Xhtml1Package.DIV_TYPE:
				return validateDivType((DivType)value, diagnostics, context);
			case Xhtml1Package.DL_TYPE:
				return validateDlType((DlType)value, diagnostics, context);
			case Xhtml1Package.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case Xhtml1Package.DT_TYPE:
				return validateDtType((DtType)value, diagnostics, context);
			case Xhtml1Package.EM_TYPE:
				return validateEmType((EmType)value, diagnostics, context);
			case Xhtml1Package.FIELDSET_TYPE:
				return validateFieldsetType((FieldsetType)value, diagnostics, context);
			case Xhtml1Package.FLOW:
				return validateFlow((Flow)value, diagnostics, context);
			case Xhtml1Package.FORM_CONTENT:
				return validateFormContent((FormContent)value, diagnostics, context);
			case Xhtml1Package.FORM_TYPE:
				return validateFormType((FormType)value, diagnostics, context);
			case Xhtml1Package.H1_TYPE:
				return validateH1Type((H1Type)value, diagnostics, context);
			case Xhtml1Package.H2_TYPE:
				return validateH2Type((H2Type)value, diagnostics, context);
			case Xhtml1Package.H3_TYPE:
				return validateH3Type((H3Type)value, diagnostics, context);
			case Xhtml1Package.H4_TYPE:
				return validateH4Type((H4Type)value, diagnostics, context);
			case Xhtml1Package.H5_TYPE:
				return validateH5Type((H5Type)value, diagnostics, context);
			case Xhtml1Package.H6_TYPE:
				return validateH6Type((H6Type)value, diagnostics, context);
			case Xhtml1Package.HEAD_TYPE:
				return validateHeadType((HeadType)value, diagnostics, context);
			case Xhtml1Package.HR_TYPE:
				return validateHrType((HrType)value, diagnostics, context);
			case Xhtml1Package.HTML_TYPE:
				return validateHtmlType((HtmlType)value, diagnostics, context);
			case Xhtml1Package.IMG_TYPE:
				return validateImgType((ImgType)value, diagnostics, context);
			case Xhtml1Package.INLINE:
				return validateInline((Inline)value, diagnostics, context);
			case Xhtml1Package.INPUT_TYPE1:
				return validateInputType1((InputType1)value, diagnostics, context);
			case Xhtml1Package.INS_TYPE:
				return validateInsType((InsType)value, diagnostics, context);
			case Xhtml1Package.ITYPE:
				return validateIType((IType)value, diagnostics, context);
			case Xhtml1Package.KBD_TYPE:
				return validateKbdType((KbdType)value, diagnostics, context);
			case Xhtml1Package.LABEL_TYPE:
				return validateLabelType((LabelType)value, diagnostics, context);
			case Xhtml1Package.LEGEND_TYPE:
				return validateLegendType((LegendType)value, diagnostics, context);
			case Xhtml1Package.LINK_TYPE:
				return validateLinkType((LinkType)value, diagnostics, context);
			case Xhtml1Package.LI_TYPE:
				return validateLiType((LiType)value, diagnostics, context);
			case Xhtml1Package.MAP_TYPE:
				return validateMapType((MapType)value, diagnostics, context);
			case Xhtml1Package.META_TYPE:
				return validateMetaType((MetaType)value, diagnostics, context);
			case Xhtml1Package.NOSCRIPT_TYPE:
				return validateNoscriptType((NoscriptType)value, diagnostics, context);
			case Xhtml1Package.OBJECT_TYPE:
				return validateObjectType((ObjectType)value, diagnostics, context);
			case Xhtml1Package.OL_TYPE:
				return validateOlType((OlType)value, diagnostics, context);
			case Xhtml1Package.OPTGROUP_TYPE:
				return validateOptgroupType((OptgroupType)value, diagnostics, context);
			case Xhtml1Package.OPTION_TYPE:
				return validateOptionType((OptionType)value, diagnostics, context);
			case Xhtml1Package.PARAM_TYPE:
				return validateParamType((ParamType)value, diagnostics, context);
			case Xhtml1Package.PRE_CONTENT:
				return validatePreContent((PreContent)value, diagnostics, context);
			case Xhtml1Package.PRE_TYPE:
				return validatePreType((PreType)value, diagnostics, context);
			case Xhtml1Package.PTYPE:
				return validatePType((PType)value, diagnostics, context);
			case Xhtml1Package.QTYPE:
				return validateQType((QType)value, diagnostics, context);
			case Xhtml1Package.SAMP_TYPE:
				return validateSampType((SampType)value, diagnostics, context);
			case Xhtml1Package.SCRIPT_TYPE:
				return validateScriptType((ScriptType)value, diagnostics, context);
			case Xhtml1Package.SELECT_TYPE:
				return validateSelectType((SelectType)value, diagnostics, context);
			case Xhtml1Package.SMALL_TYPE:
				return validateSmallType((SmallType)value, diagnostics, context);
			case Xhtml1Package.SPAN_TYPE:
				return validateSpanType((SpanType)value, diagnostics, context);
			case Xhtml1Package.STRONG_TYPE:
				return validateStrongType((StrongType)value, diagnostics, context);
			case Xhtml1Package.STYLE_TYPE:
				return validateStyleType((StyleType)value, diagnostics, context);
			case Xhtml1Package.SUB_TYPE:
				return validateSubType((SubType)value, diagnostics, context);
			case Xhtml1Package.SUP_TYPE:
				return validateSupType((SupType)value, diagnostics, context);
			case Xhtml1Package.TABLE_TYPE:
				return validateTableType((TableType)value, diagnostics, context);
			case Xhtml1Package.TBODY_TYPE:
				return validateTbodyType((TbodyType)value, diagnostics, context);
			case Xhtml1Package.TD_TYPE:
				return validateTdType((TdType)value, diagnostics, context);
			case Xhtml1Package.TEXTAREA_TYPE:
				return validateTextareaType((TextareaType)value, diagnostics, context);
			case Xhtml1Package.TFOOT_TYPE:
				return validateTfootType((TfootType)value, diagnostics, context);
			case Xhtml1Package.THEAD_TYPE:
				return validateTheadType((TheadType)value, diagnostics, context);
			case Xhtml1Package.TH_TYPE:
				return validateThType((ThType)value, diagnostics, context);
			case Xhtml1Package.TITLE_TYPE:
				return validateTitleType((TitleType)value, diagnostics, context);
			case Xhtml1Package.TR_TYPE:
				return validateTrType((TrType)value, diagnostics, context);
			case Xhtml1Package.TT_TYPE:
				return validateTtType((TtType)value, diagnostics, context);
			case Xhtml1Package.UL_TYPE:
				return validateUlType((UlType)value, diagnostics, context);
			case Xhtml1Package.VAR_TYPE:
				return validateVarType((VarType)value, diagnostics, context);
			case Xhtml1Package.ALIGN_TYPE:
				return validateAlignType((AlignType)value, diagnostics, context);
			case Xhtml1Package.CHECKED_TYPE:
				return validateCheckedType((CheckedType)value, diagnostics, context);
			case Xhtml1Package.DECLARE_TYPE:
				return validateDeclareType((DeclareType)value, diagnostics, context);
			case Xhtml1Package.DEFER_TYPE:
				return validateDeferType((DeferType)value, diagnostics, context);
			case Xhtml1Package.DIR_TYPE:
				return validateDirType((DirType)value, diagnostics, context);
			case Xhtml1Package.DIR_TYPE1:
				return validateDirType1((DirType1)value, diagnostics, context);
			case Xhtml1Package.DISABLED_TYPE:
				return validateDisabledType((DisabledType)value, diagnostics, context);
			case Xhtml1Package.INPUT_TYPE:
				return validateInputType((InputType)value, diagnostics, context);
			case Xhtml1Package.ISMAP_TYPE:
				return validateIsmapType((IsmapType)value, diagnostics, context);
			case Xhtml1Package.METHOD_TYPE:
				return validateMethodType((MethodType)value, diagnostics, context);
			case Xhtml1Package.MULTIPLE_TYPE:
				return validateMultipleType((MultipleType)value, diagnostics, context);
			case Xhtml1Package.NOHREF_TYPE:
				return validateNohrefType((NohrefType)value, diagnostics, context);
			case Xhtml1Package.READONLY_TYPE:
				return validateReadonlyType((ReadonlyType)value, diagnostics, context);
			case Xhtml1Package.READONLY_TYPE1:
				return validateReadonlyType1((ReadonlyType1)value, diagnostics, context);
			case Xhtml1Package.SCOPE:
				return validateScope((Scope)value, diagnostics, context);
			case Xhtml1Package.SELECTED_TYPE:
				return validateSelectedType((SelectedType)value, diagnostics, context);
			case Xhtml1Package.SHAPE:
				return validateShape((Shape)value, diagnostics, context);
			case Xhtml1Package.TFRAME:
				return validateTFrame((TFrame)value, diagnostics, context);
			case Xhtml1Package.TRULES:
				return validateTRules((TRules)value, diagnostics, context);
			case Xhtml1Package.TYPE_TYPE:
				return validateTypeType((TypeType)value, diagnostics, context);
			case Xhtml1Package.VALIGN_TYPE:
				return validateValignType((ValignType)value, diagnostics, context);
			case Xhtml1Package.VALUETYPE_TYPE:
				return validateValuetypeType((ValuetypeType)value, diagnostics, context);
			case Xhtml1Package.ALIGN_TYPE_OBJECT:
				return validateAlignTypeObject((AlignType)value, diagnostics, context);
			case Xhtml1Package.CHARACTER:
				return validateCharacter((String)value, diagnostics, context);
			case Xhtml1Package.CHARSET:
				return validateCharset((String)value, diagnostics, context);
			case Xhtml1Package.CHARSETS:
				return validateCharsets((String)value, diagnostics, context);
			case Xhtml1Package.CHECKED_TYPE_OBJECT:
				return validateCheckedTypeObject((CheckedType)value, diagnostics, context);
			case Xhtml1Package.CONTENT_TYPE:
				return validateContentType((String)value, diagnostics, context);
			case Xhtml1Package.CONTENT_TYPES:
				return validateContentTypes((String)value, diagnostics, context);
			case Xhtml1Package.COORDS:
				return validateCoords((String)value, diagnostics, context);
			case Xhtml1Package.DATETIME:
				return validateDatetime((XMLGregorianCalendar)value, diagnostics, context);
			case Xhtml1Package.DECLARE_TYPE_OBJECT:
				return validateDeclareTypeObject((DeclareType)value, diagnostics, context);
			case Xhtml1Package.DEFER_TYPE_OBJECT:
				return validateDeferTypeObject((DeferType)value, diagnostics, context);
			case Xhtml1Package.DIR_TYPE_OBJECT:
				return validateDirTypeObject((DirType)value, diagnostics, context);
			case Xhtml1Package.DIR_TYPE_OBJECT1:
				return validateDirTypeObject1((DirType1)value, diagnostics, context);
			case Xhtml1Package.DISABLED_TYPE_OBJECT:
				return validateDisabledTypeObject((Enumerator)value, diagnostics, context);
			case Xhtml1Package.INPUT_TYPE_OBJECT:
				return validateInputTypeObject((InputType)value, diagnostics, context);
			case Xhtml1Package.ISMAP_TYPE_OBJECT:
				return validateIsmapTypeObject((IsmapType)value, diagnostics, context);
			case Xhtml1Package.LANGUAGE_CODE:
				return validateLanguageCode((String)value, diagnostics, context);
			case Xhtml1Package.LENGTH:
				return validateLength((String)value, diagnostics, context);
			case Xhtml1Package.LINK_TYPES:
				return validateLinkTypes((List<?>)value, diagnostics, context);
			case Xhtml1Package.MEDIA_DESC:
				return validateMediaDesc((String)value, diagnostics, context);
			case Xhtml1Package.METHOD_TYPE_OBJECT:
				return validateMethodTypeObject((MethodType)value, diagnostics, context);
			case Xhtml1Package.MULTI_LENGTH:
				return validateMultiLength((String)value, diagnostics, context);
			case Xhtml1Package.MULTIPLE_TYPE_OBJECT:
				return validateMultipleTypeObject((MultipleType)value, diagnostics, context);
			case Xhtml1Package.NOHREF_TYPE_OBJECT:
				return validateNohrefTypeObject((NohrefType)value, diagnostics, context);
			case Xhtml1Package.NUMBER:
				return validateNumber((BigInteger)value, diagnostics, context);
			case Xhtml1Package.PIXELS:
				return validatePixels((BigInteger)value, diagnostics, context);
			case Xhtml1Package.READONLY_TYPE_OBJECT:
				return validateReadonlyTypeObject((ReadonlyType)value, diagnostics, context);
			case Xhtml1Package.READONLY_TYPE_OBJECT1:
				return validateReadonlyTypeObject1((ReadonlyType1)value, diagnostics, context);
			case Xhtml1Package.SCOPE_OBJECT:
				return validateScopeObject((Scope)value, diagnostics, context);
			case Xhtml1Package.SCRIPT:
				return validateScript((String)value, diagnostics, context);
			case Xhtml1Package.SELECTED_TYPE_OBJECT:
				return validateSelectedTypeObject((SelectedType)value, diagnostics, context);
			case Xhtml1Package.SHAPE_OBJECT:
				return validateShapeObject((Shape)value, diagnostics, context);
			case Xhtml1Package.STYLE_SHEET:
				return validateStyleSheet((String)value, diagnostics, context);
			case Xhtml1Package.TABINDEX_NUMBER:
				return validateTabindexNumber((BigInteger)value, diagnostics, context);
			case Xhtml1Package.TEXT:
				return validateText((String)value, diagnostics, context);
			case Xhtml1Package.TFRAME_OBJECT:
				return validateTFrameObject((TFrame)value, diagnostics, context);
			case Xhtml1Package.TRULES_OBJECT:
				return validateTRulesObject((TRules)value, diagnostics, context);
			case Xhtml1Package.TYPE_TYPE_OBJECT:
				return validateTypeTypeObject((TypeType)value, diagnostics, context);
			case Xhtml1Package.URI:
				return validateURI((String)value, diagnostics, context);
			case Xhtml1Package.URI_LIST:
				return validateUriList((String)value, diagnostics, context);
			case Xhtml1Package.VALIGN_TYPE_OBJECT:
				return validateValignTypeObject((ValignType)value, diagnostics, context);
			case Xhtml1Package.VALUETYPE_TYPE_OBJECT:
				return validateValuetypeTypeObject((ValuetypeType)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAbbrType(AbbrType abbrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(abbrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAContent(AContent aContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAcronymType(AcronymType acronymType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(acronymType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAddressType(AddressType addressType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(addressType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAreaType(AreaType areaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(areaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAType(AType aType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(aType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBaseType(BaseType baseType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(baseType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBdoType(BdoType bdoType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bdoType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBigType(BigType bigType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlockquoteType(BlockquoteType blockquoteType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(blockquoteType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBodyType(BodyType bodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBrType(BrType brType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(brType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBType(BType bType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonContent(ButtonContent buttonContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateButtonType(ButtonType buttonType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(buttonType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCaptionType(CaptionType captionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(captionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCiteType(CiteType citeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(citeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCodeType(CodeType codeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(codeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColgroupType(ColgroupType colgroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colgroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateColType(ColType colType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(colType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDdType(DdType ddType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ddType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDelType(DelType delType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(delType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDfnType(DfnType dfnType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dfnType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDivType(DivType divType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(divType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDlType(DlType dlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDtType(DtType dtType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dtType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEmType(EmType emType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(emType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFieldsetType(FieldsetType fieldsetType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(fieldsetType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFlow(Flow flow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(flow, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormContent(FormContent formContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFormType(FormType formType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(formType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH1Type(H1Type h1Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h1Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH2Type(H2Type h2Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h2Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH3Type(H3Type h3Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h3Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH4Type(H4Type h4Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h4Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH5Type(H5Type h5Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h5Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateH6Type(H6Type h6Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(h6Type, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeadType(HeadType headType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(headType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHrType(HrType hrType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hrType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHtmlType(HtmlType htmlType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(htmlType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateImgType(ImgType imgType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(imgType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInline(Inline inline, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inline, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType1(InputType1 inputType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inputType1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsType(InsType insType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIType(IType iType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(iType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKbdType(KbdType kbdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kbdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLabelType(LabelType labelType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(labelType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLegendType(LegendType legendType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(legendType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkType(LinkType linkType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(linkType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLiType(LiType liType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(liType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMapType(MapType mapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mapType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMetaType(MetaType metaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(metaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNoscriptType(NoscriptType noscriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(noscriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateObjectType(ObjectType objectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(objectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOlType(OlType olType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(olType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptgroupType(OptgroupType optgroupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optgroupType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionType(OptionType optionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamType(ParamType paramType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreContent(PreContent preContent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preContent, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePreType(PreType preType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(preType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePType(PType pType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQType(QType qType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(qType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSampType(SampType sampType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sampType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScriptType(ScriptType scriptType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(scriptType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectType(SelectType selectType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(selectType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSmallType(SmallType smallType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(smallType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpanType(SpanType spanType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(spanType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrongType(StrongType strongType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strongType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleType(StyleType styleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSubType(SubType subType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(subType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSupType(SupType supType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(supType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTableType(TableType tableType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tableType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTbodyType(TbodyType tbodyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tbodyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTdType(TdType tdType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tdType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTextareaType(TextareaType textareaType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(textareaType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTfootType(TfootType tfootType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tfootType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTheadType(TheadType theadType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(theadType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateThType(ThType thType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTitleType(TitleType titleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(titleType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrType(TrType trType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(trType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTtType(TtType ttType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ttType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUlType(UlType ulType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ulType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVarType(VarType varType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(varType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignType(AlignType alignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckedType(CheckedType checkedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclareType(DeclareType declareType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeferType(DeferType deferType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType(DirType dirType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirType1(DirType1 dirType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabledType(DisabledType disabledType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputType(InputType inputType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsmapType(IsmapType ismapType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodType(MethodType methodType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleType(MultipleType multipleType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNohrefType(NohrefType nohrefType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadonlyType(ReadonlyType readonlyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadonlyType1(ReadonlyType1 readonlyType1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScope(Scope scope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectedType(SelectedType selectedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShape(Shape shape, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFrame(TFrame tFrame, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRules(TRules tRules, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeType(TypeType typeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValignType(ValignType valignType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuetypeType(ValuetypeType valuetypeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAlignTypeObject(AlignType alignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCharacter_MinLength(character, diagnostics, context);
		if (result || diagnostics != null) result &= validateCharacter_MaxLength(character, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MinLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MinLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length >= 1;
		if (!result && diagnostics != null)
			reportMinLengthViolation(Xhtml1Package.eINSTANCE.getCharacter(), character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * Validates the MaxLength constraint of '<em>Character</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharacter_MaxLength(String character, DiagnosticChain diagnostics, Map<Object, Object> context) {
		int length = character.length();
		boolean result = length <= 1;
		if (!result && diagnostics != null)
			reportMaxLengthViolation(Xhtml1Package.eINSTANCE.getCharacter(), character, length, 1, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharset(String charset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharsets(String charsets, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCheckedTypeObject(CheckedType checkedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentType(String contentType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContentTypes(String contentTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoords(String coords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateCoords_Pattern(coords, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateCoords_Pattern
	 */
	public static final  PatternMatcher [][] COORDS__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[-+]?(\\d+|\\d+(\\.\\d+)?%)(,\\s*[-+]?(\\d+|\\d+(\\.\\d+)?%))*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Coords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoords_Pattern(String coords, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Xhtml1Package.eINSTANCE.getCoords(), coords, COORDS__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDatetime(XMLGregorianCalendar datetime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeclareTypeObject(DeclareType declareTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDeferTypeObject(DeferType deferTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirTypeObject(DirType dirTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDirTypeObject1(DirType1 dirTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDisabledTypeObject(Enumerator disabledTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInputTypeObject(InputType inputTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIsmapTypeObject(IsmapType ismapTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLanguageCode(String languageCode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateLanguage_Pattern(languageCode, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateLength_Pattern(length, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateLength_Pattern
	 */
	public static final  PatternMatcher [][] LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[-+]?(\\d+|\\d+(\\.\\d+)?%)")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLength_Pattern(String length, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Xhtml1Package.eINSTANCE.getLength(), length, LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLinkTypes(List<?> linkTypes, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNMTOKENS_MinLength(linkTypes, diagnostics, context);
		if (result || diagnostics != null) result &= xmlTypeValidator.validateNMTOKENSBase_ItemType(linkTypes, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaDesc(String mediaDesc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMediaDesc_Pattern(mediaDesc, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMediaDesc_Pattern
	 */
	public static final  PatternMatcher [][] MEDIA_DESC__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[^,]+(,\\s*[^,]+)*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Media Desc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMediaDesc_Pattern(String mediaDesc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Xhtml1Package.eINSTANCE.getMediaDesc(), mediaDesc, MEDIA_DESC__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMethodTypeObject(MethodType methodTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength(String multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateMultiLength_Pattern(multiLength, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateMultiLength_Pattern
	 */
	public static final  PatternMatcher [][] MULTI_LENGTH__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[-+]?(\\d+|\\d+(\\.\\d+)?%)|[1-9]?(\\d+)?\\*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Multi Length</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultiLength_Pattern(String multiLength, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Xhtml1Package.eINSTANCE.getMultiLength(), multiLength, MULTI_LENGTH__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMultipleTypeObject(MultipleType multipleTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNohrefTypeObject(NohrefType nohrefTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(number, diagnostics, context);
		if (result || diagnostics != null) result &= validateNumber_Pattern(number, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateNumber_Pattern
	 */
	public static final  PatternMatcher [][] NUMBER__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("[0-9]+")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumber_Pattern(BigInteger number, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Xhtml1Package.eINSTANCE.getNumber(), number, NUMBER__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePixels(BigInteger pixels, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = xmlTypeValidator.validateNonNegativeInteger_Min(pixels, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadonlyTypeObject(ReadonlyType readonlyTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReadonlyTypeObject1(ReadonlyType1 readonlyTypeObject1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScopeObject(Scope scopeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateScript(String script, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSelectedTypeObject(SelectedType selectedTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateShapeObject(Shape shapeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyleSheet(String styleSheet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabindexNumber(BigInteger tabindexNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateNumber_Pattern(tabindexNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabindexNumber_Min(tabindexNumber, diagnostics, context);
		if (result || diagnostics != null) result &= validateTabindexNumber_Max(tabindexNumber, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTabindexNumber_Min
	 */
	public static final BigInteger TABINDEX_NUMBER__MIN__VALUE = new BigInteger("0");

	/**
	 * Validates the Min constraint of '<em>Tabindex Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabindexNumber_Min(BigInteger tabindexNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tabindexNumber.compareTo(TABINDEX_NUMBER__MIN__VALUE) >= 0;
		if (!result && diagnostics != null)
			reportMinViolation(Xhtml1Package.eINSTANCE.getTabindexNumber(), tabindexNumber, TABINDEX_NUMBER__MIN__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTabindexNumber_Max
	 */
	public static final BigInteger TABINDEX_NUMBER__MAX__VALUE = new BigInteger("32767");

	/**
	 * Validates the Max constraint of '<em>Tabindex Number</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTabindexNumber_Max(BigInteger tabindexNumber, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = tabindexNumber.compareTo(TABINDEX_NUMBER__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(Xhtml1Package.eINSTANCE.getTabindexNumber(), tabindexNumber, TABINDEX_NUMBER__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateText(String text, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTFrameObject(TFrame tFrameObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTRulesObject(TRules tRulesObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTypeTypeObject(TypeType typeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateURI(String uri, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUriList(String uriList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValignTypeObject(ValignType valignTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValuetypeTypeObject(ValuetypeType valuetypeTypeObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Xhtml1Validator
