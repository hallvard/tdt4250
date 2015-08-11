package no.hal.pg.runtime.tests.util;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.resource.JsonResourceFactory;

import junit.framework.TestCase;
import no.hal.pg.model.ModelPackage;

public class TestHelper {
	
	private final TestCase testCase;

	public TestHelper(TestCase testCase, EPackage... packages) {
		this.testCase = testCase;
		org.eclipse.emf.ecore.EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		// register packages
		for (EPackage ePackage : packages) {
			packageRegistry.put(ePackage.getNsURI(), ePackage);
		}
	}

	private URI createModelUri(String modelPath) {
		URL resource = testCase.getClass().getResource(modelPath);
		return URI.createURI(resource.toString());
	}
	
	private ResourceSet createResourceSet() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelUri = createModelUri(testCase.getClass().getSimpleName() + ".class");
		resSet.getURIConverter().getURIMap().put(URI.createURI("test:/"), modelUri.trimSegments(1).appendSegment(""));
		return resSet;
	}
	
	public Resource loadResource(String modelPath) {
		ResourceSet resSet = createResourceSet();
		return resSet.getResource(createModelUri(modelPath), true);
	}
	
	private String getDefaultModelPath() {
		return testCase.getClass().getSimpleName() + ".json";
	}
	
	public Resource loadTestResource() {
		return loadResource(getDefaultModelPath());
	}
	
	public Object loadResource(String modelPath, EClass eClass) {
		Resource resource = loadResource(modelPath);
		return EcoreUtil.getObjectByType(resource.getContents(), eClass);
	}

	public Object loadTestResource(EClass eClass) {
		return loadResource(getDefaultModelPath(), eClass);
	}
}
