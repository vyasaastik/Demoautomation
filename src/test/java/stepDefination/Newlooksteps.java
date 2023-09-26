package stepDefination;

import io.cucumber.java.en.When;
import pages.Newlookpages;

public class Newlooksteps {
	
	 Newlookpages look= new  Newlookpages();
	
	@When("user enter {string} {string} {string} {string} {string} {string}")
	public void user_enter(String Email, String Password, String Title, String Fname, String Lname, String Clickbox) {
		look.user_enter(Email, Password, Title, Fname, Lname, Clickbox);
	   
	}













}
