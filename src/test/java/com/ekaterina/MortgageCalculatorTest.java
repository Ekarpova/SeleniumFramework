package com.ekaterina;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


//*****Imports from Paul
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MortgageCalculatorTest extends Basic{
	
	private static Logger log = LogManager.getLogger(MortgageCalculatorTest.class.getName());
	
	
	
	@BeforeTest
	public void openBrowser() throws IOException 
	{driver = driverInitialization();
	log.info("Initialiazation..");
	}
	
	
	@Test
	public void navigatetocalc() {
		//HomePageObjects HPO = new HomePageObjects(driver);
		HomePageObjects hpage = PageFactory.initElements(driver, HomePageObjects.class);
		
		String pageTitle = driver.getTitle();
		log.info(pageTitle);
		
		//Assert.assertEquals("Mortgage Calculator", pageTitle);
		Actions a = new Actions(driver);
		WebElement move = hpage.dataInput();
	  
		a.moveToElement(move).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).click().build().perform();
		String newPageTitle = driver.getTitle();
		log.info(newPageTitle);
		
		
		hpage.enterHomeValue("371000");
		hpage.enterOrigAmount().sendKeys("350000");		 
		hpage.enterInterst().sendKeys("4.8");
		hpage.enterCurLoanTerm("30");
		hpage.enterMonthsPaid("60");
		hpage.enterYearsBeforeSell("1");
		hpage.clickCalcButton();
		String refAmount = hpage.captureRefAmount().getText();
		log.info("Total Refinancing Benefit", " ", refAmount); 
		hpage.clickAnalysisLink().click();
		String Summary = hpage.captureSummary().getText();
		System.out.println(Summary);	
		  
			
		 FramesFinder.NumberOfFrames(driver, hpage.BankRateLink);} 
		
		
	    
		/*public void pagenavigation(){
		
	    }*/
		
		
		
		
		//driver.switchTo().window(parentid);
	    
		//System.out.println(currpage);  
		
	    
		
		//driver.switchTo().frame(driver.findElement(By.id("br1")));
		//driver.findElement(By.linkText("Bankrate.com")).click();
		
		
		
		
		//System.out.println(refAmount);
	
	

}
