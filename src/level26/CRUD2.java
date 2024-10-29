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

public class CRUD2 {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

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
        SimpleDateFormat formatter_in = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int iter = 0; iter < args.length-3; iter+=3){
                        name = args[iter+1];
                        sex = args[iter+2].equals("м") ? Sex.MALE : Sex.FEMALE;
                        try {
                            birthDate = formatter_in.parse(args[iter+3]);
                        } catch (ParseException _) {
                        }
                        if (sex == Sex.MALE) {
                            allPeople.add(Person.createMale(name, birthDate));
                        } else {
                            allPeople.add(Person.createFemale(name, birthDate));
                        }
                        System.out.println(allPeople.size()-1);
                    }
                    break;
                }

            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++){
                        int index = Integer.parseInt(args[i]);
                        Person person = allPeople.get(index);
                        name = person.getName();
                        String parsedSex = person.getSex() == Sex.MALE ? "м" : "ж";
                        String parsedDate = formatter.format(person.getBirthDate());
                        System.out.println(name + " " + parsedSex + " " + parsedDate);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    for (int uiter = 0; uiter < args.length-4; uiter+=4){
                        Person updatedPerson = allPeople.get(Integer.parseInt(args[uiter + 1]));
                        if (updatedPerson == null){
                            throw new IllegalArgumentException("Нет такого человека в списке");
                        }
                        updatedPerson.setName(args[uiter + 2]);
                        updatedPerson.setSex(args[uiter+3].equals("м") ? Sex.MALE : Sex.FEMALE);
                        try {
                            updatedPerson.setBirthDate(new SimpleDateFormat("dd/MM/yyyy").parse(args[uiter+4]));
                        } catch (ParseException _) {}
//                        allPeople.set(uiter, updatedPerson);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int diter = 1; diter < args.length; diter++){
                        Person deletedPerson = allPeople.get(Integer.parseInt(args[diter]));
                        deletedPerson.setBirthDate(null);
                        deletedPerson.setName(null);
                        deletedPerson.setSex(null);
                    }
                }
                break;

        }


    }
}
