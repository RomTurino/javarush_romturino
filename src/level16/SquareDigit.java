package level16;


import java.util.stream.Collectors;

public class SquareDigit {

    public int squareDigits(int n) {
        String result = "";
        int digit;
        int counter = 0;
        while (n > 0) {
            digit = n % 10;
            result = (digit*digit) + result;
            n /= 10;
            counter++;
        }
        if (result.isEmpty()) {
            return 0;
        }
        return Integer.parseInt(result); // TODO Implement me
    }

    public int squareDigits2(int n) {
        return Integer.parseInt(String.valueOf(n)
                .chars()
                .map(i -> Integer.parseInt(String.valueOf((char) i)))
                .map(i -> i * i)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining("")));
    }

    public int squareDigits3(int n) {

        String strDigits = String.valueOf(n);
        String result = "";

        for (char c : strDigits.toCharArray()) {
            int digit = Character.digit(c, 10); // radix - это система счисления
            result += digit * digit;
        }

        return Integer.parseInt(result);
    }

    public int squareDigits4(int n) {
        StringBuilder sb = new StringBuilder();
        String num = String.valueOf(n);
        for (char c : num.toCharArray()) {
            int curr = c - '0';
            curr *= curr;
            sb.append(curr);
        }
        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        SquareDigit squareDigit = new SquareDigit();
        int result = squareDigit.squareDigits(9119);
        int result2 = squareDigit.squareDigits2(9119);
        int result3 = squareDigit.squareDigits3(9119);
        int result4 = squareDigit.squareDigits4(9119);
        System.out.println(result==811181);
    }

}