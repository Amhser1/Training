package com.Obsqura02.maven1training;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream fi;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	
	

	public static String readsString(int i, int j) throws Exception{
		fi = new FileInputStream("C:\\Users\\91828\\OneDrive\\Documents\\maven Test1.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		XSSFRow row= sh.getRow(i);
		XSSFCell cell= row.getCell(j);
		
		return cell.getStringCellValue();
	}
	
	public static double readNumeric(int i, int j) throws Exception{
		fi = new FileInputStream("C:\\Users\\91828\\OneDrive\\Documents\\maven Test1.xlsx");
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet("Sheet1");
		XSSFRow row= sh.getRow(i);
		XSSFCell cell= row.getCell(j);
		
		return cell.getNumericCellValue();
	}
	
	public static void main (String args[]) throws Exception{
		String name =ExcelCode.readsString(1, 0);
		System.out.println(name);
		double amount =ExcelCode.readNumeric(1, 1);
		System.out.println(amount);
		
	}

	
	}


