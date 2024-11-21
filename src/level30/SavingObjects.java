package level30;

import java.io.*;

public class SavingObjects {
    public static void main(String[] args) {
        Cat cat = new Cat("Tom", 5, 10);
//        try {
//            cat.save(new PrintWriter(new FileWriter("cat.txt")));
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
        try {
            cat.load(new BufferedReader(new FileReader("cat.txt")));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(cat);

    }


}
