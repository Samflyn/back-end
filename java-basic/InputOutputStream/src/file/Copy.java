package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
	public static void main(String[] args) throws IOException {
		if (args.length != 2) {
			System.out.println("Invalid Syntax : java Create <file>,<file>");
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
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(args[0]);
			fos = new FileOutputStream(args[1]);
			char ch = (char) fis.read();
			while (ch != (char) -1) {
				fos.write(ch);
				ch = (char) fis.read();
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
			}
			if (fis != null) {
				fis.close();
			}
		}
	}
}
