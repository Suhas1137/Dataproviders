package com.pageutility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataprovider {

	XSSFWorkbook wb;
	public Exceldataprovider() throws IOException {
		String path="C:\\Users\\DELL\\eclipse-workspace\\Dataproviderpractice\\Testdata\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		wb=new XSSFWorkbook(fis);
	}
	
	public String getStringData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
