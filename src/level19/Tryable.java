package level19;

import java.util.LinkedHashMap;
import java.util.WeakHashMap;

public class Tryable {
    public static void main(String[] args) {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("1", "b");
//        map.put("2", "c");
        map.put("3", "d");
        map.put("4", "e");
        map.put("2", "f");
        map.put("34", "g");
        map.forEach((k, v) -> System.out.println(k + " " + v));

    }
}
