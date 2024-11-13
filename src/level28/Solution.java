package level28;

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String[] line = fileScanner.nextLine().split(" ");
            Date birthday = new GregorianCalendar(Integer.parseInt(line[5]),
                    Integer.parseInt(line[4]) - 1, Integer.parseInt(line[3])).getTime();
            return new Person(line[0], line[1], line[2], birthday);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }


}
