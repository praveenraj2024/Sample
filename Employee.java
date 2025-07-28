package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Hibbu\\eclipse-workspace\\Datadriven\\Excel\\UPD(1).xlsx");
		FileInputStream fileinputstream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(fileinputstream);
		Sheet sheet = workbook.getSheet("user");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(1);
		System.out.println(cell);
		int count = row.getPhysicalNumberOfCells();
		System.out.println(count);
		
		
	}
	

}
