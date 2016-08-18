package no.hal.pg.runtime.engine;

import no.hal.pg.model.GameDef;
import no.hal.pg.runtime.Game;

public interface IGameRunner {
	public IEngine run(String uri, String key);
	public IEngine runGame(GameDef gameDef, String key);
	public IEngine resumeGame(Game game, String key);
}
