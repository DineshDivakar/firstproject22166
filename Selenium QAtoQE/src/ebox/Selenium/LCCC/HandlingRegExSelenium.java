package ebox.Selenium.LCCC;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//HandlingRegExSelenium
public class HandlingRegExSelenium {
	private WebDriver driver;
	private String url;
	
	
	@Before
	public void Setup (){
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/Handling_Regular_Expression/";
	driver.get(url);
	driver.manage().window().maximize();
	}

	//@Test
		//public boolean resultEmail1(String email) {
		//String RegEx = "\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b";
		//return email.matches(RegEx);
	//}
	@Test
    public void HandlingRegEx() {
		WebElement userid = driver.findElement(By.id("userId"));
		WebElement Search = driver.findElement(By.id("track"));
		userid.sendKeys("Shamili");
		Search.click();
		WebElement Name = driver.findElement(By.xpath("//*[@id=\"result\"]/table/tbody/tr[1]/td[2]"));
		String email = driver.findElement(By.id("e- mail")).getText();
		//System.out.println(email);
		String shipment = driver.findElement(By.id("shipment")).getText();
		System.out.println(email.matches("\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b"));
		System.out.println(shipment.matches("[A-Z0-9]{8}"));
	//System.out.println("Pass"+resultEmail1(email));	
		//Boolean resultEmail1 = email.matches("\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b");
		//Boolean resultShipId1 = shipment.matches("[A-Z0-9]{8}"); 
		
	}
    @After
	public void complete() {
		driver.quit();
	}	
}
