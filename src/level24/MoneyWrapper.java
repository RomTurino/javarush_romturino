package level24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MoneyWrapper {
    public static List<Exception> exceptions = new ArrayList<Exception>();
    public static void main(String[] args) {
        initExceptions();

        for (Exception e : exceptions) {
            System.out.println(e);
        }
        Person ivan  = new Person("Иван");
        ArrayList<Money> moneyList = new ArrayList<>();
        moneyList.add(new Hryvnia(100));
        moneyList.add(new Ruble(100));
        moneyList.add(new USD(100));
        ivan.setAllMoney(moneyList);
        for (Money money : ivan.getAllMoney()) {
            System.out.println(ivan.name + " имеет заначку в размере " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    private static void initExceptions() {
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
        exceptions.add(new NoSuchElementException());
        exceptions.add(new IllegalStateException());
        exceptions.add(new NullPointerException());
        exceptions.add(new IllegalArgumentException());
        exceptions.add(new IndexOutOfBoundsException());
        exceptions.add(new UnsupportedOperationException());
        exceptions.add(new ClassCastException());
        exceptions.add(new NumberFormatException());
        exceptions.add(new ArithmeticException());
        exceptions.add(new ArrayStoreException());
    }

    static class Person {
        public String  name;

        public Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
        }

        private List<Money> allMoney;

        public void setAllMoney(List<Money> allMoney) {
            this.allMoney = allMoney;
        }

        public List<Money> getAllMoney() {
            return allMoney;
        }


    }
}
