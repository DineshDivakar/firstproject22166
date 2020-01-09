package ebox.Selenium.LCCC;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	Sheet s;
	Workbook wb;

	public Sheet readExcel(String filePath,String fileName,String sheetName) throws InvalidFormatException, IOException {
		FileInputStream inputfile = new FileInputStream(filePath);
		wb = WorkbookFactory.create(inputfile);
		s = wb.getSheet(sheetName);
		return s;
	}

	public void UpdateArrivalPort(Sheet s, String filePath) throws InvalidFormatException, IOException {
		Cell updatecell = s.getRow(1).getCell(3);
		updatecell.setCellValue("Agra");
		FileOutputStream outputfile = new FileOutputStream(new File(filePath)); 
		wb.write(outputfile); // write changes
		outputfile.close(); // close the stream
	}
}
