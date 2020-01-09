package ebox.Selenium.LCCC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	
//Driver and WebElement declaration
private WebDriver driver;


	//Declaring Driver
	public LoginPage(WebDriver driver){
		this.driver = driver;
		
	}
//Declaring method for entering username in login page
	public void setUserName(String strUserName) {
		WebElement username = driver.findElement(By.name("username"));
		username.clear();
		username.sendKeys(strUserName);
		
	}
//Declaring method for entering password in login page
	public void setPassword(String strPassword) {
		
		WebElement passwrd = driver.findElement(By.name("password"));
		passwrd.sendKeys(strPassword);;
	}
	
//Clicking on the [Login] button
	public void clickLogin() {
	WebElement loginbutton = driver.findElement(By.name("login"));
	loginbutton.click();
	}
	
	//entering credentials and returning true if login is successful
	public boolean verifySignIn() {
		setUserName("Admin");
		setPassword("admin123");
		clickLogin();
		return true;
		
	}
}
