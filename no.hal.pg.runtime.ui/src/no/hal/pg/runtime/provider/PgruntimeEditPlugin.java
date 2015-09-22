/**
 */
package no.hal.pg.runtime.provider;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.InvalidRegistryObjectException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;

import no.hal.pg.model.provider.PgEditPlugin;
import no.hal.pg.runtime.engine.Engine;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.ui.html.HtmlGenerator;

/**
 * This is the central singleton for the Pg-runtime editor plugin.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public final class PgruntimeEditPlugin extends EMFPlugin {
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final PgruntimeEditPlugin INSTANCE = new PgruntimeEditPlugin();
	
	/**
	 * Keep track of the singleton.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Implementation plugin;

	/**
	 * Create the instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PgruntimeEditPlugin() {
		super
			(new ResourceLocator [] {
				PgEditPlugin.INSTANCE,
			});
	}

	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	@Override
	public ResourceLocator getPluginResourceLocator() {
		return plugin;
	}
	
	/**
	 * Returns the singleton instance of the Eclipse plugin.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the singleton instance.
	 * @generated
	 */
	public static Implementation getPlugin() {
		return plugin;
	}
	
	/**
	 * The actual implementation of the Eclipse <b>Plugin</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static class Implementation extends EclipseUIPlugin {
		/**
		 * Creates an instance.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		public Implementation() {
			super();
	
			// Remember the static instance.
			//
			plugin = this;
		}

		public IEngine createEngine() {
			BundleContext bundleContext = plugin.getBundle().getBundleContext();
			Collection<ServiceReference<ComponentFactory>> serviceReferences = null;
			try {
				serviceReferences = bundleContext.getServiceReferences(ComponentFactory.class, "(component.factory=" + Engine.FACTORY_ID + ")");
			} catch (InvalidSyntaxException e) {
			}
			if (serviceReferences != null && serviceReferences.size() > 0) {
				ComponentFactory factory = bundleContext.getService(serviceReferences.iterator().next());
				ComponentInstance instance = factory.newInstance(null);
				return (IEngine) instance.getInstance();
			}
			return null;
		}
		
		private Map<EClass, Collection<HtmlGenerator>> htmlGenerators = null;
		
		public Collection<HtmlGenerator> getGenerators(EObject eObject) {
			if (htmlGenerators == null) {
				htmlGenerators = new HashMap<EClass, Collection<HtmlGenerator>>();
				processHtmlGeneratorExtensions();
			}
			Collection<HtmlGenerator> result = new ArrayList<HtmlGenerator>();
			addHtmlGenerators(eObject.eClass(), result);
			for (EClass eClass : eObject.eClass().getEAllSuperTypes()) {
				addHtmlGenerators(eClass, result);
			}
			System.out.println("Generators for " + eObject + ": " + result);
			return result;
		}
		
		private void addHtmlGenerators(EClass eClass, Collection<HtmlGenerator> htmlGenerators) {
			Collection<HtmlGenerator> generators = this.htmlGenerators.get(eClass);
			if (generators != null) {
				htmlGenerators.addAll(generators);
			}
		}

		private void processHtmlGeneratorExtensions() {
			IConfigurationElement[] elements = Platform.getExtensionRegistry().getConfigurationElementsFor("no.hal.pg.runtime.ui.htmlGenerator");
			for (int i = 0; i < elements.length; i++) {
				IConfigurationElement element = elements[i];
				if ("htmlGenerator".equals(element.getName())) {
					try {
						String ePackUri = element.getAttribute("ePackage");
						String eClasses = element.getAttribute("eClasses");
						EPackage ePackage = EPackage.Registry.INSTANCE.getEPackage(ePackUri);
						if (ePackage != null && eClasses != null) {
							String[] eClassNames = eClasses.split(" ");
							HtmlGenerator htmlGenerator = null;
							for (int j = 0; j < eClassNames.length; j++) {
								EClassifier eClassifier = ePackage.getEClassifier(eClassNames[j]);
								if (eClassifier instanceof EClass) {
									if (htmlGenerator == null) {
										htmlGenerator = (HtmlGenerator) element.createExecutableExtension("generatorClass");
									}
									Collection<HtmlGenerator> generators = htmlGenerators.get((EClass) eClassifier);
									if (generators == null) {
										generators = new ArrayList<HtmlGenerator>();
										htmlGenerators.put((EClass) eClassifier, generators);
									}
									generators.add(htmlGenerator);
								}
							}
						}
					} catch (Exception e) {
					}
				}
			}
		}
	}
}
