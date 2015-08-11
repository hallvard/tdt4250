package no.hal.pg.runtime.util;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;

public class Util {

	public static boolean containsPlayer(EObject eObject, Player player, boolean includeContainers) {
		while (eObject != null) {
			if (eObject instanceof Players) {
				EList<Player> players = ((Players) eObject).getPlayers();
				if (players.size() > 0 && players.contains(player)) {
					return true;
				}
			}
			eObject = (includeContainers ? eObject.eContainer() : null);
		}
		return false;
	}
}
