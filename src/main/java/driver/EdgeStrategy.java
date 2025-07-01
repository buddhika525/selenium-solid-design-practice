package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EdgeStrategy implements DriverStrategy{

	@Override
	public WebDriver setupDriver() {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		return new EdgeDriver();
	}

}
