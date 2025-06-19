package context;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import config.ConfigReader;
import driver.DriverGenerator;

public class TestContext {

	Properties prop;
	WebDriver driver;
	
	public TestContext() {
		loadConfig();
		setUpDriver();
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
	
	public WebDriver getDriver() {
		return driver;
	}
	
	

}
