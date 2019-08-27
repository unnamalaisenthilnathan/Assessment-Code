package com.atmecs.shoptools.excelsheet;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;







 
public class ReadExcel { 
public static void main(String[] args) throws IOException 
	{ 
		File src=new File("C:\\Users\\Unnamalai.S\\git\\Assessment-Code\\Demoqa\\resources\\testdatafile.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook wb =new XSSFWorkbook(file);
        XSSFSheet sheet1=wb.getSheetAt(0);
        int rowcount=sheet1.getLastRowNum();
        System.out.println("Total row is"+rowcount);
        for(int i=0;i<rowcount;i++)
        {
        String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
        
        System.out.println("Test data from excel is"+data0);
        }
       


	}

	}
