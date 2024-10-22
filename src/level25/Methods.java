package level25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Methods {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while (true) {
            line = reader.readLine();
            if (line.equals("exit")) {
                break;
            }

            try{
                if (line.contains(".")) {
                    Double real = Double.parseDouble(line);
                    print(real);
                    continue;
                }
                int d = Integer.parseInt(line);
                if (d> 0 && d < 128) {
                    print((short) d);
                }
                else {
                    print(d);
                }

            } catch (NumberFormatException e) {
                print(line);
            }
        }

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
