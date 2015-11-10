package no.hal.pg.karaf.emf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.ecore.EFactory;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Factory;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.framework.BundleListener;
import org.osgi.framework.ServiceReference;
import org.osgi.service.log.LogService;

public class RegistryHelper implements BundleListener {

	private final BundleContext bundleContext;
	private LogService logger;
	
	public RegistryHelper(BundleContext bundleContext) {
		this.bundleContext = bundleContext;
		ServiceReference<LogService> serviceReference = bundleContext.getServiceReference(LogService.class);
		if (serviceReference != null) {
			this.logger = bundleContext.getService(serviceReference);
		}
	}

	public BundleContext getBundleContext() {
		return bundleContext;
	}
	
	private Collection<EPD> descriptors;
	private Collection<XD> xdescriptors;
	
	public void register(EPD[] descriptors, XD[] xdescriptors) throws Exception {
		this.descriptors = new ArrayList<EPD>(Arrays.asList(descriptors));
		this.xdescriptors = new ArrayList<XD>(Arrays.asList(xdescriptors));
		register();
	}
	
	protected void register() {
		registerEPackage(null);
		doSetup(null);
		if (descriptors.size() > 0 || xdescriptors.size() > 0) {
			this.bundleContext.addBundleListener(this);
		}
	}

	protected void doSetup(String bundleId) {
		Iterator<XD> xiterator = xdescriptors.iterator();
		while (xiterator.hasNext()) {
			XD descriptor = xiterator.next();
			if (bundleId == null || descriptor.bundleId.equals(bundleId)) {
				if (descriptor.doSetup()) {
					if (logger != null) {
						logger.log(LogService.LOG_INFO, "Invoked " + descriptor.setupClassName + ".doSetup");
					}
					xiterator.remove();
				}
			}
		}
	}

	protected void registerEPackage(String bundleId) {
		Iterator<EPD> iterator = descriptors.iterator();
		while (iterator.hasNext()) {
			EPD descriptor = iterator.next();
			if ((bundleId == null || descriptor.bundleId.equals(bundleId)) && findBundle(descriptor.bundleId) != null) {
				descriptor.registerEPackage();
				descriptor.registerResourceFactory();
				iterator.remove();
			}
		}
	}

	private Bundle findBundle(String bundleId) {
		for (Bundle bundle : getBundleContext().getBundles()) {
			if (bundle.getSymbolicName().equals(bundleId)) {
				return bundle;
			}
		}
		return null;
	}
	
	protected EPD epd(String bundleId, String packageUri, String className, String resourceFactoryClassName, String fileExtension, Object... formatArgs) {
		return new EPD(bundleId, packageUri, className, resourceFactoryClassName, fileExtension, formatArgs);
	}

	protected XD xd(String bundleId, String setupClassName, Object... formatArgs) {
		return new XD(bundleId, setupClassName, formatArgs);
	}
	
	//

	@Override
	public void bundleChanged(BundleEvent event) {
		if (event.getType() == BundleEvent.STARTED) {
			String symbolicName = event.getBundle().getSymbolicName();
			if (logger != null) {
				logger.log(LogService.LOG_INFO, "Retrying EMF and Xtext registration for bundle " + symbolicName);
			}
			registerEPackage(symbolicName);
			doSetup(symbolicName);
			if (descriptors.isEmpty() && xdescriptors.isEmpty()) {
				this.bundleContext.removeBundleListener(this);
			}
		}
	}

	//

	protected class EPD implements EPackage.Descriptor, Resource.Factory.Descriptor {

		final String bundleId, packageUri, className, resourceFactoryClassName, fileExtension;
		
		public EPD(String bundleId, String packageUri, String className, String resourceFactoryClassName, String fileExtension) {
			this.bundleId = bundleId;
			this.packageUri = packageUri;
			this.className = className;
			this.resourceFactoryClassName = resourceFactoryClassName;
			this.fileExtension = fileExtension;
		}
		
		public EPD(String bundleId, String packageUri, String className, String resourceFactoryClassName, String fileExtension, Object... formatArgs) {
			this(String.format(bundleId, formatArgs), String.format(packageUri, formatArgs), String.format(className, formatArgs),
					(resourceFactoryClassName != null ? String.format(resourceFactoryClassName, formatArgs) : null), fileExtension);
		}

		private EPackage ePackage;
		
		@Override
		public EPackage getEPackage() {
			if (ePackage == null) {
				loadEPackage();
			}
			return ePackage;
		}

		void registerEPackage() {
			ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
			if (ePackage == null && register(EPackage.Registry.INSTANCE, packageUri)) {
				if (logger != null) {
					logger.log(LogService.LOG_INFO, "Registered EPackage.Descriptor for " + packageUri);
				}
				ePackage = EPackage.Registry.INSTANCE.getEPackage(packageUri);
			}
		}

		protected void loadEPackage() {
			Bundle bundle = findBundle(bundleId);
			if (bundle != null) {
				try {
					Class<?> packageClass = bundle.loadClass(className);
					this.ePackage = (EPackage) packageClass.getField("eINSTANCE").get(null);
				} catch (Exception e) {
					if (logger != null) {
						logger.log(LogService.LOG_ERROR, "Exception when loading " + className + ": ", e);
					}
				}
			} else if (logger != null) {
				logger.log(LogService.LOG_INFO, "Didn't find bundle with symbolic name " + bundleId + ", when loading " + className);
			}
		}

		@Override
		public EFactory getEFactory() {
			if (ePackage == null) {
				loadEPackage();
			}
			return (ePackage != null ? ePackage.getEFactoryInstance() : null);
		}

		private boolean register(Map<String, Object> map, String key) {
			if (! map.containsKey(key)) {
				map.put(key, this);
				return true;
			}
			return false;
		}
		
		void registerResourceFactory() {
			if (fileExtension != null) {
				if (register(Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap(), fileExtension)) {
					if (logger != null) {
						logger.log(LogService.LOG_INFO, "Registered Resource.Factory for " + fileExtension + " extension");
					}
				}
			}
		}
		
		@Override
		public Factory createFactory() {
			if (resourceFactoryClassName == null) {
				return null;
			}
			Bundle bundle = findBundle(this.bundleId);
			if (bundle != null) {
				try {
					Class<?> resourceFactoryClass = bundle.loadClass(resourceFactoryClassName);
					return (Factory) resourceFactoryClass.newInstance();
				} catch (Exception e) {
					if (logger != null) {
						logger.log(LogService.LOG_ERROR, "Exception when loading " + className + ": ", e);
					}
				}
			} else if (logger != null) {
				logger.log(LogService.LOG_INFO, "Didn't find bundle with symbolic name " + bundleId + ", when loading " + className);
			}
			return null;
		}
	}
	
	//

	protected class XD {

		final String bundleId, setupClassName;
		
		public XD(String bundleId, String setupClassName) {
			this.bundleId = bundleId;
			this.setupClassName = setupClassName;
		}
		
		public XD(String bundleId, String setupClassName, Object... formatArgs) {
			this(String.format(bundleId, formatArgs), String.format(setupClassName, formatArgs));
		}

		boolean doSetup() {
			Bundle bundle = findBundle(this.bundleId);
			if (bundle != null) {
				try {
					Class<?> setupClass = bundle.loadClass(setupClassName);
					setupClass.getMethod("doSetup").invoke(null);
					if (logger != null) {
						logger.log(LogService.LOG_INFO, "Invoked " + setupClassName + ".doSetup()");
					}
					return true;
				} catch (Exception e) {
					if (logger != null) {
						logger.log(LogService.LOG_ERROR, "Exception when loading " + setupClassName + " and invoking doSetup(): ", e);
					}
				}
			} else if (logger != null) {
				logger.log(LogService.LOG_INFO, "Didn't find bundle with symbolic name " + bundleId + ", when loading " + setupClassName);
			}
			return false;
		}
	}
}
