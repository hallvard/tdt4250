package no.hal.pg.runtime.engine.util;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.osgi.service.component.annotations.Component;

import no.hal.pg.model.Person;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IReferenceProvider;
import no.hal.pg.runtime.engine.IReferenceResolver;

@Component
public class PlayerReferenceHandler implements IReferenceResolver, IReferenceProvider {

	@Override
	public String getReference(EObject eObject, EObject context) {
		if (eObject instanceof Player) {
			Person person = ((Player) eObject).getPerson();
			EList<String> ids = person.getIds();
			return (ids.isEmpty() ? null : ids.get(0));
		}
		return null;
	}

	@Override
	public EObject resolveReference(String reference, EObject context) {
		if (context instanceof Service<?>) {
			context = (EObject) ((Service<?>) context).getContext();
		}
		Collection<Player> players = null;
		while (context != null) {
			if (context instanceof Players) {
				players = ((Players) context).getAllPlayers();
				if (players.size() > 0) {
					break;
				}
				players = null;
			}
			context = context.eContainer();
		}
		if (players != null) {
			for (Player player : players) {
				if (player.getPerson().getIds().contains(reference)) {
					return player;
				}
			}
		}
		return null;
	}
}
