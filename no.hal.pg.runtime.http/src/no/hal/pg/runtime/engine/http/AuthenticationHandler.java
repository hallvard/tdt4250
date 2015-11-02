package no.hal.pg.runtime.engine.http;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.engine.ISubjectProvider;

public interface AuthenticationHandler extends ISubjectProvider {
	public void acceptRequest(HttpServletRequest req, EObject context);
	public void forceAuthentication(HttpServletResponse resp, String message, String engineKey) throws IOException;
}
