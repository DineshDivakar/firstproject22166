package ebox.Selenium.LCCC;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//CompanyOffersDiscount1
public class WebTest3 {
private String baseurl;
private WebDriver driver;
private WebElement EnterWeight;
private WebElement EnterDistance;
private WebElement Submit;
private WebElement Result;

@Before
	public void Setup () {
	System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	baseurl = "http://apps.qa2qe.cognizant.e-box.co.in/CompanyOffersDiscount/";
	driver.get(baseurl);
	EnterWeight = driver.findElement(By.id("weight"));
	EnterDistance = driver.findElement(By.id("distance"));
	Submit = driver.findElement(By.id("submit"));
	Result = driver.findElement(By.id("result"));

	
		}
@Test
public void Scenario1 () {
	
	EnterWeight.sendKeys("100");
	EnterDistance.sendKeys("200");
	Submit.click();
	String result1= Result.getText();
	System.out.println(result1);
	String ExpectedS1 = "Datax shipping company offers discount";
	assertEquals(ExpectedS1, result1);
	System.out.println("Success");

	}
@Test
public void Scenario2 () {
	
	EnterWeight.sendKeys("80");
	EnterDistance.sendKeys("500");
	Submit.click();
	String result2= Result.getText();
	System.out.println(result2);
	String ExpectedS2 = "Datax shipping company offers discount";
	assertEquals(ExpectedS2, result2);
	System.out.println("Success");
}
@Test
public void Scenario3 () {
	
	EnterWeight.sendKeys("60");
	EnterDistance.sendKeys("110");
	Submit.click();
	String result3= Result.getText();
	System.out.println(result3);
	String ExpectedS3 = "Datax shipping offers no discount";
	assertEquals(ExpectedS3, result3);
	System.out.println("Success");
}
@Test
public void Scenario4 () {
	
	EnterWeight.sendKeys("120");
	EnterDistance.sendKeys("520");
	Submit.click();
	String result4= Result.getText();
	System.out.println(result4);
	String ExpectedS4 = "Datax shipping company offers discount";
	assertEquals(ExpectedS4, result4);
	System.out.println("Success");
}
@Test
public void Scenario5 () {
	
	EnterWeight.sendKeys("300");
	EnterDistance.sendKeys("200");
	Submit.click();
	String result5= Result.getText();
	System.out.println(result5);
	String ExpectedS5 = "Datax shipping company offers discount";
	assertEquals(ExpectedS5, result5);
	System.out.println("Success");
}
@Test
public void Scenario6 () {
	
	EnterWeight.sendKeys("50");
	EnterDistance.sendKeys("150");
	Submit.click();
	String result6= Result.getText();
	System.out.println(result6);
	String ExpectedS6 = "Datax shipping offers no discount";
	assertEquals(ExpectedS6, result6);
	System.out.println("Success");
}
@After
public void complete() {
	driver.quit();
}
}


