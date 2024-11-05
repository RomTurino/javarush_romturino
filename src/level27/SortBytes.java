package level27;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.TreeSet;

public class SortBytes {
    public static void main(String[] args) throws Exception{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fis = new FileInputStream(filename);
        // Создаем поток для чтения русских букв в кодировке UTF-8


        TreeSet<Character> set = new TreeSet<>();
        int count = 0;
        while (fis.available() > 0) {
            char b = (char) fis.read();
            set.add(b);
        }
        for (Character b : set) {
            System.out.println(b + " ");
        }


        fis.close();
        reader.close();
        copy();
    }

    public static void copy() throws IOException {
        FileInputStream inputStream = new FileInputStream("test.txt");
        FileOutputStream outputStream = new FileOutputStream("test2.txt");

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }
        inputStream.close();
        outputStream.close();

    }


}
