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
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageTest extends MortgageCalculatorTest {



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
		HomePageObjects logIn = PageFactory.initElements(driver, HomePageObjects.class);
		navigatetocalc();
		
		FramesFinder.windowsNavigation(driver, logIn.MyBankRate);
		System.out.println(driver.getTitle());
		
		
		logIn.clickMyBankRate();
		
		logIn.usrIdEnter(getusername());
		
		logIn.passwordEnter(getpassword());
		
		Assert.assertEquals("Password or Email Incorrect", logIn.capturedText());
		log.error(logIn.capturedText());
		if(logIn.capturedText().isEmpty()) {log.error("test failed");}
		else {log.info("Test Passed");} 		 
	
	
	log.info(driver.getTitle());
	
	}
	





	


	
	
}

