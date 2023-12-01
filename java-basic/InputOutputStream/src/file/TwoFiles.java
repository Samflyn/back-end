package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class TwoFiles {
	public static void main(String[] args) throws IOException {
		File file1 = new File(args[0]);
		File file2 = new File(args[1]);
		File file3 = new File(args[2]);
		FileInputStream fis1 = new FileInputStream(file1);
		FileInputStream fis2 = new FileInputStream(file2);
		FileOutputStream fos = new FileOutputStream(file3);
		SequenceInputStream sqis = new SequenceInputStream(fis1, fis2);
		char ch = (char) sqis.read();
		while (ch != (char) -1) {
			fos.write(ch);
			ch = (char) sqis.read();
		}
		fos.flush();
		fis1.close();
		fis2.close();
		fos.close();
	}
}
