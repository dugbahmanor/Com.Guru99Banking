package com.guru99BankingApp.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReader 
{
public XSSFWorkbook wb;
public FileInputStream fis;
public File src;
public XSSFSheet sheet;
public String path;
public XSSFRow row;
public XSSFCell cell;



public ExcelDataReader (String path) throws FileNotFoundException
{
	this.path=path;
	//path="./Config/Gurubanking.xlsx";
	fis=new FileInputStream(path);
	try {
		wb=new XSSFWorkbook(fis);
	} catch (IOException e) {
		
		e.printStackTrace();
	}
}


//@SuppressWarnings("unused")
public String[][] getStringCellData(String sheetname)
{
	String dataset[][]=null;
	try
	{
		int index=wb.getSheetIndex(sheetname);
	sheet=wb.getSheetAt(index);
	int TR=sheet.getLastRowNum()+1;
	int TC=sheet.getRow(0).getLastCellNum();
	dataset=new String[TR-1][TC];
	for(int i=1;i<TR;i++)
	{
		XSSFRow row=sheet.getRow(i);
		
		for(int j=0;j<TC;j++)
		{
			XSSFCell cell=row.getCell(j);
			
			if(cell.getCellType()==CellType.STRING)
			{
				dataset[i-1][j]=cell.getStringCellValue();
			}
			else if(cell.getCellType()==CellType.NUMERIC)
			{
				dataset[i-1][j]=String.valueOf(cell.getNumericCellValue());
			}
			else
			{
				dataset[i-1][j]=String.valueOf(cell.getBooleanCellValue());
			}
		}
	}
	}
	catch(Exception e)
	{
	e.getMessage();
	}
	return dataset;
}



public String getData(int rownum,String colname,String sheetname)

{
	try 
	{
		int col_num=0;
	int index=wb.getSheetIndex(sheetname);
	sheet=wb.getSheetAt(index);
	XSSFRow row=sheet.getRow(0);

	for(int i=0;i<row.getLastCellNum();i++)
	{
		if(row.getCell(i).getStringCellValue().equalsIgnoreCase(colname))
		{
			col_num=i;
			break;
		}
		row=sheet.getRow(rownum-1);
		XSSFCell cell=row.getCell(col_num);
		if(cell.getCellType()==CellType.STRING)
		{
			return cell.getStringCellValue();
		}
		else if(cell.getCellType()==CellType.BLANK)
		{
			return "";
		}
		
		}
		
		
	
		
	}catch(Exception e)

	{
		e.printStackTrace();
	}
	return null;
}
}
