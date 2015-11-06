package hal.pg.karaf.tests.browser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@RunWith(BlockJUnit4ClassRunner.class)
public class AppTest {

	private static ChromeDriverService service;
	private WebDriver driver;

	@BeforeClass
	public static void createAndStartService() throws IOException {
		service = new ChromeDriverService.Builder()
				.usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver"))) // "/Applications/chromedriver"))
				.usingAnyFreePort()
				.build();
		service.start();
	}

	@AfterClass
	public static void createAndStopService() {
		service.stop();
	}

	@Before
	public void openBrowser() {
		if (service != null) {
			driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
		} else {
			driver = new ChromeDriver();
		}
	}

	@After
	public void closeBrowser() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	@Test
	public void testExampleTaskYes() throws InterruptedException {
		driver.get("http://localhost:8082/example1.pg/app/");

		WebElement task3link = driver.findElement(By.linkText("Task 3 - ExampleTask"));
		task3link.click();

		List<WebElement> buttons = driver.findElements(By.cssSelector("button"));
		Assert.assertEquals(2, buttons.size());
		WebElement yesButton = buttons.get(0);
		Assert.assertEquals("Yes", yesButton.getText());
		yesButton.click();

		List<WebElement> h2s = driver.findElements(By.cssSelector("h2"));
		WebElement correctnessElement = h2s.get(1);

		WebDriverWait wait = new WebDriverWait(driver, 1);
        wait.until(ExpectedConditions.textToBePresentInElement(correctnessElement, "Correct"));

		Assert.assertEquals("Correct", correctnessElement.getText());
	}
}
