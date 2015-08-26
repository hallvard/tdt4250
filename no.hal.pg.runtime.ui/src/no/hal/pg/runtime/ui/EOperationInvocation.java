package no.hal.pg.runtime.ui;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.ChangeCommand;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class EOperationInvocation extends ChangeCommand {

		private EOperation operation = null;
		private EObject argumentsInstance = null;
		private Object result = null;

		public EOperationInvocation(EObject operationOwner) {
			super(operationOwner);
		}

		public void dispose() {
			super.dispose();
			operation = null;
			argumentsInstance = null;
			result = null;
		}
		
		public EObject getOperationOwner() {
			return (EObject) notifier;
		}

		public void setOperation(EOperation operation, EObject argumentsInstance) {
			this.operation = operation;
			this.argumentsInstance = argumentsInstance;
		}
		
		private EList<Object> argumentList = new BasicEList<Object>();

		@Override
		protected boolean prepare() {
			if (! super.prepare() || getOperationOwner() == null || operation == null) {
				return false;
			}
			for (EStructuralFeature property : argumentsInstance.eClass().getEStructuralFeatures()) {
				Object value = argumentsInstance.eGet(property);
				argumentList.add(value);
			}
			return true;
		}

		public Object getInvocationResult() {
			return result;
		}
		
		protected void doExecute() {
			try {
				result = getOperationOwner().eInvoke(operation, argumentList);
			} catch (Exception e) {
				result = e;
			}
		}

//		public boolean didChange() {
//			ChangeDescription changes = getChangeDescription();
//			return changes.getObjectChanges().size() == 0 && changes.getResourceChanges().size() == 0;
//		}
		
		void execute(IEditingDomainProvider editingDomainProvider, Shell shell) {
			if (! canExecute()) {
				return;
			}
			if (editingDomainProvider != null) {
				editingDomainProvider.getEditingDomain().getCommandStack().execute(this);
			} else {
				execute();
			}
			if (result != null && shell != null) {
				MessageDialog dialog = new MessageDialog(shell, "Invocation result", null, String.valueOf(result),
						(result instanceof Exception ? MessageDialog.ERROR : MessageDialog.INFORMATION), new String[]{"Close"}, 0);
				dialog.open();
			}
		}
	}