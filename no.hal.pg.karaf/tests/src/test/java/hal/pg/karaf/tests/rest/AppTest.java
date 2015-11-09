package hal.pg.karaf.tests.rest;

import static com.jayway.restassured.RestAssured.get;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	private String engineUrl = "http://localhost:8082/example1.pg/data";
	private String tasksUrl = engineUrl + "/tasks";

	private void testTaskCount(int n) {
		List<?> jsonObject = get(tasksUrl).getBody().jsonPath().get();
		Assert.assertEquals(n, jsonObject.size());
	}
	
	@Test
	public void testTaskCount() {
		testTaskCount(3);
	}

	private void testStateUpto(String state, int m, int n) {
		List<?> jsonObject = get(tasksUrl).getBody().jsonPath().get();
		int i = 0;
		for (Object jsonChild : jsonObject) {
			Assert.assertTrue(jsonChild instanceof Map<?, ?>);
			Object stateValue = ((Map<?, ?>) jsonChild).get(state);
			Assert.assertEquals(i < m, stateValue);
			i++;
		}
	}
	
	@Test
	public void testStartedUpto() {
		testStateUpto("started", 1, 3);
	}

	@Test
	public void testFinishedUpto() {
		testStateUpto("finished", 0, 3);
	}

	private void testTaskClassNames(String... taskClassNames) {
		List<?> jsonObject = get(tasksUrl).getBody().jsonPath().get();
		int i = 0;
		for (Object jsonChild : jsonObject) {
			Assert.assertTrue(jsonChild instanceof Map<?, ?>);
			Object taskClassName = ((Map<?, ?>) jsonChild).get("taskClassName");
			Assert.assertEquals(taskClassNames[i], taskClassName);
			i++;
		}
	}

	@Test
	public void testTaskClassNames() {
		testTaskClassNames("QuizTask", "ExampleTask", "SokobanTask");
	}
	
	private void testState(Map<?, ?> jsonChild, String state, boolean value) {
		Assert.assertEquals(value, jsonChild.get(state));
	}

	private void testState(List<?> jsonObject, String state, boolean value) {
		Assert.assertTrue(jsonObject.size() == 1 && jsonObject.get(0) instanceof Map<?, ?>);
		testState((Map<?, ?> ) jsonObject.get(0), state, value);
	}
	
	private void testFinishingRestUrls(int i, String... restUrls) {
		List<?> jsonObject = get(tasksUrl + "/" + i).getBody().jsonPath().get();
		testState(jsonObject, "finished", false);		
		for (int j = 0; j < restUrls.length; j++) {
			System.out.println("Invoking " + tasksUrl + "/" + i + "/" + restUrls[j]);
			get(tasksUrl + "/" + i + "/" + restUrls[j]).getBody().jsonPath().get();
			jsonObject = get(tasksUrl + "/" + i).getBody().jsonPath().get();
			testState(jsonObject, "finished", j + 1 == restUrls.length);		
		}
	}
	
	private String restUrlFilesDirectory = "/Users/hal/java/git/tdt4250/no.hal.pg.runtime.examples/src/no/hal/pg/runtime/examples";
	
	private void testFinishingRestUrls(int i, Object taskClassName) {
		File dir = new File(restUrlFilesDirectory);
		File file = new File(dir, taskClassName + ".txt");
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			Collection<String> restUrls = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				if (line.trim().length() == 0) {
					break;
				}
				restUrls.add(line);
			}
			testFinishingRestUrls(i, restUrls.toArray(new String[restUrls.size()]));
		} catch (IOException e) {
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}
	}
	
	private void testFinishTask(String... taskClassNames) {
		List<?> jsonObject = get(tasksUrl).getBody().jsonPath().get();
		int i = 0;
		for (Object jsonChild : jsonObject) {
			Assert.assertTrue(jsonChild instanceof Map<?, ?>);
			Object taskClassName = ((Map<?, ?>) jsonChild).get("taskClassName");
			testFinishingRestUrls(i, taskClassName);
			i++;
		}
	}

	@Test
	public void testFinishTasks() {
		testFinishTask(
				"QuizTask",
				"ExampleTask",
				"SokobanTask");
	}
}
