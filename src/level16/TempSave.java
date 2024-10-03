package level16;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;



public class TempSave {
    public static void main(String[] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        URL url = new URL(line);
        try (InputStream inputStream = url.openStream()){
            Path path = Files.createTempFile(null, null);
            Files.write(path, inputStream.readAllBytes());
        }

    }
}
