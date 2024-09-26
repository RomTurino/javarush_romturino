package level14;


import java.util.ArrayList;
import java.util.HashMap;

/*
ArrayList vs HashMap
*/

public class ProgramLanguage {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    public static HashMap<String, Integer> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < programmingLanguages.size(); i++) {
            map.put(programmingLanguages.get(i), i);
        }
        return map;
    }

}