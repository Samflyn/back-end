package assignments;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Second {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Invalid Syntax : java Lines <file>");
			System.exit(0);
		}
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File does not exists");
			System.exit(0);
		}
		if (!file.isFile()) {
			System.out.println("Path specified is not a file");
			System.exit(0);
		}
		ArrayList<String> al = new ArrayList<String>();
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			TreeSet<String> ts = new TreeSet<String>();
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				String[] fields = record.split(":");
				ts.add(fields[3]);
				record = dis.readLine();
			}
			dis.close();
			fis.close();
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				al.add(itr.next());
			}
			System.out.println(al);
			for (int i = 0; i < al.size(); i++) {
				fis = new FileInputStream(file);
				dis = new DataInputStream(fis);
				String record1 = dis.readLine();
				while (record1 != null && !record1.isEmpty()) {
					if (record1.contains(al.get(i))) {
						System.out.println(record1);
					}
					record1 = dis.readLine();
				}
				dis.close();
				fis.close();
			}
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
