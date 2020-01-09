package com.basic.functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWriteFromExcel {
	Sheet s;
	Workbook wb;
	
	
	public Sheet readExcel(String filePath,String fileName,String sheetName) throws InvalidFormatException, IOException {
		FileInputStream inputfile = new FileInputStream(filePath);
		wb = WorkbookFactory.create(inputfile);
		s = wb.getSheet(sheetName);
		return s;
	
	}

	public void WriteExcel(Sheet s, String filePath, String sheetName) throws InvalidFormatException, IOException {
		//Cell updatecell = s.getRow(1).getCell(0);
		//updatecell.setCellValue("Pass");
		FileOutputStream outputfile = new FileOutputStream(new File(filePath)); 
		wb.write(outputfile); // write changes
		//outputfile.close(); // close the stream
	}
	
	public int getrows(String filePath,Sheet s) {
		int rowcount = s.getLastRowNum();
		System.out.println(rowcount);
		return rowcount;
		
	}
	public int getCols(String filePath,Sheet s) {
		int i =0;
		int Colcount = s.getRow(i).getLastCellNum();
		System.out.println(Colcount);
		return Colcount;
	}	
	
	
	
	
}



