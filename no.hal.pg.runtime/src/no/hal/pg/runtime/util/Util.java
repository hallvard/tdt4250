package no.hal.pg.runtime.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;

public class Util {
	
	public static Collection<Player> getPlayers(EObject eObject, boolean includeContainers) {
		Collection<Player> result = new ArrayList<Player>();
		while (eObject != null) {
			if (eObject instanceof Players) {
				EList<Player> players = ((Players) eObject).getPlayers();
				if (players.size() > 0) {
					result.addAll(players);
					if (! includeContainers) {
						break;
					}
				}
			}
			eObject = eObject.eContainer();
		}
		return result;
	}

	public static boolean containsPlayer(EObject eObject, Player player, boolean includeContainers) {
		while (eObject != null) {
			if (eObject instanceof Players) {
				EList<Player> players = ((Players) eObject).getPlayers();
				if (players.size() > 0) {
					if (players.contains(player)) {
						return true;
					}
					if (! includeContainers) {
						return false;
					}
				}
			}
			eObject = eObject.eContainer();
		}
		return false;
	}
}
