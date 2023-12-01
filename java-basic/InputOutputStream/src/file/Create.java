package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Create {
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.out.println("Invalid Syntax : java Create <file>");
			System.exit(0);
		}
		File file = new File(args[0]);
		if (file.exists()) {
			System.out.println("File exists");
			System.exit(0);
		}
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(args[0]);
			char ch = (char) System.in.read();
			while (ch != (char) -1) {
				fos.write(ch);
				ch = (char) System.in.read();
			}
			fos.flush();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				fos.close();
			}
		}
	}
}
