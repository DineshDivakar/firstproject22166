package ebox.Selenium.LCCC;

import org.testng.annotations.Test;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Shipment {
	ReadExcel readex = new ReadExcel();
	Sheet sh;

	@BeforeTest
	public void changeport() throws InvalidFormatException, IOException {
		sh = readex.readExcel("C:\\\\Dinesh Divakar\\\\Selenium\\\\Test Data\\\\Datax Shipping Company.xlsx","Datax Shipping Company.xlsx","Sheet1");
		readex.UpdateArrivalPort(sh,"C:\\Dinesh Divakar\\Selenium\\Test Data\\Datax Shipping Company.xlsx");
	}

	@DataProvider(name = "testdata")
	public String[][] getdata() throws InvalidFormatException, IOException {
		int TotalCol = sh.getRow(0).getLastCellNum();
		int Totalrows = sh.getLastRowNum();
		String[][] data = new String[Totalrows][TotalCol];
		for (int i = 0; i < Totalrows; i++) {
			Row r = sh.getRow(i);
			for (int j = 0; j < TotalCol; j++) {
				Cell c = r.getCell(j);
				try {
					if (c.getCellType() == CellType.STRING) {
						data[i][j] = c.getStringCellValue();
					} else {
						data[i][j] = String.valueOf(c.getNumericCellValue());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return data;
	}

	@Test(dataProvider = "testdata")
	public void displayShipmentValues(String s1, String s2, String s3, String s4, String s5, String s6)
			throws InvalidFormatException, IOException {
		String test = String.format("%-15s%-25s%-25s%-25s%-15s%15s", s1, s2, s3, s4, s5, s6);
		System.out.println(test);
	}

}
