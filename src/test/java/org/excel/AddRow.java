package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class AddRow {
public static void main(String[] args) throws IOException {
		
		//1.Declare the location of ur excel sheet
		File f=new File("C:\\Users\\Admin\\eclipse-workspacekalai\\Framework8amBatch\\target\\testData\\Excel data 1.xlsx");
		
		//2.To read the file
		FileInputStream fin=new FileInputStream(f);
		
		//3.Type of workbook
		Workbook w=new XSSFWorkbook(fin);
												
	//4.get the sheet from workbook
	Sheet s = w.getSheet("greens");
	//5.create one row
	Row r = s.createRow(1);
			//6.create cell
		for (int i = 0; i <=4; i++) {
			Cell c = r.createCell(i);
			//set the value
			if (i==0) 				
			c.setCellValue("Abi");
			else if (i==1) {
				c.setCellValue("Mannai");

			}else if (i==2)
				c.setCellValue("6789034562");
				else if(i==3)
				c.setCellValue("12/3/2001");
				else 
					c.setCellValue("IT");
		}
	//update the sheet
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	System.out.println("SUCCESS");
}
}
