package com.ekaterina;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;



import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.commons.logging.Log;
import com.ekaterina.*;


public class HomePageTest extends BankRateTest 
/*This calss is a test for sign in into bankrate page, it primarily testing ability to pull data
 from DB and enter it as sign in info. This test depends on successful completion of first test - calculating 
 the refinance and second test successfully navigating to bankrate page */

{
	private static Logger log = LogManager.getLogger(HomePageTest.class.getName());
	public String Myusername;
	public String Mypassword;
	
	
	
	@BeforeTest
	public void openBrowser() throws IOException 
	{driver = driverInitialization();
	log.info("Initialiazation");
	}
	
	

	@Test
	public void enterLogIn() throws IOException, SQLException {
		navigToBankRate();
		LogInPageObjs logIn = new LogInPageObjs(driver);
		FramesFinder.windowsNavigation(driver, logIn.LogInButton);
		 Basic b = new Basic();
		 ResultSet results = b.dbConnection();
		
		 while(results.next()) {
			 
		driver.findElement(logIn.Myusername).sendKeys(results.getString("username"));
		driver.findElement(logIn.Mypassword).sendKeys(results.getString("password"));
		 }
		
		
		
		
		
	
	//logIn.clickSubmit().click();
	
	log.info(driver.getTitle());
	
	}
	





	


	
	
}

