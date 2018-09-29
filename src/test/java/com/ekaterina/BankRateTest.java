package com.ekaterina;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BankRateTest extends MortgageCalculatorTest
/*This class is basically a test for navigation from first mortgage calculation page to bank rate page.
 Here I am working with frames and testing navigation between pages   */

{
	private static Logger log = LogManager.getLogger(BankRateTest.class.getName());
	
	
	
	@BeforeTest
	public void openBrowser() throws IOException 
	{driver = driverInitialization();
	log.info("Initialiazation");
	navigatetocalc();
	}
	
	@Test
	public void navigToBankRate() {
		
		
		
		LogInPageObjs logIn = new LogInPageObjs(driver);
		FramesFinder.windowsNavigation(driver, logIn.MyBankRate);
		
		
		log.info(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Bankrate.com - Compare mortgage, refinance, insurance, CD rates");
		
		
		log.info(driver.getTitle());
		
	}
	
	
	
	
}
