package no.hal.pg.runtime.engine.http;

import java.util.Collection;

import javax.servlet.http.HttpServlet;

public interface IEngineApp {

	public String getName();
	public Collection<String> getResourceNames();
	public HttpServlet getAppServlet();
}
