package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLReadingDemo {

	public static void main(String[] args) throws IOException {

		String xlPath = System.getProperty("user.dir") + "/testdata/SampleTestData.xlsx";

		FileInputStream fis = new FileInputStream(xlPath);

		Workbook workbook = new XSSFWorkbook(fis); // --> this is a short way XSSFWorkbook workbook = new
													// XSSFWorkbook(fis);

		Sheet sheet = workbook.getSheet("Sample");

		String value3 = sheet.getRow(1).getCell(3).toString(); // J
		System.out.println(value3);

		// how to get values from all rows and colums?

		// 1. get numbers of rows
		int rows = sheet.getPhysicalNumberOfRows();

		// 2. get number of colums
		int cols = sheet.getRow(0).getLastCellNum();

		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {

				String value = sheet.getRow(r).getCell(c).toString();

				System.out.print(value + " ");
			}
			System.out.println("");
		}
		
		
		

//		
//		Row row = sheet.getRow(0);
//		
//		Cell row1cell2 = row.getCell(2);
//		
//		String value=row1cell2.toString();
//		
//		System.out.println(value);//LastName
//		
//		Row row2= sheet.getRow(1);
//		String value2=row2.getCell(0).toString();
//		System.out.println(value2);//John
//		
//		String value3=sheet.getRow(1).getCell(1).toString(); // J
//		System.out.println(value3);
	}
}
