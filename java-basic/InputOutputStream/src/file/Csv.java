package file;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Csv {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("Invalid Syntax : java Lines <sfile>, <dfile>");
			System.exit(0);
		}
		File sfile = new File(args[0]);
		File dfile = new File(args[1]);
		if (!sfile.exists()) {
			System.out.println("File does not exists");
			System.exit(0);
		}
		if (!sfile.isFile()) {
			System.out.println("Path specified is not a file");
			System.exit(0);
		}
		if (dfile.exists()) {
			System.out.println("Destination file exists");
			System.exit(0);
		}
		FileInputStream fis = null;
		DataInputStream dis = null;
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fis = new FileInputStream(sfile);
			dis = new DataInputStream(fis);
			fos = new FileOutputStream(dfile);
			dos = new DataOutputStream(fos);
			String record = dis.readLine();
			while (record != null && !record.isEmpty()) {
				String result = record.replaceAll(":", ",");
				dos.writeBytes(result);
				record = dis.readLine();
			}
			dos.flush();
			dis.close();
			fis.close();
			dos.close();
			fos.close();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dis != null) {
				dis.close();
			}
			if (fis != null) {
				fis.close();
			}
			if (dos != null) {
				dos.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
}
