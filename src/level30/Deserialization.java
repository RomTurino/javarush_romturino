package level30;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/*
Десериализация
*/

public class Deserialization{
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {
        try {
            return (A) objectStream.readObject();
        }
        catch (ClassCastException e) {
            return null;
        }
    }

    public class A implements Serializable{
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}