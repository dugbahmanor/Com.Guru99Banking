package com.guru99BankingApp.ExcelReader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData 
{
	public static final Logger log=Logger.getLogger(ReadExcelData.class.getName());
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

	public XSSFRow getRow(String shname,int rownum)
	{
		return Row=sheet.getRow(rownum);
	}
	
	public XSSFCell getCell(String shname,int cellnum,int row)
	{
		return Cell=getRow(shname,row).getCell(cellnum);
	}
	public int getTotalRow(String shname)
	{
		log.info(" ==== finding total row in the sheet========== "+ wb.getSheet(shname).getLastRowNum());
		return wb.getSheet(shname).getLastRowNum()+1;
	
	}
	
	
	public int getTotalCell(String shname)
	{
		log.info(" ==== finding total cell in the sheet========== "+ wb.getSheet(shname).getRow(0).getLastCellNum());
		return wb.getSheet(shname).getRow(0).getLastCellNum();
	}
	public Object[][] getExcelData(String sheetname)
			{
		Object[][] dataSet=null; 
		
		
		
	try
	{

		XSSFSheet sheet=wb.getSheet(sheetname);
		int TR=sheet.getLastRowNum()+1;
		int TC=sheet.getRow(0).getLastCellNum();
		dataSet=new Object[TR-1][TC];
		
		for(int i=1;i<TR;i++)
		{
			XSSFRow row=sheet.getRow(i);
			
			for(int j=0;j<TC;j++)
			{
				XSSFCell cell=row.getCell(j);
				//Cell.getCellType();
				if(cell.getCellType()==CellType.STRING)
				{
					dataSet[i-1][j]=cell.getStringCellValue();
				}
				
				
			}
			
		}
		return dataSet;
	}
	catch(Exception e)
	{
		log.info(e.getMessage());
	}
	return dataSet;
			}

	
	
	public void getDataRow(String shtname,int rownum)
	{
		wb.getSheet(shtname).getRow(rownum);
		//XSSFRow my=sheet.getRow(rownum);
		
	}
	public String  getStringData(String sheetname,int row)
	{
		String data=wb.getSheet(sheetname).getRow(row).toString();
		return data;
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
