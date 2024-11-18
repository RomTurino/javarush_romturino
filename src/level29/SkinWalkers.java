package level29;

import java.io.*;

public class SkinWalkers {
    public static void main(String[] args) {
        String filename="";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            filename  = br.readLine();
        } catch (IOException _) {}
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            StringBuffer sb = new StringBuffer();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
                sb.reverse();
                System.out.println(sb.toString());
                sb.setLength(0);
            }
        } catch (IOException _) {}

    }
}
