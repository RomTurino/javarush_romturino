package level25;

import java.util.Properties;

public class MatrixWrapper {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");
    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public static void printMatrix(int m, Integer n, Object value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, String value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, int value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, long value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, float value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, double value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, char value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, boolean value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, byte value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, short value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, Object[] value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, int[] value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, Integer n, long[] value) {
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(Integer m, Integer n, Object value) {
        printMatrix(m, n, value);
    }

    
}
