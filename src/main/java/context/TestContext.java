package context;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigReader;
import driver.DriverGenerator;
import utils.DriverWait;
import utils.SeleniumWrapper;

public class TestContext {

	Properties prop;
	WebDriver driver;
	WebDriverWait wait;
	
	public TestContext() {
		loadConfig();
		setUpDriver();
		//setupWebDriverWait(driver);
	}
	
	
	private void loadConfig() {
		try {
			prop = new ConfigReader().loadProperties();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void setUpDriver() {
		String browser = prop.getProperty("browser");
		driver = new DriverGenerator().initializeDriver(browser);
	}
	
	public void setupWebDriverWait(WebDriver ldriver) {
		wait = new DriverWait().initialiseWait(ldriver, 10);;
	}
	
	public WebDriverWait getDriverWait() {
		return wait;
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	

}
