package level16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class GetByAPI {
    public static void main(String[] args) throws IOException{
        URL url = new URL("http://httpbin.org/post");
        URLConnection conn = url.openConnection();
        conn.setDoOutput(true);
        try (OutputStream os = conn.getOutputStream();
            PrintStream sender = new PrintStream(os);) {

            sender.println("My name is Roman");
        }

        try (InputStream is = conn.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is));) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        }
    }
}
