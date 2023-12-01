package excelreader;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CSVFile {

	public void generateCSVFile(String[] records, String dst) throws IOException {
		File file = new File(dst);
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			for (String record : records) {
				dos.writeBytes(record);
			}
			dos.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				dos.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}
}
