package ebox.Selenium.LCCC;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Cargo Shipping Calculation
public class CargoShippingCalculation {
	
	private String url;
	private WebDriver driver;
	
@Before
public void Setup (){
	System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
driver = new FirefoxDriver();
url = "http://apps.qa2qe.cognizant.e-box.co.in/CostCalculation/";
driver.get(url);
driver.manage().window().maximize();
}

@Test
public void cargocalculation(){
	WebElement Weight = driver.findElement(By.id("weight"));
	WebElement AirRadio = driver.findElement(By.id("air"));
	WebElement RoadRadio = driver.findElement(By.id("road"));
	WebElement ShipRadio = driver.findElement(By.id("ship"));
	WebElement Calculate = driver.findElement(By.id("calculate"));
	WebElement Result = driver.findElement(By.id("result"));
	
	Weight.sendKeys("100");
	AirRadio.click();
	Calculate.click();
	String Result1 = Result.getText();
	Assert.assertEquals("Dear Customer, your total shipping cost is $100",Result1);
	//System.out.println("Scenario 1 Success");
	
	
	Weight.clear();
	Weight.sendKeys("100");
	ShipRadio.click();
	Calculate.click();
	String Result2 = Result.getText();
	//System.out.println(Result2);
	Assert.assertEquals("Dear Customer, your total shipping cost is $70",Result2);
	//System.out.println("Scenario 2 Success");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	Weight.clear();
	Weight.sendKeys("100");
	RoadRadio.click();
	Calculate.click();
	String Result3 = Result.getText();
	Assert.assertEquals("Dear Customer, your total shipping cost is $50",Result3);
	//System.out.println("Scenario 3 Success");
	//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}

@After
public void Complete() {
	driver.quit();
}
}