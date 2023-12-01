package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Display {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Invalid Syntax : java Display <file>");
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
		try {
			fis = new FileInputStream(file);
			char ch = (char) fis.read();
			while (ch != (char) -1) {
				System.out.print(ch);
				ch = (char) fis.read();
			}
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				fis.close();
			}
		}
	}
}
