package level29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TagHunter {
    public static void main(String[] args) throws IOException {
//        String line = "Text: <span> crop </span> окончание фразы";
//        int start = line.indexOf("<span");
//        int end = line.indexOf("</span>") + "</span>".length();
//        System.out.println(line.substring(start, end));
        String fileName = "";
        String tag = "span";//args[0];
        String line;
        ArrayList<String> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        }
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            int start;
            int end;
            StringBuilder sb = new StringBuilder();
            while ((line = fileReader.readLine()) != null) {
                start = line.indexOf(String.format("<%s", tag));
                end = line.indexOf(String.format("</%s>", tag));
                if (start != -1 && end == -1){
                    sb.append(line.substring(start));
                }
                if (start != -1 && end != -1)
                    result.add(line.substring(start, end + tag.length()));
            }
        }
        for (String str : result) {
            System.out.println(str);
        }
    }
}
