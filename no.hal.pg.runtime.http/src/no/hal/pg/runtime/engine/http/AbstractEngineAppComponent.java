package no.hal.pg.runtime.engine.http;

import java.util.Collection;
import java.util.Collections;
import java.util.Dictionary;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.osgi.service.cm.ConfigurationException;
import org.osgi.service.cm.ManagedService;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;

public abstract class AbstractEngineAppComponent<T> implements IEngineApp<T>, ManagedService {

	private String displayName;
	private EClass dataClass;
	
	@Override
	public String getDisplayName() {
		return displayName;
	}
	
	protected void setDisplayName(String displayName) {
		this.displayName = displayName;
	}
	
	@Override
	public EClass getDataClass() {
		return dataClass;
	}
	protected void setDataClass(EClass dataClass) {
		this.dataClass = dataClass;
	}
	
	@Activate
	public void activate(ComponentContext context) throws Exception {
		configure(context.getProperties());
	}
	
	protected boolean configure(Dictionary<String, ?> properties) {
		try {
			Object displayNameProperty = properties.get("EngineAppComponent.displayName");
			if (displayNameProperty != null) {
				setDisplayName(String.valueOf(displayNameProperty));
			}
			EClass dateClassProperty = getEClassProperty(properties, "EngineAppComponent.dataClass");
			if (dateClassProperty != null) {
				setDataClass(dateClassProperty);
			}
			return true;
		} catch (Exception e) {
			return false;
		}		
	}

	protected EClass getEClassProperty(Dictionary<String, ?> properties, String propertyName) {
		String eClassName = (String) properties.get(propertyName);
		int pos = eClassName.indexOf('#');
		EPackage ePackage = (EPackage) EPackage.Registry.INSTANCE.getEPackage(eClassName.substring(0, pos));
		EClass eClass = (EClass) ePackage.getEClassifier(eClassName.substring(pos + 1));
		return eClass;
	}

	public void updated(Dictionary<String, ?> properties) throws ConfigurationException {
		configure(properties);
	}

	@Deactivate
	public void deactivate(ComponentContext context) throws Exception {
	}

	//
	
	@Override
	public Collection<String> getResourceNames() {
		return Collections.emptyList();
	}
}
