package level28;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

/*
Ридер обертка
*/

public class ReaderWrapper{
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        System.setOut(printStream);
        testString.printSomething();
        String[] result = outputStream.toString().split("[\\s]");
        int num1 = Integer.parseInt(result[0]);
        int num2 = Integer.parseInt(result[2]);
        int evaluation = 0;
        switch (result[1]){
            case "+":
                evaluation = num1 + num2;
                break;
            case "-":
                evaluation = num1 - num2;
                break;
            case "*":
                evaluation = num1 * num2;
                break;
        }
        System.setOut(consoleStream);
        System.out.println(outputStream.toString().trim() + " " + evaluation);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}
