package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelParser {
	private StringBuffer sb = null;

	public String parseExcelData(String src) {
		File file = new File(src);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			sb = new StringBuffer();
			XSSFRow row;
			XSSFCell cell;
			while (rowIterator.hasNext()) {
				row = (XSSFRow) rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					cell = (XSSFCell) cellIterator.next();
					switch (cell.getCellType()) {
					case STRING:
						sb.append(cell.getStringCellValue() + ",");
						break;
					case NUMERIC:
						sb.append(cell.getNumericCellValue() + ",");
						break;
					}
				}
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		String data = sb.toString();
		return data;
	}
}
