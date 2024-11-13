package level28;

import java.io.*;

public class EvenBytes {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        try (FileReader fileReader = new FileReader(fileName1);
             FileWriter fileWriter = new FileWriter(fileName2);){
            int count = 0;
            while (fileReader.ready()){
                int b = fileReader.read();
                if (count % 2 == 0){
                    fileWriter.write(b);
                }
                count++;
            }
        }

    }
}
