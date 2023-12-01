package charstreams;

import java.io.FileReader;
import java.util.Properties;

public class FileProperties {
	public static void main(String[] args) {
		try {
			Properties fp = new Properties();
			FileReader fr = new FileReader(args[0]);
			fp.load(fr);
			System.out.println("Database product : " + fp.getProperty("dbProduct"));
			System.out.println("Database Host :" + fp.getProperty("dbhost"));
			System.out.println("Database name :" + fp.getProperty("dbname"));
			System.out.println("Database Driver : " + fp.getProperty("dbdriver"));
			System.out.println("Database Port : " + fp.getProperty("dbport"));
			System.out.println("Database UID : " + fp.getProperty("dbuid"));
			System.out.println("Database PWD : " + fp.getProperty("dbpwd"));
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
