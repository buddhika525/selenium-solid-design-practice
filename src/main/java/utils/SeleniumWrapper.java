package utils;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrapper {
	
	WebDriverWait wait;
	WebDriver driver;
	
	public SeleniumWrapper(WebDriverWait wait) {
		this.wait = wait;
	}
	
	public void sendKeys(WebElement element, String key) {
		wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(key);
	}
	
	public void click(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element)).click();
	}

}
