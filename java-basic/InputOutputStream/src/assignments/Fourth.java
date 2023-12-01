package assignments;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Fourth {
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
				ts.add(fields[2]);
				record = dis.readLine();
			}
			dis.close();
			fis.close();
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				al.add(itr.next());
			}
			int sum = 0;
			for (int i = 0; i < al.size(); i++) {
				sum = sum + Integer.parseInt(al.get(i));
			}
			int avg = sum / al.size();
			System.out.println("Max salary : " + al.get(al.size() - 1) + "\n" + "Min salary : " + al.get(0) + "\n"
					+ "Average salary : " + avg);
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
