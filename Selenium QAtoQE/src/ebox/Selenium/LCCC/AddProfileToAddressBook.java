package ebox.Selenium.LCCC;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ebox.Selenium.LCCC.ListenerTest.class)

public class AddProfileToAddressBook {

	private static WebDriver driver;
	private String url;
	AddressBook AddAddress = new AddressBook(driver);
	
	@BeforeClass
	public void Setup() {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		url = "http://apps.qa2qe.cognizant.e-box.co.in/AddressBook/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test (priority = 0)
	public void addAddressBook() throws InterruptedException {
		
		AddressBook AddAddress = new AddressBook(driver);
		AddAddress.NickName();
		AddAddress.ContactName();
		AddAddress.Company();
		AddAddress.City();
		AddAddress.Country();
		AddAddress.Type();
		AddAddress.ClickAddButton();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Reporter.log("Address Successfully Added");
	}

	@Test (priority = 1)
public void updateAddressBook() throws InterruptedException {
		
		AddressBook AddAddress = new AddressBook(driver);
		AddAddress.ClickRadiobutton();	
		AddAddress.ClickEditButton();
		driver.findElement(By.id("nickname")).sendKeys(Keys.CONTROL +"a");
		driver.findElement(By.id("nickname")).sendKeys(Keys.DELETE);
		driver.findElement(By.id("nickname")).clear();
		driver.findElement(By.id("nickname")).sendKeys("Din1");
		AddAddress.ClickAddButton();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Reporter.log("Address Successfully Updated");
	}
	@Test (priority = 2)
public void deleteAddressBook() {
	AddressBook AddAddress = new AddressBook(driver);
		AddAddress.ClickRadiobutton();
		AddAddress.ClickDeleteButton();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Reporter.log("Address Successfully Deleted");
	}
	@AfterClass
	public static void driverClose() {
		driver.quit();
	}
}
