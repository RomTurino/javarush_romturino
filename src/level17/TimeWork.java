package level17;

import java.time.Instant;
import java.time.LocalTime;

public class TimeWork {
    static LocalTime timeMax = LocalTime.MAX;
    static LocalTime timeMin = LocalTime.MIN;
    static LocalTime time1 = LocalTime.of(14, 0);
    static LocalTime time2 = LocalTime.of(7, 0, 8);
    static LocalTime time3 = LocalTime.of(0, 45,0,61);
    static LocalTime time4 = LocalTime.of(14,0, 45, 1001);

//    public static void main(String[] args) {
//        LocalTime time = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
//        System.out.println(time);
//    }

    public static void main(String[] args) throws InterruptedException {
        LocalTime time = LocalTime.of(time1.getHour(), time2.getMinute(), time3.getSecond(), time4.getNano());
        System.out.println(time);
        LocalTime localTime = LocalTime.MIDNIGHT;
        LocalTime next = amazingMethod(localTime);
        while (next.isAfter(localTime)) {
            System.out.println(next);
            next = amazingMethod(next);
        }
        System.out.println(Instant.now().getNano());
    }

    static LocalTime amazingMethod(LocalTime base) {
        return base.plusHours(4).plusMinutes(48);
    }
}
