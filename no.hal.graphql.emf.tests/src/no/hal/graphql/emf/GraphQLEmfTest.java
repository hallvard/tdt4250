package no.hal.graphql.emf;

import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.schema.GraphQLInterfaceType;
import graphql.schema.GraphQLObjectType;
import graphql.schema.GraphQLSchema;
import graphql.schema.GraphQLType;
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import no.hal.pg.model.ModelPackage;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.service.GameService;
import no.hal.pg.runtime.service.ServiceFactory;
import no.hal.pg.runtime.service.ServicePackage;
import no.hal.pg.runtime.tests.util.TestHelper;

/**
 * Unit test for simple App.
 */
public class GraphQLEmfTest extends TestCase {

	private TestHelper testHelper;
	GraphQLSchema schema;
	
	@Override
	protected void setUp() throws Exception {
		testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE, ServicePackage.eINSTANCE); //, no.hal.pg.quiz.model.ModelPackage.eINSTANCE, no.hal.pg.quiz.runtime.RuntimePackage.eINSTANCE, no.hal.pg.quiz.runtime.service.ServicePackage.eINSTANCE);
//		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("jquiz", new ModelResourceFactoryImpl());
//		testHelper.addResource(URI.createURI("test:/GraphQLEmfTest.jquiz"), QuizTaskTest.createSimpleTestQuiz());
		game = (Game) testHelper.loadTestResource(RuntimePackage.eINSTANCE.getGame());
		SchemaGenerator schemaGenerator = new SchemaGenerator(testHelper.getPackages());
		schema = schemaGenerator.generate(ServicePackage.eINSTANCE.getGameService());
	}

	private Game game;
	
    public void testSchemaGenerator() {
//    	for (GraphQLType type : schema.getAllTypesAsList()) {
//    		System.out.println(type.getName());
//    	}
    	checkInterfaceType("Person", "name", "ids");
    	checkInterfaceType("Player", "person");
    	checkInterfaceType("Game", "tasks", "players");
    	checkInterfaceType("Task", "players");
    	checkInterfaceType("TaskState", "entered");
    	checkInterfaceType("TaskState", "exited");
    	checkInterfaceType("GameService", "context");
    	checkObjectType("GameServiceObject", "context");
    }

    public static void checkFieldContainerType(GraphQLSchema schema, String typeName, Class<? extends GraphQLType> typeClass, String... fieldNames) {
    	GraphQLType type = schema.getType(typeName);
    	assertNotNull("Type " + typeName + " is missing", type);
    	checkFieldContainerType(type, typeClass, fieldNames);
    }

	public static void checkFieldContainerType(GraphQLType type, Class<? extends GraphQLType> typeClass, String... fieldNames) {
    	assertTrue(type + " is not of type " + typeClass, typeClass.isInstance(type));
    	for (String fieldName : fieldNames) {
			try {
				Method method = typeClass.getMethod("getFieldDefinition", new Class[]{String.class});
				Object field = method.invoke(type, fieldName);
				assertNotNull("Field " + fieldName + " is missing from " + type.getName(), field);
			} catch (Exception e) {
				fail(e.getMessage());
			}
    	}
    }
    
    private void checkInterfaceType(String name, String... fieldNames) {
    	checkFieldContainerType(schema, name, GraphQLInterfaceType.class, fieldNames);
    }

    private void checkObjectType(String name, String... fieldNames) {
    	checkFieldContainerType(schema, name, GraphQLObjectType.class, fieldNames);
    }
    
    public void testGameQuery() {
    	assertNotNull(game);
    	GameService gameService = ServiceFactory.eINSTANCE.createGameService();
    	gameService.setContext(game);
		ExecutionResult result = new GraphQL(schema).execute("{"
    			+ "tasks { "
					+ "players {"
						+ "person { name, ids }"
					+ "}"
				+ "}"
				+ "players {"
					+ "person { name, ids }"
				+ "}"
			+ "}"
    	, gameService);
    	try {
			assertTrue(result.getErrors().isEmpty());
		} catch (AssertionFailedError afe) {
			System.err.println(result.getErrors());
			throw afe;
		}
    	Map<String, Object> data = result.getData();
    	printData(data, System.out);
    }
    
    public static void printData(Map<String, Object> data, OutputStream out) {
    	try {
    		new ObjectMapper().writer(new DefaultPrettyPrinter()).writeValue(out, data);
		} catch (Exception e) {
			System.err.println(e);
		}
    }

    public static void checkData(Map<String, Object> data, Object... path) {
    	Object value = data;
    	Iterator<Object> segments = Arrays.asList(path).iterator();
    	while (segments.hasNext()) {
    		Object segment = segments.next();
    		if (value instanceof Map<?, ?>) {
    			assertTrue(segments.hasNext());
    			value = ((Map<?, ?>) value).get(segment);
    		} else if (value instanceof List<?>) {
    			assertTrue(segment instanceof Integer);
    			if (segments.hasNext()) {
    				value = ((List<?>) value).get((Integer) segment);
    			} else {
    				assertEquals(((Integer) segment).intValue(), ((List<?>) value).size());
    			}
    		} else {
    			assertFalse(segments.hasNext());
    			assertEquals(segment, value);
    		}
    	}
    }
}
