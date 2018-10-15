Feature: Application Login

Scenario: Happy path - user able to logIn into his account

Given User_was_able_to_navigate_to_logIn_page
When user enters correct username and password
And clicks logIn botton 
Then user is signed in and can see his/her name in the upper right corner of the page