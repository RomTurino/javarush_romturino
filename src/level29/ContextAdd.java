package level29;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ContextAdd {
    public static TestString testString = new TestString();
    public final static String AD = "JavaRush - курсы Java онлайн";

    

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        System.setOut(new PrintStream(baos));
        testString.printSomething();
        String[] result = baos.toString().split("\n");
        System.setOut(consoleStream);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]   );
            if (i%2 != 0){
                System.out.println(AD);
            }
        }


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}
