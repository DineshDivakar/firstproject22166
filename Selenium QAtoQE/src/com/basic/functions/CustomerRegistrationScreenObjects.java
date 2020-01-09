package com.basic.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomerRegistrationScreenObjects {
	
	private WebDriver driver;
	
	//Declare Driver
	public CustomerRegistrationScreenObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	//Enter the Name
	public void EnterName(String Name) {
	driver.findElement(By.id("name")).sendKeys(Name);
	}
	
	//Enter Mobile Number
	public void EnterMobNumber(String MobNumber) {
		driver.findElement(By.id("mobile")).sendKeys(MobNumber);
		}
	
	//Enter Date of Birth
	public void EnterDOB(String DOB) {
		driver.findElement(By.id("dob")).sendKeys(DOB);
		}
	
	//Click Male Radio Button
	public void SelMaleradio() {
		driver.findElement(By.id("male")).click();
	}
	
	//Click Female Radio Button
	public void SelFemaleradio() {
		driver.findElement(By.id("female")).click();
	}
	
	//Enter Address
	public void EnterAddress(String Address) {
		driver.findElement(By.id("address")).sendKeys(Address);
		}
	
	//Click Register Button
	public void RegisterClick() {
		driver.findElement(By.id("register")).click();
	}
	
	//Record message on screen
		public String RecordMsg() {
			String CustErrMsg = driver.findElement(By.id("errorMessage")).getText();
			return CustErrMsg;
		}

}
