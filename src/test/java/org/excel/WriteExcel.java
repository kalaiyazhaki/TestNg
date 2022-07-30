package org.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcel {
public static void main(String[] args) throws IOException {
	
	//1.mention the loction
	File f=new File("C:\\Users\\Admin\\eclipse-workspacekalai\\Framework8amBatch\\target\\testData\\write.xlsx");
	boolean a = f.createNewFile();
	System.out.println(a);
	
	//2.type the workbook
	Workbook w=new XSSFWorkbook();
	
	//3.create sheet
	Sheet s = w.createSheet("Main");
	
	//4.create row
	Row r = s.createRow(1);
	
	//5.create cell
	Cell c = r.createCell(0);
	
	//6.pass the values
	c.setCellValue("gayathri");
	//7.update the sheet
	FileOutputStream fout=new FileOutputStream(f);
	w.write(fout);
	System.out.println("SUCCESS");
}
}
