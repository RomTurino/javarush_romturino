package level30;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Human {
    public Cat cat;

    public void save(PrintWriter writer) throws Exception {
        String isCatPresent = cat != null ? "yes" : "no";
        writer.println(isCatPresent);
        writer.flush();

        if (cat != null) {
            cat.save(writer);
        }
    }
    public void load(BufferedReader reader) throws Exception {
        String isCatPresent = reader.readLine();
        if (isCatPresent.equals("yes")) {
            cat = new Cat();
            cat.load(reader);
        }

    }
}
