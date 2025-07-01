package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxStrategy implements DriverStrategy{

	@Override
	public WebDriver setupDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}

}
