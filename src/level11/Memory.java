package level11;

import java.util.Arrays;
import java.util.Objects;

/*
Дефрагментация памяти
*/

public class Memory {

    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        //напишите тут ваш код
        for (int i = 0; i < array.length; i++) {
            for (int j = i ; j < array.length; j++) {
                if (array[j] != null) {
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    break;
                }
            }
        }
    }
}
