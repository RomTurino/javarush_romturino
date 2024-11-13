package level28;

import java.io.*;
import java.util.regex.Pattern;

public class CharChange {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        br.close();
        try (BufferedReader fr = new BufferedReader(new FileReader(fileName1));
             BufferedWriter fw = new BufferedWriter(new FileWriter(fileName2))) {
            String line;

            while ((line = fr.readLine()) != null) {
//                line = line.replaceAll("\\W","");
                // Убрать все знаки препинания и переноса строки
                line = line.replaceAll("[\\p{Punct}]", "");
                line = line.replaceAll("[\\n]", "");
                fw.write(line);

            }
        }

    }
}
