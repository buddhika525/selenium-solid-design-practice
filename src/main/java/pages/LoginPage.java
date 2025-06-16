package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")
	WebElement usernameField;
	
	@FindBy(id="password")
	WebElement passwordField;
	
	@FindBy(id="login-button")
	WebElement loginBtn;
	
	public void inputUsername(String username) {
		usernameField.sendKeys(username);
	}
	
	public void inputPassword(String password) {
		passwordField.sendKeys(password);
	}
	
	public void clickonLoginBtn() {
		loginBtn.click();
	}

}
