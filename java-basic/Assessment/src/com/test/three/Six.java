package com.test.three;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import com.test.three.ExcelGen;

public class Six {
	public static void main(String[] args) throws IOException {

		if (args.length != 2) {
			System.out.println("Invalid parameter:<File1,File2>");
			System.exit(0);
		}
		File src = null;
		File dst = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		new ExcelGen();
		StringBuffer sb = new StringBuffer();
		try {
			src = new File(args[0]);
			String dest = src.getParent() + File.pathSeparator + "Excel.xlsx";
			dst = new File(dest);
			fis = new FileInputStream(src);
			dis = new DataInputStream(fis);
			String records = dis.readLine();
			while (records != null && !records.isEmpty()) {
				sb.append(records + "\n");
				records = dis.readLine();
			}
			String data = sb.toString();
			String[] record = data.split("\n");
			ExcelGen.gen(record, dst);
			System.out.println("Excel file generated");
			dis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (fis != null) {
				fis.close();
			}
		}

	}
}
