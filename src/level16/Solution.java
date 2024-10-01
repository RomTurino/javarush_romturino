package level16;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Solution {
//    public static void main(String[] args) {
//        char[] chars = args[0].toCharArray();
//        try (InputStream stream = System.in;
//             Scanner scanner = new Scanner(stream);
//             BufferedWriter writer = Files.newBufferedWriter(Path.of(scanner.nextLine()))){
//             writer.write(chars);
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong");
//        }
//    }

    public static ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    public static PrintStream stream = new PrintStream(outputStream);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printSomething(scanner.nextLine());
        StringBuilder result = new StringBuilder(outputStream.toString());
        outputStream.reset();
        printSomething(result.reverse().toString());
        System.out.println(outputStream);
    }
    public static void printSomething(String str) {
        stream.print(str);
    }
}
