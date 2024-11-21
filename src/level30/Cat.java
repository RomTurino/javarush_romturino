package level30;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Cat{
    public String name;
    public int age;
    public int weight;

    public Cat(String name, int age, int weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat() {

    }

    public void save(PrintWriter writer) throws Exception{
        writer.println(name);
        writer.println(age);
        writer.println(weight);
        writer.flush();
    }

    public void load(BufferedReader reader) throws IOException {
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }

    public String toString(){
        return name + " " + age + " " + weight;
    }
}