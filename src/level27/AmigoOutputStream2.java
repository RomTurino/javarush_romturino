package level27;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
AmigoOutputStream
*/

public class AmigoOutputStream2 extends FileOutputStream{
    public static String fileName = "C:/tmp/result.txt";
    private final FileOutputStream fileOutputStream;

    public void write(int i) throws IOException {
        fileOutputStream.write(i);
    }
    public void write(byte[] b) throws IOException {
        fileOutputStream.write(b);
    }
    public void write(byte[] b, int off, int len) throws IOException {
        fileOutputStream.write(b, off, len);
    }
    public void write(String s) throws IOException {
        fileOutputStream.write(s.getBytes());
    }
    public void write(String s, int off, int len) throws IOException {
        fileOutputStream.write(s.getBytes(), off, len);
    }


    public void flush() throws IOException {
        fileOutputStream.flush();
    }

    public void close() throws IOException {
        flush();
        String endFile = "JavaRush © All rights reserved.";
        fileOutputStream.write(endFile.getBytes());
        fileOutputStream.close();
    }

    public AmigoOutputStream2(FileOutputStream fileOutputStream) throws FileNotFoundException {
        super(fileName);
        this.fileOutputStream = fileOutputStream;
    }

    public static void main(String[] args) throws FileNotFoundException {
        new AmigoOutputStream2(new FileOutputStream(fileName));
    }

}