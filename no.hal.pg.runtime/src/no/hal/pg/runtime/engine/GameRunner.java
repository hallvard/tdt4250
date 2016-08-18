package no.hal.pg.runtime.engine;

import java.util.Collection;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
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
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedServiceFactory;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.log.LogService;

import no.hal.pg.model.GameDef;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.model.util.ModelResourceFactoryImpl;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.util.RuntimeResourceFactoryImpl;

@Component(immediate=true, properties={"osgi.command.scope=pg", "osgi.command.function=run"})
public class GameRunner implements IGameRunner, ManagedServiceFactory {
	
	private LogService logger;
	
	public synchronized void setLogger(LogService logger) {
		this.logger = logger;
	}
	public synchronized void unsetLogger(LogService logger) {
		this.logger = null;
	}
	
	private Map<IEngine, ComponentInstance> engines = new HashMap<IEngine, ComponentInstance>();

	private final static String ENGINE_KEY_PROPERTY_NAME = "IEngine.key";
	
	private IEngine createEngine(Dictionary<String, Object> engineConfig) {
		BundleContext bundleContext = FrameworkUtil.getBundle(getClass()).getBundleContext();
		Collection<ServiceReference<ComponentFactory>> serviceReferences = null;
		try {
			serviceReferences = bundleContext.getServiceReferences(ComponentFactory.class, "(component.factory=" + Engine.FACTORY_ID + ")");
		} catch (InvalidSyntaxException e) {
		}
		if (serviceReferences != null && serviceReferences.size() > 0) {
			ComponentFactory factory = bundleContext.getService(serviceReferences.iterator().next());
			ComponentInstance instance = factory.newInstance(engineConfig);
			IEngine engine = (IEngine) instance.getInstance();
			engines.put(engine, instance);
			return engine;
		}
		return null;
	}
	
	private IEngine createEngine(String key) {
		Dictionary<String, Object> engineConfig = new Hashtable<String, Object>();
		engineConfig.put(ENGINE_KEY_PROPERTY_NAME, key);
		IEngine engine = null;
		try {
			engine = createEngine(engineConfig);
			if (engine != null) {
				log(LogService.LOG_INFO, "Created engine: #" + key);
			}
		} finally {
			if (engine == null) {
				log(LogService.LOG_ERROR, "Exception when creating engine: #" + key);
			}
		}
		return engine;
	}

	protected void log(int level, String message) {
		if (logger != null) {
			logger.log(level, message);
		} else if (level < LogService.LOG_INFO) {
			System.err.println(message);
		} else {
			System.out.println(message);
		}
	}
	
	protected void initResourceSet(ResourceSet resourceSet) {
		Map<String, Object> extensionMap = resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap();
		extensionMap.put("json", new JsonResourceFactory());
		extensionMap.put("xmi", new XMIResourceFactoryImpl());
		extensionMap.put("pg", new ModelResourceFactoryImpl());
		extensionMap.put("pg-rt", new RuntimeResourceFactoryImpl());
	}

	// the console command entry point
	@Override
	public IEngine run(String uriString, String key) {
		URI uri = URI.createURI(uriString);
		EObject game = loadGame(uri);
		if (game instanceof GameDef) {
			return runGame((GameDef) game, key);
		} else if (game instanceof Game) {
			return resumeGame((Game) game, key);
		} else {
			throw new IllegalArgumentException("No game found in " + uri);
		}
	}

	public EObject loadGame(URI uri) {
		ResourceSet resourceSet = new ResourceSetImpl();
		initResourceSet(resourceSet);
		Resource resource = resourceSet.getResource(uri, true);
		EList<EObject> contents = resource.getContents();
		if (resource.getErrors() != null && resource.getErrors().size() > 0) {
			log(LogService.LOG_ERROR, "Errors when loading " + uri + ": " + resource.getErrors());
		}
		Game game = (Game) EcoreUtil.getObjectByType(contents, RuntimePackage.eINSTANCE.getGame());
		if (game != null) {
			return game;
		}
		GameDef gameDef = (GameDef) EcoreUtil.getObjectByType(contents, ModelPackage.eINSTANCE.getGameDef());
		if (gameDef == null) {
			for (EObject eObject : contents) {
				gameDef = (GameDef) EcoreUtil.getObjectByType(eObject.eContents(), ModelPackage.eINSTANCE.getGameDef());
				if (gameDef != null) {
					break;
				}
			}
		}
		return gameDef;
	}

	@Override
	public IEngine runGame(GameDef gameDef, String key) {
		IEngine engine = createEngine(key != null ? key : getEngineKey(gameDef));
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

	@Override
	public IEngine resumeGame(Game game, String key) {
		IEngine engine = createEngine(key != null ? key : getEngineKey(game));
		if (engine != null) {
			engine.init(game);
		}
		return engine;
	}

	//

	@Override
	public String getName() {
		return "Game runner";
	}

	protected void stopEngine(IEngine engine) {
		engines.get(engine).dispose();
	}

	protected IEngine getEngine(String pid) {
		for (IEngine engine : engines.keySet()) {
			if (pid.equals(engine.getKey())) {
				return engine;
			}
		}
		return null;
	}

	@Override
	public void updated(String pid, Dictionary<String, ?> properties) throws ConfigurationException {
		IEngine oldEngine = getEngine(pid);
//		System.out.println("Updating engine #" + pid + ": " + oldEngine);
		if (oldEngine != null) {
			stopEngine(oldEngine);
		} else {
			try {
				run(String.valueOf(properties.get("uri")), pid);
			} catch (Exception e) {
				throw new ConfigurationException("uri", e.getMessage(), e);
			}
		}
	}

	@Override
	public void deleted(String pid) {
		IEngine oldEngine = getEngine(pid);
//		System.out.println("Deleting engine #" + pid + ": " + oldEngine);
		if (oldEngine != null) {
			stopEngine(oldEngine);
		}
	}
}
