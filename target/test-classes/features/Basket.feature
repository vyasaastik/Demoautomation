@Reg
Feature: Basket functionality

Scenario: verify the basket count and functionality
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
Then click on the add to cart button
And validate cart count is "1"


