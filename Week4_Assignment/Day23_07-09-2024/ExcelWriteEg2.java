package com.exceleg;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;

public class ExcelWriteEg2 {

	public static void main(String[] args) throws Exception {
		//create workbook
		Workbook wbook = new XSSFWorkbook();
		
		//create a new sheet
		Sheet st = wbook.createSheet("First Sheet");
		
		//create row
		Row row = st.createRow(0);
		
		//In above row, create cell and set some value
		Cell cell = row.createCell(0, CellType.NUMERIC);
		cell.setCellValue(12);
		
		Row row1 = st.createRow(1);
		
		Cell cell1 = row1.createCell(0, CellType.NUMERIC);
		cell1.setCellValue(20);
		
        Row row2 = st.createRow(2);
		
		Cell cell2 = row2.createCell(0, CellType.NUMERIC);
		cell2.setCellValue(11);
		
		
		FileOutputStream fos = new FileOutputStream("firstexcelNum.xlsx");
		
		//write above excel to a file
		wbook.write(fos);
		wbook.close();
		fos.close();
		

	}

}
