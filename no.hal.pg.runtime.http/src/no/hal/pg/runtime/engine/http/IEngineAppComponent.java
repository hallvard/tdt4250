package no.hal.pg.runtime.engine.http;

import java.net.URL;

public interface IEngineAppComponent extends IEngineApp {
	public URL getResource(String name);
	public String getRefreshServiceUrlPath();
}
