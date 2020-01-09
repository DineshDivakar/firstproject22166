package ebox.Selenium.LCCC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class WebTest1 {
	private WebDriver driver;
	private String url;
	//public static void main (String[] args) throws IOException {
	//System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		//}
	
	@Before
	public void setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/WelcomeMessage/";
	
	}
	
	@Test
	public void test() {
		driver.get(url);	
		WebElement h1element = driver.findElement(By.tagName("h1"));
		String helloWorldTxt = h1element.getText();
		//System.out.println(h1element);
				
	Assert.assertEquals("WELCOME TO DATAX SHIPPING COMPANY", helloWorldTxt);
	//System.out.println("Success");
	}
	
	@After
	public void complete() {
		driver.quit();
	}
	

}
