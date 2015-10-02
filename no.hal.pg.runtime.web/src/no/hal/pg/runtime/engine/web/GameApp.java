package no.hal.pg.runtime.engine.web;

import java.util.Arrays;
import java.util.Collection;

import no.hal.pg.runtime.engine.http.EngineAppComponent;

public class GameApp extends EngineAppComponent {
	
	@Override
	public Collection<String> getResourceNames() {
		return Arrays.asList(
			"web/GameApp.html",
			"web/GameApp.css",
			"web/PlayerComponent.js",
			"web/TaskComponent.js",
			"web/TaskListComponent.js"
		);
	}
}
