package level16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReversedBytes {
    public static void main(String[] args) throws IOException {
        try (Scanner sc = new Scanner(System.in);
             var inputStream = Files.newInputStream(Paths.get(sc.nextLine()));
             var outputStream = Files.newOutputStream(Paths.get(sc.nextLine()))
        ) {
            int size = 1024;
            byte[] buffer = new byte[size];
            while (inputStream.available() > 0) {
                int read = inputStream.read();
                outputStream.write(buffer, 0, size - 1);

            }
        }
    }

    public static void removeAllPunctuation() throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            List<String> lines = Files.readAllLines(Paths.get(sc.nextLine()));
            for (String line : lines) {
                String cleanedLine = line.replaceAll("[.,\\s]", "");
                System.out.print(cleanedLine);
            }

        }
    }

}
