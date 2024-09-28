package level14;

public class Solution {
    public static void main(String[] args) {
        StringLinkedList stringLinkedList = new StringLinkedList();
        stringLinkedList.add("1");
        stringLinkedList.add("2");
        stringLinkedList.add("3");
        stringLinkedList.add("4");
        stringLinkedList.add("5");
        stringLinkedList.add("6");
        stringLinkedList.add("7");
        stringLinkedList.add("8");
        stringLinkedList.add("9");


        System.out.println(stringLinkedList.get(0));
        System.out.println(stringLinkedList.get(2));
        System.out.println(stringLinkedList.get(4));
        System.out.println(stringLinkedList.get(5));

        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.DECEMBER));


        int temperature = 22;
        switch (temperature) {
            case 20:
                System.out.println("It's ok");
            case 21:
                System.out.println("It's hot");
            case 22:
                System.out.println("It's hotter");
        }

    }

    public static Month getNextMonth(Month month) {
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
//        for (int i = 0; i < Month.values().length; i++){
//            if (Month.values()[i] == month){
//                Month nextMonth = Month.values()[i + 1];
//                if (nextMonth.ordinal() == 11){
//                    return Month.JANUARY;
//                }
//                return nextMonth;
//            }
//        }
//        return null;
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        String shape = switch (countOfCorner) {
            case 3 -> "Треугольник";
            case 4 -> "Четырехугольник";
            case 5 -> "Пятиугольник";
            case 6 -> "Шестиугольник";
            case 7 -> "Семиугольник";
            case 8 -> "Восьмиугольник";
            default -> "Другая фигура";
        };
        return shape;
    }
}

