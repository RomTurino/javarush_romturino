package level11;

/*
Жажда скорости
*/

public class NeedForSpeed{
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public NeedForSpeed(String model, int year, String color) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public NeedForSpeed(String model, int year) {
        //напишите тут ваш код
        this.model = model;
        this.year = year;
        this.color = "Оранжевый";
    }

    public NeedForSpeed(String model) {
        //напишите тут ваш код
        this.model = model;
        this.year = 4321;
        this.color = "Оранжевый";
    }
}
