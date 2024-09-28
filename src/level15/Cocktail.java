package level15;

public class Cocktail  {

    public static final String OUTPUT_FORMAT = "Метод %s вызван из строки %d класса %s в файле %s.\n";

    public static void main(String[] args) {
        makeScrewdriver();
    }

    public static void printStackTrace(StackTraceElement[] stackTrace) {
        for (StackTraceElement trace : stackTrace) {
            String nameMethod = trace.getMethodName();
            int lineNumber = trace.getLineNumber();
            String className = trace.getClassName();
            String fileName = trace.getFileName();
            System.out.printf(OUTPUT_FORMAT, nameMethod, lineNumber, className, fileName);
        }



    }

    static void makeScrewdriver() {
        addJuice();
    }

    static void addJuice() {
        addVodka();
    }

    static void addVodka() {
        printStackTrace(Thread.currentThread().getStackTrace());
    }
}
