package com.atmecs.shoptools.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet1;

	public ExcelReader(String filePath) {
	try {
	File file = new File(filePath);
	FileInputStream fileInput = new FileInputStream(file);
	try {
	workbook = new XSSFWorkbook(fileInput);
	} catch (IOException e) {
	e.printStackTrace();
	}

	} catch (FileNotFoundException e) {
	e.printStackTrace();
	}
	}

	public static String getData(int index, int rowNum, int cellNum) {

	sheet1 = workbook.getSheetAt(index);
	String data = sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();

	return data;
	}
}

