package testing;

import junit.framework.TestCase;

public class TrafficLightControllerTest extends TestCase {

	private ITrafficLightController trafficLightController;
	
	protected void setUp() throws Exception {
		trafficLightController = new TrafficLightController();
	}

	public void testTrafficLightController() {
		state0Test();
	}

	private void state0Test() {
		assertTrue(trafficLightController.isCarLight(true, "green"));
		assertTrue(trafficLightController.isCarLight(false, "red", "yellow"));
		assertTrue(trafficLightController.isPedLight(true, "red"));
		assertTrue(trafficLightController.isPedLight(false, "green"));
	}

	public void testSequence1() {
		state0Test();
		trafficLightController.tick();
		// tick() doesn't change the state
		state0Test();
		
		trafficLightController.pedButton();
		state1Test();
		trafficLightController.pedButton();
		// pedButton() doesn't change the state
		state1Test();
		
		trafficLightController.tick();
		state2Test();
		trafficLightController.pedButton();
		// pedButton() doesn't change the state
		state2Test();

		trafficLightController.tick();
		state3Test();
		trafficLightController.pedButton();
		// pedButton() doesn't change the state
		state3Test();
		
		trafficLightController.tick();
		state0Test();
	}

	private void state1Test() {
		assertTrue(trafficLightController.isCarLight(true, "yellow"));
		assertTrue(trafficLightController.isCarLight(false, "red", "green"));
		assertTrue(trafficLightController.isPedLight(true, "red"));
		assertTrue(trafficLightController.isPedLight(false, "green"));
	}
	
	private void state2Test() {
		assertTrue(trafficLightController.isCarLight(true, "red"));
		assertTrue(trafficLightController.isCarLight(false, "yellow", "green"));
		assertTrue(trafficLightController.isPedLight(true, "green"));
		assertTrue(trafficLightController.isPedLight(false, "red"));
	}
	
	private void state3Test() {
		assertTrue(trafficLightController.isCarLight(true, "red", "yellow"));
		assertTrue(trafficLightController.isCarLight(false, "green"));
		assertTrue(trafficLightController.isPedLight(true, "red"));
		assertTrue(trafficLightController.isPedLight(false, "green"));
	}
}
