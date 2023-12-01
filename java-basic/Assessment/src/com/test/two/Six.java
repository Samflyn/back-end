package com.test.two;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.TreeSet;

public class Six {
	public static void main(String[] args) throws IOException {
		File file = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		StringBuffer sb = new StringBuffer();
		TreeSet<String> ts = new TreeSet<String>();
		TreeSet<String> ts1 = new TreeSet<String>();
		try {
			file = new File(args[0]);
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String line = dis.readLine();
			while (line != null & !line.isEmpty()) {
				sb.append(line.toLowerCase());
				sb.append(" ");
				line = dis.readLine();
			}
			String[] split = sb.toString().split(" ");
			for (int i = 0; i < split.length; i++) {
				for (int j = i + 1; j < split.length; j++) {
					if (split[i].equals(split[j])) {
						ts1.add(split[i]);
						break;
					}
				}
				ts.add(split[i]);
			}
			ts.removeAll(ts1);
			System.out.println("Distinct words are : ");
			System.out.println(ts);
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
