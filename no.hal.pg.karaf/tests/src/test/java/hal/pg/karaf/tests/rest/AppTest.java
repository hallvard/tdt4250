package hal.pg.karaf.tests.rest;

import static com.jayway.restassured.RestAssured.get;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {

	private String engineUrl = "http://localhost:8082/pg/example1.pg/data";
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
		testStateUpto("started", 1, taskClassNames.length);
	}

	@Test
	public void testFinishedUpto() {
		testStateUpto("finished", 0, taskClassNames.length);
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

	private String[] taskClassNames = { 
		"QuizTask",
		"ExampleTask",
		"SokobanTask",
		"AssociationGameTask",
		"GeoCacheTask",
		"OtagQuest",
		"OtagQuest",
		"OtagQuest",
		"OtagQuest",
		"OtagQuest",
		"OtagQuest",
		"DrawGameTask",
		"CrosswordquizTask",
		"Group07Task",
		"YahtzeeTask",
		"MoveTask",
		"QuizLocationTask",
		"CodeCracker",
		"GeoQuizTask",
		"TreasureHuntTask",
		"TreasureHuntTask",
		"Group16"
	};
	
	@Test
	public void testTaskClassNames() {
		testTaskClassNames(taskClassNames);
	}
	
	private Boolean getState(Map<?, ?> jsonChild, String state) {
		return Boolean.valueOf(String.valueOf(jsonChild.get(state)));
	}

	private Boolean getState(List<?> jsonObject, String state) {
		if (jsonObject.size() == 1 && jsonObject.get(0) instanceof Map<?, ?>) {
			return getState((Map<?, ?> ) jsonObject.get(0), state);
		}
		return null;
	}
	
	protected boolean checkTaskState(List<?> jsonObject, String state, boolean value) {
		return Boolean.valueOf(value).equals(getState(jsonObject, state));
	}
	
	protected void assertTaskState(String url, List<?> jsonObject, String state, boolean value) {
		Assert.assertEquals("Illegal state value after running " + url, value, getState(jsonObject, state));
	}

	private String testFinishingRestUrls(int i, String... restUrls) {
		List<?> jsonObject = get(tasksUrl + "/" + i).getBody().jsonPath().get();
		if (! checkTaskState(jsonObject, "finished", false)) {
			return tasksUrl + "/" + i;
		}
		for (int j = 0; j < restUrls.length; j++) {
			String restUrl = restUrls[j];
			System.out.println("Invoking " + tasksUrl + "/" + i + "/" + restUrl);
			get(tasksUrl + "/" + i + "/" + restUrl).getBody().jsonPath().get();
			jsonObject = get(tasksUrl + "/" + i).getBody().jsonPath().get();
			if (! checkTaskState(jsonObject, "finished", j + 1 == restUrls.length)) {
				return restUrl;
			}
		}
		return null;
	}
	
	private String restUrlFilesDirectory = "/Users/hal/java/git/tdt4250/no.hal.pg.runtime.examples/src/no/hal/pg/runtime/examples/resturls";
	
	private Map<Object, Integer> taskClassNameCounters = null;
	
	private String testFinishingRestUrls(int i, Object taskClassName) {
		File dir = new File(restUrlFilesDirectory);
		FileReader fileReader = null;
		try {
			File file = new File(dir, taskClassName + ".txt");
//			System.out.println("Trying " + file);
			fileReader = new FileReader(file);
		} catch (FileNotFoundException e1) {
			if (taskClassNameCounters == null) {
				taskClassNameCounters = new HashMap<Object, Integer>();
			}
			Integer counterObject = taskClassNameCounters.get(taskClassName);
			int counter = (counterObject != null ? counterObject.intValue() : 0) + 1;
			taskClassNameCounters.put(taskClassName, counter);
			try {
				File file = new File(dir, taskClassName + String.valueOf(counter) + ".txt");
//				System.out.println("Trying " + file);
				fileReader = new FileReader(file);
			} catch (FileNotFoundException e) {
			}
		}
		Assert.assertNotNull("No test file for " + taskClassName + " (" + i + ")", fileReader);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(fileReader);
			String line = null;
			Collection<String> restUrls = new ArrayList<String>();
			while ((line = reader.readLine()) != null) {
				if (line.trim().length() == 0 || line.startsWith("#")) {
					continue;
				}
				restUrls.add(line);
			}
			return testFinishingRestUrls(i, restUrls.toArray(new String[restUrls.size()]));
		} catch (IOException e) {
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
				}
			}
		}
		return null;
	}
	
	private void testFinishTask(String... taskClassNames) {
		List<String> errorUrls = new ArrayList<String>();
		List<?> jsonObject = get(tasksUrl).getBody().jsonPath().get();
		int i = 0;
		for (Object jsonChild : jsonObject) {
			Assert.assertTrue(jsonChild instanceof Map<?, ?>);
			Object taskClassName = ((Map<?, ?>) jsonChild).get("taskClassName");
			String result = testFinishingRestUrls(i, taskClassName);
			if (result != null) {
				errorUrls.add(taskClassName + " -> " + result);
			}
			i++;
		}
		Assert.assertEquals(Arrays.asList(), errorUrls);
	}

	@Test
	public void testFinishTasks() {
		testFinishTask(taskClassNames);
	}
}
