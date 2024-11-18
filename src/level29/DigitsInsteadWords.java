package level29;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class DigitsInsteadWords {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static{
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) {
        String filename = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            filename = br.readLine();
        } catch (IOException e) {}
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                for (Map.Entry<Integer, String> entry: map.entrySet()){
                    line = line.replace("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(line);

            }
        } catch (IOException e) {}


    }
}
