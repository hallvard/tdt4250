package no.hal.pg.runtime.engine;

import no.hal.pg.runtime.Service;

public interface IServiceProvider {
	public Iterable<Service<?>> getGameServices();
}
