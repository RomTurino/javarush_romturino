package level17;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class DateWork {
    public static void main(String[] args) {
        ZoneId timezone = ZoneId.of("Europe/Paris");
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Сейчас в Париже = " + today);

        LocalDate tomorrow = today.plusDays(1);
        System.out.println("Завтра в Париже = " + tomorrow);

        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());


        var day = tomorrow.getDayOfWeek();
        System.out.println(day.getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru")));

    }

    static LocalDate nowExample() {
        return LocalDate.now();
    }

    static LocalDate ofExample() {
        return LocalDate.of(2020, 9, 12);
    }

    static LocalDate ofYearDayExample() {
        var need = LocalDate.of(2020, 9, 12);
        for (int i = 1; i <= 365; i++) {
            var date = LocalDate.ofYearDay(2020, i);
            if (date.equals(need)) {
                System.out.println(i);
                return date;
            }
        }
        return need;
    }
}
