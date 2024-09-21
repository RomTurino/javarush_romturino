package level13;

public class Solution {
    public static void main(String[] args) {
        String string = "Думаю, это будет новой фичей." +
                "Только не говорите никому, что она возникла случайно.";

        System.out.println("Количество цифр в строке : " + countDigits(string));
        System.out.println("Количество букв в строке : " + countLetters(string));
        System.out.println("Количество пробелов в строке : " + countSpaces(string));
        compare('a', 'a');
        compare('a', 'б');
        compare('р', 'в');
        compare('ы', 'ы');
    }



    public static int countDigits(String string) {
        //напишите тут ваш код
        int count = 0;
        for (char letter : string.toCharArray()) {
            if (Character.isDigit(letter)) {
                count++;
            }
        }
        return count;
    }

    public static int countLetters(String string) {
        //напишите тут ваш код
        int count = 0;
        for (char letter : string.toCharArray()) {
            if (Character.isLetter(letter)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpaces(String string) {
        //напишите тут ваш код
        int count = 0;
        for (char letter : string.toCharArray()) {
            if (Character.isWhitespace(letter)) {
                count++;
            }
        }
        return count;
    }
    public static void compare(Character a, Character b) {
        char c = a;
        char d = b;
        if (c == d){
            System.out.println("Символы равны");
        }
        else if (c > d){
            System.out.println("Первый символ больше");
        }
        else if (c < d){
            System.out.println("Первый символ меньше");
        }
        else {
            System.out.println("Символы не равны");
        }
    }
}
