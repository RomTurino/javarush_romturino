package level17;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
Подчищаем хвосты
*/

public class CorrectData {

    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015, 12, 25, 20, 40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));

        System.out.println("before fixes:");
        dateList.forEach(System.out::println);

        fixDate(dateList);

        System.out.println("after fixes:");
        dateList.forEach(System.out::println);

        Date date = new Date("6 January 2010");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(formatter.format(date));
    }

    static void fixDate(List<Date> brokenDates) {
        //напишите тут ваш код
        Date date_now = new Date();
        for (Date date: brokenDates){
            if (date.after(date_now)){
                date.setYear(date.getYear() - 1900);
                date.setMonth(date.getMonth() - 1);
            }
        }
    }
}
