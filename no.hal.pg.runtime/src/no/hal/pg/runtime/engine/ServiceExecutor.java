package no.hal.pg.runtime.engine;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;

@Component
public class ServiceExecutor implements IServiceExecutor {

	private Collection<IServiceProvider> serviceProviders = new ArrayList<IServiceProvider>();

	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeServiceProvider"
	)
	public synchronized void addServiceProvider(IServiceProvider serviceProvider) {
		serviceProviders.add(serviceProvider);
		servicesMap.clear();
	}
	
	public synchronized void removeServiceProvider(IServiceProvider serviceProvider) {
		serviceProviders.remove(serviceProvider);
		servicesMap.clear();
	}

	private Map<EObject, Collection<Service<?>>> servicesMap = new HashMap<EObject, Collection<Service<?>>>();
	
	protected Iterable<Service<?>> getServices(EObject eObject) {
		Collection<Service<?>> services = servicesMap.get(eObject);
		if (services == null) {
			services = new ArrayList<Service<?>>();
			for (IServiceProvider serviceProvider : serviceProviders) {
				Service<?> service = serviceProvider.getService(eObject);
				if (service != null) {
					services.add(service);
				}
			}
			servicesMap.put(eObject, services);
		}
		return services;
	}

	//
	
	private Collection<IReferenceHandler> referenceHandlers = new ArrayList<IReferenceHandler>();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeReferenceHandler"
			)
	public synchronized void addReferenceHandler(IReferenceHandler referenceHandler) {
		referenceHandlers.add(referenceHandler);
	}
	
	public synchronized void removeReferenceHandler(IReferenceHandler referenceHandler) {
		referenceHandlers.remove(referenceHandler);
	}
	
	//
	
	private List<Object> objects = new ArrayList<Object>();

	public void init(EObject... eObject) {
		setObjects((Object[]) eObject);
	}
	
	public final static String SelfService_ANNOTATION_KEY = "SelfService";

	public void execute(String serviceName, Map<String, Object> args) {
		Collection<Object> results = new ArrayList<Object>();
		for (Object object : objects) {
			if (object instanceof EObject) {
				EObject eObject = (EObject) object;
				services: for (Service<?> service : getServices(eObject)) {
					EObject target = service;
					ETypedElement serviceElement = getServiceElement(target, serviceName, args);
					if (serviceElement != null) {
						String annotationValue = getSelfServiceAnnotationValue(serviceElement);
						String alternateServiceName = null;
						if ("*".equals(annotationValue)) {
							alternateServiceName = serviceName;
						} else if (annotationValue != null) {
							alternateServiceName = annotationValue;
						}
						if (alternateServiceName != null) {
							target = eObject;
							serviceElement = getServiceElement(target, alternateServiceName, args);							
						}
					} else {
						String annotationValue = getSelfServiceAnnotationValue(service);
						if (annotationValue != null && includesFeature(annotationValue, serviceName)) {
							target = eObject;
							serviceElement = getServiceElement(target, serviceName, args);
						}
					}
					if (serviceElement == null) {
						throwNoSuchServiceException(eObject, serviceName, args);
					}
					if (serviceElement != null) {
						try {
							Object value = tryInvokeServiceElement(target, serviceElement, args);
							if (value instanceof Collection<?>) {
								results.addAll((Collection<?>) value);
							} else {
								results.add(value);
							}
							break services;
						} catch (InvocationTargetException e) {
							throwServiceInvocationException(e, eObject, serviceName, args);
						}
					}
				}
			}
		}
		setObjects(results);
	}

	protected Object throwNoSuchServiceException(EObject eObject, String serviceName, Map<String, Object> args) {
		throw new UnsupportedOperationException(eObject + " does not support the " + serviceName + " service");
	}

	protected Object throwServiceInvocationException(Exception e, EObject eObject, String serviceName, Map<String, Object> args) {
		throw new IllegalArgumentException("Exception when invoking " + serviceName + " on " + eObject + ": " + e, e);
	}

	public static String getSelfServiceAnnotationValue(EObject service) {
		return getSelfServiceAnnotationValue(service.eClass());
	}

	public static String getSelfServiceAnnotationValue(EModelElement modelElement) {
		return EcoreUtil.getAnnotation(modelElement, RuntimePackage.eNS_URI, SelfService_ANNOTATION_KEY);
	}
	
	private boolean includesFeature(String featureNames, String featureName) {
		if ("*".equals(featureNames)) {
			return true;
		}
		if (featureNames.equals(featureName) ||
			featureNames.startsWith(featureName + " ") ||
			featureNames.endsWith(" " + featureName) ||
			featureNames.contains(" " + featureName + " ")) {				
			return true;
		}
		return false;
	}
	
	protected ETypedElement getServiceElement(EObject service, String serviceName, Map<String, Object> args) {
		EList<EOperation> operations = service.eClass().getEOperations();
		EOperation operation = getServiceOperation(serviceName, args, operations);
		if (operation != null) {
			return operation;
		} else if (args == null) {
			EStructuralFeature feature = service.eClass().getEStructuralFeature(serviceName);
			return feature;
		}
		return null;
	}

	protected Object tryInvokeServiceElement(EObject service, ETypedElement serviceElement, Map<String, Object> args) throws InvocationTargetException {
		if (serviceElement instanceof EOperation) {
			EOperation operation = (EOperation) serviceElement;
			EList<Object> arguments = new BasicEList<Object>();
			for (EParameter parameter : operation.getEParameters()) {
				Object arg = args.get(parameter.getName());
				arguments.add(arg);
			}
			return service.eInvoke(operation, arguments);
		} else if (serviceElement instanceof EStructuralFeature) {
			EStructuralFeature feature = (EStructuralFeature) serviceElement;
			return service.eGet(feature);
		}
		return null;
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
