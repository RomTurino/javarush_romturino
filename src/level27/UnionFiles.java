package level27;

import java.io.*;


public class UnionFiles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = br.readLine();
        String filename2 = br.readLine();
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(filename1)){
            while (fr.ready()) {
                sb.append((char) fr.read());
            }
        } catch (IOException _) {}
        try (FileWriter fw = new FileWriter(filename1);
             FileReader fr = new FileReader(filename2)){
            while (fr.ready()) {
                fw.write((char) fr.read());
            }
            for (int i = 0; i < sb.length(); i++) {
                fw.write(sb.charAt(i));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(filename1);
             FileInputStream fileInputStream2 = new FileInputStream(filename2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(filename1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
