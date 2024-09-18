package level11;

import java.util.Objects;

public class Iphone {
    private String model;
    private String color;
    private int price;


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public Iphone(String model, String color, int price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Iphone iphone)) return false;
        return price == iphone.price && Objects.equals(model, iphone.model) && Objects.equals(color, iphone.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, price);
    }
    //напишите тут ваш код

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}