package level23;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class SortEvenNums {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        try (FileInputStream fis = new FileInputStream(fileName)){
            Scanner scanner = new Scanner(fis);
            ArrayList<Integer> list = new ArrayList<>();
            int number;
            while (scanner.hasNext()) {
                number = scanner.nextInt();
                if (number % 2 == 0) {
                    list.add(number);
                }
            }
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        }

    }
}
