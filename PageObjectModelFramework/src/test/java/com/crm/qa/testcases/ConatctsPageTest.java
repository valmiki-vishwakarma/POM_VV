package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.util.TestUtil;

public class ConatctsPageTest extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	TestUtil testUtil;

	public ConatctsPageTest() {
		super();

	}

	@BeforeMethod
	public void setUp() {
		initialization();
		testUtil = new TestUtil();
		loginPage = new LoginPage();
		homePage = loginPage.Login(prop.getProperty("username"), prop.getProperty("password"));
		testUtil.swtichtoFrame("mainpanel");
		contactsPage = homePage.clickOnContactsLink();

	}

	@Test(priority = 1)
	public void verifyContactsPageLabelTest() {

		Assert.assertTrue(contactsPage.verifyContactsLabel(),"contacts label is missing on the page");

	}

	@Test(priority = 2)
	public void selectSingleContactsTest() {
		contactsPage.selectContactsByName("Shree B");
	}

	@Test(priority = 3, enabled = false)
	public void selectMultipleContactsTest() {
		contactsPage.selectContactsByName("John2 Doe2  ");
		contactsPage.selectContactsByName("John3 Doe3  ");
	}

	
	@Test (priority = 4,enabled = false)
	public void validateCreateNewContact() {
	
		homePage.clickOnNewContactsLink();
		contactsPage.createNewContact("MR", "DOM", "PETER", "Google");
		
	}
	@AfterMethod
	public void tearDown() { 

		driver.quit();
	}

}
