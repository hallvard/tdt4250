package no.hal.pg.runtime.engine;

import no.hal.pg.model.GameDef;
import no.hal.pg.runtime.Game;

public interface IEngine {
	
	public void init(GameDef gameDef);
	public void start();

	public void init(Game game);

	public String getKey();
	public Game getGame();
	public IServiceExecutor getServiceExecutor();
}
