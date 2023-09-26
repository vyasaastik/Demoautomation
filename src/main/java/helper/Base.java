package helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Base {

	public static Properties prop;
	public static WebDriver driver;
	static {

		FileInputStream file;
		try {
			file = new FileInputStream(System.getProperty("user.dir") + "/src/test/java/resource/env.properties");
			 prop = new Properties();
			prop.load(file);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void setup() {

		String browsername = prop.getProperty("browser");

		switch (browsername) {

		case "chrome":
			driver = new ChromeDriver();
			break;

		case "ff":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void selectbydropdownmethod(WebElement ele, String type, String value) {
		Select s = new Select(ele);
		switch (type) {

		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;

		case "value":
			s.selectByValue(value);
			break;

		case "visibletext":
			s.selectByVisibleText(value);

			break;
		}
	}

	public void bootstrapdropdown(List<WebElement> list, String value) {

		for (WebElement H : list) {

			String actutalvalue = H.getText();

			if (actutalvalue.equals(value)) {
				H.click();

			}
		}

	}

	public void mousehover(WebElement ele) {
		waitforexpectedelement(ele, 0);

		Actions a = new Actions(driver);
		a.moveToElement(ele).build().perform();

	}

	public void handlealert(String action) {
		Alert a = driver.switchTo().alert();

		switch (action) {

		case "accept":
			a.accept();
			break;

		case "dismiss":
			a.dismiss();
			break;

		}
	}

	public void waitforexpectedelement(WebElement ele, long wait) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(wait));
		w.until(ExpectedConditions.visibilityOf(ele));

	}

	public void waitforexpectedelementtobeclickable(WebElement ele, long wait) {
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(wait));
		w.until(ExpectedConditions.elementToBeClickable(ele));

	}

	public void clickonelement(WebElement ele) {
		waitforexpectedelementtobeclickable(ele, 10);
		try {
			ele.click();
		} catch (Exception e) {

			waitforexpectedelementtobeclickable(ele, 10);
			executorclickonelement(ele);
		}
	}

	public void executorclickonelement(WebElement ele) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", driver);
		js.executeScript("arguments[0].click();", ele);
	}

	public void switchframe(String value, String type) {
		switch (type) {
		case "name":
			driver.switchTo().frame(0);
			break;

		case "index":
			driver.switchTo().frame(Integer.parseInt(value));
			break;

		}

	}

	public void switchwindows(String title) {
		Set<String> allwindows = driver.getWindowHandles();

		for (String windowId : allwindows) {
			driver.switchTo().window(windowId);

			if (driver.getTitle().contains(title)) {
				break;

			}
		}

	}

	public void clickoncheckboxes(WebElement ele) {
		if (!ele.isSelected()) {
			clickonelement(ele);

		}
	}

	@After
	public void teardown(Scenario s) {
		if (s.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Capturedscr = ts.getScreenshotAs(OutputType.FILE);
			try {
				FileHandler.copy(Capturedscr, new File("Screenshots/" + s.getName() + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		driver.quit();

	}

}
