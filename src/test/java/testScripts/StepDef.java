package testScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.cartPage;
import pageObjects.loginPage;
import pageObjects.productPage;

public class StepDef {
	WebDriver driver;
	loginPage lp;
	productPage pp;
	cartPage cp;
	
	
	@Given("^user is on the loginpage$")
	public void user_is_on_the_loginpage() throws Throwable {
	    
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		lp = new loginPage(driver);
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
	}

	@When("^user enters valid username$")
	public void user_enters_valid_username() throws Throwable {
		WebElement loginbox = driver.findElement(By.id("user-name"));
		loginbox.sendKeys("standard_user");
	    
	}

	@When("^user enters valid password$")
	public void user_enters_valid_password() throws Throwable {
	    
		WebElement passwordbox = driver.findElement(By.id("password"));
		passwordbox.sendKeys("secret_sauce");
	}

	@When("^user click on the login button$")
	public void user_click_on_the_login_button() throws Throwable {
	    
		lp.getloginButton().click();
	}

	@Then("^user should be on the homepage$")
	public void user_should_be_on_the_homepage() throws Throwable {
	    
		String url = driver.getCurrentUrl();

		System.out.println(url);

		Assert.assertEquals("https://www.saucedemo.com/inventory.html", url);
	}

	@Then("^user should able to close the browser$")
	public void user_should_able_to_close_the_browser() throws Throwable {
	    
	    driver.quit();
	}

}
