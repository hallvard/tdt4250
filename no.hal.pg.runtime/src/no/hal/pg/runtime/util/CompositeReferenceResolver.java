package no.hal.pg.runtime.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.engine.IReferenceResolver;

public class CompositeReferenceResolver implements IReferenceResolver {

	protected Collection<IReferenceResolver> referenceResolvers = new ArrayList<IReferenceResolver>();
	
	public void addReferenceResolver(IReferenceResolver referenceResolver) {
		referenceResolvers.add(referenceResolver);
	}
	
	public void removeReferenceResolver(IReferenceResolver referenceResolver) {
		referenceResolvers.remove(referenceResolver);
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		return resolveReference(reference, context, referenceResolvers);
	}
	
	//
	
	
	public static EObject resolveReference(String ref, EObject context, Iterable<IReferenceResolver> referenceResolvers) {
		for (IReferenceResolver referenceResolver : referenceResolvers) {
			EObject resolved = referenceResolver.resolveReference(ref, context);
			if (resolved != null) {
				return resolved;
			}
		}
		return null;
	}
}
