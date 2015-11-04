package no.hal.pg.runtime.engine;

import java.util.Collection;
import java.util.Dictionary;
import java.util.Hashtable;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.model.util.ModelResourceFactoryImpl;
import no.hal.pg.runtime.Game;

public class GameRunner {

	public IEngine createEngine(Dictionary<String, Object> engineConfig) {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		Collection<ServiceReference<ComponentFactory>> serviceReferences = null;
		try {
			serviceReferences = bundleContext.getServiceReferences(ComponentFactory.class, "(component.factory=" + Engine.FACTORY_ID + ")");
		} catch (InvalidSyntaxException e) {
		}
		if (serviceReferences != null && serviceReferences.size() > 0) {
			ComponentFactory factory = bundleContext.getService(serviceReferences.iterator().next());
			ComponentInstance instance = factory.newInstance(engineConfig);
			return (IEngine) instance.getInstance();
		}
		return null;
	}

	private IEngine createEngine(String key) {
		Dictionary<String, Object> engineConfig = new Hashtable<String, Object>();
		engineConfig.put("IEngine.key", key);
		return createEngine(engineConfig);
	}
	
	protected void initResourceSet(ResourceSet resourceSet) {
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("json", new JsonResourceFactory());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("pg", new ModelResourceFactoryImpl());
	}
	
	public GameDef loadGame(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		initResourceSet(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
		GameDef gameDef = (GameDef) EcoreUtil.getObjectByType(resource.getContents(), ModelPackage.eINSTANCE.getGameDef());
		return gameDef;
	}

	public IEngine runGame(GameDef gameDef) {
		IEngine engine = createEngine(getEngineKey(gameDef));
		if (engine != null) {
			engine.init(gameDef);
			engine.start();
		}
		return engine;
	}

	protected String getEngineKey(EObject eObject) {
		return eObject.eResource().getURI().lastSegment();
	}
	
	protected String getEngineKey(GameDef gameDef) {
		return getEngineKey((EObject) gameDef);
	}
	
	protected String getEngineKey(Game game) {
		return getEngineKey((EObject) game);
	}

	public IEngine resumeGame(Game game) {
		IEngine engine = createEngine(getEngineKey(game));
		if (engine != null) {
			engine.init(game);
		}
		return engine;
	}
}
