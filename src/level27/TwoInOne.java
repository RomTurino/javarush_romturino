package level27;

import java.io.*;

public class TwoInOne {
    public static void main(String[] args) {
        String filename1;
        String filename2;
        String filename3;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            filename1 = br.readLine();
            filename2 = br.readLine();
            filename3 = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
       try (FileWriter fw = new FileWriter(filename1, true);
            BufferedReader fr = new BufferedReader(new FileReader(filename2));
            BufferedReader fr2 = new BufferedReader(new FileReader(filename3))){
           String line;
           while ((line = fr.readLine()) != null){
               fw.write(line);
               fw.write("\n");
           }
           while ((line = fr2.readLine()) != null){
               fw.write(line);
               fw.write("\n");
           }

       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }
}
