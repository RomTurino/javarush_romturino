package level27;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

public class MaxByte {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        FileInputStream fis = new FileInputStream(filename);
        HashMap<Byte, Integer> map = new HashMap<>();
        while (fis.available() > 0) {
            byte b = (byte) fis.read();
            map.put(b, map.getOrDefault(b, 0) + 1);
        }
        int min = Integer.MAX_VALUE;
        for (int value: map.values()) {
            if (value < min) {
                min = value;
            }
        }
        for (byte b : map.keySet()) {
            if (map.get(b) == min){
                System.out.print(b + " ");
            }
        }
        fis.close();
        reader.close();


    }
}
