package driver;

import org.openqa.selenium.WebDriver;

public class DriverGenerator {
	
	private WebDriver driver;
	
	public WebDriver initializeDriver(String browser) 
	{
		switch(browser) {
			case "chrome":{
				driver = new ChromeStrategy().setupDriver();
				break;
			}
			case "firefox":{
				driver = new FirefoxStrategy().setupDriver();
				break;
			}
			case "edge":{
				driver = new EdgeStrategy().setupDriver();
				break;
			}
			default:{
				throw new IllegalArgumentException("invalid browser " + browser);
			}
		}
		
		return driver;
	}
}
