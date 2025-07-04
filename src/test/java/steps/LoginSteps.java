package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import context.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage loginPage;
	WebDriverWait wait;
	
	public LoginSteps() {
		TestContext testContext = new TestContext();
		driver = testContext.getDriver();
		testContext.setupWebDriverWait(driver);
		wait = testContext.getDriverWait();
	}
	
	@Given("user goes to {string}")
	public void user_goes_to(String string) throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    driver.get("https://www.saucedemo.com/");
	    driver.manage().window().maximize();
	    loginPage = new LoginPage(driver, wait);
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@When("user types {string} as Username and types {string} as password")
	public void user_types_as_username_and_types_as_password(String username, String password) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//Thread.sleep(1000);
		loginPage.inputUsername(username);
		loginPage.inputPassword(password);
	    
	}
	@When("user clicks on the Login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	   loginPage.clickonLoginBtn();
	}
	@Then("user should be directed to {string} page")
	public void user_should_be_directed_to_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
