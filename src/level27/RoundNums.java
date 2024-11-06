package level27;


import java.io.*;
import java.util.ArrayList;

public class RoundNums {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();

        try (BufferedReader br1 = new BufferedReader(new FileReader(filename1));
             BufferedWriter bw1 = new BufferedWriter(new FileWriter(filename2))) {
            ArrayList<Integer> list = new ArrayList<>();
            while (br1.ready()) {
                String line = br1.readLine();
                String[] nums = line.split(" ");
                for (String num : nums) {
                    double d = Double.parseDouble(num);
                    bw1.write((int) Math.round(d) + " ");
                }
            }

        } catch (IOException _) {}
    }
}
