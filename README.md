# Project: SeleniumFramework

#Prerequisites:
- java version 8 should be insatlled on your machine
 - Maven should be installed on your machine (https://maven.apache.org/download.cgi)

#How to run the project:
- Clone the project from GitHuB
- Once project is downloaded, open command prompt and navigate to the directory where the project is placed
- run command mvn test
- test results can be found here: directory_where_project_saved\target\surefire-reports

#Project description:

-  MortgageCalculatorTest.java
Contains one test - navigatetocalc();
This is the first test to run. Purpose of this test is to successfully input values that are required to calculate refinancing of a house.
Complete calculation and capture feedback provide by the application. 

 - BankRateTest.java
Contains one test - navigToBankRate();
This test is basically a test for navigation from first mortgage calculation page to bank rate page.
 Here I am working with frames and testing navigation between pages.
 
 
  - HomePageTest.java
 Contains one test - enterLogIn();
 This calss is a test for sign in into bankrate page, it primarily testing ability to pull data
 from DB and enter it as sign in info. This test depends on successful completion of first test - calculating 
 the refinance and second test, successfully navigating to bankrate page.

Author and Contributor: Ekaterina Karpova
