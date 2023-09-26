package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;

public class Loginpagesteps {
	
	Loginpage page = new Loginpage();
	
	
	@When("user enter correct username and paswword {string} and {string}")
	public void user_enter_correct_username_and_paswword_and(String username, String password) {
    page.user_enter_correct_username_and_paswword_and(username, password);
	
	}
	@Then("click on the login button")
	public void click_on_the_login_button() {
		page.click_on_the_login_button();
	    
	}
	@Then("validate successfull login")
	public void validate_successfull_login() {
	    
	}
	
	@Then("validate error message")
	public void validate_error_message() {
		page.validateerrormessage();
	   
	}


		
		
	



	
	

	
	
	

}
