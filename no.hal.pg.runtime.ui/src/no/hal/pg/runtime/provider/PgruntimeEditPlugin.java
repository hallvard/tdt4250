/**
 */
package no.hal.pg.runtime.provider;

import java.util.Collection;

import org.eclipse.emf.common.EMFPlugin;
import org.eclipse.emf.common.ui.EclipseUIPlugin;
import org.eclipse.emf.common.util.ResourceLocator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.InvalidSyntaxException;
import org.osgi.framework.ServiceReference;
import org.osgi.service.component.ComponentFactory;
import org.osgi.service.component.ComponentInstance;

import no.hal.pg.model.provider.PgEditPlugin;
import no.hal.pg.runtime.engine.Engine;
import no.hal.pg.runtime.engine.IEngine;

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
	}
}
