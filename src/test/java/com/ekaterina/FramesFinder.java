package com.ekaterina;

import java.util.Iterator;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesFinder
/*This is supplementary class that contains reusable methods for finding and handling frames on the page 
 as well as working with multiple windows    */
{
	private static Logger log = LogManager.getLogger(FramesFinder.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
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
		
	
	
	
	
	
}
