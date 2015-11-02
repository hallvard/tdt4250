package no.hal.pg.runtime.engine.http;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.model.Person;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.util.Util;

public class HttpAuthenticationHandler extends AbstractAuthenticationHandler {

	private String authHeader;
	
	public HttpAuthenticationHandler(boolean autoAuthenticate) {
		super(autoAuthenticate);
	}

	public HttpAuthenticationHandler() {
		super(null);
	}
	
	@Override
	public Person getSubject() {
		if (authHeader != null) {
			StringTokenizer st = new StringTokenizer(authHeader);
			if (st.hasMoreTokens() && st.nextToken().equalsIgnoreCase("Basic")) {
				String credentials = null;
				try {
					credentials = new String(Base64.getDecoder().decode(st.nextToken()), "UTF-8");
				} catch (UnsupportedEncodingException e) {
				}
				if (credentials != null) {
					int p = credentials.indexOf(":");
					if (p >= 0) {
						return getSubject(credentials.substring(0, p).trim(), credentials.substring(p + 1).trim());
					}
				}
			}
		}
		return null;
	}

	protected Person getSubject(String username, String password) {
		for (Player player : Util.getPlayers(context, false)) {
			Person person = player.getPerson();
			if (isPerson(person, username, password)) {
				return person;
			}
		}
		return null;
	}
	
	protected boolean isPerson(Person person, String username, String password) {
		if (! person.getIds().contains(username)) {
			return false;
		}
		String personPass = "";
		char lastChar = '\0';
		for (int i = 0; i < username.length(); i++) {
			char c = username.charAt(i);
			if (Character.isLetter(c) && (! Character.isLetter(lastChar))) {
				personPass += c;
			}
			lastChar = c;
		}
		return personPass.equals(password);
	}

	@Override
	public void acceptRequest(HttpServletRequest req, EObject context) {
		this.context = context;
		this.authHeader = req.getHeader("Authorization");
	}

	@Override
	public void forceAuthentication(HttpServletResponse resp, String message, String engineKey) throws IOException {
		resp.setHeader("WWW-Authenticate", "Basic realm=\"" + engineKey + "\"");
		resp.sendError(401, message);
	}
}
