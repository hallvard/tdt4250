package no.hal.pg.runtime.engine.web;

import java.util.Arrays;
import java.util.Collection;

import javax.servlet.http.HttpServlet;

import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.engine.http.AbstractEngineAppComponent;

public class GameApp extends AbstractEngineAppComponent<Game> {
	
	@Override
	public Collection<String> getResourceNames() {
		return Arrays.asList(
			"web/GameApp.css",
			"PlayerComponent.js",
			"TaskComponent.js",
			"TaskListComponent.js"
		);
	}

	@Override
	public HttpServlet getServlet(Game game, String dataUrl) {
		return null;
	}
}
