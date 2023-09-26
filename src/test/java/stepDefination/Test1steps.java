package stepDefination;

import io.cucumber.java.en.Then;
import pages.Test1page;

public class Test1steps {
	Test1page page = new Test1page();

	@Then("leave all the textfield empty {string} {string} {string}")
	public void leave_all_the_textfield_empty(String fname, String lname, String zipcode) {
		page.leave_all_the_textfield_empty(fname, lname, zipcode);
	   
	}
	
	@Then("click on the continue button")
	public void click_on_the_continue_button() {
		page.click_on_the_continue_button();
		
		}
	
	@Then("validate an error message")
	public void validate_an_error_message() {
		page.validate_an_error_message();
		
	  
	}

	
	

	
	
	
}
