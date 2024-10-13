package level23;

import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.util.Scanner;

public class WriterInFile {
    public static void main(String[] args) throws IOException {
        try (
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                FileWriter fileWriter = new FileWriter(reader.readLine());
                BufferedWriter writer = new BufferedWriter(fileWriter);
        ){

            while (reader.ready()) {
                String line = reader.readLine();
                if (line.equals("exit"))
                    break;
                writer.write(line + "\n");
            }

        }

    }
}
