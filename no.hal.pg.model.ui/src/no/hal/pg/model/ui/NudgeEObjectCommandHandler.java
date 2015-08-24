package no.hal.pg.model.ui;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IHandlerListener;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

public class NudgeEObjectCommandHandler extends AbstractHandler {

	public NudgeEObjectCommandHandler() {
		super();
	}
	
	public void dispose() {
	}

	private EObject getSelection(IWorkbenchWindow wbw) {
		return (wbw != null && wbw.getActivePage() != null ? getSelection(wbw.getActivePage().getSelection()) : null);
	}
	private EditingDomain getEditingDomainProvider(IWorkbenchWindow wbw) {
		if (wbw == null || wbw.getActivePage() == null) {
			return null;
		}
		IWorkbenchPart part = wbw.getActivePage().getActivePart();
		return (part instanceof IEditingDomainProvider ? ((IEditingDomainProvider) part).getEditingDomain() : null);
	}

	private EObject getSelection(ISelection selection) {
		if (selection instanceof IStructuredSelection && ((IStructuredSelection)selection).getFirstElement() instanceof EObject) {
			return (EObject) (((IStructuredSelection) selection).getFirstElement());
		}
		return null;
	}

	private final String movementDeltaParameterId = "org.eclipse.e4.emf.ui.NudgeEObjectCommand.movementDelta";
	private final String shouldCopyParameterId = "org.eclipse.e4.emf.ui.NudgeEObjectCommand.shouldCopy";
	
	public Object execute(ExecutionEvent event) throws ExecutionException {
		Command command = createCommand(event);
		if (command != null && command.canExecute()) {
			EditingDomain editingDomain = getEditingDomainProvider(HandlerUtil.getActiveWorkbenchWindow(event));
			if (editingDomain != null) {
				editingDomain.getCommandStack().execute(command);
			} else {
				command.execute();
			}
			return command.getAffectedObjects();
		}
		return null;
	}

	public Command createCommand(ExecutionEvent event) {
		// first, get the selection
		Object object = getSelection(HandlerUtil.getActiveWorkbenchWindow(event));
		if (object == null) {
			return null;
		}
		
		// second, find the parent and siblings, and siblings size (the siblings are needed for finding the position)
		Object parent = null;
		Collection<?> siblings = null;
		EditingDomain editingDomain = getEditingDomainProvider(HandlerUtil.getActiveWorkbenchWindow(event));
		if (editingDomain instanceof AdapterFactoryEditingDomain) {
			AdapterFactory adapterFactory = ((AdapterFactoryEditingDomain) editingDomain).getAdapterFactory();
			parent = ((ITreeItemContentProvider) adapterFactory.adapt(object, ITreeItemContentProvider.class)).getParent(object);
			siblings = ((ITreeItemContentProvider) adapterFactory.adapt(parent, ITreeItemContentProvider.class)).getChildren(parent);
		} else if (object instanceof EObject) {
			EReference containmentFeature = ((EObject) object).eContainmentFeature();		
			if (containmentFeature != null && containmentFeature.isMany()) {
				EObject container = ((EObject) object).eContainer();
				parent = container;
				siblings = (Collection<?>) container.eGet(containmentFeature);
			}
		}
		if (parent == null || siblings == null) {
			return null;
		}
		

		// third, find existing position
		int pos = -1;
		if (siblings instanceof List<?>) {
			pos = ((List) siblings).indexOf(object);
		} else if (siblings instanceof Collection<?>) {
			Iterator<?> it = ((Collection<?>) siblings).iterator();
			for (int i = 0; it.hasNext(); i++) {
				if (it.next() == object) {
					pos = i;
					break;
				}
			}
		}
		if (pos < 0) {
			return null;
		}

		int movementDelta = 0;
		try {
			movementDelta = Integer.parseInt(event.getParameter(movementDeltaParameterId));
		} catch (NumberFormatException e) {
		} catch (NullPointerException e) {
		}
		boolean shouldCopy = "true".equals(event.getParameter(shouldCopyParameterId));

		// fourth, find new position
		int newPos = pos + movementDelta;
		if (newPos < 0) {
			newPos = 0;
		} else if (newPos >= siblings.size()) {
			newPos = siblings.size() - 1;
		}
		
		// finally, compute command
		Command command = null;
		if (shouldCopy && object instanceof EObject) {
			command = AddCommand.create(editingDomain, parent, null, EcoreUtil.copy((EObject) object), newPos);
		} else if (newPos != pos) {
			command = MoveCommand.create(editingDomain, parent, null, object, newPos);
		}
		return command;
	}

	public boolean isEnabled() {
		EObject eObject = getSelection(PlatformUI.getWorkbench().getActiveWorkbenchWindow());
		return (eObject != null);
	}

	public boolean isHandled() {
		return true;
	}

	public void addHandlerListener(IHandlerListener handlerListener) {
	}
	public void removeHandlerListener(IHandlerListener handlerListener) {
	}
}