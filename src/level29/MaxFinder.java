package level29;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeMap;
import java.util.TreeSet;

/*
Самый богатый
*/

public class MaxFinder{
    public static void main(String[] args) {
        TreeMap<String, Double> salary = new TreeMap<>();
        double max =Double.MIN_VALUE;
        String fileName = "test.txt";//args[0];

        try (BufferedReader rd = new BufferedReader(new FileReader(fileName))) {
            String[] splitedLine;
            String line;
            double currentValue;


            while ((line = rd.readLine()) != null) {
                splitedLine = line.split(" ");
                String name = splitedLine[0];
                double value = Double.parseDouble(splitedLine[1]);
                double valueMap = salary.getOrDefault(name, Double.MIN_VALUE);
                if (salary.containsKey(name)) {
                    currentValue = salary.get(name) + value;
                    salary.put(name, currentValue);
                } else {
                    salary.put(name, value);
                }
                if (max < salary.get(name)){
                    max = salary.get(name);
                }
            }
        } catch (IOException _) {

        }

        for (String key : salary.keySet()) {
            if (salary.get(key) == max  )
                System.out.println(key);
        }
    }
}