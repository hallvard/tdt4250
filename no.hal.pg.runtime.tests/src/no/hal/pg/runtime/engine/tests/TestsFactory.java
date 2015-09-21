/**
 */
package no.hal.pg.runtime.engine.tests;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.pg.runtime.engine.tests.TestsPackage
 * @generated
 */
public class TestsFactory extends EFactoryImpl {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TestsFactory eINSTANCE = init();

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TestsFactory init() {
		try {
			TestsFactory theTestsFactory = (TestsFactory)EPackage.Registry.INSTANCE.getEFactory(TestsPackage.eNS_URI);
			if (theTestsFactory != null) {
				return theTestsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TestsFactory();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestsFactory() {
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
			case TestsPackage.CONTAINER: return createContainer();
			case TestsPackage.SIMPLE1: return createSimple1();
			case TestsPackage.SIMPLE2: return createSimple2();
			case TestsPackage.CONTAINER_SERVICE: return createContainerService();
			case TestsPackage.SIMPLE2_SERVICE: return createSimple2Service();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public no.hal.pg.runtime.engine.tests.Container createContainer() {
		no.hal.pg.runtime.engine.tests.Container container = new no.hal.pg.runtime.engine.tests.Container();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple1 createSimple1() {
		Simple1 simple1 = new Simple1();
		return simple1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple2 createSimple2() {
		Simple2 simple2 = new Simple2();
		return simple2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainerService createContainerService() {
		ContainerService containerService = new ContainerService();
		return containerService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Simple2Service createSimple2Service() {
		Simple2Service simple2Service = new Simple2Service();
		return simple2Service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestsPackage getTestsPackage() {
		return (TestsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TestsPackage getPackage() {
		return TestsPackage.eINSTANCE;
	}

} //TestsFactory
