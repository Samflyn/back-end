package com.test.four;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Six {
	public static void main(String[] args) throws IOException {

		File src;
		FileInputStream fis = null;
		DataInputStream dis = null;
		ArrayList<String> al = new ArrayList<String>();
		Map<Integer, String> dev = new HashMap<Integer, String>();
		Map<Integer, String> tes = new HashMap<Integer, String>();
		Map<Integer, String> fin = new HashMap<Integer, String>();
		Map<Integer, String> adm = new HashMap<Integer, String>();
		try {
			src = new File(args[0]);
			if (!src.isFile()) {
				System.out.println("Given directory is not a file");
				System.exit(0);
			}
			fis = new FileInputStream(src);
			dis = new DataInputStream(fis);
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				al.add(record);
				record = dis.readLine();
			}
			Iterator<String> iterator = al.iterator();
			while (iterator.hasNext()) {
				String next = iterator.next();
				if (next.contains("Developer")) {
					String[] split = next.split(":");
					dev.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Testing")) {
					String[] split = next.split(":");
					tes.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Finance")) {
					String[] split = next.split(":");
					fin.put(Integer.parseInt(split[0]), split[1]);
				} else if (next.contains("Admin")) {
					String[] split = next.split(":");
					adm.put(Integer.parseInt(split[0]), split[1]);
				}
			}
			System.out.println("Developer Employees : " + dev);
			System.out.println("Testing Employees : " + tes);
			System.out.println("Finance Employees : " + fin);
			System.out.println("Admin Employees : " + adm);
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
