package no.hal.pg.runtime.tests.util;

import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emfjson.jackson.resource.JsonResourceFactory;

import junit.framework.TestCase;

public class TestHelper {
	
	private final TestCase testCase;
	private Collection<EPackage> packages;
	private ResourceSet resourceSet;
	
	public TestHelper(TestCase testCase) {
		this.testCase = testCase;
		registerResourceFactory("json", new JsonResourceFactory());
		resourceSet = createResourceSet();
	}

	public void registerResourceFactory(String ext, Resource.Factory resourceFactory) {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(ext, resourceFactory);
	}

	public TestHelper(TestCase testCase, EPackage... packages) {
		this(testCase);
		registerPackages(packages);
	}

	public void registerPackages(EPackage... packages) {
		this.packages = Arrays.asList(packages);
		// register packages
		org.eclipse.emf.ecore.EPackage.Registry packageRegistry = EPackage.Registry.INSTANCE;		
		for (EPackage ePackage : packages) {
			packageRegistry.put(ePackage.getNsURI(), ePackage);
		}
	}
	
	public Collection<EPackage> getPackages() {
		return packages;
	}
	
	private URI createModelUri(String modelPath) {
		URL resource = testCase.getClass().getResource(modelPath);
		if (resource == null) {
			System.err.println("No resource for " + modelPath);
		}
		return URI.createURI(resource.toString());
	}
	
	private ResourceSet createResourceSet() {
		ResourceSet resSet = new ResourceSetImpl();
		URI modelUri = createModelUri(testCase.getClass().getSimpleName() + ".class");
		resSet.getURIConverter().getURIMap().put(URI.createURI("test:/"), modelUri.trimSegments(1).appendSegment(""));
		return resSet;
	}

	public void addResource(Resource resource) {
		resourceSet.getResources().add(resource);
	}

	public void addResource(URI uri, EObject eObject) {
		Resource resource = resourceSet.createResource(uri);
		resource.getContents().add(eObject);
	}
	
	public Resource loadResource(String modelPath) {
		return resourceSet.getResource(createModelUri(modelPath), true);
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
