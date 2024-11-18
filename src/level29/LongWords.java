package level29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LongWords {
    public static void main(String[] args) {
        String fileName = "test.txt";
        String fileName2 = "test2.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(fileName));
             BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s");
                for (String word : words) {
                    if (word.length() > 6) {
                        sb.append(word).append(" ");
                    }
                }
            }
            bw.write(sb.toString().trim().replaceAll(" ", ","));
        } catch (IOException ignored) {
        }
    }
}
