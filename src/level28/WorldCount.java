package level28;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorldCount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        try (BufferedReader freader = new BufferedReader((new FileReader(fileName)))) {
            int count = 0;
            String line;
            while ((line = freader.readLine()) != null){
                if (line.contains("world")){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
