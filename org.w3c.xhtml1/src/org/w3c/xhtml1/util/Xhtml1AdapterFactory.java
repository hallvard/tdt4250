/**
 */
package org.w3c.xhtml1.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;
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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.w3c.xhtml1.Xhtml1Package
 * @generated
 */
public class Xhtml1AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Xhtml1Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Xhtml1AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Xhtml1Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Xhtml1Switch<Adapter> modelSwitch =
		new Xhtml1Switch<Adapter>() {
			@Override
			public Adapter caseAbbrType(AbbrType object) {
				return createAbbrTypeAdapter();
			}
			@Override
			public Adapter caseAContent(AContent object) {
				return createAContentAdapter();
			}
			@Override
			public Adapter caseAcronymType(AcronymType object) {
				return createAcronymTypeAdapter();
			}
			@Override
			public Adapter caseAddressType(AddressType object) {
				return createAddressTypeAdapter();
			}
			@Override
			public Adapter caseAreaType(AreaType object) {
				return createAreaTypeAdapter();
			}
			@Override
			public Adapter caseAType(AType object) {
				return createATypeAdapter();
			}
			@Override
			public Adapter caseBaseType(BaseType object) {
				return createBaseTypeAdapter();
			}
			@Override
			public Adapter caseBdoType(BdoType object) {
				return createBdoTypeAdapter();
			}
			@Override
			public Adapter caseBigType(BigType object) {
				return createBigTypeAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter caseBlockquoteType(BlockquoteType object) {
				return createBlockquoteTypeAdapter();
			}
			@Override
			public Adapter caseBodyType(BodyType object) {
				return createBodyTypeAdapter();
			}
			@Override
			public Adapter caseBrType(BrType object) {
				return createBrTypeAdapter();
			}
			@Override
			public Adapter caseBType(BType object) {
				return createBTypeAdapter();
			}
			@Override
			public Adapter caseButtonContent(ButtonContent object) {
				return createButtonContentAdapter();
			}
			@Override
			public Adapter caseButtonType(ButtonType object) {
				return createButtonTypeAdapter();
			}
			@Override
			public Adapter caseCaptionType(CaptionType object) {
				return createCaptionTypeAdapter();
			}
			@Override
			public Adapter caseCiteType(CiteType object) {
				return createCiteTypeAdapter();
			}
			@Override
			public Adapter caseCodeType(CodeType object) {
				return createCodeTypeAdapter();
			}
			@Override
			public Adapter caseColgroupType(ColgroupType object) {
				return createColgroupTypeAdapter();
			}
			@Override
			public Adapter caseColType(ColType object) {
				return createColTypeAdapter();
			}
			@Override
			public Adapter caseDdType(DdType object) {
				return createDdTypeAdapter();
			}
			@Override
			public Adapter caseDelType(DelType object) {
				return createDelTypeAdapter();
			}
			@Override
			public Adapter caseDfnType(DfnType object) {
				return createDfnTypeAdapter();
			}
			@Override
			public Adapter caseDivType(DivType object) {
				return createDivTypeAdapter();
			}
			@Override
			public Adapter caseDlType(DlType object) {
				return createDlTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseDtType(DtType object) {
				return createDtTypeAdapter();
			}
			@Override
			public Adapter caseEmType(EmType object) {
				return createEmTypeAdapter();
			}
			@Override
			public Adapter caseFieldsetType(FieldsetType object) {
				return createFieldsetTypeAdapter();
			}
			@Override
			public Adapter caseFlow(Flow object) {
				return createFlowAdapter();
			}
			@Override
			public Adapter caseFormContent(FormContent object) {
				return createFormContentAdapter();
			}
			@Override
			public Adapter caseFormType(FormType object) {
				return createFormTypeAdapter();
			}
			@Override
			public Adapter caseH1Type(H1Type object) {
				return createH1TypeAdapter();
			}
			@Override
			public Adapter caseH2Type(H2Type object) {
				return createH2TypeAdapter();
			}
			@Override
			public Adapter caseH3Type(H3Type object) {
				return createH3TypeAdapter();
			}
			@Override
			public Adapter caseH4Type(H4Type object) {
				return createH4TypeAdapter();
			}
			@Override
			public Adapter caseH5Type(H5Type object) {
				return createH5TypeAdapter();
			}
			@Override
			public Adapter caseH6Type(H6Type object) {
				return createH6TypeAdapter();
			}
			@Override
			public Adapter caseHeadType(HeadType object) {
				return createHeadTypeAdapter();
			}
			@Override
			public Adapter caseHrType(HrType object) {
				return createHrTypeAdapter();
			}
			@Override
			public Adapter caseHtmlType(HtmlType object) {
				return createHtmlTypeAdapter();
			}
			@Override
			public Adapter caseImgType(ImgType object) {
				return createImgTypeAdapter();
			}
			@Override
			public Adapter caseInline(Inline object) {
				return createInlineAdapter();
			}
			@Override
			public Adapter caseInputType1(InputType1 object) {
				return createInputType1Adapter();
			}
			@Override
			public Adapter caseInsType(InsType object) {
				return createInsTypeAdapter();
			}
			@Override
			public Adapter caseIType(IType object) {
				return createITypeAdapter();
			}
			@Override
			public Adapter caseKbdType(KbdType object) {
				return createKbdTypeAdapter();
			}
			@Override
			public Adapter caseLabelType(LabelType object) {
				return createLabelTypeAdapter();
			}
			@Override
			public Adapter caseLegendType(LegendType object) {
				return createLegendTypeAdapter();
			}
			@Override
			public Adapter caseLinkType(LinkType object) {
				return createLinkTypeAdapter();
			}
			@Override
			public Adapter caseLiType(LiType object) {
				return createLiTypeAdapter();
			}
			@Override
			public Adapter caseMapType(MapType object) {
				return createMapTypeAdapter();
			}
			@Override
			public Adapter caseMetaType(MetaType object) {
				return createMetaTypeAdapter();
			}
			@Override
			public Adapter caseNoscriptType(NoscriptType object) {
				return createNoscriptTypeAdapter();
			}
			@Override
			public Adapter caseObjectType(ObjectType object) {
				return createObjectTypeAdapter();
			}
			@Override
			public Adapter caseOlType(OlType object) {
				return createOlTypeAdapter();
			}
			@Override
			public Adapter caseOptgroupType(OptgroupType object) {
				return createOptgroupTypeAdapter();
			}
			@Override
			public Adapter caseOptionType(OptionType object) {
				return createOptionTypeAdapter();
			}
			@Override
			public Adapter caseParamType(ParamType object) {
				return createParamTypeAdapter();
			}
			@Override
			public Adapter casePreContent(PreContent object) {
				return createPreContentAdapter();
			}
			@Override
			public Adapter casePreType(PreType object) {
				return createPreTypeAdapter();
			}
			@Override
			public Adapter casePType(PType object) {
				return createPTypeAdapter();
			}
			@Override
			public Adapter caseQType(QType object) {
				return createQTypeAdapter();
			}
			@Override
			public Adapter caseSampType(SampType object) {
				return createSampTypeAdapter();
			}
			@Override
			public Adapter caseScriptType(ScriptType object) {
				return createScriptTypeAdapter();
			}
			@Override
			public Adapter caseSelectType(SelectType object) {
				return createSelectTypeAdapter();
			}
			@Override
			public Adapter caseSmallType(SmallType object) {
				return createSmallTypeAdapter();
			}
			@Override
			public Adapter caseSpanType(SpanType object) {
				return createSpanTypeAdapter();
			}
			@Override
			public Adapter caseStrongType(StrongType object) {
				return createStrongTypeAdapter();
			}
			@Override
			public Adapter caseStyleType(StyleType object) {
				return createStyleTypeAdapter();
			}
			@Override
			public Adapter caseSubType(SubType object) {
				return createSubTypeAdapter();
			}
			@Override
			public Adapter caseSupType(SupType object) {
				return createSupTypeAdapter();
			}
			@Override
			public Adapter caseTableType(TableType object) {
				return createTableTypeAdapter();
			}
			@Override
			public Adapter caseTbodyType(TbodyType object) {
				return createTbodyTypeAdapter();
			}
			@Override
			public Adapter caseTdType(TdType object) {
				return createTdTypeAdapter();
			}
			@Override
			public Adapter caseTextareaType(TextareaType object) {
				return createTextareaTypeAdapter();
			}
			@Override
			public Adapter caseTfootType(TfootType object) {
				return createTfootTypeAdapter();
			}
			@Override
			public Adapter caseTheadType(TheadType object) {
				return createTheadTypeAdapter();
			}
			@Override
			public Adapter caseThType(ThType object) {
				return createThTypeAdapter();
			}
			@Override
			public Adapter caseTitleType(TitleType object) {
				return createTitleTypeAdapter();
			}
			@Override
			public Adapter caseTrType(TrType object) {
				return createTrTypeAdapter();
			}
			@Override
			public Adapter caseTtType(TtType object) {
				return createTtTypeAdapter();
			}
			@Override
			public Adapter caseUlType(UlType object) {
				return createUlTypeAdapter();
			}
			@Override
			public Adapter caseVarType(VarType object) {
				return createVarTypeAdapter();
			}
			@Override
			public Adapter caseXMLTypeDocumentRoot(XMLTypeDocumentRoot object) {
				return createXMLTypeDocumentRootAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AbbrType
	 * @generated
	 */
	public Adapter createAbbrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AContent
	 * @generated
	 */
	public Adapter createAContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AcronymType
	 * @generated
	 */
	public Adapter createAcronymTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AddressType
	 * @generated
	 */
	public Adapter createAddressTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AreaType <em>Area Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AreaType
	 * @generated
	 */
	public Adapter createAreaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.AType
	 * @generated
	 */
	public Adapter createATypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BaseType
	 * @generated
	 */
	public Adapter createBaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BdoType <em>Bdo Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BdoType
	 * @generated
	 */
	public Adapter createBdoTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BigType <em>Big Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BigType
	 * @generated
	 */
	public Adapter createBigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BlockquoteType
	 * @generated
	 */
	public Adapter createBlockquoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BodyType
	 * @generated
	 */
	public Adapter createBodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BrType
	 * @generated
	 */
	public Adapter createBrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.BType
	 * @generated
	 */
	public Adapter createBTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ButtonContent <em>Button Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ButtonContent
	 * @generated
	 */
	public Adapter createButtonContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ButtonType <em>Button Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ButtonType
	 * @generated
	 */
	public Adapter createButtonTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.CaptionType
	 * @generated
	 */
	public Adapter createCaptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.CiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.CiteType
	 * @generated
	 */
	public Adapter createCiteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.CodeType
	 * @generated
	 */
	public Adapter createCodeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ColgroupType
	 * @generated
	 */
	public Adapter createColgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ColType
	 * @generated
	 */
	public Adapter createColTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DdType
	 * @generated
	 */
	public Adapter createDdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DelType <em>Del Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DelType
	 * @generated
	 */
	public Adapter createDelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DfnType
	 * @generated
	 */
	public Adapter createDfnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DivType
	 * @generated
	 */
	public Adapter createDivTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DlType
	 * @generated
	 */
	public Adapter createDlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.DtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.DtType
	 * @generated
	 */
	public Adapter createDtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.EmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.EmType
	 * @generated
	 */
	public Adapter createEmTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.FieldsetType <em>Fieldset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.FieldsetType
	 * @generated
	 */
	public Adapter createFieldsetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.Flow
	 * @generated
	 */
	public Adapter createFlowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.FormContent <em>Form Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.FormContent
	 * @generated
	 */
	public Adapter createFormContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.FormType <em>Form Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.FormType
	 * @generated
	 */
	public Adapter createFormTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H1Type
	 * @generated
	 */
	public Adapter createH1TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H2Type
	 * @generated
	 */
	public Adapter createH2TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H3Type
	 * @generated
	 */
	public Adapter createH3TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H4Type
	 * @generated
	 */
	public Adapter createH4TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H5Type
	 * @generated
	 */
	public Adapter createH5TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.H6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.H6Type
	 * @generated
	 */
	public Adapter createH6TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.HeadType <em>Head Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.HeadType
	 * @generated
	 */
	public Adapter createHeadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.HrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.HrType
	 * @generated
	 */
	public Adapter createHrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.HtmlType <em>Html Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.HtmlType
	 * @generated
	 */
	public Adapter createHtmlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ImgType
	 * @generated
	 */
	public Adapter createImgTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.Inline
	 * @generated
	 */
	public Adapter createInlineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.InputType1 <em>Input Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.InputType1
	 * @generated
	 */
	public Adapter createInputType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.InsType <em>Ins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.InsType
	 * @generated
	 */
	public Adapter createInsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.IType
	 * @generated
	 */
	public Adapter createITypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.KbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.KbdType
	 * @generated
	 */
	public Adapter createKbdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.LabelType <em>Label Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.LabelType
	 * @generated
	 */
	public Adapter createLabelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.LegendType <em>Legend Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.LegendType
	 * @generated
	 */
	public Adapter createLegendTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.LinkType
	 * @generated
	 */
	public Adapter createLinkTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.LiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.LiType
	 * @generated
	 */
	public Adapter createLiTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.MapType <em>Map Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.MapType
	 * @generated
	 */
	public Adapter createMapTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.MetaType <em>Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.MetaType
	 * @generated
	 */
	public Adapter createMetaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.NoscriptType <em>Noscript Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.NoscriptType
	 * @generated
	 */
	public Adapter createNoscriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ObjectType
	 * @generated
	 */
	public Adapter createObjectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.OlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.OlType
	 * @generated
	 */
	public Adapter createOlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.OptgroupType <em>Optgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.OptgroupType
	 * @generated
	 */
	public Adapter createOptgroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.OptionType
	 * @generated
	 */
	public Adapter createOptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ParamType
	 * @generated
	 */
	public Adapter createParamTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.PreContent
	 * @generated
	 */
	public Adapter createPreContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.PreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.PreType
	 * @generated
	 */
	public Adapter createPreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.PType
	 * @generated
	 */
	public Adapter createPTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.QType
	 * @generated
	 */
	public Adapter createQTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SampType
	 * @generated
	 */
	public Adapter createSampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ScriptType <em>Script Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ScriptType
	 * @generated
	 */
	public Adapter createScriptTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SelectType <em>Select Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SelectType
	 * @generated
	 */
	public Adapter createSelectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SmallType <em>Small Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SmallType
	 * @generated
	 */
	public Adapter createSmallTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SpanType
	 * @generated
	 */
	public Adapter createSpanTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.StrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.StrongType
	 * @generated
	 */
	public Adapter createStrongTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.StyleType <em>Style Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.StyleType
	 * @generated
	 */
	public Adapter createStyleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SubType
	 * @generated
	 */
	public Adapter createSubTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.SupType <em>Sup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.SupType
	 * @generated
	 */
	public Adapter createSupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TableType
	 * @generated
	 */
	public Adapter createTableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TbodyType
	 * @generated
	 */
	public Adapter createTbodyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TdType
	 * @generated
	 */
	public Adapter createTdTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TextareaType <em>Textarea Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TextareaType
	 * @generated
	 */
	public Adapter createTextareaTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TfootType
	 * @generated
	 */
	public Adapter createTfootTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TheadType
	 * @generated
	 */
	public Adapter createTheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.ThType
	 * @generated
	 */
	public Adapter createThTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TitleType
	 * @generated
	 */
	public Adapter createTitleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TrType
	 * @generated
	 */
	public Adapter createTrTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.TtType <em>Tt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.TtType
	 * @generated
	 */
	public Adapter createTtTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.UlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.UlType
	 * @generated
	 */
	public Adapter createUlTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.w3c.xhtml1.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.w3c.xhtml1.VarType
	 * @generated
	 */
	public Adapter createVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.emf.ecore.xml.type.XMLTypeDocumentRoot
	 * @generated
	 */
	public Adapter createXMLTypeDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Xhtml1AdapterFactory
