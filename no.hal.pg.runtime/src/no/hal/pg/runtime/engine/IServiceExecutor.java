package no.hal.pg.runtime.engine;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IServiceExecutor {
	public void init(EObject... eObject);
	public EObject resolve(String reference, boolean use);
	public void execute(String serviceName, Map<String, ? extends Object> args);
	public void select(int start, int end);
	public Object[] getObjects();
	public Object[] getObjects(EObject referenceContext);
	
	public String SERVICE_NAMES_WILDCARD = "*";
	public Map<String, Object> executeFeatureServices(EObject eObject, String featureNames);
}
