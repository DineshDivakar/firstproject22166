package ebox.Selenium.LCCC;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;

//tag validation
public class WebTest2 {
	private WebDriver driver;
	private String url;
	
	@Before
	public void setup () {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/HTMLTAGS/";
	driver.get(url);
	
}
	@Test
	public void test2() {
		String loginId = driver.findElement(By.id("login")).getText();
		String signupId = driver.findElement(By.id("signup")).getText();
		String h1element = driver.findElement(By.tagName("h1")).getText();
		String h2element = driver.findElement(By.tagName("h2")).getText();
		String h3element = driver.findElement(By.tagName("h3")).getText();
		String pelement = driver.findElement(By.tagName("p")).getText();
	Assert.assertEquals("Log in",loginId);
	System.out.println("Success");
	
	Assert.assertEquals("Sign up",signupId);
	System.out.println("Success");
	
	Assert.assertEquals("DATAX Shipping Company",h1element);
	System.out.println("Success");
	
	Assert.assertEquals("Welcome to DATAX Shipping Company",h2element);
	System.out.println("Success");
	
	Assert.assertEquals("About us :",h3element);
	System.out.println("Success");
	
	Assert.assertEquals("DATAX Shipping Company is a global shipping company based in the Middle East. Founded in 2006, Company has more than 185 offices around the world. The company is the largest container shipping line in the Middle East region and adjacent markets, covering over 275 ports and destinations worldwide. UASC offers containerized cargo transportation, temperature controlled (reefer) and out of gauge cargo amongst other value added services to a diversified global client-base.",pelement);
	System.out.println("Success");
}
	
	@After
	public void complete() {
		driver.quit();
	}
	}