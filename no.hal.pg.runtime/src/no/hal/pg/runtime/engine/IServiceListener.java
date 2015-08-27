package no.hal.pg.runtime.engine;

import no.hal.pg.runtime.Service;

public interface IServiceListener {
	public void serviceActivated(IEngine engine, Service<?> service);
	public void serviceDeactivated(IEngine engine, Service<?> service);
}
