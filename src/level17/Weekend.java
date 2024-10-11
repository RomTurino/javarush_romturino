package level17;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Weekend {
    private static final int FRIDAY = 5;
    private static final int SATURDAY = 6;
    private static final int SUNDAY = 7;
    private static final int WEEKEND_START_FRIDAY_CUT_OFF_HOUR = 22;
    private static final int WEEKEND_END_SUNDAY_CUT_OFF_HOUR = 23;

    public static void main(String[] args) {
        List<LocalDateTime> dateTimeList = new ArrayList<>();
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 18, 39));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 21, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 22, 22, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 23, 5, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 8, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 22, 59));
        dateTimeList.add(LocalDateTime.of(2016, 4, 24, 23, 0));
        dateTimeList.add(LocalDateTime.of(2016, 4, 25, 11, 5));

        for (LocalDateTime dateTime : dateTimeList) {
            System.out.println(dateTime + ", is weekend - " + isWeekend(dateTime));
        }

        Instant instant = Instant.ofEpochSecond(10);
        System.out.println(instant);
        System.out.println(plusHours(instant, 1));
        instant.pl

    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        //напишите тут ваш код

        if (dateTime.getDayOfWeek().getValue() >= FRIDAY && dateTime.getHour() >= WEEKEND_START_FRIDAY_CUT_OFF_HOUR){
            return (dateTime.getDayOfWeek().getValue() <= SUNDAY && dateTime.getHour() < WEEKEND_END_SUNDAY_CUT_OFF_HOUR);
        }

        return false;
    }

    static public Instant plusHours(Instant instant, int hours) {
        return instant.plusSeconds(hours * 3600L);
    }
}
