package level14;


import java.util.HashMap;
import java.util.Set;

/*
Успеваемость студентов-2
*/

public class Students {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println("Список студентов группы: ");
        printStudents();
        System.out.print("Средний балл группы: " + getAverageMark());
        printStudentsInfo();
    }

    public static void addStudents() {
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudents() {
        //напишите тут ваш код
        Set<String> keys = grades.keySet();
        for (String key : keys) {
            System.out.println(key);
        }

    }

    public static Double getAverageMark() {
        //напишите тут ваш код
        var values = grades.values();
        int size = values.size();
        double sum = 0;
        for (Double value : values) {
            sum += value;
        }
        return sum / size;

    }

    public static void printStudentsInfo() {
        for (var pair: grades.entrySet()){
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}