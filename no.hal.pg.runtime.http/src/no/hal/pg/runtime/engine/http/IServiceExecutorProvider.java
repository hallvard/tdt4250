package no.hal.pg.runtime.engine.http;

import no.hal.pg.runtime.engine.IServiceExecutor;

public interface IServiceExecutorProvider {
	public IServiceExecutor getServiceExecutor();
}
