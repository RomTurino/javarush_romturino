package level24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
level30.User, Loser, Coder and Proger
*/

public class UserTask {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        List<String> variants = Arrays.asList("user","loser", "coder", "proger");
        while (true)
        {
            key = reader.readLine();
            if (!variants.contains(key)){
                break;
            }
            //создаем объект, пункт 2
            person = switch (key) {
                case "user" -> new Person.User();
                case "loser" -> new Person.Loser();
                case "coder" -> new Person.Coder();
                case "proger" -> new Person.Proger();
                default -> throw new IllegalStateException("Unexpected value: " + key);
            };

            doWork(person); //вызываем doWork

        }
    }

    public static void doWork(Person person) {
        // пункт 3
        switch (person) {
            case Person.User user -> user.live();
            case Person.Loser loser -> loser.doNothing();
            case Person.Coder coder -> coder.writeCode();
            case Person.Proger proger -> proger.enjoy();
            default -> throw new IllegalStateException("Unexpected value: " + person);
        }
    }
}
