package no.hal.pg.runtime.engine;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
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

	@Override
	public void init(EObject... eObject) {
		setObjects((Object[]) eObject);
	}
	
	public final static String SelfService_ANNOTATION_KEY = "SelfService";

	@Override
	public void execute(String serviceName, Map<String, Object> args) {
		Collection<Object> results = new ArrayList<Object>();
		for (Object object : objects) {
			if (object instanceof EObject) {
				ServiceInvocation serviceInvocation = getServiceInvokation((EObject) object, serviceName, args);
				if (serviceInvocation != null) {
					try {
						Object value = tryInvokeServiceElement(serviceInvocation.target, serviceInvocation.serviceElement, serviceInvocation.args);
						if (value instanceof Collection<?>) {
							results.addAll((Collection<?>) value);
						} else {
							results.add(value);
						}
					} catch (InvocationTargetException e) {
						throwServiceInvocationException(e, object, serviceName, args);
					}
				} else {
					throwNoSuchServiceException(object, serviceName, args);
				}
			} else {
				throwNoSuchServiceException(object, serviceName, args);
			}
		}
		setObjects(results);
	}

	protected Object throwNoSuchServiceException(Object eObject, String serviceName, Map<String, Object> args) {
		throw new UnsupportedOperationException(eObject + " does not support the " + serviceName + " service");
	}

	protected Object throwServiceInvocationException(Exception e, Object eObject, String serviceName, Map<String, Object> args) {
		throw new IllegalArgumentException("Exception when invoking " + serviceName + " on " + eObject + ": " + e, e);
	}

	public static String getSelfServiceAnnotationValue(EObject service) {
		return getSelfServiceAnnotationValue(service.eClass());
	}

	public static String getSelfServiceAnnotationValue(EModelElement modelElement) {
		return EcoreUtil.getAnnotation(modelElement, RuntimePackage.eNS_URI, SelfService_ANNOTATION_KEY);
	}
	
	private boolean includesName(String featureNames, String featureName) {
		if (SERVICE_NAMES_WILDCARD.equals(featureNames)) {
			return true;
		}
		if (featureNames == null) {
			return false;
		}
		if (featureNames.equals(featureName) ||
			featureNames.startsWith(featureName + " ") ||
			featureNames.endsWith(" " + featureName) ||
			featureNames.contains(" " + featureName + " ")) {				
			return true;
		}
		return false;
	}
	
	private static class ServiceInvocation {
		@SuppressWarnings("unused") EObject eObject;
		String serviceName;
		EObject target;
		ETypedElement serviceElement;
		Map<String, Object> args;
		
		ServiceInvocation(EObject eObject, String serviceName, EObject target, ETypedElement serviceElement, Map<String, Object> args) {
			set(eObject, serviceName, target, serviceElement, args);
		}
		void set(EObject eObject, String serviceName, EObject target, ETypedElement serviceElement, Map<String, Object> args) {
			this.target = target;
			this.serviceName = serviceName;
			this.serviceElement = serviceElement;
			this.args = args;
		}
	}
	
	protected ServiceInvocation getServiceInvokation(EObject eObject, String serviceName, Map<String, Object> args) {
		for (Service<?> service : getServices(eObject)) {
			EObject target = service;
			ETypedElement serviceElement = getServiceElement(target, serviceName, args);
			if (serviceElement != null) {
				String annotationValue = getSelfServiceAnnotationValue(serviceElement);
				String alternateServiceName = null;
				if (SERVICE_NAMES_WILDCARD.equals(annotationValue)) {
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
				if (annotationValue != null && includesName(annotationValue, serviceName)) {
					target = eObject;
					serviceElement = getServiceElement(target, serviceName, args);
				}
			}
			if (serviceElement != null) {
				return new ServiceInvocation(eObject, serviceElement.getName(), target, serviceElement, args);
			}
		}
		return null;
	}

	@Override
	public Map<String, Object> executeFeatureServices(EObject eObject, String featureNames) {
		Map<String, Object> results = new HashMap<String, Object>();
		Collection<ServiceInvocation> serviceInvokations = getServiceInvokations(eObject, featureNames, true);
		for (ServiceInvocation serviceInvocation : serviceInvokations) {
			Object value = null;
			try {
				value = tryInvokeServiceElement(serviceInvocation.target, serviceInvocation.serviceElement, serviceInvocation.args);
				if (value instanceof Collection<?>) {
					value = ((Collection<?>) value).toArray();
				} else {
					value = new Object[]{value};
				}
			} catch (Exception e) {
				System.out.println("Exception when invoking " + serviceInvocation.serviceElement + " on " + serviceInvocation.target + ": " + e);
				value = e;
			}
			results.put(serviceInvocation.serviceName, value);
		}
		return results;
	}

	protected Collection<ServiceInvocation> getServiceInvokations(EObject eObject, String serviceNames, boolean onlyFeatures) {
		Collection<ServiceInvocation> serviceInvocations = new ArrayList<ServiceExecutor.ServiceInvocation>();
		for (Service<?> service : getServices(eObject)) {
			EObject target = service;
			Collection<ETypedElement> features = null;
			String annotationValue = getSelfServiceAnnotationValue(service);
			if (annotationValue != null) {
				target = eObject;
				features = getServiceElements(target, annotationValue, onlyFeatures);
			} else {
				features = getServiceElements(target, SERVICE_NAMES_WILDCARD, onlyFeatures);
			}
			for (ETypedElement serviceElement : features) {
				EObject serviceTarget = target;
				String serviceName = serviceElement.getName();
				if (! includesName(serviceNames, serviceName)) {
					continue;
				}
				annotationValue = getSelfServiceAnnotationValue(serviceElement);
				String alternateServiceName = null;
				if (SERVICE_NAMES_WILDCARD.equals(annotationValue)) {
					alternateServiceName = serviceName;
				} else if (annotationValue != null) {
					alternateServiceName = annotationValue;
				}
				if (alternateServiceName != null) {
					serviceTarget = eObject;
					serviceElement = getServiceElement(serviceTarget, alternateServiceName, null);							
				}
				if (serviceElement != null) {
					serviceInvocations.add(new ServiceInvocation(eObject, serviceName, serviceTarget, serviceElement, null));
				}
			}
		}
		return serviceInvocations;
	}
	
	protected Collection<ETypedElement> getServiceElements(EObject target, String serviceNames, boolean onlyFeatures) {
		Collection<ETypedElement> elements = new ArrayList<ETypedElement>();
		elements.addAll(target.eClass().getEAllStructuralFeatures());
		if (! onlyFeatures) {
			elements.addAll(target.eClass().getEAllOperations());
		}
		if (! SERVICE_NAMES_WILDCARD.equals(serviceNames)) {
			Iterator<ETypedElement> it = elements.iterator();
			while (it.hasNext()) {
				ETypedElement elt = it.next();
				if (! includesName(serviceNames, elt.getName())) {
					it.remove();
				}
			}
		}
		return elements;
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
	
	@Override
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
	
	@Override
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
