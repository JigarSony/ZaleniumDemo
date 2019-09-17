package zaleniumDemo;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class FirefoxZaleniumDemo {

	@Test
	public void openFF() throws MalformedURLException, InterruptedException {
		
		System.out.println("Thread which are running"+Thread.currentThread().getId());

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setBrowserName(BrowserType.FIREFOX);

		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), cap);

		driver.manage().window().maximize();

		driver.get("http://www.gmail.com");

		System.out.println(driver.getTitle());

		Thread.sleep(5000);

		driver.quit();

	}

}
