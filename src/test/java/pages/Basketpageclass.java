package pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;


public class Basketpageclass extends Base {

	public void addtocartbutton() {

		WebElement addcartbutton = driver.findElement(By.xpath("//button[@class='btn_primary btn_inventory']"));
		clickonelement(addcartbutton);

	}

	public void validatecartcount(String count) {
		WebElement cartcount = driver.findElement(By.xpath("//span[@class='fa-layers-counter shopping_cart_badge']"));
		String cartvalue = cartcount.getText();
		Assert.assertEquals(count, cartvalue);

	}

}
