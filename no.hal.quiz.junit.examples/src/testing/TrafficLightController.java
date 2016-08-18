package testing;

public class TrafficLightController implements ITrafficLightController {

	private TrafficLight carLights, pedLights;
	private int stateNum = 0;

	public TrafficLightController() {
		this.carLights = new TrafficLight(TrafficLight.RED, TrafficLight.YELLOW, TrafficLight.GREEN);
		this.pedLights = new TrafficLight(TrafficLight.RED, TrafficLight.GREEN);
		enterState(0);
	}
	
	private void enterState(int stateNum) {
		this.stateNum = stateNum;
		// assumes the previous state is stateNum - 1
		switch (stateNum) {
		case 0:
			this.carLights.setState(true, TrafficLight.GREEN);
			this.carLights.setState(false, TrafficLight.RED, TrafficLight.YELLOW);
			this.pedLights.setState(true, TrafficLight.RED);
			this.pedLights.setState(false, TrafficLight.GREEN);
			break;
		case 1:
			this.carLights.toggleState(TrafficLight.GREEN, TrafficLight.YELLOW);
			break;
		case 2:
			this.carLights.toggleState(TrafficLight.YELLOW, TrafficLight.RED);
			this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);
			break;
		case 3:
			this.carLights.toggleState(TrafficLight.YELLOW);
			this.pedLights.toggleState(TrafficLight.GREEN, TrafficLight.RED);
			break;
		}
	}

	@Override
	public boolean isCarLight(boolean state, String... lights) {
		return carLights.isState(state, lights);
	}

	@Override
	public boolean isPedLight(boolean state, String... lights) {
		return pedLights.isState(state, lights);
	}

	@Override
	public void tick() {
		if (stateNum > 0) {
			enterState((stateNum + 1) % 4);
		}
	}
	
	@Override
	public void pedButton() {
		if (stateNum == 0) {
			enterState(1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(TrafficLightController.class);
	}
}
