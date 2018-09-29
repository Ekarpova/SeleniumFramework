package com.ekaterina;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.Test;




public class Basic 
/* this class contains basic methods that are used in framework, like initializing the browser
 taking the screenshot and connecting to DB */

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
	

	public static void main(String[] args)  {}
		// TODO Auto-generated method stub
	
	
	

	
	public WebDriver driverInitialization() throws IOException{
	
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\ekate\\SeleniumFramework\\src\\test\\java\\com\\ekaterina\\DataF.properties");
		
		
		
		prop.load(fis);
		String theBrowser = prop.getProperty("browser");
		if(theBrowser.contains("chrome")) {driver = new ChromeDriver();}
		else if(theBrowser.contains("firefox")) {driver = new FirefoxDriver();}
		else {driver = new InternetExplorerDriver();}
		
		url = prop.getProperty("url");
		driver.get(prop.getProperty("url"));
		//username = prop.getProperty("username");
		//password = prop.getProperty("password");
		//host = prop.getProperty("host");
		//port = prop.getProperty("port");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		log.info(theBrowser);
		return driver;
				
	}
	
	public void takeTestScreenshot(String result) throws IOException {
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("C://Users//ekate//Desktop//Statements//"+ result +"sh.png"));}
	
	
	
public ResultSet dbConnection() throws SQLException  {
		
Connection con;

	con = DriverManager.getConnection("jdbc:mysql://localhost:3306" + "/qadb", "root", "Cenk1986");

log.info("the browser is ");
log.info("Connected to MySQL");
Statement s;

	s = con.createStatement();

ResultSet rs;

	rs = s.executeQuery("select username, password from credentials where name = 'Alex_Doe';");

return rs;}
	


}

