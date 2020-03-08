package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.crm.qa.util.TestUtil;
import com.crm.qa.util.WebdriverEventListener;

public class TestBase {

	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties prop;
	public static EventFiringWebDriver e_driver;
	public static WebDriverEventListener eventListener;

	public TestBase() {

		prop = new Properties();

		// First load the config file
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");

			// E:\VV_FirstFramework\FreeCRMTest\src\main\java\com\crm\qa\config\config.properties

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			prop.load(fis);
			System.getProperty("browser");

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void initialization() {
		// read property file
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Valmiki Vishwakarma\\Downloads\\DataDrivenFramework-1\\DataDrivenFramework\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
		}

		else {

			System.err.println(" The Browse name" + browserName + " in config.properties is not valid");
		}

		e_driver = new EventFiringWebDriver(driver);
		eventListener = new WebdriverEventListener();
		e_driver.register(eventListener);
		driver = e_driver;
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));

	}

}
