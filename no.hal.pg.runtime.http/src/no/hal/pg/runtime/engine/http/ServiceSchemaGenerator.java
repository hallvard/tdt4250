package no.hal.pg.runtime.engine.http;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.ETypedElement;
import org.eclipse.emf.ecore.util.EcoreUtil;

import graphql.schema.DataFetcher;
import graphql.schema.GraphQLFieldDefinition;
import no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor.ServiceInvocation;

public class ServiceSchemaGenerator extends SchemaGenerator implements IServiceExecutorProvider {

	private ServiceExecutor serviceExecutor;
	
	public ServiceSchemaGenerator(ServiceExecutor serviceExecutor, Collection<EPackage> packages) {
		super(packages);
		setServiceExecutor(serviceExecutor);
	}

	public ServiceSchemaGenerator(ServiceExecutor serviceExecutor, EPackage... packages) {
		super(packages);
		setServiceExecutor(serviceExecutor);
	}

	private void setServiceExecutor(ServiceExecutor serviceExecutor) {
		this.serviceExecutor = serviceExecutor;
	}
	
	@Override
	public IServiceExecutor getServiceExecutor() {
		return serviceExecutor;
	}

	//

	protected void addFields(EClass eClass, Collection<GraphQLFieldDefinition> fields) {
		if (includesPackage(eClass.getEPackage())) {
			EObject prototype = EcoreUtil.create(eClass);
			Collection<ServiceInvocation> serviceInvokations = serviceExecutor.getServiceInvokations(prototype, IServiceExecutor.SERVICE_NAMES_WILDCARD, false);
			Collection<ETypedElement> typedElements = new ArrayList<ETypedElement>();
			for (ServiceInvocation serviceInvocation : serviceInvokations) {
				typedElements.add(serviceInvocation.serviceElement);
			}
			addFields(typedElements, eClass, fields);
		}
	}

	protected DataFetcher getDataFetcher(ETypedElement typedElement) {
		return new ServiceExecutorDataFetcher(this, typedElement.getName());
	}
}
