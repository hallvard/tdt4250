package no.hal.graphql.emf;

import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

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
import no.hal.pg.no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.quiz.model.util.ModelResourceFactoryImpl;
import no.hal.pg.quiz.runtime.tests.QuizTaskTest;
import no.hal.pg.runtime.Game;
import no.hal.pg.runtime.RuntimePackage;
import no.hal.pg.runtime.service.GameService;
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
		testHelper = new TestHelper(this, ModelPackage.eINSTANCE, RuntimePackage.eINSTANCE, ServicePackage.eINSTANCE, no.hal.pg.quiz.model.ModelPackage.eINSTANCE, no.hal.pg.quiz.runtime.RuntimePackage.eINSTANCE, no.hal.pg.quiz.runtime.service.ServicePackage.eINSTANCE);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("jquiz", new ModelResourceFactoryImpl());
		testHelper.addResource(URI.createURI("test:/GraphQLEmfTest.jquiz"), QuizTaskTest.createSimpleTestQuiz());
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

    private void checkInterfaceType(String name, String... fieldNames) {
    	GraphQLType type = schema.getType(name);
    	assertTrue(type instanceof GraphQLInterfaceType);
    	GraphQLInterfaceType interfaceType = (GraphQLInterfaceType) type;
    	for (String fieldName : fieldNames) {
    		assertNotNull(interfaceType.getFieldDefinition(fieldName));
    	}
    }

    private void checkObjectType(String name, String... fieldNames) {
    	GraphQLType type = schema.getType(name);
    	assertTrue(type instanceof GraphQLObjectType);
    	GraphQLObjectType objectType = (GraphQLObjectType) type;
    	for (String fieldName : fieldNames) {
    		assertNotNull(objectType.getFieldDefinition(fieldName));
    	}
    }
    
    public void testGameQuery() {
    	assertNotNull(game);
    	assertFalse(game.getServices().isEmpty());
    	assertTrue(game.getServices().get(0) instanceof GameService);
    	GameService gameService = (GameService) game.getServices().get(0);
		ExecutionResult result = new GraphQL(schema).execute("{"
    			+ "tasks { "
					+ "players {"
						+ "person { name, ids }"
					+ "}"
				+ "}"
				+ "players {"
					+ "person { name, ids }"
				+ "}"
    	, gameService);
    	try {
			assertTrue(result.getErrors().isEmpty());
		} catch (AssertionFailedError afe) {
			System.err.println(result.getErrors());
			throw afe;
		}
    	Map<String, Object> data = result.getData();
    	try {
    		new ObjectMapper().writer(new DefaultPrettyPrinter()).writeValue(System.out, data);
		} catch (Exception e) {
			System.err.println(e);
		}
    }
}
