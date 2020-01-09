package ebox.Selenium.LCCC;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyProfilePage{
	
	private WebDriver driver;
	
	//setting up WebDriver
	public MyProfilePage(WebDriver driver){
	this.driver = driver;	
	}

	//Click on the ProfileLink
	public void Profilelink() {
		driver.findElement(By.id("profile")).click();
	}
	//Getting the Name from the user profile screen
	public String getName() {
String Name =  driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[2]")).getText();
return Name;
	}
	
	//getting the User Name from the user profile screen
	public String getUsername() {
		String UserName = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText();
		return UserName;
	}

	//Getting the email Id of the user from the user profile screen
	public String getEmail() {
		String EmailID = driver.findElement(By.xpath("/html/body/table/tbody/tr[3]/td[2]")).getText();
		return EmailID;
		}

	//Getting User Role from the user profile screen
	public String getRole() {
		String Role = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		return Role;
		}
	
	//Getting user address from the user profile screen
	public String getAddress() {
		String Address = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
		return Address;
	}
	
	//Getting City from the user profile screen
	public String getCity() {
		String City = driver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]")).getText();
		return City;
	}
	
	//Getting City from the user profile screen
	public String getState() {
		String State = driver.findElement(By.xpath("/html/body/table/tbody/tr[7]/td[2]")).getText();
		return State;
	}
}


