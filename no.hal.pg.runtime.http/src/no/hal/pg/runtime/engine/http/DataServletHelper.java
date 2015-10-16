package no.hal.pg.runtime.engine.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import graphql.schema.GraphQLSchema;
import no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor;

@SuppressWarnings("serial")
public class DataServletHelper extends HttpServlet {

	private final IServiceExecutor serviceExecutor;
	
	public DataServletHelper(IServiceExecutor serviceExecutor) {
		this.serviceExecutor = serviceExecutor;
	}

	public IServiceExecutor getServiceExecutor() {
		return serviceExecutor;
	}
	
	protected boolean executeSegments(HttpServletRequest req) throws ServletException, IOException {
		String path = req.getPathInfo();
		if (path != null) {
			return executePath(path, req.getParameterMap());
		}
		return false;
	}

	protected boolean executePath(String path, Map<String, ? extends Object> parameters) {
		String[] segments = path.split("\\/");
		return executeSegments(segments, (segments.length > 0 ? 1 : 0), -1, parameters);
	}

	protected boolean executeSegments(String[] segments, Map<String, ? extends Object> parameters) {
		return executeSegments(segments, 0, -1, parameters);
	}
	
	protected boolean executeSegments(String[] segments, int start, int end, Map<String, ? extends Object> parameters) {
		if (end < 0) {
			end = segments.length + end + 1;
		}
		for (int i = start; i < end; i++) {
			String segment = segments[i];
			if (segment.length() != 0) {
				try {
					int num = Integer.valueOf(segment);
					serviceExecutor.select(num, num + 1);
				} catch (NumberFormatException e) {
					if (! serviceExecutor.resolve(segment)) {
						serviceExecutor.execute(segment, (i == end - 1 ? parameters : null));				
					}
				}
			}
		}
		return true;
	}
	
	private static Collection<EPackage> getEPackages(Iterator<EObject> eObjects) {
		List<EPackage> packages = new ArrayList<EPackage>();
		while (eObjects.hasNext()) {
			EObject next = eObjects.next();
			EPackage ePackage = next.eClass().getEPackage();
			if (! packages.contains(ePackage)) {
				packages.add(ePackage);
			}
		}
		Collections.sort(packages, new Comparator<EPackage>() {
			@Override
			public int compare(EPackage o1, EPackage o2) {
				return o1.getNsURI().compareTo(o2.getNsURI());
			}
		});
		return packages;
	}
	
	private Map<Object, GraphQLSchema> graphQLSchemas = new HashMap<Object, GraphQLSchema>();
	
	protected GraphQLSchema getGraphQLSchema(EObject root) {
		GraphQLSchema schema = graphQLSchemas.get(root);
		if (schema == null) {
			Iterator<EObject> eObjects = null;
			if (root.eResource() == null) {
				eObjects = Collections.<EObject>singletonList(root).iterator();
			} else if (root.eResource().getResourceSet() == null) {
				eObjects = EcoreUtil.getAllProperContents(root.eResource(), false);
			} else {
				eObjects = EcoreUtil.getAllProperContents(root.eResource().getResourceSet(), false);
			}
			Collection<EPackage> ePackages = getEPackages(eObjects);
			Collection<Object> schemaKey = new ArrayList<Object>(ePackages);
			schemaKey.add(root.eClass());
			schema = graphQLSchemas.get(schemaKey);
			if (schema == null) {
				SchemaGenerator schemaGenerator = new ServiceSchemaGenerator((ServiceExecutor) serviceExecutor, ePackages);
				schema = schemaGenerator.generate(root.eClass());
				graphQLSchemas.put(schemaKey, schema);
			}
			graphQLSchemas.put(root, schema);				
		}
		return schema;
	}

	protected String getGraphQL(HttpServletRequest req) throws IOException {
		String query = req.getParameter("gq");
		if (query != null) {
			return query;
		}
		StringBuilder builder = new StringBuilder();
		BufferedReader reader = req.getReader();
		String line = null;
		while ((line = reader.readLine()) != null) {
			builder.append(line);
			builder.append("\n");
		}
		return builder.toString();
	}
}
