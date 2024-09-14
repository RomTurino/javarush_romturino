package level10;


import java.util.Arrays;
import java.util.regex.Pattern;

/*
Двоично-шестнадцатеричный конвертер
*/

public class Converter {
    private static final String HEX = "0123456789abcdef";
    private static final String[] BINS = {"0000",
            "0001", "0010", "0011", "0100", "0101", "0110",
            "0111", "1000", "1001", "1010", "1011", "1100",
            "1101", "1110", "1111"};

    //!Pattern.matches("[0-1]+", binaryNumber))
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Двоичное число " + binaryNumber + " равно шестнадцатеричному числу " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Шестнадцатеричное число " + hexNumber + " равно двоичному числу " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (!Pattern.matches("[0-1]+", binaryNumber)) {
            return "";
        }
        while (binaryNumber.length() % 4!= 0) {
            binaryNumber = "0" + binaryNumber;
        }
        int start = 0;
        StringBuilder hexNumber = new StringBuilder();
        while (start < binaryNumber.length()) {
            String sub = binaryNumber.substring(start, start + 4);
            int index = Arrays.binarySearch(BINS, sub);
            char value = HEX.charAt(index);
            hexNumber.append(value);
            start += 4;
        }
        return hexNumber.toString();
    }


    public static String toBinary(String hexNumber) {
        //напишите тут ваш код
        if (!Pattern.matches("[0-9a-fA-F]+", hexNumber)) {
            return "";
        }
        StringBuilder binaryNumber = new StringBuilder();
        for (int i = 0; i < hexNumber.length(); i++) {
            char c = hexNumber.charAt(i);
            int index = HEX.indexOf(c);
            String bin = BINS[index];
            binaryNumber.append(bin);
        }
        return binaryNumber.toString();
    }
}