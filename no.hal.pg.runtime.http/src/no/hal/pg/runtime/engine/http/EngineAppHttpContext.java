package no.hal.pg.runtime.engine.http;

import java.io.IOException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.osgi.service.http.HttpContext;

public class EngineAppHttpContext implements HttpContext {

	private final IEngineApp engineApp;
	private final HttpContext delegate;

	public EngineAppHttpContext(IEngineApp engineApp, HttpContext delegate) {
		this.engineApp = engineApp;
		this.delegate = delegate;
	}

	@Override
	public boolean handleSecurity(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return (delegate == null || delegate.handleSecurity(request, response));
	}
	
	@Override
	public URL getResource(String name) {
		URL resourceUrl = null;
		if (engineApp instanceof IEngineAppComponent) {
			resourceUrl = ((IEngineAppComponent) engineApp).getResource(name);
		}
		if (resourceUrl == null && delegate != null) {
			resourceUrl = delegate.getResource(name);
		}
		return resourceUrl;
	}

	@Override
	public String getMimeType(String name) {
		return (delegate != null ? delegate.getMimeType(name) : null);
	}
}
