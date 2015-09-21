package no.hal.pg.runtime.engine.http;

import java.util.Arrays;

import org.eclipse.emf.ecore.EObject;

import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import graphql.schema.GraphQLList;
import no.hal.pg.runtime.engine.IServiceExecutor;

public class ServiceExecutorDataFetcher implements DataFetcher {

	private final IServiceExecutorProvider serviceExecutorProvider;
	private String serviceName;

	public ServiceExecutorDataFetcher(IServiceExecutorProvider serviceExecutorProvider, String serviceName) {
		this.serviceExecutorProvider = serviceExecutorProvider;
		this.serviceName = serviceName;
	}

	@Override
	public Object get(DataFetchingEnvironment environment) {
		if (! (environment.getSource() instanceof EObject)) {
			return null;
		}
		EObject context = (EObject) environment.getSource();
		try {
			IServiceExecutor serviceExecutor = serviceExecutorProvider.getServiceExecutor();
			serviceExecutor.init(context);
			serviceExecutor.execute(serviceName, environment.getArguments());
			Object[] values = serviceExecutor.getObjects();
			if (environment.getFieldType() instanceof GraphQLList) {
				return Arrays.asList(values);
			}
			return (values != null && values.length > 0 ? values[0] : null);
		} catch (Exception e) {
			return null;
		}
	}
}
