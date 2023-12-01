package com.test.four;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelGen {
	public static void gen(String[] record, File dst) {
		try {
			FileOutputStream fos = new FileOutputStream(dst);
			XSSFWorkbook workBook = new XSSFWorkbook();
			XSSFSheet sheet = workBook.createSheet("EmpData");
			int rowIndex = 0;
			for (String records : record) {
				String[] fields = records.split(":");
				XSSFRow row = sheet.createRow(rowIndex++);
				XSSFCell cell = row.createCell(0);
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(Integer.parseInt(fields[0]));
				cell = row.createCell(1);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(fields[1]);
				cell = row.createCell(2);
				cell.setCellType(Cell.CELL_TYPE_NUMERIC);
				cell.setCellValue(Double.parseDouble(fields[2]));
				cell = row.createCell(3);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(fields[3]);
				cell = row.createCell(4);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				cell.setCellValue(fields[4]);
			}
			workBook.write(fos);
			workBook.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
