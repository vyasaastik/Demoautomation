package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Test1page extends Base{
	
	public void leave_all_the_textfield_empty(String fname, String lname, String zipcode) {
		
		WebElement name  = 	driver.findElement(By.xpath("//input[@id='first-name']"));
		name.sendKeys(fname);
		
		WebElement last  = 	driver.findElement(By.xpath("//input[@id='last-name']"));
		last.sendKeys(lname);
		
		WebElement zip  = 	driver.findElement(By.xpath("//input[@id='postal-code']"));
		zip.sendKeys(zipcode);
			  
		   }
	
public void click_on_the_continue_button() {
	WebElement conti  = driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
		clickonelement(conti);
		
		}

public void validate_an_error_message() {
	WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
	Assert.assertTrue(error.isDisplayed());
	
	  
}

	




}
