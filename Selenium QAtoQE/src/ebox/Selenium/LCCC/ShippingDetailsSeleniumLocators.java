package ebox.Selenium.LCCC;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.Assert;

//ShippingDetailsSeleniumLocators
public class ShippingDetailsSeleniumLocators {
	private String url;
	private WebDriver driver;
	
@Before
	public void Setup (){
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/shippingDetails/";
	driver.get(url);
	driver.manage().window().maximize();
	}

@Test
public void shipcalculation() {
	String h2tag = driver.findElement(By.tagName("h2")).getText();
	WebElement ShipmentID = driver.findElement(By.linkText("6543217"));
	String link1 = ShipmentID.getText();
			//driver.findElement(By.xpath("//*[@id=\"shippingTable\"]/table/tbody/tr[2]/td[1]/a")).getText();
	

	//If(driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[1]/td[1]/b")).isDisplayed()
			//{
	Assert.assertEquals("Shipping Details", h2tag);
	Assert.assertEquals("6543217",link1);
	driver.findElement(By.linkText("6543217")).click();
	//ShipmentID.click();
	String tablecontent1 = driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[2]/td[1]")).getText();
	String shipmentDate = driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[9]/td[1]")).getText();
	String accountno = driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[10]/td[2]")).getText();
	
	Assert.assertEquals("Maya",tablecontent1);
	Assert.assertEquals("Shipping Date : 03/12/2017",shipmentDate);
	Assert.assertEquals("Account No : 93746537",accountno);
	
//}
	//else {
		//System.out.println("failed");
	//}
}
@After
public void complete() {
	driver.quit();
}
}
