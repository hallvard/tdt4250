package no.hal.pg.runtime.http.tests;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import junit.framework.TestCase;
import no.hal.pg.runtime.RuntimeFactory;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.IServiceProvider;
import no.hal.pg.runtime.engine.ServiceExecutor;
import no.hal.pg.runtime.tests.util.TestHelper;

public class ServiceExecutorTest extends TestCase {
	
	private ServiceExecutor serviceExecutor;
	private Container container;
	
	@Override
	protected void setUp() throws Exception {
		serviceExecutor = new ServiceExecutor();
		serviceExecutor.addServiceProvider(new IServiceProvider() {
			@Override
			public Service<?> getService(EObject eObject) {
				Service<?> service = null;
				if (eObject instanceof Container) {
					service = TestsFactory.eINSTANCE.createContainerService();
				} else if (eObject instanceof Simple1) {
					service = RuntimeFactory.eINSTANCE.createSelfService();
				} else if (eObject instanceof Simple2) {
					service = TestsFactory.eINSTANCE.createSimple2Service();
				}
				if (service != null) {
					((Service<EObject>) service).setContext(eObject);
				}
				return service;
			}
		});
		TestHelper testHelper = new TestHelper(this, TestsPackage.eINSTANCE);
		container = (Container) testHelper.loadResource("Container1.xmi", TestsPackage.eINSTANCE.getContainer());
	}
	
	public void testSetUp() {
		assertNotNull(container);
		assertNotNull(container.getSimple1());
		assertFalse(container.getSimple1().getSimples2().isEmpty());
		assertFalse(container.getSimples2().isEmpty());
	}
	
	public void testDeriveAttribute1() {
		serviceExecutor.init(container);
		serviceExecutor.execute("simple1", null);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(1, result.length);
		assertEquals(container.getSimple1(), result[0]);
	}

	public void testDeriveAttribute2() {
		serviceExecutor.init(container.getSimples2().get(0));
		serviceExecutor.execute("string21", null);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(1, result.length);
		assertEquals("lvard", result[0]);
	}
	
	public void testInvokeOperation() {
		serviceExecutor.init(container);
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("stringFilter", "Hal");
		serviceExecutor.execute("getSimples2", args);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(2, result.length);
		assertEquals(container.getSimples2().get(0), result[0]);
		assertEquals(container.getSimples2().get(1), result[1]);
	}

	private void testNonExistingService(EObject target, String serviceName, Map<String, Object> args) {
		serviceExecutor.init(target);
		try {
			serviceExecutor.execute(serviceName, args);
			fail();
		} catch (Exception e) {
		}
	}
	
	public void testNonExistingService() {
		testNonExistingService(container, "string1", null);
	}

	public void testInvokeOperationDeriveAttribute() {
		serviceExecutor.init(container);
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("stringFilter", "Hal");
		serviceExecutor.execute("getSimples2", args);
		Object[] result = serviceExecutor.getObjects();
		serviceExecutor.execute("string21", null);
		result = serviceExecutor.getObjects();
		assertEquals(2, result.length);
		assertEquals("lvard", result[0]);
		assertEquals("vard", result[1]);
	}

	// SelfService tests

	public void testDeriveSelfServiceAttribute() {
		serviceExecutor.init(container);
		serviceExecutor.execute("int1", null);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(1, result.length);
		assertEquals(container.getInt1(), result[0]);
	}

	public void testDeriveSelfServiceAlternateAttribute() {
		serviceExecutor.init(container.getSimple1().getSimples2().get(1));
		serviceExecutor.execute("int1", null);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(1, result.length);
		assertEquals(2, result[0]);
	}

	public void testDeriveSelfServiceClassAttribute() {
		serviceExecutor.init(container.getSimple1());
		serviceExecutor.execute("string11", null);
		Object[] result = serviceExecutor.getObjects();
		assertEquals(1, result.length);
		assertEquals("Hallvard", result[0]);
	}
	
	public void testContextReference() {
		serviceExecutor.init(container.getSimple1());
		testNonExistingService(container, "context", null);
	}
	
	//
	
	public void testExecuteFeatureServices() {
		Map<String, Object> result = serviceExecutor.executeFeatureServices(container, IServiceExecutor.SERVICE_NAMES_WILDCARD);
		assertTrue(result.keySet().containsAll(Arrays.asList("simple1", "int1")));
		result = serviceExecutor.executeFeatureServices(container.getSimple1(), IServiceExecutor.SERVICE_NAMES_WILDCARD);
		assertTrue(result.keySet().containsAll(Arrays.asList("simples2", "string11")));
		result = serviceExecutor.executeFeatureServices(container.getSimples2().get(0), IServiceExecutor.SERVICE_NAMES_WILDCARD);
		assertTrue(result.keySet().containsAll(Arrays.asList("int1", "string21")));
	}
}
