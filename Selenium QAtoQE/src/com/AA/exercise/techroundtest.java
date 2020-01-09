package com.AA.exercise;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class techroundtest {
	
	private WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Dinesh Divakar\\Selenium\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.aa.com/homePage.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
	}

	@Test
	public void login(){
		
		String title = driver.findElement(By.id("plan-travel-expander")).getText();
		
		if(title.equals("Plan Travel")){
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false")	;
		}
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
