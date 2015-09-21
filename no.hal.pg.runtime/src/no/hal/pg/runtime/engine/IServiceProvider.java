package no.hal.pg.runtime.engine;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.Service;

public interface IServiceProvider {
	public Service<?> getService(EObject eObject);
}
