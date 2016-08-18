package testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TrafficLight {

	public final static String RED = "red", YELLOW = "yellow", GREEN = "green";

	private Collection<String> allLights, lightsOn;
	
	public TrafficLight(String... lights) {
		this.allLights = Arrays.asList(lights);
		this.lightsOn = new ArrayList<String>();
	}
	
	@Override
	public String toString() {
		return lightsOn + "/" + allLights;
	}
	
	public boolean isState(boolean state, String... lights) {
		for (int i = 0; i < lights.length; i++) {
			String light = lights[i];
			checkLight(light);
			if (getState(light) != state) {
				return false;
			}
		}
		return true;
	}

	public boolean getState(String light) {
		return lightsOn.contains(light);
	}

	private void checkLight(String light) {
		if (! allLights.contains(light)) {
			throw new IllegalArgumentException("Unknown light: " + light);
		}
	}
	
	public void setState(boolean state, String... lights) {
		for (int i = 0; i < lights.length; i++) {
			String light = lights[i];
			checkLight(light);
			if (! state) {
				lightsOn.remove(light);
			} else if (! getState(light)) {
				lightsOn.add(light);
			}
		}
	}

	public void toggleState(String... lights) {
		for (int i = 0; i < lights.length; i++) {
			String light = lights[i];
			checkLight(light);
			setState(! getState(light), light);
		}
	}
}
