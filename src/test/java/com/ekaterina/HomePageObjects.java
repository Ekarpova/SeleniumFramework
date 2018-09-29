package com.ekaterina;

import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class HomePageObjects {
	/*This class is designed to capture objects of the first page I am working with, 
	where I input values in the calculator, I capture here locators where I can easily modify them if any
	change occurs which creates reusability*/
	
	
	public HomePageObjects(WebDriver driver) {this.driver = driver;}
	
	WebDriver driver;
	
	By Calculator = By.xpath("//div[@class='main-menu']/nav/ul/li[2]/a");
	By CalcLink =   By.xpath("//div[@class='main-menu']/nav/ul/li[1]/ul/li[1]/a");
	
	By Title = By.xpath("//div[@class='logo']/a");
			
	
	By currentvalue;
	
	By OrigAmount = By.xpath("//input[@name='Amount']");
	By Interest =  By.xpath("//input[@name='Interest']");
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	
	public WebElement validatepage() {return driver.findElement(Title);}
	
	
	
	public WebElement dataInput() {return driver.findElement(Calculator);}
	
	public WebElement enterOrigAmount() {return driver.findElement(OrigAmount);}
	
	public WebElement enterInterst() {return driver.findElement(Interest);}
	
	@FindBy(how = How.XPATH, using = "//input[@name='HomeValue']")
    public  WebElement HomeValue;
	
	 public void enterHomeValue(String text) {
		 HomeValue.sendKeys(text);
		 HomeValue.submit(); }
	    	 
	 
	 @FindBy(how = How.XPATH, using = "//input[@name='Length']")
	    public  WebElement CurrLoanTerm;
	 
	 public void enterCurLoanTerm(String text) {
		 CurrLoanTerm.sendKeys(text);
		 CurrLoanTerm.submit(); }

	 
	 @FindBy(how = How.XPATH, using = "//input[@name='PaidPeriods']")
	    public  WebElement MonthsPaid;
	 
	 public void enterMonthsPaid(String text) {
		 MonthsPaid.sendKeys(text);
		 MonthsPaid.submit(); }
	
	 @FindBy(how = How.XPATH, using = "//input[@name='YearsBeforeSell']")
	    public  WebElement YearsBeforeSell;
	 
	 public void enterYearsBeforeSell(String text) {
		 YearsBeforeSell.sendKeys(text);
		 YearsBeforeSell.submit(); }
	 
	 @FindBy(how = How.XPATH, using = "//td[@class='button']")
	    public  WebElement CalcButton;
	 
	 public void clickCalcButton() {
		 
		 CalcButton.click(); }
	 
	 By totalRef = By.xpath("//tr[@class='total last']/td[3]");
	 public WebElement captureRefAmount() {return driver.findElement(totalRef);}
	 
	 By Analysis = By.xpath("//*[@id='analysisDiv']/div/a");
	 public WebElement clickAnalysisLink() {return driver.findElement(Analysis);}
	 
	By Summary = By.xpath("//*[@id='plainEnglishDiv']/table/tbody/tr/td");
	 public WebElement captureSummary() {return driver.findElement(Analysis);}
	 
	By BankRateLink = By.linkText("Bankrate.com");
			
	
	
		
	
} 


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

