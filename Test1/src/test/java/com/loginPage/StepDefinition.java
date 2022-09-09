package com.loginPage;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.config.ConfigReader;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

	WebDriver driver;
	ConfigReader config;
	LoginPage loginpage=PageFactory.initElements(driver, LoginPage.class);

	@SuppressWarnings("deprecation")
	@Before
	public void setUp() throws FileNotFoundException {
		config = new ConfigReader();
		
		System.setProperty("webdriver.chrome.driver", config.getChromeDriver());
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("User is on home screen")
	public void user_is_on_home_screen() throws FileNotFoundException {
		config = new ConfigReader();
		System.out.println("User is on home screen");
		driver.get(config.getURL());
		//throw new io.cucumber.java.PendingException();
	}

	@When("^I enter username \"[^\"]*\"$")
	public void i_enter_username(String arg1) {
		
		loginpage.enterPassword(arg1);
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
//
//	@And("I enter password \"[^\"]*\"$")
//	public void i_enter_password(String arg1) {
//		loginpage.enterPassword(arg1);
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("I verify the successful login")
//	public void i_verify_the_successful_login() {
//		// Write code here that turns the phrase above into concrete actions
//		throw new io.cucumber.java.PendingException();
//	}

}
