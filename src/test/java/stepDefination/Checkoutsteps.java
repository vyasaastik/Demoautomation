package stepDefination;

import io.cucumber.java.en.Then;
import pages.Checkoutpage;

public class Checkoutsteps {
	
	Checkoutpage page = new Checkoutpage();

	@Then("click on cart button")
	public void click_on_cart_button() {
		page.clickonaddcartbutton();
	   
	}

	@Then("click on checkbox button")
	public void click_on_checkbox_button() {
	   page.clickoncheckoutbtn();
	}
	
	@Then("user enter {string} {string} {string}")
	public void user_enter(String fname, String lname, String zipcode) {
	  page.user_enter(fname, lname, zipcode);
	}

	@Then("click on continue button")
	public void click_on_continue_button() {
	   page.clickoncontinuebtn();
	}
	
	@Then("navigate next page")
	public void navigate_next_page() {
	  page.navigate_next_page();
	}

	
}



