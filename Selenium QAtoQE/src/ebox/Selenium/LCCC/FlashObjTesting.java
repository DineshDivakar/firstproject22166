package ebox.Selenium.LCCC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlashObjTesting {
	private WebDriver driver;
	private String url;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		url = "http://apps.qa2qe.cognizant.e-box.co.in/Flash_Application/";
		
	}
	
	@Test
	public void testUntitled() {
		driver.get(url);
		driver.manage().window().maximize();
		WebElement objelement = driver.findElement(By.tagName("Object"));
	//System.out.println("True");
		
				
	}
	@After
	public void complete() {
		driver.quit();
}
}