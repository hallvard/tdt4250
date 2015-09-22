/**
 */
package org.w3c.xhtml1.impl;

import java.math.BigInteger;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;
import org.w3c.xhtml1.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Xhtml1FactoryImpl extends EFactoryImpl implements Xhtml1Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Xhtml1Factory init() {
		try {
			Xhtml1Factory theXhtml1Factory = (Xhtml1Factory)EPackage.Registry.INSTANCE.getEFactory(Xhtml1Package.eNS_URI);
			if (theXhtml1Factory != null) {
				return theXhtml1Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Xhtml1FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml1FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Xhtml1Package.ABBR_TYPE: return createAbbrType();
			case Xhtml1Package.ACONTENT: return createAContent();
			case Xhtml1Package.ACRONYM_TYPE: return createAcronymType();
			case Xhtml1Package.ADDRESS_TYPE: return createAddressType();
			case Xhtml1Package.AREA_TYPE: return createAreaType();
			case Xhtml1Package.ATYPE: return createAType();
			case Xhtml1Package.BASE_TYPE: return createBaseType();
			case Xhtml1Package.BDO_TYPE: return createBdoType();
			case Xhtml1Package.BIG_TYPE: return createBigType();
			case Xhtml1Package.BLOCK: return createBlock();
			case Xhtml1Package.BLOCKQUOTE_TYPE: return createBlockquoteType();
			case Xhtml1Package.BODY_TYPE: return createBodyType();
			case Xhtml1Package.BR_TYPE: return createBrType();
			case Xhtml1Package.BTYPE: return createBType();
			case Xhtml1Package.BUTTON_CONTENT: return createButtonContent();
			case Xhtml1Package.BUTTON_TYPE: return createButtonType();
			case Xhtml1Package.CAPTION_TYPE: return createCaptionType();
			case Xhtml1Package.CITE_TYPE: return createCiteType();
			case Xhtml1Package.CODE_TYPE: return createCodeType();
			case Xhtml1Package.COLGROUP_TYPE: return createColgroupType();
			case Xhtml1Package.COL_TYPE: return createColType();
			case Xhtml1Package.DD_TYPE: return createDdType();
			case Xhtml1Package.DEL_TYPE: return createDelType();
			case Xhtml1Package.DFN_TYPE: return createDfnType();
			case Xhtml1Package.DIV_TYPE: return createDivType();
			case Xhtml1Package.DL_TYPE: return createDlType();
			case Xhtml1Package.DOCUMENT_ROOT: return createDocumentRoot();
			case Xhtml1Package.DT_TYPE: return createDtType();
			case Xhtml1Package.EM_TYPE: return createEmType();
			case Xhtml1Package.FIELDSET_TYPE: return createFieldsetType();
			case Xhtml1Package.FLOW: return createFlow();
			case Xhtml1Package.FORM_CONTENT: return createFormContent();
			case Xhtml1Package.FORM_TYPE: return createFormType();
			case Xhtml1Package.H1_TYPE: return createH1Type();
			case Xhtml1Package.H2_TYPE: return createH2Type();
			case Xhtml1Package.H3_TYPE: return createH3Type();
			case Xhtml1Package.H4_TYPE: return createH4Type();
			case Xhtml1Package.H5_TYPE: return createH5Type();
			case Xhtml1Package.H6_TYPE: return createH6Type();
			case Xhtml1Package.HEAD_TYPE: return createHeadType();
			case Xhtml1Package.HR_TYPE: return createHrType();
			case Xhtml1Package.HTML_TYPE: return createHtmlType();
			case Xhtml1Package.IMG_TYPE: return createImgType();
			case Xhtml1Package.INLINE: return createInline();
			case Xhtml1Package.INPUT_TYPE1: return createInputType1();
			case Xhtml1Package.INS_TYPE: return createInsType();
			case Xhtml1Package.ITYPE: return createIType();
			case Xhtml1Package.KBD_TYPE: return createKbdType();
			case Xhtml1Package.LABEL_TYPE: return createLabelType();
			case Xhtml1Package.LEGEND_TYPE: return createLegendType();
			case Xhtml1Package.LINK_TYPE: return createLinkType();
			case Xhtml1Package.LI_TYPE: return createLiType();
			case Xhtml1Package.MAP_TYPE: return createMapType();
			case Xhtml1Package.META_TYPE: return createMetaType();
			case Xhtml1Package.NOSCRIPT_TYPE: return createNoscriptType();
			case Xhtml1Package.OBJECT_TYPE: return createObjectType();
			case Xhtml1Package.OL_TYPE: return createOlType();
			case Xhtml1Package.OPTGROUP_TYPE: return createOptgroupType();
			case Xhtml1Package.OPTION_TYPE: return createOptionType();
			case Xhtml1Package.PARAM_TYPE: return createParamType();
			case Xhtml1Package.PRE_CONTENT: return createPreContent();
			case Xhtml1Package.PRE_TYPE: return createPreType();
			case Xhtml1Package.PTYPE: return createPType();
			case Xhtml1Package.QTYPE: return createQType();
			case Xhtml1Package.SAMP_TYPE: return createSampType();
			case Xhtml1Package.SCRIPT_TYPE: return createScriptType();
			case Xhtml1Package.SELECT_TYPE: return createSelectType();
			case Xhtml1Package.SMALL_TYPE: return createSmallType();
			case Xhtml1Package.SPAN_TYPE: return createSpanType();
			case Xhtml1Package.STRONG_TYPE: return createStrongType();
			case Xhtml1Package.STYLE_TYPE: return createStyleType();
			case Xhtml1Package.SUB_TYPE: return createSubType();
			case Xhtml1Package.SUP_TYPE: return createSupType();
			case Xhtml1Package.TABLE_TYPE: return createTableType();
			case Xhtml1Package.TBODY_TYPE: return createTbodyType();
			case Xhtml1Package.TD_TYPE: return createTdType();
			case Xhtml1Package.TEXTAREA_TYPE: return createTextareaType();
			case Xhtml1Package.TFOOT_TYPE: return createTfootType();
			case Xhtml1Package.THEAD_TYPE: return createTheadType();
			case Xhtml1Package.TH_TYPE: return createThType();
			case Xhtml1Package.TITLE_TYPE: return createTitleType();
			case Xhtml1Package.TR_TYPE: return createTrType();
			case Xhtml1Package.TT_TYPE: return createTtType();
			case Xhtml1Package.UL_TYPE: return createUlType();
			case Xhtml1Package.VAR_TYPE: return createVarType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Xhtml1Package.ALIGN_TYPE:
				return createAlignTypeFromString(eDataType, initialValue);
			case Xhtml1Package.CHECKED_TYPE:
				return createCheckedTypeFromString(eDataType, initialValue);
			case Xhtml1Package.DECLARE_TYPE:
				return createDeclareTypeFromString(eDataType, initialValue);
			case Xhtml1Package.DEFER_TYPE:
				return createDeferTypeFromString(eDataType, initialValue);
			case Xhtml1Package.DIR_TYPE:
				return createDirTypeFromString(eDataType, initialValue);
			case Xhtml1Package.DIR_TYPE1:
				return createDirType1FromString(eDataType, initialValue);
			case Xhtml1Package.DISABLED_TYPE:
				return createDisabledTypeFromString(eDataType, initialValue);
			case Xhtml1Package.INPUT_TYPE:
				return createInputTypeFromString(eDataType, initialValue);
			case Xhtml1Package.ISMAP_TYPE:
				return createIsmapTypeFromString(eDataType, initialValue);
			case Xhtml1Package.METHOD_TYPE:
				return createMethodTypeFromString(eDataType, initialValue);
			case Xhtml1Package.MULTIPLE_TYPE:
				return createMultipleTypeFromString(eDataType, initialValue);
			case Xhtml1Package.NOHREF_TYPE:
				return createNohrefTypeFromString(eDataType, initialValue);
			case Xhtml1Package.READONLY_TYPE:
				return createReadonlyTypeFromString(eDataType, initialValue);
			case Xhtml1Package.READONLY_TYPE1:
				return createReadonlyType1FromString(eDataType, initialValue);
			case Xhtml1Package.SCOPE:
				return createScopeFromString(eDataType, initialValue);
			case Xhtml1Package.SELECTED_TYPE:
				return createSelectedTypeFromString(eDataType, initialValue);
			case Xhtml1Package.SHAPE:
				return createShapeFromString(eDataType, initialValue);
			case Xhtml1Package.TFRAME:
				return createTFrameFromString(eDataType, initialValue);
			case Xhtml1Package.TRULES:
				return createTRulesFromString(eDataType, initialValue);
			case Xhtml1Package.TYPE_TYPE:
				return createTypeTypeFromString(eDataType, initialValue);
			case Xhtml1Package.VALIGN_TYPE:
				return createValignTypeFromString(eDataType, initialValue);
			case Xhtml1Package.VALUETYPE_TYPE:
				return createValuetypeTypeFromString(eDataType, initialValue);
			case Xhtml1Package.ALIGN_TYPE_OBJECT:
				return createAlignTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.CHARACTER:
				return createCharacterFromString(eDataType, initialValue);
			case Xhtml1Package.CHARSET:
				return createCharsetFromString(eDataType, initialValue);
			case Xhtml1Package.CHARSETS:
				return createCharsetsFromString(eDataType, initialValue);
			case Xhtml1Package.CHECKED_TYPE_OBJECT:
				return createCheckedTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.CONTENT_TYPE:
				return createContentTypeFromString(eDataType, initialValue);
			case Xhtml1Package.CONTENT_TYPES:
				return createContentTypesFromString(eDataType, initialValue);
			case Xhtml1Package.COORDS:
				return createCoordsFromString(eDataType, initialValue);
			case Xhtml1Package.DATETIME:
				return createDatetimeFromString(eDataType, initialValue);
			case Xhtml1Package.DECLARE_TYPE_OBJECT:
				return createDeclareTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.DEFER_TYPE_OBJECT:
				return createDeferTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.DIR_TYPE_OBJECT:
				return createDirTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.DIR_TYPE_OBJECT1:
				return createDirTypeObject1FromString(eDataType, initialValue);
			case Xhtml1Package.DISABLED_TYPE_OBJECT:
				return createDisabledTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.INPUT_TYPE_OBJECT:
				return createInputTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.ISMAP_TYPE_OBJECT:
				return createIsmapTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.LANGUAGE_CODE:
				return createLanguageCodeFromString(eDataType, initialValue);
			case Xhtml1Package.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case Xhtml1Package.LINK_TYPES:
				return createLinkTypesFromString(eDataType, initialValue);
			case Xhtml1Package.MEDIA_DESC:
				return createMediaDescFromString(eDataType, initialValue);
			case Xhtml1Package.METHOD_TYPE_OBJECT:
				return createMethodTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.MULTI_LENGTH:
				return createMultiLengthFromString(eDataType, initialValue);
			case Xhtml1Package.MULTIPLE_TYPE_OBJECT:
				return createMultipleTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.NOHREF_TYPE_OBJECT:
				return createNohrefTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.NUMBER:
				return createNumberFromString(eDataType, initialValue);
			case Xhtml1Package.PIXELS:
				return createPixelsFromString(eDataType, initialValue);
			case Xhtml1Package.READONLY_TYPE_OBJECT:
				return createReadonlyTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.READONLY_TYPE_OBJECT1:
				return createReadonlyTypeObject1FromString(eDataType, initialValue);
			case Xhtml1Package.SCOPE_OBJECT:
				return createScopeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.SCRIPT:
				return createScriptFromString(eDataType, initialValue);
			case Xhtml1Package.SELECTED_TYPE_OBJECT:
				return createSelectedTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.SHAPE_OBJECT:
				return createShapeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.STYLE_SHEET:
				return createStyleSheetFromString(eDataType, initialValue);
			case Xhtml1Package.TABINDEX_NUMBER:
				return createTabindexNumberFromString(eDataType, initialValue);
			case Xhtml1Package.TEXT:
				return createTextFromString(eDataType, initialValue);
			case Xhtml1Package.TFRAME_OBJECT:
				return createTFrameObjectFromString(eDataType, initialValue);
			case Xhtml1Package.TRULES_OBJECT:
				return createTRulesObjectFromString(eDataType, initialValue);
			case Xhtml1Package.TYPE_TYPE_OBJECT:
				return createTypeTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.URI:
				return createURIFromString(eDataType, initialValue);
			case Xhtml1Package.URI_LIST:
				return createUriListFromString(eDataType, initialValue);
			case Xhtml1Package.VALIGN_TYPE_OBJECT:
				return createValignTypeObjectFromString(eDataType, initialValue);
			case Xhtml1Package.VALUETYPE_TYPE_OBJECT:
				return createValuetypeTypeObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Xhtml1Package.ALIGN_TYPE:
				return convertAlignTypeToString(eDataType, instanceValue);
			case Xhtml1Package.CHECKED_TYPE:
				return convertCheckedTypeToString(eDataType, instanceValue);
			case Xhtml1Package.DECLARE_TYPE:
				return convertDeclareTypeToString(eDataType, instanceValue);
			case Xhtml1Package.DEFER_TYPE:
				return convertDeferTypeToString(eDataType, instanceValue);
			case Xhtml1Package.DIR_TYPE:
				return convertDirTypeToString(eDataType, instanceValue);
			case Xhtml1Package.DIR_TYPE1:
				return convertDirType1ToString(eDataType, instanceValue);
			case Xhtml1Package.DISABLED_TYPE:
				return convertDisabledTypeToString(eDataType, instanceValue);
			case Xhtml1Package.INPUT_TYPE:
				return convertInputTypeToString(eDataType, instanceValue);
			case Xhtml1Package.ISMAP_TYPE:
				return convertIsmapTypeToString(eDataType, instanceValue);
			case Xhtml1Package.METHOD_TYPE:
				return convertMethodTypeToString(eDataType, instanceValue);
			case Xhtml1Package.MULTIPLE_TYPE:
				return convertMultipleTypeToString(eDataType, instanceValue);
			case Xhtml1Package.NOHREF_TYPE:
				return convertNohrefTypeToString(eDataType, instanceValue);
			case Xhtml1Package.READONLY_TYPE:
				return convertReadonlyTypeToString(eDataType, instanceValue);
			case Xhtml1Package.READONLY_TYPE1:
				return convertReadonlyType1ToString(eDataType, instanceValue);
			case Xhtml1Package.SCOPE:
				return convertScopeToString(eDataType, instanceValue);
			case Xhtml1Package.SELECTED_TYPE:
				return convertSelectedTypeToString(eDataType, instanceValue);
			case Xhtml1Package.SHAPE:
				return convertShapeToString(eDataType, instanceValue);
			case Xhtml1Package.TFRAME:
				return convertTFrameToString(eDataType, instanceValue);
			case Xhtml1Package.TRULES:
				return convertTRulesToString(eDataType, instanceValue);
			case Xhtml1Package.TYPE_TYPE:
				return convertTypeTypeToString(eDataType, instanceValue);
			case Xhtml1Package.VALIGN_TYPE:
				return convertValignTypeToString(eDataType, instanceValue);
			case Xhtml1Package.VALUETYPE_TYPE:
				return convertValuetypeTypeToString(eDataType, instanceValue);
			case Xhtml1Package.ALIGN_TYPE_OBJECT:
				return convertAlignTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.CHARACTER:
				return convertCharacterToString(eDataType, instanceValue);
			case Xhtml1Package.CHARSET:
				return convertCharsetToString(eDataType, instanceValue);
			case Xhtml1Package.CHARSETS:
				return convertCharsetsToString(eDataType, instanceValue);
			case Xhtml1Package.CHECKED_TYPE_OBJECT:
				return convertCheckedTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.CONTENT_TYPE:
				return convertContentTypeToString(eDataType, instanceValue);
			case Xhtml1Package.CONTENT_TYPES:
				return convertContentTypesToString(eDataType, instanceValue);
			case Xhtml1Package.COORDS:
				return convertCoordsToString(eDataType, instanceValue);
			case Xhtml1Package.DATETIME:
				return convertDatetimeToString(eDataType, instanceValue);
			case Xhtml1Package.DECLARE_TYPE_OBJECT:
				return convertDeclareTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.DEFER_TYPE_OBJECT:
				return convertDeferTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.DIR_TYPE_OBJECT:
				return convertDirTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.DIR_TYPE_OBJECT1:
				return convertDirTypeObject1ToString(eDataType, instanceValue);
			case Xhtml1Package.DISABLED_TYPE_OBJECT:
				return convertDisabledTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.INPUT_TYPE_OBJECT:
				return convertInputTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.ISMAP_TYPE_OBJECT:
				return convertIsmapTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.LANGUAGE_CODE:
				return convertLanguageCodeToString(eDataType, instanceValue);
			case Xhtml1Package.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case Xhtml1Package.LINK_TYPES:
				return convertLinkTypesToString(eDataType, instanceValue);
			case Xhtml1Package.MEDIA_DESC:
				return convertMediaDescToString(eDataType, instanceValue);
			case Xhtml1Package.METHOD_TYPE_OBJECT:
				return convertMethodTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.MULTI_LENGTH:
				return convertMultiLengthToString(eDataType, instanceValue);
			case Xhtml1Package.MULTIPLE_TYPE_OBJECT:
				return convertMultipleTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.NOHREF_TYPE_OBJECT:
				return convertNohrefTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.NUMBER:
				return convertNumberToString(eDataType, instanceValue);
			case Xhtml1Package.PIXELS:
				return convertPixelsToString(eDataType, instanceValue);
			case Xhtml1Package.READONLY_TYPE_OBJECT:
				return convertReadonlyTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.READONLY_TYPE_OBJECT1:
				return convertReadonlyTypeObject1ToString(eDataType, instanceValue);
			case Xhtml1Package.SCOPE_OBJECT:
				return convertScopeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.SCRIPT:
				return convertScriptToString(eDataType, instanceValue);
			case Xhtml1Package.SELECTED_TYPE_OBJECT:
				return convertSelectedTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.SHAPE_OBJECT:
				return convertShapeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.STYLE_SHEET:
				return convertStyleSheetToString(eDataType, instanceValue);
			case Xhtml1Package.TABINDEX_NUMBER:
				return convertTabindexNumberToString(eDataType, instanceValue);
			case Xhtml1Package.TEXT:
				return convertTextToString(eDataType, instanceValue);
			case Xhtml1Package.TFRAME_OBJECT:
				return convertTFrameObjectToString(eDataType, instanceValue);
			case Xhtml1Package.TRULES_OBJECT:
				return convertTRulesObjectToString(eDataType, instanceValue);
			case Xhtml1Package.TYPE_TYPE_OBJECT:
				return convertTypeTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.URI:
				return convertURIToString(eDataType, instanceValue);
			case Xhtml1Package.URI_LIST:
				return convertUriListToString(eDataType, instanceValue);
			case Xhtml1Package.VALIGN_TYPE_OBJECT:
				return convertValignTypeObjectToString(eDataType, instanceValue);
			case Xhtml1Package.VALUETYPE_TYPE_OBJECT:
				return convertValuetypeTypeObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbbrType createAbbrType() {
		AbbrTypeImpl abbrType = new AbbrTypeImpl();
		return abbrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AContent createAContent() {
		AContentImpl aContent = new AContentImpl();
		return aContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcronymType createAcronymType() {
		AcronymTypeImpl acronymType = new AcronymTypeImpl();
		return acronymType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AreaType createAreaType() {
		AreaTypeImpl areaType = new AreaTypeImpl();
		return areaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType createAType() {
		ATypeImpl aType = new ATypeImpl();
		return aType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseType createBaseType() {
		BaseTypeImpl baseType = new BaseTypeImpl();
		return baseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BdoType createBdoType() {
		BdoTypeImpl bdoType = new BdoTypeImpl();
		return bdoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigType createBigType() {
		BigTypeImpl bigType = new BigTypeImpl();
		return bigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockquoteType createBlockquoteType() {
		BlockquoteTypeImpl blockquoteType = new BlockquoteTypeImpl();
		return blockquoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyType createBodyType() {
		BodyTypeImpl bodyType = new BodyTypeImpl();
		return bodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrType createBrType() {
		BrTypeImpl brType = new BrTypeImpl();
		return brType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BType createBType() {
		BTypeImpl bType = new BTypeImpl();
		return bType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonContent createButtonContent() {
		ButtonContentImpl buttonContent = new ButtonContentImpl();
		return buttonContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ButtonType createButtonType() {
		ButtonTypeImpl buttonType = new ButtonTypeImpl();
		return buttonType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaptionType createCaptionType() {
		CaptionTypeImpl captionType = new CaptionTypeImpl();
		return captionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CiteType createCiteType() {
		CiteTypeImpl citeType = new CiteTypeImpl();
		return citeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeType createCodeType() {
		CodeTypeImpl codeType = new CodeTypeImpl();
		return codeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColgroupType createColgroupType() {
		ColgroupTypeImpl colgroupType = new ColgroupTypeImpl();
		return colgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColType createColType() {
		ColTypeImpl colType = new ColTypeImpl();
		return colType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DdType createDdType() {
		DdTypeImpl ddType = new DdTypeImpl();
		return ddType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelType createDelType() {
		DelTypeImpl delType = new DelTypeImpl();
		return delType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DfnType createDfnType() {
		DfnTypeImpl dfnType = new DfnTypeImpl();
		return dfnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DivType createDivType() {
		DivTypeImpl divType = new DivTypeImpl();
		return divType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DlType createDlType() {
		DlTypeImpl dlType = new DlTypeImpl();
		return dlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DtType createDtType() {
		DtTypeImpl dtType = new DtTypeImpl();
		return dtType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmType createEmType() {
		EmTypeImpl emType = new EmTypeImpl();
		return emType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldsetType createFieldsetType() {
		FieldsetTypeImpl fieldsetType = new FieldsetTypeImpl();
		return fieldsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Flow createFlow() {
		FlowImpl flow = new FlowImpl();
		return flow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormContent createFormContent() {
		FormContentImpl formContent = new FormContentImpl();
		return formContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormType createFormType() {
		FormTypeImpl formType = new FormTypeImpl();
		return formType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H1Type createH1Type() {
		H1TypeImpl h1Type = new H1TypeImpl();
		return h1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H2Type createH2Type() {
		H2TypeImpl h2Type = new H2TypeImpl();
		return h2Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H3Type createH3Type() {
		H3TypeImpl h3Type = new H3TypeImpl();
		return h3Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H4Type createH4Type() {
		H4TypeImpl h4Type = new H4TypeImpl();
		return h4Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H5Type createH5Type() {
		H5TypeImpl h5Type = new H5TypeImpl();
		return h5Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public H6Type createH6Type() {
		H6TypeImpl h6Type = new H6TypeImpl();
		return h6Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeadType createHeadType() {
		HeadTypeImpl headType = new HeadTypeImpl();
		return headType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HrType createHrType() {
		HrTypeImpl hrType = new HrTypeImpl();
		return hrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HtmlType createHtmlType() {
		HtmlTypeImpl htmlType = new HtmlTypeImpl();
		return htmlType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImgType createImgType() {
		ImgTypeImpl imgType = new ImgTypeImpl();
		return imgType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inline createInline() {
		InlineImpl inline = new InlineImpl();
		return inline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType1 createInputType1() {
		InputType1Impl inputType1 = new InputType1Impl();
		return inputType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsType createInsType() {
		InsTypeImpl insType = new InsTypeImpl();
		return insType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IType createIType() {
		ITypeImpl iType = new ITypeImpl();
		return iType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KbdType createKbdType() {
		KbdTypeImpl kbdType = new KbdTypeImpl();
		return kbdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelType createLabelType() {
		LabelTypeImpl labelType = new LabelTypeImpl();
		return labelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegendType createLegendType() {
		LegendTypeImpl legendType = new LegendTypeImpl();
		return legendType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiType createLiType() {
		LiTypeImpl liType = new LiTypeImpl();
		return liType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapType createMapType() {
		MapTypeImpl mapType = new MapTypeImpl();
		return mapType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaType createMetaType() {
		MetaTypeImpl metaType = new MetaTypeImpl();
		return metaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoscriptType createNoscriptType() {
		NoscriptTypeImpl noscriptType = new NoscriptTypeImpl();
		return noscriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectType createObjectType() {
		ObjectTypeImpl objectType = new ObjectTypeImpl();
		return objectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OlType createOlType() {
		OlTypeImpl olType = new OlTypeImpl();
		return olType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptgroupType createOptgroupType() {
		OptgroupTypeImpl optgroupType = new OptgroupTypeImpl();
		return optgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamType createParamType() {
		ParamTypeImpl paramType = new ParamTypeImpl();
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreContent createPreContent() {
		PreContentImpl preContent = new PreContentImpl();
		return preContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreType createPreType() {
		PreTypeImpl preType = new PreTypeImpl();
		return preType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PType createPType() {
		PTypeImpl pType = new PTypeImpl();
		return pType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QType createQType() {
		QTypeImpl qType = new QTypeImpl();
		return qType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SampType createSampType() {
		SampTypeImpl sampType = new SampTypeImpl();
		return sampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptType createScriptType() {
		ScriptTypeImpl scriptType = new ScriptTypeImpl();
		return scriptType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectType createSelectType() {
		SelectTypeImpl selectType = new SelectTypeImpl();
		return selectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmallType createSmallType() {
		SmallTypeImpl smallType = new SmallTypeImpl();
		return smallType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpanType createSpanType() {
		SpanTypeImpl spanType = new SpanTypeImpl();
		return spanType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StrongType createStrongType() {
		StrongTypeImpl strongType = new StrongTypeImpl();
		return strongType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StyleType createStyleType() {
		StyleTypeImpl styleType = new StyleTypeImpl();
		return styleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubType createSubType() {
		SubTypeImpl subType = new SubTypeImpl();
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SupType createSupType() {
		SupTypeImpl supType = new SupTypeImpl();
		return supType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TdType createTdType() {
		TdTypeImpl tdType = new TdTypeImpl();
		return tdType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextareaType createTextareaType() {
		TextareaTypeImpl textareaType = new TextareaTypeImpl();
		return textareaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TfootType createTfootType() {
		TfootTypeImpl tfootType = new TfootTypeImpl();
		return tfootType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ThType createThType() {
		ThTypeImpl thType = new ThTypeImpl();
		return thType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrType createTrType() {
		TrTypeImpl trType = new TrTypeImpl();
		return trType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TtType createTtType() {
		TtTypeImpl ttType = new TtTypeImpl();
		return ttType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlType createUlType() {
		UlTypeImpl ulType = new UlTypeImpl();
		return ulType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarType createVarType() {
		VarTypeImpl varType = new VarTypeImpl();
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeFromString(EDataType eDataType, String initialValue) {
		AlignType result = AlignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckedType createCheckedTypeFromString(EDataType eDataType, String initialValue) {
		CheckedType result = CheckedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCheckedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareType createDeclareTypeFromString(EDataType eDataType, String initialValue) {
		DeclareType result = DeclareType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclareTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferType createDeferTypeFromString(EDataType eDataType, String initialValue) {
		DeferType result = DeferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeFromString(EDataType eDataType, String initialValue) {
		DirType result = DirType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirType1FromString(EDataType eDataType, String initialValue) {
		DirType1 result = DirType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisabledType createDisabledTypeFromString(EDataType eDataType, String initialValue) {
		DisabledType result = DisabledType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisabledTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputTypeFromString(EDataType eDataType, String initialValue) {
		InputType result = InputType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsmapType createIsmapTypeFromString(EDataType eDataType, String initialValue) {
		IsmapType result = IsmapType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsmapTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodTypeFromString(EDataType eDataType, String initialValue) {
		MethodType result = MethodType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleType createMultipleTypeFromString(EDataType eDataType, String initialValue) {
		MultipleType result = MultipleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeFromString(EDataType eDataType, String initialValue) {
		NohrefType result = NohrefType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadonlyType createReadonlyTypeFromString(EDataType eDataType, String initialValue) {
		ReadonlyType result = ReadonlyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadonlyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadonlyType1 createReadonlyType1FromString(EDataType eDataType, String initialValue) {
		ReadonlyType1 result = ReadonlyType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadonlyType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeFromString(EDataType eDataType, String initialValue) {
		Scope result = Scope.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedType createSelectedTypeFromString(EDataType eDataType, String initialValue) {
		SelectedType result = SelectedType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectedTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeFromString(EDataType eDataType, String initialValue) {
		Shape result = Shape.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameFromString(EDataType eDataType, String initialValue) {
		TFrame result = TFrame.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesFromString(EDataType eDataType, String initialValue) {
		TRules result = TRules.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeFromString(EDataType eDataType, String initialValue) {
		TypeType result = TypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeFromString(EDataType eDataType, String initialValue) {
		ValignType result = ValignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuetypeType createValuetypeTypeFromString(EDataType eDataType, String initialValue) {
		ValuetypeType result = ValuetypeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuetypeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType createAlignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createAlignTypeFromString(Xhtml1Package.eINSTANCE.getAlignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertAlignTypeToString(Xhtml1Package.eINSTANCE.getAlignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharacterFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharacterToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharsetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharsetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCharsetsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCharsetsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CheckedType createCheckedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createCheckedTypeFromString(Xhtml1Package.eINSTANCE.getCheckedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCheckedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCheckedTypeToString(Xhtml1Package.eINSTANCE.getCheckedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContentTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createContentTypesFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContentTypesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCoordsFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoordsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar createDatetimeFromString(EDataType eDataType, String initialValue) {
		return (XMLGregorianCalendar)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DATE_TIME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatetimeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DATE_TIME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareType createDeclareTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeclareTypeFromString(Xhtml1Package.eINSTANCE.getDeclareType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeclareTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeclareTypeToString(Xhtml1Package.eINSTANCE.getDeclareType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeferType createDeferTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDeferTypeFromString(Xhtml1Package.eINSTANCE.getDeferType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDeferTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDeferTypeToString(Xhtml1Package.eINSTANCE.getDeferType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType createDirTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createDirTypeFromString(Xhtml1Package.eINSTANCE.getDirType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertDirTypeToString(Xhtml1Package.eINSTANCE.getDirType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 createDirTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createDirType1FromString(Xhtml1Package.eINSTANCE.getDirType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDirTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertDirType1ToString(Xhtml1Package.eINSTANCE.getDirType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator createDisabledTypeObjectFromString(EDataType eDataType, String initialValue) {
		return (Enumerator)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisabledTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputType createInputTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createInputTypeFromString(Xhtml1Package.eINSTANCE.getInputType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInputTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertInputTypeToString(Xhtml1Package.eINSTANCE.getInputType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsmapType createIsmapTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createIsmapTypeFromString(Xhtml1Package.eINSTANCE.getIsmapType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIsmapTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertIsmapTypeToString(Xhtml1Package.eINSTANCE.getIsmapType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLanguageCodeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.LANGUAGE, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLanguageCodeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.LANGUAGE, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> createLinkTypesFromString(EDataType eDataType, String initialValue) {
		return (List)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NMTOKENS, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLinkTypesToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NMTOKENS, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMediaDescFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMediaDescToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MethodType createMethodTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMethodTypeFromString(Xhtml1Package.eINSTANCE.getMethodType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMethodTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMethodTypeToString(Xhtml1Package.eINSTANCE.getMethodType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createMultiLengthFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiLengthToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleType createMultipleTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createMultipleTypeFromString(Xhtml1Package.eINSTANCE.getMultipleType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertMultipleTypeToString(Xhtml1Package.eINSTANCE.getMultipleType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NohrefType createNohrefTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createNohrefTypeFromString(Xhtml1Package.eINSTANCE.getNohrefType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNohrefTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertNohrefTypeToString(Xhtml1Package.eINSTANCE.getNohrefType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createNumberFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createPixelsFromString(EDataType eDataType, String initialValue) {
		return (BigInteger)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPixelsToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NON_NEGATIVE_INTEGER, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadonlyType createReadonlyTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createReadonlyTypeFromString(Xhtml1Package.eINSTANCE.getReadonlyType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadonlyTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReadonlyTypeToString(Xhtml1Package.eINSTANCE.getReadonlyType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadonlyType1 createReadonlyTypeObject1FromString(EDataType eDataType, String initialValue) {
		return createReadonlyType1FromString(Xhtml1Package.eINSTANCE.getReadonlyType1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReadonlyTypeObject1ToString(EDataType eDataType, Object instanceValue) {
		return convertReadonlyType1ToString(Xhtml1Package.eINSTANCE.getReadonlyType1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope createScopeObjectFromString(EDataType eDataType, String initialValue) {
		return createScopeFromString(Xhtml1Package.eINSTANCE.getScope(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertScopeToString(Xhtml1Package.eINSTANCE.getScope(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createScriptFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScriptToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelectedType createSelectedTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createSelectedTypeFromString(Xhtml1Package.eINSTANCE.getSelectedType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSelectedTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSelectedTypeToString(Xhtml1Package.eINSTANCE.getSelectedType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShapeObjectFromString(EDataType eDataType, String initialValue) {
		return createShapeFromString(Xhtml1Package.eINSTANCE.getShape(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertShapeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertShapeToString(Xhtml1Package.eINSTANCE.getShape(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStyleSheetFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleSheetToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger createTabindexNumberFromString(EDataType eDataType, String initialValue) {
		return createNumberFromString(Xhtml1Package.eINSTANCE.getNumber(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTabindexNumberToString(EDataType eDataType, Object instanceValue) {
		return convertNumberToString(Xhtml1Package.eINSTANCE.getNumber(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createTextFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TFrame createTFrameObjectFromString(EDataType eDataType, String initialValue) {
		return createTFrameFromString(Xhtml1Package.eINSTANCE.getTFrame(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTFrameObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTFrameToString(Xhtml1Package.eINSTANCE.getTFrame(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TRules createTRulesObjectFromString(EDataType eDataType, String initialValue) {
		return createTRulesFromString(Xhtml1Package.eINSTANCE.getTRules(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTRulesObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTRulesToString(Xhtml1Package.eINSTANCE.getTRules(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createTypeTypeFromString(Xhtml1Package.eINSTANCE.getTypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertTypeTypeToString(Xhtml1Package.eINSTANCE.getTypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createURIFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.ANY_URI, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertURIToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.ANY_URI, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUriListFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUriListToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType createValignTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValignTypeFromString(Xhtml1Package.eINSTANCE.getValignType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValignTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValignTypeToString(Xhtml1Package.eINSTANCE.getValignType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValuetypeType createValuetypeTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createValuetypeTypeFromString(Xhtml1Package.eINSTANCE.getValuetypeType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertValuetypeTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertValuetypeTypeToString(Xhtml1Package.eINSTANCE.getValuetypeType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml1Package getXhtml1Package() {
		return (Xhtml1Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Xhtml1Package getPackage() {
		return Xhtml1Package.eINSTANCE;
	}

} //Xhtml1FactoryImpl
