package ebox.Selenium.LCCC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datasource {
	XSSFWorkbook Workbook;
	XSSFSheet Worksheet;
	XSSFRow Rowcount;
	XSSFCell ColCount;
	
	String path = "C:\\Dinesh Divakar\\Selenium\\CustomerDetails.xlsx";
	
	public void wrkbooksetup(String SheetName) throws Exception {
		File Source = new File (path);
		FileInputStream fis = new FileInputStream(Source);
		Workbook = new XSSFWorkbook(fis);
		//int InputSheet = Workbook.getSheetIndex(SheetName);
		Worksheet = Workbook.getSheet(SheetName);
	}
		//Get Row and Column Count
		
	public int Rcount() { 
		
				int RowCount = Worksheet.getLastRowNum();
				System.out.println(RowCount);
				return RowCount;
	}
public int Colcount() {
				XSSFRow Rows = Worksheet.getRow(0);
				int ColCount = Rows.getLastCellNum();
				System.out.println(ColCount);
				return ColCount;
}
public Object[][] fetchdata(int RowCount, int ColCount) {
	Object[][] inputdata = new Object[RowCount][ColCount];
	for (int i=RowCount-1;i<=RowCount;RowCount++){
		for (int j=ColCount; j<=ColCount;ColCount++){
			inputdata [i][j] = Worksheet.getRow(RowCount).getCell(ColCount).toString();
		}
	}
	return inputdata;
}

}


