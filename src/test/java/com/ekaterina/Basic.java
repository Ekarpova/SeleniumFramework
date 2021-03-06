package com.ekaterina;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;




public class Basic 


{
	
	private static Logger log = LogManager.getLogger(Basic.class.getName());
	
	public  WebDriver driver;
	
	public Properties prop;
	public String url;
	public String username;
	public String password;
	public String FilePath;
	//public String host;
	//public String port;
	

	
	InputStream inputStream;
	
	public WebDriver driverInitialization() throws IOException{
	
		
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
		
				
		
		String theBrowser = prop.getProperty("browser");
		
		if(theBrowser.contains("chrome")) {driver = new ChromeDriver();}
		
		
		
		else if(theBrowser.contains("firefox")) {driver = new FirefoxDriver();}
		else {driver = new InternetExplorerDriver();}
		
		url = prop.getProperty("url");
		driver.get(prop.getProperty("url"));
		
		
		//host = prop.getProperty("host");
		//port = prop.getProperty("port");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		log.info(theBrowser);
		
		
		
		return driver; }
		catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();}
		return driver ;
		
	}
	
	
	
	
	
	public String getusername() throws IOException{
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");}
			
			
			username = prop.getProperty("username");
		
			}
			
			finally {
				inputStream.close();}
			return username ;
		
	}
	
	
	
public String getpassword() throws IOException{
		
		try {
			Properties prop = new Properties();
			String propFileName = "config.properties";
 
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");}
			
			password = prop.getProperty("password");
			
		
			}
			
			finally {
				inputStream.close();}
			return username ;
		
	}
	
	
	
		
	
	public ResultSet dbConnection() throws SQLException  {
		
	
	
Connection con;

	con = DriverManager.getConnection("jdbc:mysql://localhost:3306" + "/qadb", "root", "mypassword");

log.info("the browser is ");
log.info("Connected to MySQL");
Statement s;

	s = con.createStatement();

ResultSet rs;

	rs = s.executeQuery("select username, password from credentials where name = 'Alex_Doe';");

return rs;}
	


}

