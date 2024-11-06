package level27;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Prices {
    public static class Reader {
        String fileName;
        FileReader fr;

        public Reader(String fileName) {
            this.fileName = fileName;
            try {
                fr = new FileReader(fileName);
            } catch (Exception _) {
            }
        }

        public List<String> readLines() {
            List<String> lines = new ArrayList<String>();
            try (BufferedReader br = new BufferedReader(fr)) {
                String line;
                while ((line = br.readLine()) != null) {
                    lines.add(line);
                }
            } catch (Exception _) {
            }
            return lines;
        }

        public int getId() {
            List<String> lines = readLines();
            int max = 0;
            int id = 0;
            for (String line : lines) {
                id = Integer.parseInt(line.substring(0, 8).trim());
                if (id > max) {
                    max = id;
                }
            }
            return max;
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please input command");
            return;
        }
        String command = args[0];
        String fileName = "";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Reader reader = new Reader(fileName);
        int id = reader.getId();
        String productName = args[1].length() > 30 ? args[1].substring(0, 30) : args[1];
        String price = args[2].length() > 8 ? args[2].substring(0, 8) : args[2];
        String quantity = args[3].length() > 4 ? args[3].substring(0, 4) : args[3];

        List<String> content = reader.readLines();
        content.add(String.format("\n%08d%-30s%-8s%-4s", id + 1, productName, price, quantity));
        try (FileWriter fw = new FileWriter(fileName, true)) {
            for (String line : content) {
                fw.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
