package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeStrategy implements DriverStrategy{
	
	@Override
	public WebDriver setupDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		return new ChromeDriver();
		
	}

}
