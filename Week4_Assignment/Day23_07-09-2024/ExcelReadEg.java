package com.exceleg;

import java.io.*;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadEg {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		//open file
		FileInputStream fis = new FileInputStream("D:\\Projects\\secondexcel.xlsx");

	
		//read workbook
		Workbook wbook = new XSSFWorkbook(fis);
		
		System.out.println("No: of sheets: " + wbook.getNumberOfSheets());
		
	int no_of_sheets = wbook.getNumberOfSheets();
		
		for (int k=0; k< no_of_sheets; k++) {
		//read sheet
		Sheet st = wbook.getSheetAt(k);
		
		
		int no_of_rows = st.getPhysicalNumberOfRows();
		
		for (int i=0;i < no_of_rows; i++) {
			
			//read rows
			Row row = st.getRow(i);
			
			int no_of_cols = row.getLastCellNum();
			
			for (int j = 0; j< no_of_cols; j++) {
		
		//read cells
		Cell cell = row.getCell(j);
		
		System.out.println(cell.getStringCellValue());}}
		
		wbook.close();
		fis.close();
	
	}
	}
}
