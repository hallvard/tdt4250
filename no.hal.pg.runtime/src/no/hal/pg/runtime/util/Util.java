package no.hal.pg.runtime.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.pg.model.Person;
import no.hal.pg.model.TaskDef;
import no.hal.pg.runtime.Player;
import no.hal.pg.runtime.Players;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.SubjectService;
import no.hal.pg.runtime.Task;

public class Util {
	
	public static Collection<Player> getPlayers(EObject eObject, boolean includeContainers) {
		Collection<Player> result = new ArrayList<Player>();
		while (eObject != null) {
			if (eObject instanceof Players) {
				EList<Player> players = ((Players) eObject).getAllPlayers();
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

	public static Player getPlayer(EObject eObject, Person person, boolean includeContainers) {
		for (Player player : getPlayers(eObject, includeContainers)) {
			if (player.getPerson() == person) {
				return player;
			}
		}
		return null;
	}
	
	public static void checkSubject(Person subject, SubjectService<?> service) {
		Player player = Util.getPlayer((EObject) service.getContext(), subject, false);
		if (player == null) {
			throw new IllegalSubjectException(subject, service);
		}
	}
	
	public static boolean containsPlayer(EObject eObject, Player player, boolean includeContainers) {
		while (eObject != null) {
			if (eObject instanceof Players) {
				EList<Player> players = ((Players) eObject).getAllPlayers();
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
	
	public static <T extends TaskDef> Task<T, ?> createTask(EClass eClass, T t) {
		@SuppressWarnings("unchecked")
		Task<T, ?> task = (Task<T, ?>) EcoreUtil.create(eClass);
		task.setTaskDef(t);
		return task;
	}

	public static <T> Service<T> createService(EClass eClass, T t) {
		@SuppressWarnings("unchecked")
		Service<T> service = (Service<T>) EcoreUtil.create(eClass);
		service.setContext(t);
		return service;
	}
}
