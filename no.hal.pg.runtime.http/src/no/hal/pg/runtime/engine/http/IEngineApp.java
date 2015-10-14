package no.hal.pg.runtime.engine.http;

import java.util.Map;

import javax.servlet.http.HttpServlet;

import org.eclipse.emf.ecore.EObject;

public interface IEngineApp {
	public boolean isAppFor(EObject eObject);
	public String getName();
	public Map<String, String> getResourceAliasMapping();
	public HttpServlet getAppServlet();
}
