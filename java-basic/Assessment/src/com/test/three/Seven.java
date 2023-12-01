package com.test.three;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Seven {
	public static void main(String[] args) throws IOException {
		File src;
		FileInputStream fis = null;
		DataInputStream dis = null;
		ArrayList<String> al = new ArrayList<String>();
		try {
			src = new File(args[0]);
			if (!src.isFile()) {
				System.out.println("Given directory is not a file");
				System.exit(0);
			}
			String ds1 = src.getParent() + src.pathSeparator + "MaleList.txt";
			String ds2 = src.getParent() + src.pathSeparator + "FemaleList.txt";
			File dst1 = new File(ds1);
			FileOutputStream fos1 = new FileOutputStream(dst1);
			DataOutputStream dos1 = new DataOutputStream(fos1);
			File dst2 = new File(ds2);
			FileOutputStream fos2 = new FileOutputStream(dst2);
			DataOutputStream dos2 = new DataOutputStream(fos2);
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
				if (next.contains("Male")) {
					dos1.writeBytes(next);
				} else if (next.contains("Male")) {
					dos2.writeBytes(next);
				}
			}
			dos2.flush();
			dos1.flush();
			dis.close();
			fis.close();
			dos1.close();
			fos1.close();
			dos2.close();
			fos2.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}