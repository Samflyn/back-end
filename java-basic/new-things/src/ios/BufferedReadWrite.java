package ios;

import java.io.*;
import java.util.Scanner;

public class BufferedReadWrite {
    public static void main(String[] args) {
//        closing scanner will close the BufferedReader as it implements closable interface
        try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("text.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                System.out.println(i);
                if (scanner.hasNext())
                    scanner.skip(scanner.delimiter());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("text.txt"))) {
            writer.write("1,2,3,4,5,6,7,8,9,10");
            System.out.println("Done...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
