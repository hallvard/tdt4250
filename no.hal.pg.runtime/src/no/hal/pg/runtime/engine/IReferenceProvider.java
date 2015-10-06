package no.hal.pg.runtime.engine;

import org.eclipse.emf.ecore.EObject;

public interface IReferenceProvider {
	public String getReference(EObject eObject, EObject context);
}
