package no.hal.pg.runtime.engine;

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

public interface IServiceExecutor {
	public void init(EObject... eObject);
	public void execute(String serviceName, Map<String, Object> args);
	public void select(int start, int end);
	public Object[] getObjects();
}
