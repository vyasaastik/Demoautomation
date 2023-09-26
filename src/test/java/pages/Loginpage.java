package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Loginpage extends Base {

	public void user_enter_correct_username_and_paswword_and(String username, String password) {

		WebElement user = driver.findElement(By.xpath("//input[@id='user-name']"));
		user.sendKeys(username);

		WebElement pass = driver.findElement(By.xpath("//input[@id='password']"));
		pass.sendKeys(password);

}
	
public void click_on_the_login_button() {
	
	WebElement clickbtn = driver.findElement(By.xpath("//input[@id='login-button']"));
	clickonelement(clickbtn);
	    
}

public void validateerrormessage () {
	WebElement errormsg = driver.findElement(By.xpath("//h3[@data-test='error']"));
   Assert.assertTrue(errormsg.isDisplayed());
   
	
	
}



}
