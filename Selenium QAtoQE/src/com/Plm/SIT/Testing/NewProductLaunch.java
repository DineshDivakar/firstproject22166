package com.Plm.SIT.Testing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

//@Listeners(ebox.Selenium.LCCC.ListenerTest.class)
public class NewProductLaunch {
	WebDriver driver;
	private Actions actions;
	
	Consumer < By > hover = (By by) -> {
        actions.moveToElement(driver.findElement(by))
        .perform();
    };
	
	@BeforeMethod
	public void iframetest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		actions = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://oplm.ite.mypepsico.com");
	}

	//@Parameters ({"userid","password"})
	@Test
	//public void login(String userid, String password) throws InterruptedException {
	public void login() throws InterruptedException	{
		driver.findElement(By.id("j_username")).sendKeys("92702161");
		driver.findElement(By.id("j_password")).sendKeys("agile");
		driver.findElement(By.id("loginspan")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String parentwindow = driver.getWindowHandle();
	System.out.println(parentwindow);
		
		
		//for (String Child:AllWindows){
			//if(!parentwindow.equalsIgnoreCase(Child)) {
				//driver.switchTo().window(parentwindow);
				
			//}
			//driver.switchTo().window(parentwindow);
			
			
			//driver.findElement(By.id("QUICKSEARCH_STRING")).sendKeys("123");
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//js.executecript("window.stop();");
			//Thread.sleep(5000);
			driver.navigate().refresh();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			//driver.switchTo().window(parentwindow);
			//driver.findElement(By.id("QUICKSEARCH_STRING")).sendKeys("123");
			driver.switchTo().window(parentwindow);
			driver.findElement(By.id("createButton")).click();
			hover.accept(By.linkText("Items"));
			hover.accept(By.linkText("Parts"));
			driver.findElement(By.id("yui-gen17")).click();
			Set<String> AllWindows = driver.getWindowHandles();
			System.out.println(AllWindows);
			ArrayList<String> tabs = new ArrayList<>(AllWindows);
			//String partsCreateWindow = driver.getWindowHandle();
			//System.out.println(partsCreateWindow);
			int windowcount = AllWindows.size();
			System.out.println(windowcount);
			driver.switchTo().window(tabs.get(0));
			System.out.println(driver.getTitle());
			driver.manage().window().maximize();
			WebElement PartsCreateDropDownList = driver.findElement(By.name("subClassId"));
			driver.switchTo().activeElement();
			
					//FOCUS ON PARTS SCREEN
			//for (String Child:AllWindows) {
				//System.out.println(Child);
				//if (parentwindow.equalsIgnoreCase(Child)) {
					//driver.switchTo().window("6442450948");
					//System.out.println(driver.getCurrentUrl());
					//Thread.sleep(5000);
				//}
				
			//}
			
			
			
			//Create Trade GTIN
			//WebElement PartsCreateDropDownList = driver.findElement(By.name("subClassId"));
			//Select SelectPartsDropDownValue = new Select(PartsCreateDropDownList);
			//SelectPartsDropDownValue.selectByVisibleText("Trade GTIN");
			
			//Select
			//actions.moveToElement(driver.findElement(By.id("yui-gen17"))).click();
			//hover.accept(By.linkText("Parts"));
	        //actions.click();
	        
			
		}
		
		//List <WebElement> AllElements = driver.findElements(By.tagName("Input"));
		//System.out.println(AllElements);
		
		//WebElement CreateNewDropdown = driver.findElement(By.id("createButton"));
		//Select NewDropdown = new Select(CreateNewDropdown);
		//NewDropdown.selectByIndex(0);
		
		
	
	
	//public void CreateNewProduct() {
		//FGproduct Creation
		//FGCase creation
		//Add TGTIN to FGProduct
			//Add CaseGTIN to FGCase
		//Create CO and add Products in it
		//Complete CO
	//}
	
	@AfterMethod
	public void driverclose() {
		driver.close();
	}
}
