package no.hal.pg.runtime.engine.http;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.model.Person;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.engine.ISubjectProvider;
import no.hal.pg.runtime.util.Util;

public class AuthHeaderSubjectProvider implements ISubjectProvider {

	private final EObject context;
	
	public AuthHeaderSubjectProvider(EObject context) {
		this.context = context;
	}

	private String authHeader;
	
	public void setAuthHeader(HttpServletRequest req) {
		setAuthHeader(req.getHeader("Authorization"));			
	}
	public void setAuthHeader(String authHeader) {
		this.authHeader = authHeader;
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
						String username = credentials.substring(0, p).trim();
						String password = credentials.substring(p + 1).trim();
						for (Player player : Util.getPlayers(context, false)) {
							Person person = player.getPerson();
							if (isPerson(person, username, password)) {
								return person;
							}
						}
					}
				}
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
}
