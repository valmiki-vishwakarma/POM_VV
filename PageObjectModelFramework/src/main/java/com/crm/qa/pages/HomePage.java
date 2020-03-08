package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//td[contains(text(),'User: Naveen Khunteta')]")
	WebElement userNamelabel;

	@FindBy(xpath = "//a[contains(text(),'Contacts')]")
	WebElement contactsLink;

	@FindBy(xpath = "//a[contains(text(),'Deals')]")
	WebElement dealsLink;

	@FindBy(xpath = "//a[contains(text(),'Tasks')]")
	WebElement tasksLink;
	
	@FindBy(xpath="//a[contains(text(),'New Contacts')]")
	WebElement newContactsLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyHomePageTitle() {

		return driver.getTitle();

	}

	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();

	}

	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}

	public TaskPage clickOnTaskLink() {
		tasksLink.click();
		return new TaskPage();
	}
	
	public Boolean verifyCorrectUsername() {
		
	return 	userNamelabel.isDisplayed();	
		
	}
	
	public void clickOnNewContactsLink() {
		
		Actions action = new Actions(driver);
		action.moveToElement(contactsLink).build().perform();
		newContactsLink.click();
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
