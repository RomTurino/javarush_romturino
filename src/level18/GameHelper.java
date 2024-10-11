package level18;

import java.io.*;
import java.nio.Buffer;

public class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            inputLine = br.readLine();
            if (inputLine.isEmpty()) {
                return null;
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return inputLine;
    }
}
