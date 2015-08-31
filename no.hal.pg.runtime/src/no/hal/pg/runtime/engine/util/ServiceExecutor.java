package no.hal.pg.runtime.engine.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;

import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.engine.Engine;

public class ServiceExecutor {

	private final Engine engine;
	
	public ServiceExecutor(Engine engine) {
		this.engine = engine;
	}
	
	private List<Object> objects;

	public void init(EObject eObject) {
		setObjects(eObject);
	}
	
	public void execute(String serviceName, Map<String, Object> args) {
		Collection<Object> results = new ArrayList<Object>();
		for (Object object : objects) {
			if (object instanceof EObject) {
				for (Service<?> service : engine.getServices((EObject) object)) {
					EList<EOperation> operations = service.eClass().getEOperations();
					EOperation operation = getServiceOperation(serviceName, args, operations);
					if (operation != null) {
					} else if (args == null) {
						EStructuralFeature feature = service.eClass().getEStructuralFeature(serviceName);
						if (feature != null) {
							Object value = service.eGet(feature);
							if (value instanceof Collection<?>) {
								results.addAll((Collection<?>) value);
							} else {
								results.add(value);
							}
						}
					}
				}
			}
		}
		setObjects(results);
	}
	
	protected void setObjects(Collection<Object> results) {
		objects.clear();
		objects.addAll(results);
	}

	protected void setObjects(Object... objects) {
		setObjects(Arrays.asList(objects));
	}
	
	public void select(int start, int end) {
		if (start < 0) {
			start = objects.size() + start;
		}
		if (end < 0) {
			end = objects.size() + end + 1;
		}
		Collection<Object> selection = new ArrayList<Object>(objects.subList(start, end));
		setObjects(selection);
	}
	
	public Object[] getObjects() {
		return objects.toArray();
	}

	//

	protected EOperation getServiceOperation(String serviceName, Map<String, Object> args, Iterable<EOperation> operations) {
		outer: for (EOperation operation : operations) {
			int argCount = (args != null ? args.size() : 0);
			if (argCount == operation.getEParameters().size() && operation.getName().equals(serviceName)) {
				for (EParameter param : operation.getEParameters()) {
					if (! args.containsKey(param.getName())) {
						continue outer;
					}
				}
				return operation;
			}
		}
		return null;
	}
}
