package driver;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverGenerator {
	
	private WebDriver driver;
	private Properties prop;
	
	private void initializeDriver() throws IOException
	{
		prop = new ConfigReader().loadProperties();
		String browser = prop.getProperty("browser").toLowerCase();
		switch(browser) {
			case "chrome":{
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			}
			case "firefox":{
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			}
			case "edge":{
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			default:{
				throw new IllegalArgumentException("invalid browser " + browser);
			}
		}
	}
	
	public WebDriver getWebDriver() throws IOException {
		initializeDriver();
		return driver;
	}

}
