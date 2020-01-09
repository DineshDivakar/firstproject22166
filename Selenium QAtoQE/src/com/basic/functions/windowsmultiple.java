package com.basic.functions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class windowsmultiple {
	@Test
	public void window() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		String parent = driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		ArrayList<String> tabs = new ArrayList<>(allwindows);
		int windowcount = allwindows.size();
		System.out.println(windowcount);
		driver.switchTo().window(tabs.get(3));
		System.out.println(driver.getTitle());
		driver.close();
		
		driver.switchTo().window(tabs.get(2));
		System.out.println(driver.getTitle());
		String tab2 = driver.getTitle();
		System.out.println("This tab contains"+tab2.contains("info"));
		driver.close();
		driver.switchTo().window(tabs.get(1));
		System.out.println(driver.getTitle());
		String tab1 = driver.getTitle();
		System.out.println("This tab contains"+tab1.contains("Info"));
		driver.close();
		//driver.switchTo().window(tabs.get(0));
		driver.switchTo().window(parent);
		driver.findElement(By.id("qsbClick")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.name("qp")).sendKeys("Selenium");
		driver.findElement(By.name("ql")).sendKeys("Plano");
		driver.findElement(By.id("exp_dd")).sendKeys("10");
		driver.findElement(By.id("salary_ddHid")).sendKeys("20");
		driver.findElement(By.id("qsbFormBtn")).click();
		//Select Experience = new Select(driver.findElement(By.id("salary_dd")));
		//Experience.selectByValue("20");
		Thread.sleep(5000);
		driver.close();
		
		//for(String Child:allwindows) {
			//if(!parent.equalsIgnoreCase(Child)){
				//	driver.switchTo().window(Child);
					//System.out.println(driver.getTitle());
					//driver.close();
			//				}
			//else {
				//driver.switchTo().window(parent);
				//System.out.println(driver.getTitle());
				//driver.close();
			//}
			
			
			
	//}
	}
}
