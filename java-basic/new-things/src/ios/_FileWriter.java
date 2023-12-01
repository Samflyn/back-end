package ios;

import java.io.FileWriter;
import java.io.IOException;

public class _FileWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
//        try {
//            fileWriter = new FileWriter("text.txt");
//            fileWriter.write("Tested");
//            fileWriter.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            fileWriter = new FileWriter("text.txt");
//            fileWriter.write("Tested");
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (fileWriter != null)
//                    fileWriter.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

        try (FileWriter writer = new FileWriter("test"); FileWriter writer1 = new FileWriter("test1")) {
//            Resources are closed in the reverse order
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
