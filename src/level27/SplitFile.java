package level27;

import java.io.*;


public class SplitFile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream fis1 = new FileInputStream(fileName1);
        FileOutputStream fis2 = new FileOutputStream(fileName2);
        FileOutputStream fis3 = new FileOutputStream(fileName3);
        byte[] buffer = new byte[fis1.available()];
        int bytesRead = fis1.read(buffer);

        int middle = (bytesRead + 1) / 2;
        fis2.write(buffer, 0, middle);
        fis3.write(buffer, middle, bytesRead - middle);

        reader.close();
        fis1.close();
        fis2.close();
        fis3.close();
    }
}
