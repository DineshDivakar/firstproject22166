package ebox.Selenium.LCCC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage {

	//Driver and WebElement declaration
	private WebDriver driver;


		//Declaring Driver
		public HomePage(WebDriver driver){
			this.driver = driver;
		}
		//getting login success message
		public String getWelcomeMessage() {
			String LoginMsg = driver.findElement(By.xpath("/html/body/h2")).getText();
			return LoginMsg;
			
			 
		}
}
