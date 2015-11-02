package no.hal.pg.runtime.engine.http;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.emf.ecore.EObject;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import no.hal.pg.runtime.engine.IEngine;
import no.hal.pg.runtime.engine.IServiceExecutor;
import no.hal.pg.runtime.engine.ServiceExecutor;
import no.hal.pg.runtime.util.IllegalSubjectException;

@SuppressWarnings("serial")
public class EngineDataServlet extends HttpServlet {

	private final IEngine engine;
	private final ISerializer serializer;

	public EngineDataServlet(IEngine engine, ISerializer serializer) {
		this.engine = engine;
		this.serializer = serializer;
	}

	private AuthenticationHandler authenticationHandler;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IServiceExecutor serviceExecutor = engine.getServiceExecutor();
		synchronized (serviceExecutor) {
			if (authenticationHandler == null) {
				authenticationHandler = new HttpAuthenticationHandler();
			}
			authenticationHandler.acceptRequest(req, engine.getGame());
			((ServiceExecutor) serviceExecutor).setSubjectProvider(authenticationHandler);
			serviceExecutor.init(engine.getGame());
			DataServletHelper helper = new DataServletHelper(serviceExecutor);
			try {
				if (helper.executeSegments(req)) {
					Object[] result = serviceExecutor.getObjects();
					writeResult(resp, result);
				}
			} catch (IllegalSubjectException subjectException) {
				authenticationHandler.forceAuthentication(resp, subjectException.getMessage(), engine.getKey());
			}
		}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String query = getGraphQL(req);
		IServiceExecutor serviceExecutor = engine.getServiceExecutor();
		synchronized (serviceExecutor) {
			serviceExecutor.init(engine.getGame());
			DataServletHelper helper = new DataServletHelper(serviceExecutor);
			if (helper.executeSegments(req)) {
				Object[] result = serviceExecutor.getObjects();
				if (result.length > 0 && result[0] instanceof EObject) {
					EObject root = (EObject) result[0];
					GraphQLSchema schema = helper.getGraphQLSchema(root);
					ExecutionResult executionResult = new GraphQL(schema).execute(query, root);
					writeResult(resp, executionResult.getData());
				} else {
					writeResult(resp, result);
				}
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
		resp.setContentType("application/json");
		PrintWriter writer = resp.getWriter();
		try {
			serializer.serialize(result, writer);
		} catch (Exception e) {
			writer.println(e.getMessage());
		}
		//		writer.close();
	}

	/*
http://localhost:8082/example1.pg-rt/data/getTasks?player=hal@idi.ntnu.no
http://localhost:8082/example1.pg-rt/data/hal@idi.ntnu.no
http://localhost:8082/example1.pg-rt/data/hal@idi.ntnu.no/tasks/0
	 */
}
