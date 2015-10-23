/**
 */
package no.hal.pg.sokoban.runtime.impl;

import no.hal.pg.sokoban.runtime.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RuntimeFactoryImpl extends EFactoryImpl implements RuntimeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RuntimeFactory init() {
		try {
			RuntimeFactory theRuntimeFactory = (RuntimeFactory)EPackage.Registry.INSTANCE.getEFactory(RuntimePackage.eNS_URI);
			if (theRuntimeFactory != null) {
				return theRuntimeFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RuntimeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeFactoryImpl() {
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
			case RuntimePackage.SOKOBAN_TASK: return createSokobanTask();
			case RuntimePackage.SOKOBAN_RESULT: return createSokobanResult();
			case RuntimePackage.SOKOBAN_SERVICE: return createSokobanService();
			case RuntimePackage.GRID_RECTANGLE_VALUES: return createGridRectangleValues();
			case RuntimePackage.SOKOBAN_GAME_SERVICE: return createSokobanGameService();
			case RuntimePackage.SOKOBAN_GRID_SERVICE: return createSokobanGridService();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanTask createSokobanTask() {
		SokobanTaskImpl sokobanTask = new SokobanTaskImpl();
		return sokobanTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanResult createSokobanResult() {
		SokobanResultImpl sokobanResult = new SokobanResultImpl();
		return sokobanResult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanService createSokobanService() {
		SokobanServiceImpl sokobanService = new SokobanServiceImpl();
		return sokobanService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridRectangleValues createGridRectangleValues() {
		GridRectangleValuesImpl gridRectangleValues = new GridRectangleValuesImpl();
		return gridRectangleValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGameService createSokobanGameService() {
		SokobanGameServiceImpl sokobanGameService = new SokobanGameServiceImpl();
		return sokobanGameService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SokobanGridService createSokobanGridService() {
		SokobanGridServiceImpl sokobanGridService = new SokobanGridServiceImpl();
		return sokobanGridService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimePackage getRuntimePackage() {
		return (RuntimePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RuntimePackage getPackage() {
		return RuntimePackage.eINSTANCE;
	}

} //RuntimeFactoryImpl
