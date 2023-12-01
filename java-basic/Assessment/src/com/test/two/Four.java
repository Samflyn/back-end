package com.test.two;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Four {
	public static void main(String[] args) throws IOException {
		File f = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		ArrayList<String> records = new ArrayList<String>();
		TreeSet<String> dept = new TreeSet<String>();
		try {
			f = new File(args[0]);
			if (!f.isFile()) {
				System.out.println("Given directory is not a file");
				System.exit(0);
			}
			if (!f.exists()) {
				System.out.println("File already exists");
				System.exit(0);
			}
			if (!f.canWrite()) {
				System.out.println("Write permission denied");
				System.exit(0);
			}
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				records.add(record);
				String[] fields = record.split(":");
				dept.add(fields[4]);
				record = dis.readLine();
			}
			Iterator<String> itr = dept.iterator();
			while (itr.hasNext()) {
				String str = itr.next();
				System.out.println(str);
				Iterator<String> iterator = records.iterator();
				while (iterator.hasNext()) {
					String str1 = iterator.next();
					if (str1.contains(str)) {
						System.out.println(str1);
					}
				}
			}
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
