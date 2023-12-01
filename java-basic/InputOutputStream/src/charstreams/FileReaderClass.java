package charstreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(args[0]);
		char ch = (char) fr.read();
		while (ch != (char) -1) {
			System.out.println(ch);
			ch = (char) fr.read();
		}
		fr.close();
	}
}
