package no.hal.pg.karaf.console;

import org.eclipse.emf.common.util.URI;

import no.hal.pg.model.GameDef;
import no.hal.pg.runtime.engine.GameRunner;

public class RunGameCommand {

	private GameRunner gameRunner;
	
	public void runGame(String uri) {
		if (gameRunner == null) {
			gameRunner = new GameRunner();
		}
		GameDef game = gameRunner.loadGame(URI.createURI(uri));
		gameRunner.runGame(game);
	}
}
