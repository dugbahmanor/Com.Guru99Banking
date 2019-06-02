package com.guru99BankingApp.ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
public XSSFWorkbook wb;
	public FileInputStream fis;
	public String path;
	public XSSFSheet sheet;
	public XSSFRow Row;
	public XSSFCell Cell;
	
	public ReadExcelData() throws Exception
	{
		
		try {
			fis=new FileInputStream("./Config/Gurubanking.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wb=new XSSFWorkbook(fis);
		
		
		
	}

public String  getStringData(String sheetname,int row,int col)
{
	String data=wb.getSheet(sheetname).getRow(row).getCell(col).getStringCellValue();
	return data;
}

public double getNumericData(String sheetname,int row,int col)
{
	double data=wb.getSheet(sheetname).getRow(row).getCell(col).getNumericCellValue();
	return data;
}


}
