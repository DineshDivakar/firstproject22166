package com.basic.functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class iframetesting {
	@Test
	public void iframetest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_iframe.asp");
		//int i = driver.findElement(By.tagName("iframe")).size();
		driver.switchTo().frame(0);
		
				driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/a[15]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/a[1]")).click();
		driver.findElement(By.xpath("/html/body/div[5]/div/a[1]/span")).click();
}
}