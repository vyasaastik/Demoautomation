@Reg
Feature: verify login functionality

Scenario: verify login functionality with valid credentials
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
And validate successfull login



Scenario: verify login functionality with invalid username and password
When user enter correct username and paswword "standard_klkjuser" and "secret_lkjysauce"
Then click on the login button
Then validate error message



Scenario: verify login functionality with invalid username and valid password 
When user enter correct username and paswword "standard_000user" and "secret_sauce"
Then click on the login button
Then validate error message



Scenario: verify login functionality with valid username and invalid password 
When user enter correct username and paswword "standard_user" and "secret_8585sauce"
Then click on the login button
Then validate error message