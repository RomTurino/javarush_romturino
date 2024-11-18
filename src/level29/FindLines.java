package level29;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindLines {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("B");
    }

    public static void main(String[] args) {
        String fileName="";
        String line;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = reader.readLine();
        } catch (IOException ignore){}
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))){
            while ((line = fileReader.readLine()) != null){
                int count = 0;
                for (String word: words){
                    if (line.contains(word)){
                        count += 1;
                    }
                }
                if (count == 2){
                    System.out.println(line);
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
