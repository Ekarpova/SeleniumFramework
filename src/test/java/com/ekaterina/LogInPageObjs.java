package com.ekaterina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObjs 
/*This class is used to collect sign in page objects */
{
	
	public LogInPageObjs(WebDriver driver) {this.driver = driver;}
	
	WebDriver driver;
	
	By Myusername = By.id("email");
	 
	By Mypassword = By.xpath("//input[@id='password']");
	
	By LogInButton = By.xpath("//a[@class='g-recaptcha button --primary normal-case ']");
	
	
	
	
	 By MyBankRate = By.xpath("//a[@class='global-navigation__secondary-nav-item --is-auth-app']");
	 public WebElement clickMyBankRate() {return driver.findElement(MyBankRate);}
	
		
	public WebElement usrIdEnter() {return driver.findElement(Myusername);}
	
	public WebElement pswEnter() { return driver.findElement(Mypassword);}
	
	public WebElement clickSubmit() { return driver.findElement(LogInButton);}
	
	
}
