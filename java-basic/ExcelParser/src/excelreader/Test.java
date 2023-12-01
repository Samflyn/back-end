package excelreader;

import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		String src = args[0];
		String dst = args[1];
		ExcelParser ep = new ExcelParser();
		String data = ep.parseExcelData(src);
		String[] records = data.split("\n");
		CSVFile csv = new CSVFile();
		csv.generateCSVFile(records, dst);
		System.out.println("done");
	}
}
