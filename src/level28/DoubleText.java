package level28;

import java.io.*;

/*
Ридер обертка
*/

public class DoubleText{
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();

        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
            fileOutputStream.write(outputStream.toByteArray());
        }
        String result = outputStream.toString();

        System.setOut(consoleStream);
        System.out.println(outputStream);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("It's a test");
        }
    }
}
