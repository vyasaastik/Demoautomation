package stepDefination;

import io.cucumber.java.en.Then;
import pages.Basketpageclass;

public class Basketpagesteps {
	
	Basketpageclass page = new Basketpageclass();

	@Then("click on the add to cart button")
	public void click_on_the_add_to_cart_button() {
		page.addtocartbutton();
	   
	}
	@Then("validate cart count is {string}")
	public void validate_cart_count_is(String count) {
		page.validatecartcount(count);
	    
	}




}
