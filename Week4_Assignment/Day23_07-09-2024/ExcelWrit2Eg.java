package com.exceleg;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.*;



public class ExcelWrit2Eg {
	
	static String sarr[][] = {{ "abcd", "defg", "hijk"},{"lmno","pqrs","tvuw"},
			{"fsgfjh", "hgdg","dtdp"}};
	

	public static void main(String[] args) {
		try {
		//create workbook
		
		Workbook wbook = new XSSFWorkbook();
		
		//create anew sheet
		
		Sheet st = wbook.createSheet("First sheet");
		
		for (int i =0; i < sarr.length; i++) {
			//create row
			Row row = st.createRow(i);
			for (int j=0;j < sarr[0].length; j++) {
				Cell cell = row.createCell(j);
				cell.setCellValue(sarr[i][j]);
				
				//create cell, and set some value to cell
				
				System.out.println("Writing the element " + sarr[i][j] +  " to excel");
			}
			
			System.out.println();
			
		}
		
		FileOutputStream fos = new FileOutputStream("D:\\Projects\\secondexcel.xlsx");
		
		wbook.write(fos);
	}
	catch (Exception et){
		et.printStackTrace();
		}
	}

}
