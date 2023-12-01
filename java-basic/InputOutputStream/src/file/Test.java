package file;

import java.io.File;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		File file1 = new File(args[0]);
		if (file1.exists()) {
			System.out.println(args[0] + " file exists");
		}
		if (file1.isFile()) {
			System.out.println(args[0] + " is a file");
		}
		if (file1.isDirectory()) {
			System.out.println(args[0] + " is not a file");
			System.exit(0);
		}
		file1.createNewFile();
		file1.deleteOnExit();
		long len = file1.length();
	}
}
