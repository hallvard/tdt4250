package no.hal.pg.runtime.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.engine.IReferenceHandler;

public class CompositeReferenceHandler implements IReferenceHandler {

	private Collection<IReferenceHandler> referenceHandlers = new ArrayList<IReferenceHandler>();
	
	public void addReferenceHandler(IReferenceHandler referenceHandler) {
		referenceHandlers.add(referenceHandler);
	}
	
	public void removeReferenceHandler(IReferenceHandler referenceHandler) {
		referenceHandlers.remove(referenceHandler);
	}

	@Override
	public String getReference(EObject eObject, EObject context) {
		return getReference(eObject, context, referenceHandlers);
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		return resolveReference(reference, context, referenceHandlers);
	}
	
	//
	
	
	public static EObject resolveReference(String ref, EObject referenceContext, Iterable<IReferenceHandler> referenceHandlers) {
		for (IReferenceHandler referenceHandler : referenceHandlers) {
			EObject resolved = referenceHandler.resolveReference(ref, referenceContext);
			if (resolved != null) {
				return resolved;
			}
		}
		return null;
	}
	
	public static String getReference(EObject eObject, EObject referenceContext, Iterable<IReferenceHandler> referenceHandlers) {
		for (IReferenceHandler referenceHandler : referenceHandlers) {
			String ref = referenceHandler.getReference(eObject, referenceContext);
			if (ref != null) {
				return ref;
			}
		}
		return null;
	}
}
