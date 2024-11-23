package level30;

import java.io.*;

/*
Externalizable для апартаментов
*/

public class ExtApartments{

    public static class Apartment  implements Externalizable{

        private String address;
        private int year;

        /**
         * Mandatory public no-arg constructor.
         */
        public Apartment() {
            super();
        }

        public Apartment(String addr, int y) {
            address = addr;
            year = y;
        }

        /**
         * Prints out the fields used for testing!
         */
        public String toString() {
            return ("Address: " + address + "\n" + "Year: " + year);
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(address);
            out.writeInt(year);
            out.writeChars(address);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            address = (String) in.readObject();
            year = in.readInt();


        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos =  new FileOutputStream("apartments.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Apartment a = new Apartment("123 Main St.", 1999);
        oos.writeObject(a);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("apartments.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Apartment b = (Apartment) ois.readObject();
        System.out.println(b);
        ois.close();
        fis.close();
    }
}
