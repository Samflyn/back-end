package ios;

import java.io.*;

public class DataStreams {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("stream")))) {
            for (int i = 1; i < 11; i++) {
                outputStream.writeInt(i);
                outputStream.writeChar(',');
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("stream")))) {
            byte[] bytes = inputStream.readAllBytes();
            System.out.println(bytes.length);
            for (byte aByte : bytes) {
                System.out.println(aByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
