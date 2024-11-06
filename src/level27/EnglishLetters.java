package level27;

import java.io.*;

public class EnglishLetters {
    public static void main(String[] args) {
//      Программа узнает количество английских букв в файле
        int count = 0;
        try (FileReader reader = new FileReader("test.txt")) {
            while (reader.ready()) {
                int num = reader.read();
                if (isInRange(num, 'a', 'z') || isInRange(num, 'A', 'Z'))
                    count++;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);

    }

    public static boolean isInRange(int number, int a, int b) {
        return number >= a && number <= b;
    }

    // Количество пробелов к общему количеству символов
    public static double countSpaces(FileReader reader) throws IOException {
        int spaces = 0;
        int all = 0;
        while (reader.ready()) {
            int num = reader.read();
            all++;
            if (num == 32) {
                spaces++;
            }
        }
        return (double) (spaces / all * 100);
    }

    public static void main2(String[] args) {
        try (FileReader reader = new FileReader(args[0])) {
            System.out.println(String.format("%.2f", countSpaces(reader))); // Округление до двух знаков после запятой
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
