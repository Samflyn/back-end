package charstreams;

import java.io.FileWriter;

public class FileWritterClass {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(args[0]);
			fw.write("Write to file");
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
