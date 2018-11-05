package com.ekaterina;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesFinder {

	private static Logger log = LogManager.getLogger(FramesFinder.class.getName());
	
	
	
public static int NumberOfFrames(WebDriver driver, By locator) {
	
		
		int framecount = driver.findElements(By.tagName("iframe")).size();	
		for(int i=0; i<framecount; i++ ) {
			driver.switchTo().frame(i);
			int elementcount = driver.findElements(locator).size();
			if(elementcount > 0) { driver.findElement(locator).click();
			break;}
			else {log.error("No frames found");}
			driver.switchTo().defaultContent();
		}
	
	return framecount  ;}
	
	public static String windowsNavigation(WebDriver driver, By locator) {
		Set<String> mywindows = driver.getWindowHandles();
		String currentWindow = "";
	
	
	Iterator<String> pageid = mywindows.iterator();
	while(pageid.hasNext()) {currentWindow = pageid.next(); driver.switchTo().window(currentWindow);
	int elementcount = driver.findElements(locator).size();
	if(elementcount > 0) {driver.findElement(locator).click();
	break;}
	else {log.error("Window is not found");}
			
	}
	
	return currentWindow;}
		
	public static int brokenLinks(WebDriver driver) {
		
		int allLinks = driver.findElements(By.tagName("link")).size();
		
		if(allLinks > 0) {
		for(int k = 0; k < allLinks; k++) {
			driver.findElement(By.tagName("link")).click();
			String pTitle = driver.getTitle();
			if(pTitle.contains("404")) {System.out.println(k + pTitle);}
			}
		
			
		}
		else {System.out.println("No links found");} 
		
		return allLinks;
	}
	
	
	
	
}
