package com.loginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	WebDriver driver;
	@FindBy(name = "userName") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(how=How.NAME,using="submit") WebElement login;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUserName(String userName) {
		username.sendKeys(userName);
	}
	public void enterPassword(String password1) {
		password.sendKeys(password1);
		login.click();
	}
	
	
	
	
}
