package no.hal.pg.runtime.http.tests;

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
import junit.framework.AssertionFailedError;
import junit.framework.TestCase;
import no.hal.graphql.emf.GraphQLEmfTest;
import no.hal.graphql.emf.SchemaGenerator;
import no.hal.pg.runtime.engine.ServiceExecutor;
import no.hal.pg.runtime.engine.http.ServiceSchemaGenerator;
import no.hal.pg.runtime.engine.tests.Container;
import no.hal.pg.runtime.engine.tests.ServiceExecutorTest;
import no.hal.pg.runtime.engine.tests.TestsPackage;
import no.hal.pg.runtime.tests.util.TestHelper;

public class SchemaServiceExecutorTest extends TestCase {
	
	private ServiceExecutor serviceExecutor;
	private Container container;
	private GraphQLSchema schema;

	@Override
	protected void setUp() throws Exception {
		serviceExecutor = new ServiceExecutor();
		serviceExecutor.addServiceProvider(new ServiceExecutorTest.ServiceExecutorTestServiceProvider());
		TestHelper testHelper = new TestHelper(this, TestsPackage.eINSTANCE);
		SchemaGenerator schemaGenerator = new ServiceSchemaGenerator(serviceExecutor, testHelper.getPackages());
		container = (Container) testHelper.loadResource("Container1.xmi", TestsPackage.eINSTANCE.getContainer());
		schema = schemaGenerator.generate(container.eClass());
	}
	
	//
	
    public void testSchemaGenerator() {
    	GraphQLEmfTest.checkFieldContainerType(schema, "Container", GraphQLInterfaceType.class, "simple1", "int1", "getSimples2");
    	GraphQLEmfTest.checkFieldContainerType(schema, "ContainerObject", GraphQLObjectType.class, "simple1", "int1", "getSimples2");
    	GraphQLEmfTest.checkFieldContainerType(schema, "Simple1", GraphQLInterfaceType.class, "simples2", "string11");
    	GraphQLEmfTest.checkFieldContainerType(schema, "Simple2", GraphQLInterfaceType.class, "int1", "string21");
    }

    public void testContainerQuery() {
    	assertNotNull(container);
		ExecutionResult result = new GraphQL(schema).execute("{"
    			+ "getSimples2(stringFilter:\"Hal\") { int1 string21 }"
				+ "simple1 {"
					+ "simples2 { int1 string21 } "
					+ "string11"
				+ "}"
			+ "}"
    	, container);
    	try {
			assertTrue(result.getErrors().isEmpty());
		} catch (AssertionFailedError afe) {
			System.err.println(result.getErrors());
			throw afe;
		}
    	Map<String, Object> data = result.getData();
    	GraphQLEmfTest.printData(data, System.out);
    	GraphQLEmfTest.checkData(data, "getSimples2", 2);
    	GraphQLEmfTest.checkData(data, "simple1", "string11", "Hallvard");
    }
}
