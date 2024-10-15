package level24;

public class Solution {
    public static void main(String[] args) {
//        Object obj = new Tiger();
//        Animal animal = (Animal) obj;
//        Cat cat = (Cat) obj;
//        Tiger tiger = (Tiger) animal;
//        Tiger tiger2 = (Tiger) cat;
        Carnivore tiger = new Tiger();
        System.out.println(tiger instanceof  Cat);
//        tiger.doAnimalActions();
        tiger.eat();
//        tiger.doCatActions();
//        tiger.doTigerActions();

    }

    interface Carnivore {
        default void eat() {
            System.out.println("Carnivore");
        }
    }

    static class Animal {
        public void doAnimalActions() {
            System.out.println("Animal");
        }
    }

    static class Cat extends Animal {
        public void doCatActions() {
            System.out.println("Cat");
        }
    }

    static class Tiger extends Cat  implements Carnivore{
        public void doTigerActions() {
            System.out.println("Tiger");
        }

        public void doAnimalActions() {
            System.out.println("Animal was overridden");
        }

    }
}

