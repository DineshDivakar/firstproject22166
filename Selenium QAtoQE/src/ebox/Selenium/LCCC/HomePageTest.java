package ebox.Selenium.LCCC;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class HomePageTest {
	private static String url;
	private static WebDriver driver;
	
	
	@BeforeClass
	public static void Setup (){
	System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
	driver = new FirefoxDriver();
	url = "http://apps.qa2qe.cognizant.e-box.co.in/Login_Servlet_3883/";
	driver.get(url);
	driver.manage().window().maximize();
	}
	
	@Test (priority = 0)
	
	public void login() throws InterruptedException {
		LoginPage Login = new LoginPage(driver);
		Login.verifySignIn();
		Thread.sleep(6000);
		
	}
		@Test (priority = 1)
		public void loginmsg() {
	HomePage Welcomemsg = new HomePage(driver);
	Welcomemsg.getWelcomeMessage();
	System.out.println(Welcomemsg.getWelcomeMessage());
		}
	
	
	@AfterClass
	public static void Teardown() {
		driver.quit();
	}
}
