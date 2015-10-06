package no.hal.pg.runtime.engine;

import org.eclipse.emf.ecore.EObject;

public interface IReferenceResolver {
	public EObject resolveReference(String reference, EObject context);
}
