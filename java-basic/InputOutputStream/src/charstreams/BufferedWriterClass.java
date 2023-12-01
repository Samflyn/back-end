package charstreams;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterClass {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter(args[0]);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Output to file");
			bw.flush();
			bw.close();
			fw.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
