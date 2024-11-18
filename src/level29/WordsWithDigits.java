package level29;

import java.io.*;

public class WordsWithDigits {
    public static void main(String[] args) throws IOException {
        String filename = "test.txt";
        String filename2 = "test2.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(filename)); BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filename2))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] words = line.split(" ");
                for (String word : words) {
                    if (word.matches(".*\\d.*")) {
                        fileWriter.write(word + " ");
                    }
                }

            }
        }
    }
}
