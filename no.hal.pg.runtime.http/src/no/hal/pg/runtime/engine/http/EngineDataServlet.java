package no.hal.pg.runtime.engine.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
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
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor;

@SuppressWarnings("serial")
public class EngineDataServlet extends HttpServlet {

	private final IEngine engine;
	private final ISerializer serializer;
	
	public EngineDataServlet(IEngine engine, ISerializer serializer) {
		this.engine = engine;
		this.serializer = serializer;
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		synchronized (engine.getServiceExecutor()) {
			if (executeSegments(req)) {
				Object[] result = engine.getServiceExecutor().getObjects();
				writeResult(resp, result);
			}
		}
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
		return executeSegments(segments, 1, -1, parameters);
	}

	protected boolean executeSegments(String[] segments, Map<String, ? extends Object> parameters) {
		return executeSegments(segments, 0, -1, parameters);
	}
	
	protected boolean executeSegments(String[] segments, int start, int end, Map<String, ? extends Object> parameters) {
		IServiceExecutor serviceExecutor = engine.getServiceExecutor();
		serviceExecutor.init(engine.getGame());
		if (end < 0) {
			end = segments.length + end + 1;
		}
		for (int i = start; i < end; i++) {
			String segment = segments[i];
			try {
				int num = Integer.valueOf(segment);
				serviceExecutor.select(num, num + 1);
			} catch (NumberFormatException e) {
				if (! serviceExecutor.resolve(segment)) {
					serviceExecutor.execute(segment, (i == end - 1 ? parameters : null));				
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
	
	private GraphQLSchema getGraphQLSchema(EObject root) {
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
			IServiceExecutor serviceExecutor = engine.getServiceExecutor();
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

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query = getGraphQL(req);
		if (executeSegments(req)) {
			IServiceExecutor serviceExecutor = engine.getServiceExecutor();
			Object[] result = serviceExecutor.getObjects();
			if (result.length > 0 && result[0] instanceof EObject) {
				EObject root = (EObject) result[0];
				GraphQLSchema schema = getGraphQLSchema(root);
				ExecutionResult executionResult = new GraphQL(schema).execute(query, root);
				writeResult(resp, executionResult.getData());
			} else {
				writeResult(resp, result);
			}
		}
	}

	private String getGraphQL(HttpServletRequest req) throws IOException {
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

	private void writeResult(HttpServletResponse resp, Object result) throws IOException, JsonGenerationException, JsonMappingException {
		PrintWriter writer = resp.getWriter();
		try {
			serializer.serialize(result, writer);
		} catch (Exception e) {
			writer.println(e.getMessage());
		}
		writer.close();
	}
	
	/*
http://localhost:8082/example1.pg-rt/data/getTasks?player=hal@idi.ntnu.no
http://localhost:8082/example1.pg-rt/data/hal@idi.ntnu.no
http://localhost:8082/example1.pg-rt/data/hal@idi.ntnu.no/tasks/0
	 */
}
