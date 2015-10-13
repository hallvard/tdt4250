package no.hal.pg.runtime.ui;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.Action;

public abstract class CommandAction extends Action {
	
	public CommandAction(String name) {
		super(name);
	}
	
	public abstract void execute(EObject context);
}
