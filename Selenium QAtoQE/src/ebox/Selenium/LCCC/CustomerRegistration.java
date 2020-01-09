package ebox.Selenium.LCCC;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

import com.basic.functions.CustomerRegistrationScreenObjects;
import com.basic.functions.ReadWriteFromExcel;


public class CustomerRegistration {
	
	private static WebDriver driver;
	private String url;
	//public String Name = "a";
	//public String MobileNumber = "b";
	//public String DOB = "1111";
	Workbook Wb;
	Sheet Sh;
	int Rows;
	int Cols;
	ReadWriteExcel readinput = new ReadWriteExcel();
	
	@BeforeClass
	public void Setup() throws InterruptedException, InvalidFormatException, IOException {
		System.setProperty("webdriver.gecko.driver", "C:\\Dinesh Divakar\\Selenium\\Firefox Driver\\geckodriver-v0.25.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		Sh = readinput.readExcel("C:\\Dinesh Divakar\\Selenium\\CustomerDetails.xlsx", "CustomerDetails.xlsx", "Test");
		//Rows = readinput.getrows("C:\\Dinesh Divakar\\Selenium\\CustomerDetails.xls", Sh);
		//Cols = readinput.getCols("C:\\Dinesh Divakar\\Selenium\\CustomerDetails.xls", Sh);
		url = "http://apps.qa2qe.cognizant.e-box.co.in/CustomerRegistration_4284";
		
		
}
	@DataProvider(name = "testdata")
	public String[][] getdata() throws InvalidFormatException, IOException {
		int TotalCol = Sh.getRow(0).getLastCellNum();
		int Totalrows = Sh.getLastRowNum();
		String[][] data = new String[Totalrows][TotalCol];
		for (int i = 0; i <= Totalrows; i++) {
			Row r = Sh.getRow(i);
			for (int j = 0; j <= TotalCol; j++) {
				Cell c = r.getCell(j);
				try {
					if (c.getCellType() == CellType.STRING) {
						data[i][j] = c.getStringCellValue();
						
					} 
					else if (c.getCellType() == CellType.BLANK) {
						data[i][j] = "";
						
					}
					else if (DateUtil.isCellDateFormatted(c)) {
	                    SimpleDateFormat dateFormat = new SimpleDateFormat(
	                            "MM/dd/yy");
	                    data[i][j]  = dateFormat.format(c.getDateCellValue());	               
	                }
					else if (c.getCellType() == CellType.NUMERIC) {
					Long MobileNumber = (long) c.getNumericCellValue();
				  data[i][j] = String.valueOf(MobileNumber);
					//if (DateUtil.isCellDateFormatted(c)) {
						//data[i][j] = c.getDateCellValue();
					}
					
								
				}
					catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}
	@Test (dataProvider = "testdata")
	public void RegisterCustomer(String s1, String Name, String Number, String BirthDate, String Gender, String Address, String Error ) throws InterruptedException {
		CustomerRegistrationScreenObjects Input = new CustomerRegistrationScreenObjects(driver);
		//ReadWriteFromExcel Output = new ReadWriteFromExcel();
		//int TotalRows = Sh.getLastRowNum();
		
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Input.EnterName(Name);
			Thread.sleep(2000);
			Input.EnterMobNumber(Number);
			Thread.sleep(5000);
			Input.EnterDOB(BirthDate);
			Thread.sleep(2000);
					if (Gender.equals("Male")) {
				Input.SelMaleradio();}
					else {
						Input.SelFemaleradio();
					}
				Thread.sleep(2000);
			//}
			//}
				Input.EnterAddress(Address);
				Thread.sleep(2000);
				
			//else {
				//
			//}
						
			Input.RegisterClick();
			String MessageDisplayed = Input.RecordMsg();
			if (MessageDisplayed.equals(Error)) {
				System.out.println("Pass");
			}
			else {
				System.out.println("Fail");
			}
					//for (int x=0;x<=TotalRows;x++){
						//if (MessageDisplayed.equals(Error)) {
							//System.out.println("Pass");
							//Sh.getRow(x).createCell(7).setCellValue("PASS");
							//}
							//else {
							//System.out.println("Fail");
							//Sh.getRow(x).createCell(7).setCellValue("FAIL");
							//Thread.sleep(2000);
							//}
						
					//try {
						//Output.WriteExcel(Sh, "C:\\Dinesh Divakar\\Selenium\\CustomerDetails.xls");
					//} catch (InvalidFormatException e) {
						//// TODO Auto-generated catch block
						//e.printStackTrace();
					//} catch (IOException e) {
						//// TODO Auto-generated catch block
						//e.printStackTrace();
					//}
					
						
			
						
		}
				
	
	@AfterClass
	public static void driverClose() {
		driver.quit();
	}
}