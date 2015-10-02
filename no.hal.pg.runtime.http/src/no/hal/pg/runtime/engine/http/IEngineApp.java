package no.hal.pg.runtime.engine.http;

import java.util.Collection;

import javax.servlet.http.HttpServlet;

import org.eclipse.emf.ecore.EClass;

public interface IEngineApp<T> {

	public String getDisplayName();
	public EClass getDataClass();
	
	public Collection<String> getResourceNames();
	
	public HttpServlet getServlet(T t, String dataUrl);
}
