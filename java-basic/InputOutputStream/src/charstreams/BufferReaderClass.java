package charstreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderClass {
	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader(args[0]);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while (line != null && line != "") {
			System.out.println(line);
			br.readLine();
		}
		br.close();
		fr.close();
	}
}
