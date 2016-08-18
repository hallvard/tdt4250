package testing;

public interface ITrafficLightController {
	public boolean isCarLight(boolean state, String... lights);
	public boolean isPedLight(boolean state, String... lights);
	public void tick();
	public void pedButton();
}
