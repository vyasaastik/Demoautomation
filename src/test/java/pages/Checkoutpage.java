package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Checkoutpage extends Base {

	public void clickonaddcartbutton() {
		WebElement addcartbutton = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
				
		clickonelement(addcartbutton);

	}

	public void clickoncheckoutbtn() {
		WebElement checkout = driver.findElement(By.xpath("//a[@class='btn_action checkout_button']"));
		clickonelement(checkout);

	}
	
	public void user_enter(String fname, String lname, String zipcode) {
	WebElement name  = 	driver.findElement(By.xpath("//input[@id='first-name']"));
	name.sendKeys(fname);
	
	WebElement last  = 	driver.findElement(By.xpath("//input[@id='last-name']"));
	last.sendKeys(lname);
	
	WebElement zip  = 	driver.findElement(By.xpath("//input[@id='postal-code']"));
	zip.sendKeys(zipcode);
		  
	}
	
	public void clickoncontinuebtn() {
	WebElement continuebtn =	driver.findElement(By.xpath("//input[@class='btn_primary cart_button']"));
		clickonelement(continuebtn);
		
	}
	
	public void navigate_next_page() {
	String url =	driver.getCurrentUrl();
	Assert.assertTrue(url.contains("step-two"));
	
		
		  
	}

}
	
	


