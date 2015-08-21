package no.hal.pg.runtime.engine;

import no.hal.pg.runtime.Service;

public interface IServiceListener {
	public void serviceActivated(Service<?> service);
	public void serviceDeactivated(Service<?> service);
}
