package com.test.two;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ten {
	public static void main(String[] args) throws IOException {

		File file = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		StringBuffer sb = new StringBuffer();
		ArrayList<String> al = new ArrayList<String>();
		Map<String, Integer> mp = new HashMap<String, Integer>();
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
			for (int j = 0; j < split.length; j++) {
				al.add(split[j]);
			}
			int counter = 1;
			for (int i = 0; i < al.size(); i++) {
				for (int j = i + 1; j < al.size(); j++) {
					if (al.get(i).equals(al.get(j))) {
						counter++;
					}
				}
				if (!mp.containsKey(al.get(i))) {
					mp.put(al.get(i), counter);
				}
				counter = 1;
			}
			System.out.println("Maximum no. words are : ");
			System.out.println(mp);
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
