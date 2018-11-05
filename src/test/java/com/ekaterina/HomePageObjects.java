package com.ekaterina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePageObjects
{
	
	public HomePageObjects(WebDriver driver) {this.driver = driver;}
	
	WebDriver driver;
	
	 @FindBy(how = How.ID, using = "email")
	    public  WebElement Myusername;
	 
	 public void usrIdEnter(String text) {Myusername.sendKeys(text); Myusername.submit();}
	
	
	 @FindBy(how = How.XPATH, using = "//input[@id='password']")
	    public  WebElement Mypassword;
	 
	 public void passwordEnter(String text) {Mypassword.sendKeys(text); Mypassword.submit();}
	
	 
	 
	 
	
	 @FindBy(how = How.XPATH, using = "//span[@class='form-element-help --has-error']")
	    public  WebElement errorMessage;
	 
	 public String capturedText() {String validationText = errorMessage.getText(); return validationText;}
	
	
	
	
	By LogInButton = By.xpath("//a[@class='g-recaptcha button --primary normal-case ']");
	
	By HElink = By.xpath("//a[@class='homepage__copy --small --uppercase --semibold']");
	
	
	 By MyBankRate = By.linkText("SIGN IN");
	//By.xpath("//a[@class='global-navigation__secondary-nav-item --is-auth-app']");
	 
	                                       
	 public WebElement clickMyBankRate() {return driver.findElement(MyBankRate);}
	 public WebElement clickOnHomeEquity() {return driver.findElement(HElink);}
		
	
	

	
	public WebElement clickSubmit() { return driver.findElement(LogInButton);}
	
	
	
	 
	
	
}
