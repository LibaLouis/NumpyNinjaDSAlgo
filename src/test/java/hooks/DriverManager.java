package hooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.LoggerLoad;

public class DriverManager {

static WebDriver driver; 
	
	public WebDriver initDriver(String browser) { 
		
		if (browser.equalsIgnoreCase("firefox")) {
			driver =WebDriverManager.firefoxdriver().create();
			LoggerLoad.info("Testing on firefox");

		} else if (browser.equalsIgnoreCase("chrome")) {
			driver=WebDriverManager.chromedriver().create();
			LoggerLoad.info("Testing on chrome");

		} else if (browser.equalsIgnoreCase("safari")) {
			driver = WebDriverManager.safaridriver().create();
			LoggerLoad.info("Testing on safari");

		} else if (browser.equalsIgnoreCase("edge")) {
			driver=WebDriverManager.edgedriver().create();
			LoggerLoad.info("Testing on edge");
	
		}
		// Set Page load timeout
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		

		return driver;
	}

	public static WebDriver getdriver() {
		return driver;
	}

	public void closeallDriver() {
		driver.close();
	}
	
}
