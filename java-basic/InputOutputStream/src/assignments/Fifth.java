package assignments;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class Fifth {
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
				ts.add(fields[4]);
				record = dis.readLine();
			}
			dis.close();
			fis.close();
			Iterator<String> itr = ts.iterator();
			while (itr.hasNext()) {
				al.add(itr.next());
			}
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record1 = dis.readLine();
			TreeSet<String> ts1 = new TreeSet<String>();
			int fcounter = 0;
			int mcounter = 0;
			while (record1 != null && !record1.isEmpty()) {
				if (record1.contains(al.get(0))) {
					String[] fields = record1.split(":");
					if (fields[3].contains("Female")) {
						fcounter++;
					} else {
						mcounter++;
					}
					ts1.add(fields[2]);
				}
				record1 = dis.readLine();
			}
			dis.close();
			fis.close();
			ArrayList<String> al1 = new ArrayList<String>();
			itr = ts1.iterator();
			while (itr.hasNext()) {
				al1.add(itr.next());
			}
			int sum = 0;
			for (int i = 0; i < al1.size(); i++) {
				sum = sum + Integer.parseInt(al1.get(i));
			}
			int avg = sum / al1.size();
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record11 = dis.readLine();
			TreeSet<String> ts11 = new TreeSet<String>();
			int fcounter1 = 0;
			int mcounter1 = 0;
			while (record11 != null && !record11.isEmpty()) {
				if (record11.contains(al.get(1))) {
					String[] fields = record11.split(":");
					if (fields[3].contains("Female")) {
						fcounter1++;
					} else {
						mcounter1++;
					}
					ts11.add(fields[2]);
				}
				record11 = dis.readLine();
			}
			dis.close();
			fis.close();
			ArrayList<String> al11 = new ArrayList<String>();
			itr = ts11.iterator();
			while (itr.hasNext()) {
				al11.add(itr.next());
			}
			int sum1 = 0;
			for (int i = 0; i < al11.size(); i++) {
				sum1 = sum1 + Integer.parseInt(al11.get(i));
			}
			int avg1 = sum1 / al11.size();
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record111 = dis.readLine();
			TreeSet<String> ts111 = new TreeSet<String>();
			int fcounter11 = 0;
			int mcounter11 = 0;
			while (record111 != null && !record111.isEmpty()) {
				if (record111.contains(al.get(2))) {
					String[] fields = record111.split(":");
					if (fields[3].contains("Female")) {
						fcounter11++;
					} else {
						mcounter11++;
					}
					ts111.add(fields[2]);
				}
				record111 = dis.readLine();
			}
			dis.close();
			fis.close();
			ArrayList<String> al111 = new ArrayList<String>();
			itr = ts111.iterator();
			while (itr.hasNext()) {
				al111.add(itr.next());
			}
			int sum11 = 0;
			for (int i = 0; i < al111.size(); i++) {
				sum11 = sum11 + Integer.parseInt(al111.get(i));
			}
			int avg11 = sum11 / al111.size();
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String record1111 = dis.readLine();
			TreeSet<String> ts1111 = new TreeSet<String>();
			int fcounter111 = 0;
			int mcounter111 = 0;
			while (record1111 != null && !record1111.isEmpty()) {
				if (record1111.contains(al.get(3))) {
					String[] fields = record1111.split(":");
					if (fields[3].contains("Female")) {
						fcounter111++;
					} else {
						mcounter111++;
					}
					ts1111.add(fields[2]);
				}
				record1111 = dis.readLine();
			}
			dis.close();
			fis.close();
			ArrayList<String> al1111 = new ArrayList<String>();
			itr = ts1111.iterator();
			while (itr.hasNext()) {
				al1111.add(itr.next());
			}
			int sum111 = 0;
			for (int i = 0; i < al1111.size(); i++) {
				sum111 = sum111 + Integer.parseInt(al1111.get(i));
			}
			int avg111 = sum111 / al1111.size();
			String str = new String("==================================EMP RECORDS==================================");
			String str1 = new String("===============================================================================");
			String str2 = new String("Dept \t" + "Total Emp\t" + "Male Emp\t" + "Female Emp\t" + "Max Sal\t"
					+ "Min Sal\t" + "Avg Sal\t" + "CTC");
			String str3 = new String("===============================================================================");
			String str4 = new String(al.get(0) + "\t" + (mcounter + fcounter) + "\t" + mcounter + "\t" + fcounter + "\t"
					+ al1.get(al1.size() - 1) + "\t" + al1.get(0) + "\t" + avg + "\t" + (mcounter + fcounter) * avg);
			String str5 = new String(al.get(1) + "\t" + (mcounter1 + fcounter1) + "\t" + mcounter1 + "\t" + fcounter1
					+ "\t" + al11.get(al11.size() - 1) + "\t" + al11.get(0) + "\t" + avg1 + "\t"
					+ (mcounter1 + fcounter1) * avg1);
			String str6 = new String(al.get(2) + "\t" + (mcounter11 + fcounter11) + "\t" + mcounter11 + "\t"
					+ fcounter11 + "\t" + al111.get(al111.size() - 1) + "\t" + al111.get(0) + "\t" + avg11 + "\t"
					+ (mcounter11 + fcounter11) * avg11);
			String str7 = new String(al.get(3) + "\t" + (mcounter111 + fcounter111) + "\t" + mcounter111 + "\t"
					+ fcounter111 + "\t" + al1111.get(al1111.size() - 1) + "\t" + al1111.get(0) + "\t" + avg111 + "\t"
					+ (mcounter111 + fcounter111) * avg111);
			String str8 = new String("===============================================================================");
			String str9 = new String("\t" + "Total Emp : " + (mcounter + fcounter + mcounter1 + fcounter1 + mcounter11
					+ fcounter11 + mcounter111 + fcounter111));
			String str10 = new String("\t" + "Total Male : " + (mcounter + mcounter1 + mcounter11 + mcounter111));
			String str11 = new String("\t" + "Total Female : " + (fcounter + fcounter1 + fcounter11 + fcounter111));
			String str12 = new String(
					"\t" + "Total CTC : " + ((mcounter + fcounter) * avg + (mcounter1 + fcounter1) * avg1
							+ (mcounter11 + fcounter11) * avg11 + (mcounter111 + fcounter111) * avg111));
			String str13 = new String(
					"===============================================================================");
			System.out.println(str + "\n" + str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6
					+ "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n" + str12 + "\n"
					+ str13);
			String path = file.getParent() + File.separator + "Result.txt";
			File output = new File(path);
			output.createNewFile();
			FileOutputStream fos = null;
			DataOutputStream dos = null;
			try {
				fos = new FileOutputStream(output);
				dos = new DataOutputStream(fos);
				dos.writeBytes(str + "\n" + str1 + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5 + "\n" + str6
						+ "\n" + str7 + "\n" + str8 + "\n" + str9 + "\n" + str10 + "\n" + str11 + "\n" + str12 + "\n"
						+ str13);
				dos.flush();
				dos.close();
				fos.close();
				System.out.println("Result saved to disk sucessfully.");
			} finally {
				if (dos != null) {
					dos.close();
				}
				if (fos != null) {
					fos.close();
				}
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
