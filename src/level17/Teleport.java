package level17;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Teleport {
    public static final String INVENTED = "Пожалуйста, можете забрать ваш карманный телепорт. Спасибо за ожидание!";
    public static final String NOT_INVENTED = "Извините, телепорт еще не изобрели, приходите через 10 лет.";

    public static final Calendar INVENTION_DAY = new GregorianCalendar(2192, Calendar.JUNE, 12);

    public static void main(String[] args) {
        Calendar currentDay = Calendar.getInstance();
        //напишите тут ваш код
        while(!isTeleportInvented(currentDay)) {
            currentDay.add(Calendar.YEAR, 10);
        }
    }

    static boolean isTeleportInvented(Calendar currentDay) {
        //напишите тут ваш код
        if (currentDay.getTime().after(INVENTION_DAY.getTime())){
            System.out.println(Teleport.INVENTED);
            return true;
        }
        else {
            System.out.println(Teleport.NOT_INVENTED);
            return false;
        }
    }
}
