package com.crm.qa.util;

import java.sql.Driver;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT= 400;
	public static long IMPLICIT_WAIT = 15;
	
	
	public void swtichtoFrame(String frameName) {
		
		driver.switchTo().frame(frameName);
	}
}
