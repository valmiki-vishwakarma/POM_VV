package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends  TestBase{

// Page factory - OR

	@FindBy(name = "username")
	WebElement username;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//button[contains(text(),'Sign Up'")
	WebElement signUpBtn;

	@FindBy(xpath = "//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;

	public LoginPage() {
		PageFactory.initElements(driver, this);

	}

	public String validateLoginPageTitle() {

		return driver.getTitle();
	}

	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();

	}


	public HomePage Login(String uname, String Password)
	{
		username.sendKeys(uname);
		password.sendKeys(Password);
		loginBtn.click();
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
