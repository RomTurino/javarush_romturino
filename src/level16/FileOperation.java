package level16;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class FileOperation {
    public static void main(String[] args) {
        try(
            Scanner scanner = new Scanner(System.in);
        ){
            List<String> lines = Files.readAllLines(Path.of(scanner.nextLine()));
            for (String line : lines) {
                System.out.println(line);
            }


        } catch (IOException e) {

            throw new RuntimeException(e);
        }

    }
}
