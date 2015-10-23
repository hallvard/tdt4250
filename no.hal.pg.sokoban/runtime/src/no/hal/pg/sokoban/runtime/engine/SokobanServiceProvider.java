package no.hal.pg.sokoban.runtime.engine;

import org.eclipse.emf.ecore.EObject;

import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.IServiceProvider;
import no.hal.pg.runtime.util.Util;
import no.hal.pg.sokoban.runtime.RuntimePackage;
import no.hal.pg.sokoban.runtime.SokobanTask;
import no.hal.sokoban.model.SokobanGame;
import no.hal.sokoban.model.SokobanGrid;

public class SokobanServiceProvider implements IServiceProvider {

	@Override
	public Service<?> getService(EObject eObject) {
		if (eObject instanceof SokobanTask) {
			return Util.createService(RuntimePackage.eINSTANCE.getSokobanService(), (SokobanTask) eObject);
		} else if (eObject instanceof SokobanGame) {
			return Util.createService(RuntimePackage.eINSTANCE.getSokobanGameService(), (SokobanGame) eObject);
		} else if (eObject instanceof SokobanGrid) {
			return Util.createService(RuntimePackage.eINSTANCE.getSokobanGridService(), (SokobanGrid) eObject);
		}
		return null;
	}
}
