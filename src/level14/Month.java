package level14;

public class Month {
    public static final Month JANUARY = new Month(0);
    public static final Month FEBRUARY = new Month(1);
    public static final Month MARCH = new Month(2);
    public static final Month APRIL = new Month(3);
    public static final Month MAY = new Month(4);
    public static final Month JUNE = new Month(5);
    public static final Month JULY = new Month(6);
    public static final Month AUGUST = new Month(7);
    public static final Month SEPTEMBER = new Month(8);
    public static final Month OCTOBER = new Month(9);
    public static final Month NOVEMBER = new Month(10);
    public static final Month DECEMBER = new Month(11);
    private final int value;
    private static final Month[] array = {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER};
    static String monthString;
    public Month(int value) {
        this.value = value;
    }

    public int ordinal() {
        return this.value;
    }

    public static Month[] values() {
        return array;
    }

    public static String getMonthByIndex(int monthIndex) {
        monthString = switch (monthIndex) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> "Недействительный месяц";
        };
        return monthString;
    }

    public static String getTranslationForDayOfWeek(String ru) {
        String en;
        if (ru.equalsIgnoreCase("понедельник")) {
            en = "Monday";
        } else if (ru.equalsIgnoreCase("вторник")) {
            en = "Tuesday";
        } else if (ru.equalsIgnoreCase("среда")) {
            en = "Wednesday";
        } else if (ru.equalsIgnoreCase("четверг")) {
            en = "Thursday";
        } else if (ru.equalsIgnoreCase("пятница")) {
            en = "Friday";
        } else if (ru.equalsIgnoreCase("суббота")) {
            en = "Saturday";
        } else if (ru.equalsIgnoreCase("воскресенье")) {
            en = "Sunday";
        } else {
            en = "Недействительный день недели";
        }

        return en;

    }

}


enum MonthEnum {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}