package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class NumberOfRows {
	public static void main(String[] args) throws IOException {
		
		//1.Declare the location of ur excel sheet
		File f=new File("C:\\Users\\Admin\\eclipse-workspacekalai\\Framework8amBatch\\target\\testData\\Excel data 1.xlsx");
		
		//2.To read the file
		FileInputStream fin=new FileInputStream(f);
		
		//3.Type of workbook
		Workbook w=new XSSFWorkbook(fin);
																						
		//4.get the sheet from workbook
		Sheet s = w.getSheet("greens");
	
		//total number of rows
		int rows = s.getPhysicalNumberOfRows();
		System.out.println("Number of rows: "+rows);

	}
	}

