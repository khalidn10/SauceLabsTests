package sauce_labs_tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SauceLabsTest {

	public static final String USERNAME = "YOUR_USERNAME"; // Your Sauce Labs account username
	public static final String ACCESS_KEY = "YOUR_ACCESS_KEY"; // Your Sauce Labs account access key
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub"; // The URL path
	  
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		URL url = new URL(URL);
		
		// The DesiredCapabilities class should no longer be used 
		/*DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Windows 7");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("browserVersion", "51.0");*/
		
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("w3c", true);
		options.setCapability("platformName", "Windows 7");
		options.setCapability("browserVersion", "58.0");
		options.setCapability("sauce:options", sauceOptions);
		
		WebDriver driver = new RemoteWebDriver(url, options);
		driver.get("https://www.google.co.uk/");
		System.out.println(driver.getTitle());
	}

}
