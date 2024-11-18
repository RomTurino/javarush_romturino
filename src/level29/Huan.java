package level29;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
/*
Хуан Хуанович
*/

public class Huan {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        String fileName = args[0];
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            StringBuilder sb;
            Calendar calendar = new GregorianCalendar();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" ");
                sb = new StringBuilder();
                for (int i = 0; i < data.length - 3; i++) {
                    sb.append(data[i]).append(" ");
                }
                int year = Integer.parseInt(data[data.length - 1]);
                int month = Integer.parseInt(data[data.length - 2]);
                int day = Integer.parseInt(data[data.length - 3]);
                calendar.set(year, month-1, day);
                PEOPLE.add(new Person(sb.toString().trim(), calendar.getTime()));
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Person person : PEOPLE) {
            System.out.println(person.toString());
        }
    }
}
