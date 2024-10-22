package level25;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static{
        String line;
        try (FileReader fr = new FileReader(Statics.FILE_NAME);
             BufferedReader br = new BufferedReader(fr)
        ){
            while ((line = br.readLine()) != null){
                lines.add(line);
            }



        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}