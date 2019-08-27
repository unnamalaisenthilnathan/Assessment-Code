package com.atmecs.shoptools.util;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelRead {
	
	
static	Workbook book;
static	Sheet sheet;
static	Object[][] data;

	public static  Object[][] getData(String path, String sheetName)
	{
	FileInputStream file = null;

	try {
	file = new FileInputStream(path);
	} catch (FileNotFoundException e) {

	e.printStackTrace();
	}

	try {
	book = WorkbookFactory.create(file);
	} catch (Exception e) {
	e.printStackTrace();
	}

	sheet = book.getSheet(sheetName);
	data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

	for(int i=0;i<sheet.getLastRowNum();i++) {
	for(int k=0;k<sheet.getRow(0).getLastCellNum();k++) {
	data[i][k]=sheet.getRow(i+1).getCell(k).toString();
	System.out.println(data[i][k]);
	}
	}

	return data;
	}

	public static void print() {
		data = getData("C:\\Users\\Unnamalai.S\\git\\Assessment-Code\\Demoqa\\resources\\testdataproperties.xlsx", "testdata");
		for(int i=0; i<data.length;i++) {
			for(int j=0;j<data[i].length;j++)
			{
			System.out.println("data["+i+"]["+j+"]= "+data[i][j]);
			}
	}
	}
	
	public static void main(String[] agrs) {
		print();
	}
}
