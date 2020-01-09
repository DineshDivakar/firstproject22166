package ebox.Selenium.LCCC;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
//import org.junit.*;
//import org.junit.AfterClass;
//import org.junit.BeforeClass;
//import org.junit.Test;

public class MyProfileTest {
	
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

//Enter userId and password to login
@Test (priority=0)
	
	public void login() throws InterruptedException {
		LoginPage Login = new LoginPage(driver);
		Login.verifySignIn();
		Thread.sleep(6000);
		
	}

//Validate if login was successful
@Test (priority=1)
	public void loginmsg() throws InterruptedException {
	HomePage Welcomemsg = new HomePage(driver);
	Welcomemsg.getWelcomeMessage();
	System.out.println(Welcomemsg.getWelcomeMessage());
	Thread.sleep(5000);
			}

// Collect the user profile details
@Test (priority=2)
public void Profilepage() {
MyProfilePage Profile = new MyProfilePage(driver);
Profile.Profilelink();
Profile.getName();
System.out.println(Profile.getName());
Profile.getUsername();
System.out.println(Profile.getUsername());
Profile.getEmail();
System.out.println(Profile.getEmail());
Profile.getAddress();
System.out.println(Profile.getAddress());
Profile.getCity();
System.out.println(Profile.getCity());
Profile.getState();
System.out.println(Profile.getState());

}


@AfterClass
public static void Teardown() {
	driver.quit();
}
}
