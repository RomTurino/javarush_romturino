package level28;

import java.io.*;

public class NumbersFromTheInside {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = br.readLine();
        String fileName2 = br.readLine();
        try (BufferedReader fr = new BufferedReader(new FileReader(fileName1));
             BufferedWriter fw = new BufferedWriter(new FileWriter(fileName2))) {
            String line;

            while ((line = fr.readLine()) != null) {
                String[] numbers = line.split(" ");
                for (String sign : numbers) {
                    if (sign.matches("\\d+")){
                        fw.write(sign + " ");
                    }
                }
            }
        }
    }
}
