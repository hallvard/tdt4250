package no.hal.pg.runtime.engine;

import org.eclipse.emf.ecore.EObject;

public interface IReferenceHandler {
	public String getReference(EObject eObject, EObject context);
	public EObject resolveReference(String reference, EObject context);
}
