@Reg
Feature:


Scenario: verify checkout functionality without entering textfields
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
Then click on the add to cart button
Then click on cart button 
Then click on checkbox button
Then leave all the textfield empty "" "" ""
Then click on the continue button
Then validate an error message

Scenario: verify checkout functionality without entering textfields
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
Then click on the add to cart button
Then click on cart button 
Then click on checkbox button
Then leave all the textfield empty "Aastik" "Vyas" ""
Then click on the continue button
Then validate an error message

Scenario: verify checkout functionality without entering textfields
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
Then click on the add to cart button
Then click on cart button 
Then click on checkbox button
Then leave all the textfield empty "Aastik" "" ""
Then click on the continue button
Then validate an error message

Scenario: verify checkout functionality without entering textfields
When user enter correct username and paswword "standard_user" and "secret_sauce"
Then click on the login button
Then click on the add to cart button
Then click on cart button 
Then click on checkbox button
Then leave all the textfield empty "Aastik" "" "202020"
Then click on the continue button
Then validate an error message


