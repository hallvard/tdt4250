package no.hal.pg.runtime.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.engine.IReferenceProvider;

public class CompositeReferenceProvider implements IReferenceProvider {

	protected Collection<IReferenceProvider> referenceProviders = new ArrayList<IReferenceProvider>();
	
	public void addReferenceProvider(IReferenceProvider referenceProvider) {
		referenceProviders.add(referenceProvider);
	}
	
	public void removeReferenceProvider(IReferenceProvider referenceProvider) {
		referenceProviders.remove(referenceProvider);
	}

	@Override
	public String getReference(EObject eObject, EObject context) {
		return getReference(eObject, context, referenceProviders);
	}

	//
	
	public static String getReference(EObject eObject, EObject referenceContext, Iterable<IReferenceProvider> referenceProviders) {
		for (IReferenceProvider referenceProvider : referenceProviders) {
			String ref = referenceProvider.getReference(eObject, referenceContext);
			if (ref != null) {
				return ref;
			}
		}
		return null;
	}
}
