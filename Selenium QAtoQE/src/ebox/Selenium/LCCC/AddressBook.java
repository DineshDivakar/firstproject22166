package ebox.Selenium.LCCC;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class AddressBook {
private WebDriver driver;


public AddressBook(WebDriver driver) {
	this.driver = driver;
	
}

public void NickName() //Enter Nick Name
{                               
	driver.findElement(By.id("nickname")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("nickname")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("nickname")).clear();
	driver.findElement(By.id("nickname")).sendKeys("Din");
}

public void ContactName() //Enter Contact Name
{         
	driver.findElement(By.id("contact")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("contact")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("contact")).clear();
	driver.findElement(By.id("contact")).sendKeys("Dinesh");
}

public void Company() //Enter Company
{         
	driver.findElement(By.id("company")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("company")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("company")).clear();
	driver.findElement(By.id("company")).sendKeys("XYZ");
}

public void City() //Enter City
{         
	driver.findElement(By.id("city")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("city")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("city")).clear();
	driver.findElement(By.id("city")).sendKeys("Chennai");
}

public void Country() //Enter Country
{         
	driver.findElement(By.id("country")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("country")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("country")).clear();
	driver.findElement(By.id("country")).sendKeys("India");
}

public void Type() //Enter Type
{         
	driver.findElement(By.id("type")).sendKeys(Keys.CONTROL +"a");
	driver.findElement(By.id("type")).sendKeys(Keys.DELETE);
	driver.findElement(By.id("type")).clear();
	driver.findElement(By.id("type")).sendKeys("Sender");
}

public void ClickAddButton() //Click Add button
{         
	driver.findElement(By.id("add")).click();
}

public void ClickRadiobutton() //Click on First radio button
{         
	driver.findElement(By.id("Radio0")).click();
}

public void ClickEditButton() //Click on Edit button
{         
	driver.findElement(By.id("edit")).click();
}

public void ClickDeleteButton() //Click on Delete button
{         
	driver.findElement(By.id("delete")).click();
}
}
