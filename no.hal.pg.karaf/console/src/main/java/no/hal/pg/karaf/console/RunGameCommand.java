package no.hal.pg.karaf.console;

import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import no.hal.pg.runtime.engine.GameRunner;

@Command(scope="pg", name="run-game", description="Run game")
@Service
public class RunGameCommand implements Action {

	// pg:run-game file:/Users/hal/java/git/tdt4250/no.hal.pg.runtime.examples/src/no/hal/pg/runtime/examples/example1.pg
	
	@Argument(
		index=0,
		name="uri",
		description="The URI of the GameDef",
		required=true,
		multiValued=false
	)
    String uri = null;
	
	@Reference(optional=false)
	private GameRunner gameRunner;
	
	@Override
	public Object execute() {
		if (gameRunner == null) {
			gameRunner = new GameRunner();
		}
		try {
			gameRunner.run(uri, null);
		} catch (Exception e) {
			System.err.println("Exception when running run-game: " + e);
			e.printStackTrace(System.err);
		}
		return null;
	}
}
