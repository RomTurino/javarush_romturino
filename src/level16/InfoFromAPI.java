package level16;



import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InfoFromAPI {
    public static void main(String[] args) throws IOException {
        URL url = new URL("https://javarush.com/api/1.0/rest/projects");
        InputStream is = url.openStream();
        byte[] buffer = is.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);

    }
}