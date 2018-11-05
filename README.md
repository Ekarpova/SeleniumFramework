# Project: SeleniumFramework

#About the project:
This sample project contains two tests and designed to showcase a sample and simple page object framework and test a few basic functionalities, see each test description below.


#Prerequisites:
- java version 8 has to be installed on your machine
(https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- Maven should be installed on your machine (https://maven.apache.org/download.cgi)
- download chomedrive.exe for your OS and place in the same directory as the project
(https://chromedriver.storage.googleapis.com/index.html?path=2.43/)

#How to run the project:
- Clone the project from GitHuB
- Once project is downloaded, open command prompt and navigate to the directory where the project is placed
- Ensure that chromedriver.exe is placed in the same directory
- run command mvn clean 
- run command mvn test
- test results can be found here: directory_where_project_saved\target\surefire-reports

#Framework components:

Basic.java
This class contains fundamental methods:
driverInitialization()
getusername()
getpassword()

FramesFinder.java
This is supplementary class that contains reusable methods for finding and handling frames on the page as well as working with multiple windows.
 NumberOfFrames(WebDriver driver, By locator)
windowsNavigation(WebDriver driver, By locator)

MortgagePageObjects.java
This class is designed to store objects of the first page – Mortgage Calculator. This class is aligned with page object model where objects of each page are stored separately and can be easily modified. 

 MortgageCalculatorTest.java extends Basic.java
Contains one test - navigatetocalc();
This is Test1. Purpose of this test is to successfully input values that are required to calculate refinancing of a house. Complete calculation and capture feedback provide by the application. 
 HomePageObjects.java
This class is designed to store objects of the second – LogIn page. This class is aligned with page object model where objects of each page are stored separately and can be easily modified.


HomePageTest.java extends MortgageCalculatorTest.java
HomePageTest is a test for sign in functionality. 
Negative scenario, testing incorrect usrername and/or password entered and the error message displayed.  This test depends on successful completion of Test1 - calculating the refinance.

***PLEASE NOTE –  3 test runs are expected as the results and one assertion failure is expected 
java.lang.AssertionError: expected [Mortgage Calculator] but found [Sign In For Your Free Credit Score & Monitoring | Bankrate]

Author and Contributor: Ekaterina Karpova
