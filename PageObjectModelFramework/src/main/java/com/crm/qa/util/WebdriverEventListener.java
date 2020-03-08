package com.crm.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.base.TestBase;

public class WebdriverEventListener extends TestBase implements WebDriverEventListener {

	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Before navigating to : "+url+"");

	}

	public void afterNavigateTo(String url, WebDriver driver) {

	}

	public void beforeNavigateBack(WebDriver driver) {

	}

	public void afterNavigateBack(WebDriver driver) {

	}

	public void beforeNavigateForward(WebDriver driver) {

	}

	public void afterNavigateForward(WebDriver driver) {

	}

	public void beforeNavigateRefresh(WebDriver driver) {

	}

	public void afterNavigateRefresh(WebDriver driver) {

	}

	public void beforeFindBy(By by, WebElement element, WebDriver driver) {

	}

	public void afterFindBy(By by, WebElement element, WebDriver driver) {

	}

	public void beforeClickOn(WebElement element, WebDriver driver) {

	}

	public void afterClickOn(WebElement element, WebDriver driver) {

	}

	public void beforeChangeValueOf(WebElement element, WebDriver driver) {

	}

	public void afterChangeValueOf(WebElement element, WebDriver driver) {

	}

	public void beforeScript(String script, WebDriver driver) {

	}

	public void afterScript(String script, WebDriver driver) {

	}

	public void onException(Throwable throwable, WebDriver driver) {

	}

}
