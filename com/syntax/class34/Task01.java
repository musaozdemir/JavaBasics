package com.syntax.class34;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task01 {
	
//	Manually create a file to store username and password
//	Using Java add 2 more lines for username and password 
//	Save code in the same file

	public static void main(String[] args) throws IOException {

		String xlFilePath = System.getProperty("user.dir") + "/testdata/taskFile.xlsx";

		FileInputStream fis = new FileInputStream(xlFilePath);

		Workbook book = new XSSFWorkbook(fis);
		
		Sheet sheet = book.getSheet("Sheet1");
		
		sheet.createRow(1).createCell(0).setCellValue("Musa");
		sheet.getRow(1).createCell(1).setCellValue("Musa1234");
		
		sheet.createRow(2).createCell(0).setCellValue("John");
		sheet.getRow(2).createCell(1).setCellValue("John1234");
		
		FileOutputStream fos = new FileOutputStream(xlFilePath);
		
		book.write(fos);
//		book.close();
//		fis.close();
//		fos.close();
		
		
		
		
	}

}
