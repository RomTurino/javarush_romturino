package level30;


import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Serializable Solution
*/

public class Solution implements Serializable{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fileOutputStream = new FileOutputStream("solution.dat");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
        Solution savedObject = new Solution(4);
        outputStream.writeObject(savedObject);
        outputStream.close();
        FileInputStream fileInputStream = new FileInputStream("solution.dat");
        ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
        Solution loadedObject = (Solution) inputStream.readObject();
        System.out.println(loadedObject.toString().equals(savedObject.toString()));
        inputStream.close();
    }

    private transient final String pattern = "dd MMMM yyyy, EEEE";
    private transient Date currentDate;
    private transient int temperature;
    String string;

    public Solution(int temperature) {
        this.currentDate = new Date();
        this.temperature = temperature;

        string = "Today is %s, and the current temperature is %s C";
        SimpleDateFormat format = new SimpleDateFormat(pattern);
        this.string = String.format(string, format.format(currentDate), temperature);
    }

    @Override
    public String toString() {
        return this.string;
    }
}