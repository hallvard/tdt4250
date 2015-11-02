package no.hal.pg.runtime.engine.http;

import java.util.Collection;

import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.model.Person;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.util.Util;

public abstract class AbstractAuthenticationHandler implements AuthenticationHandler {

	protected EObject context;
	
	private final Boolean autoAuthenticate;
	
	protected AbstractAuthenticationHandler(Boolean autoAuthenticate) {
		this.autoAuthenticate = autoAuthenticate;
	}

	@Override
	public Person getSubject() {
		if (! Boolean.FALSE.equals(autoAuthenticate)) {
			Collection<Player> players = Util.getPlayers(context, false);
			if (autoAuthenticate || players.size() == 1) {
				for (Player player : players) {
					return player.getPerson();
				}
			}
		}
		return null;
	}

	@Override
	public void acceptRequest(HttpServletRequest req, EObject context) {
		this.context = context;
	}
}
