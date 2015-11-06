package hal.pg.karaf.tests.rest;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;

public class AppTest {

	@Test
	public void testUnfinished() {
		get("http://localhost:8082/example1.pg/data/tasks/0").then().
		assertThat().body("[0].started", equalTo(true)).and().
		assertThat().body("[0].finished", equalTo(false))
		;
	}
}
