package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public static void main(String[] args) throws IOException {
	
	//1.Declare the location of ur excel sheet
	File f=new File("C:\\Users\\Admin\\eclipse-workspacekalai\\Framework8amBatch\\target\\testData\\Excel data.xlsx");
	
	//2.To read the file
	FileInputStream fin=new FileInputStream(f);
	
	//3.Type of workbook
	Workbook w=new XSSFWorkbook(fin);
																					
	//4.get the sheet from workbook
	Sheet s = w.getSheet("greens");
	
	//5.iterate all the rows and cells
	for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
		Row r = s.getRow(i);
		for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
			Cell c = r.getCell(j);
			int cellType = c.getCellType();
			if (cellType==1) {
				String value = c.getStringCellValue();
				System.out.println(value);
			}
			else if (DateUtil.isCellDateFormatted(c)) {
				Date d1 = c.getDateCellValue();
				SimpleDateFormat sim=new SimpleDateFormat("dd,MM,YYYY");
				String date = sim.format(d1);
				System.out.println(date);
			}
			else {
				double d = c.getNumericCellValue();
				//to convert double to long and then convert long to string
				long l=(long)d;
				String value = String.valueOf(l);
				System.out.println(value);
			}
		}
	}
}
}
