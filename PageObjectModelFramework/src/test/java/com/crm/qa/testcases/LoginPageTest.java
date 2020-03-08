package com.crm.qa.testcases;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homepage;

	public LoginPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {

		initialization();

		loginPage = new LoginPage();
	}

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

	@Test(priority = 1)
	public void loginPageTiltleTest() {
		String title = loginPage.validateLoginPageTitle();
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

	}

	@Test(priority = 2)
	public void crmLogoTest() {

		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}

	@Test(priority = 3) 
	public void LoginTest() {

		homepage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
	}

}
