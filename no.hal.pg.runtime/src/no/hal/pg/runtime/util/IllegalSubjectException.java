package no.hal.pg.runtime.util;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.model.Person;

@SuppressWarnings({ "serial" })
public class IllegalSubjectException extends RuntimeException {

	private final Person subject;
	private final EObject service;
	
	public IllegalSubjectException(Person subject, EObject service) {
		super();
		this.subject = subject;
		this.service = service;
	}
	
	@Override
	public String toString() {
		return "Couldn't perform " + service + " on behalf of " + subject;
	}
}
