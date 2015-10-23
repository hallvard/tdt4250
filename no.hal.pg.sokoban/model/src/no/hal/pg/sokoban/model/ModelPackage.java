/**
 */
package no.hal.pg.sokoban.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.pg.sokoban.model.ModelFactory
 * @model kind="package"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.pg.sokoban.model/model/pg-sokoban.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "pg-sokoban-model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = no.hal.pg.sokoban.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.pg.sokoban.model.impl.SokobanTaskDefImpl <em>Sokoban Task Def</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.pg.sokoban.model.impl.SokobanTaskDefImpl
	 * @see no.hal.pg.sokoban.model.impl.ModelPackageImpl#getSokobanTaskDef()
	 * @generated
	 */
	int SOKOBAN_TASK_DEF = 0;

	/**
	 * The feature id for the '<em><b>Levels</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK_DEF__LEVELS = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sokoban Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK_DEF_FEATURE_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Sokoban Task Def</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOKOBAN_TASK_DEF_OPERATION_COUNT = no.hal.pg.model.ModelPackage.TASK_DEF_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link no.hal.pg.sokoban.model.SokobanTaskDef <em>Sokoban Task Def</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sokoban Task Def</em>'.
	 * @see no.hal.pg.sokoban.model.SokobanTaskDef
	 * @generated
	 */
	EClass getSokobanTaskDef();

	/**
	 * Returns the meta object for the reference list '{@link no.hal.pg.sokoban.model.SokobanTaskDef#getLevels <em>Levels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Levels</em>'.
	 * @see no.hal.pg.sokoban.model.SokobanTaskDef#getLevels()
	 * @see #getSokobanTaskDef()
	 * @generated
	 */
	EReference getSokobanTaskDef_Levels();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.pg.sokoban.model.impl.SokobanTaskDefImpl <em>Sokoban Task Def</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.pg.sokoban.model.impl.SokobanTaskDefImpl
		 * @see no.hal.pg.sokoban.model.impl.ModelPackageImpl#getSokobanTaskDef()
		 * @generated
		 */
		EClass SOKOBAN_TASK_DEF = eINSTANCE.getSokobanTaskDef();
		/**
		 * The meta object literal for the '<em><b>Levels</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOKOBAN_TASK_DEF__LEVELS = eINSTANCE.getSokobanTaskDef_Levels();

	}

} //ModelPackage
