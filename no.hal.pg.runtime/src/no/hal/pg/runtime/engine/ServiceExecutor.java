package no.hal.pg.runtime.engine;

import java.lang.reflect.Array;
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
import org.eclipse.emf.ecore.EDataType;
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
import org.osgi.service.log.LogService;

import no.hal.pg.model.Person;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.Service;
import no.hal.pg.runtime.SubjectService;
import no.hal.pg.runtime.util.CompositeReferenceResolver;
import no.hal.pg.runtime.util.IllegalSubjectException;

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
		if (services.size() == 0 && this.logger != null) {
			this.logger.log(LogService.LOG_WARNING, "No service found for " + eObject);
		}
		return services;
	}

	//
	
	private CompositeReferenceResolver referenceResolver = new CompositeReferenceResolver();
	
	@Reference(
			cardinality=ReferenceCardinality.MULTIPLE,
			policy=ReferencePolicy.DYNAMIC,
			unbind="removeReferenceResolver"
			)
	public synchronized void addReferenceResolver(IReferenceResolver referenceResolver) {
		this.referenceResolver.addReferenceResolver(referenceResolver);
	}
	public synchronized void removeReferenceResolver(IReferenceResolver referenceHandler) {
		this.referenceResolver.removeReferenceResolver(referenceResolver);
	}

	//

	private LogService logger = null;
	
	@Reference(
			cardinality=ReferenceCardinality.OPTIONAL,
			policy=ReferencePolicy.DYNAMIC,
			unbind="unsetLogService"
			)
	public synchronized void setLogService(LogService logService) {
		this.logger = logService;
	}
	public synchronized void unsetLogService(LogService logService) {
		this.logger = null;
	}

	//
	
	private List<Object> objects = new ArrayList<Object>();

	@Override
	public void init(EObject... eObject) {
		setObjects((Object[]) eObject);
	}
	
	public final static String SelfService_ANNOTATION_KEY = "SelfService";

	@Override
	public boolean resolve(String reference) {
		for (Object object : objects) {
			if (object instanceof EObject) {
				EObject resolved = referenceResolver.resolveReference(reference, (EObject) object);
				if (resolved != null) {
					setObjects(resolved);
					return true;
				}
			}
		}
		return false;
	}

	private ISubjectProvider subjectProvider = null;
	
	public ISubjectProvider getSubjectProvider() {
		return subjectProvider;
	}
	
	public void setSubjectProvider(ISubjectProvider subjectProvider) {
		this.subjectProvider = subjectProvider;
	}
	
	@Override
	public void execute(String serviceName, Map<String, ? extends Object> args) {
		Collection<Object> results = new ArrayList<Object>();
		for (Object object : objects) {
			if (object instanceof EObject) {
				ServiceInvocation serviceInvocation = getServiceInvokation((EObject) object, serviceName, args);
				if (serviceInvocation != null) {
					try {
						Object value = tryInvokeServiceElement(serviceInvocation);
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
	
	protected void setSubject(ServiceInvocation serviceInvocation) {
		setSubject(serviceInvocation.target, serviceInvocation.serviceName);
	}

	protected void setSubject(EObject service, String serviceName) {
		if (service instanceof SubjectService<?>) {
			if (getSubjectProvider() == null && ((SubjectService<?>) service).getSubject() == null) {
				throwNoSubjectException(service, serviceName);
			}
			Person subject = getSubjectProvider().getSubject();
			if (getSubjectProvider() == null) {
				throw new IllegalSubjectException(null, service);
			}
			((SubjectService<?>) service).setSubject(subject);
		}
	}

	protected void throwNoSubjectException(EObject eObject, String serviceName) {
		throw new IllegalSubjectException(null, eObject);
	}

	protected Object throwNoSuchServiceException(Object eObject, String serviceName, Map<String, ? extends Object> args) {
		throw new UnsupportedOperationException(eObject + " does not support the " + serviceName + " service");
	}

	protected Object throwServiceInvocationException(Exception e, Object eObject, String serviceName, Map<String, ? extends Object> args) {
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
	
	public static class ServiceInvocation {
		EObject eObject;
		String serviceName;
		EObject target;
		public ETypedElement serviceElement;
		ETypedElement targetElement;
		Map<String, ? extends Object> args;
		
		ServiceInvocation(EObject eObject, String serviceName, EObject target, ETypedElement serviceElement, ETypedElement targetElement, Map<String, ? extends Object> args) {
			set(eObject, serviceName, target, serviceElement, targetElement, args);
		}
		void set(EObject eObject, String serviceName, EObject target, ETypedElement serviceElement, ETypedElement targetElement, Map<String, ? extends Object> args) {
			this.target = target;
			this.serviceName = serviceName;
			this.serviceElement = serviceElement;
			this.targetElement = targetElement;
			this.args = args;
		}
	}
	
	protected ServiceInvocation getServiceInvokation(EObject eObject, String serviceName, Map<String, ? extends Object> args) {
		for (Service<?> service : getServices(eObject)) {
			EObject target = service;
			ETypedElement serviceElement = getServiceElement(target, serviceName, args), targetElement = serviceElement;
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
					targetElement = getServiceElement(target, alternateServiceName, args);
					if (targetElement == null) {
						serviceElement = null;
					}
				}
			} else {
				String annotationValue = getSelfServiceAnnotationValue(service);
				if (annotationValue != null && includesName(annotationValue, serviceName)) {
					target = eObject;
					targetElement = getServiceElement(target, serviceName, args);
				}
			}
			if (targetElement == null) {
				targetElement = serviceElement;
			}
			if (targetElement != null) {
				return new ServiceInvocation(eObject, targetElement.getName(), target, serviceElement, targetElement, args);
			}
		}
		if (this.logger != null) {
			this.logger.log(LogService.LOG_WARNING, "No " + serviceName + " service found for " + eObject);
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
				value = tryInvokeServiceElement(serviceInvocation);
				if (value instanceof Collection<?>) {
					value = ((Collection<?>) value).toArray();
				}
			} catch (Exception e) {
				if (this.logger != null) {
					this.logger.log(LogService.LOG_ERROR, "Exception when invoking " + serviceInvocation.targetElement + " on " + serviceInvocation.target + ": " + e);
				}
				value = e;
			}
			results.put(serviceInvocation.serviceName, value);
		}
		return results;
	}

	public Collection<ServiceInvocation> getServiceInvokations(EObject eObject, String serviceNames, boolean onlyFeatures) {
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
				ETypedElement targetElement = null;
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
					targetElement = getServiceElement(serviceTarget, alternateServiceName, null);
					if (targetElement == null) {
						serviceElement = null; 
					}
				}
				if (targetElement == null) {
					targetElement = serviceElement;
				}
				if (targetElement != null) {
					serviceInvocations.add(new ServiceInvocation(eObject, serviceName, serviceTarget, serviceElement, targetElement, null));
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
		
	protected ETypedElement getServiceElement(EObject service, String serviceName, Map<String, ? extends Object> args) {
		EList<EOperation> operations = service.eClass().getEOperations();
		EOperation operation = getServiceOperation(serviceName, args, operations);
		if (operation != null) {
			return operation;
		} else if (args == null || args.size() == 0) {
			EStructuralFeature feature = service.eClass().getEStructuralFeature(serviceName);
			return feature;
		}
		return null;
	}

	protected Object tryInvokeServiceElement(ServiceInvocation serviceInvocation) throws InvocationTargetException {
		setSubject(serviceInvocation);
		return tryInvokeServiceElement(serviceInvocation.target, serviceInvocation.targetElement, serviceInvocation.args);
	}

	protected Object tryInvokeServiceElement(EObject service, ETypedElement serviceElement, Map<String, ? extends Object> args) throws InvocationTargetException {
		if (serviceElement instanceof EOperation) {
			EOperation operation = (EOperation) serviceElement;
			EList<Object> arguments = new BasicEList<Object>();
			for (EParameter parameter : operation.getEParameters()) {
				Object arg = args.get(parameter.getName());
				Object realArg = ensureServiceArgument(service, parameter, arg);
				arguments.add(realArg);
			}
			return service.eInvoke(operation, arguments);
		} else if (serviceElement instanceof EStructuralFeature) {
			EStructuralFeature feature = (EStructuralFeature) serviceElement;
			return service.eGet(feature);
		}
		return null;
	}
	
	protected Object ensureServiceArgument(EObject service, EParameter parameter, Object arg) {
		if (parameter.getEType().isInstance(arg)) {
			return arg;
		} else if (arg instanceof String) {
			EObject resolved = referenceResolver.resolveReference(String.valueOf(arg), service);
			if (resolved != null) {
				Object realArg = ensureServiceArgument(service, parameter, resolved);
				if (realArg != null) {
					return realArg;
				}
			} else if (parameter.getEType() instanceof EDataType) {
				Object realArg = EcoreUtil.createFromString((EDataType) parameter.getEType(), (String) arg);
				if (realArg != null) {
					return realArg;
				}				
			}
		} else if (arg != null && arg.getClass().isArray()) {
			for (int i = 0; i < Array.getLength(arg); i++) {
				Object realArg = ensureServiceArgument(service, parameter, Array.get(arg, i));
				if (realArg != null) {
					return realArg;
				}
			}
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

//	@Override
//	public Object[] getObjects(EObject referenceContext) {
//		Object[] result = getObjects();
//		replaceWithReferences(result, referenceContext);
//		for (int i = 0; i < result.length; i++) {
//			if (result[i] instanceof EObject) {
//				Map<String, Object> featureValues = executeFeatureServices((EObject) result[i], SERVICE_NAMES_WILDCARD);
//				replaceWithReferences(featureValues, referenceContext);
//				result[i] = featureValues;
//			}
//		}
//		return result;
//	}

//	private void replaceWithReferences(Map<String, Object> objects, EObject referenceContext) {
//		for (Map.Entry<String, Object> entry : objects.entrySet()) {
//			Object value = entry.getValue();
//			if (value instanceof Object[]) {
//				replaceWithReferences((Object[]) value, referenceContext);
//			} else if (value instanceof EObject) {
//				String ref = referenceHandler.getReference((EObject) value, referenceContext);
//				if (ref != null) {
//					entry.setValue(ref);
//				}
//			}
//		}
//	}

//	private void replaceWithReferences(Object[] objects, EObject referenceContext) {
//		for (int i = 0; i < objects.length; i++) {
//			if (objects[i] instanceof EObject) {
//				String ref = referenceHandler.getReference((EObject) objects[i], referenceContext);
//				if (ref != null) {
//					objects[i] = ref;
//				}
//			}
//		}
//	}
	
	//

	protected EOperation getServiceOperation(String serviceName, Map<String, ? extends Object> args, Iterable<EOperation> operations) {
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
