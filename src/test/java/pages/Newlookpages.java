package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class Newlookpages extends Base {

	public void user_enter(String Email, String Password, String Title, String Fname, String Lname, String Clickbox) {

		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys(Email);

		WebElement pass = driver.findElement(By.xpath("//input[@id='pwd']"));
		pass.sendKeys(Password);

		WebElement t = driver.findElement(By.xpath("//select[@id='titleCode']"));
		clickonelement(t);

		selectbydropdownmethod(t, "visibletext", "Mr.");

		WebElement fname = driver.findElement(By.xpath("//input[@id='firstName']"));
		fname.sendKeys(Fname);

		WebElement lname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lname.sendKeys(Lname);

		WebElement box = driver.findElement(By.xpath("//label[@class='label checkbox__label']"));
		clickoncheckboxes(box);

	}
	
	
	
	

}
