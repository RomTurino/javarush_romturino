package level17;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class MyCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date date = calendar.getTime();
        System.out.println(date);

        int era = calendar.get(Calendar.ERA);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int millisecond = calendar.get(Calendar.MILLISECOND);

        System.out.println("Era: " + era);
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1));
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Millisecond: "+ millisecond);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(Calendar.JANUARY+" " + Calendar.SUNDAY);

        // my birthday
        var birthDate = new GregorianCalendar(1995, Calendar.NOVEMBER, 25);
        System.out.println("My birthday: " + birthDate.getTime());
        String imonth = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, new Locale("ru"));
        String jmonth = new SimpleDateFormat("EEEE", new Locale("ru")).format(birthDate.getTime());
        System.out.println(imonth);
        System.out.println(jmonth);

    }
}
