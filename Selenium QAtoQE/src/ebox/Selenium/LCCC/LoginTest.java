package ebox.Selenium.LCCC;


import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class LoginTest {
	private String url;
	private WebDriver driver;
	
	@BeforeClass
	public void Setup (){
	System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/";
	driver.get(url);
	driver.manage().window().maximize();
	}
		
	@Test
	public void login() {
		LoginPage Login = new LoginPage(driver);
		Login.verifySignIn();
	}
	
	@AfterClass
	public void complete() {
		driver.quit();
	}
}
