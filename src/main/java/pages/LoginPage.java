package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.SeleniumWrapper;

public class LoginPage {
	
	//WebDriver driver;
	WebDriverWait wait;
	SeleniumWrapper wrapper;
	
	public LoginPage(WebDriver driver, WebDriverWait wait) {
		
		PageFactory.initElements(driver, this);
		wrapper = new SeleniumWrapper(wait);
	}
	
	@FindBy(id="user-name")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void inputUsername(String username) {
		wrapper.sendKeys(usernameField, username);
	}
	
	public void inputPassword(String password) {
		wrapper.sendKeys(passwordField, password);
	}
	
	public void clickonLoginBtn() {
		wrapper.click(loginBtn);
	}

}
