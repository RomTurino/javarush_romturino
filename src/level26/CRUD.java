package level26;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class CRUD {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        if (args==null || args.length < 1) {
            throw new RuntimeException("Не указаны параметры");
        }
        //напишите тут ваш код
        String name;
        Sex sex;
        Date birthDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                name = args[1];
                sex = args[2].equals("м") ? Sex.MALE : Sex.FEMALE;
                try {
                    birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(args[3]);
                } catch (ParseException _) {
                }
                if (sex == Sex.MALE) {
                    allPeople.add(Person.createMale(name, birthDate));
                } else {
                    allPeople.add(Person.createFemale(name, birthDate));
                }
                System.out.println(allPeople.size()-1);
                break;
            case "-r":
                int index = Integer.parseInt(args[1]);
                Person person = allPeople.get(index);
                name = person.getName();
                String parsedSex = person.getSex() == Sex.MALE ? "м" : "ж";
                String parsedDate = formatter.format(person.getBirthDate());
                System.out.println(name + " " + parsedSex + " " + parsedDate);
                break;
            case "-u":
                Person updatedPerson = allPeople.get(Integer.parseInt(args[1]));
                if (updatedPerson == null){
                    throw new IllegalArgumentException("Нет такого человека в списке");
                }
                updatedPerson.setName(args[2]);
                updatedPerson.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                try {
                    updatedPerson.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[4]));
                } catch (ParseException _) {}
                break;
            case "-d":
                Person deletedPerson = allPeople.get(Integer.parseInt(args[1]));
                deletedPerson.setBirthDate(null);
                deletedPerson.setName(null);
                deletedPerson.setSex(null);

        }


    }
}
