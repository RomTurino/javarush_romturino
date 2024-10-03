package level16;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesTry {
    public static void main(String[] args) throws IOException {
//        try (var paths = Files.newDirectoryStream(Path.of("src/level16"))){
//            Files.delete(Path.of("src/level16/text.txt"));
//            for (var path : paths){
//                System.out.println(path);
//            }
//        } catch (IOException e){
//            System.out.println("Error");
//        }
        URL url0 = new URL("https://javarush.com");
        InputStream inputStream = url0.openStream();
        byte[] buffer = inputStream.readAllBytes();
        String str = new String(buffer);
        System.out.println(str);

        URL url = new URL("https://javarush.com");
        URLConnection connection = url.openConnection();

// отправляем данные
        try (OutputStream output = connection.getOutputStream();
             PrintStream sender = new PrintStream(output))
        {
            sender.println("Привет");
        }

// читаем данные
        try(InputStream input = connection.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input)))
        {
            while (reader.ready())
                System.out.println(reader.readLine());
        }


        String image =  "https://i.ytimg.com/vi/36tTCGcSeWw/maxresdefault.jpg";
        URL url1 = new URL(image);
        InputStream input = url1.openStream();

        Path path = Path.of("src/level16/about_java.jpg");
        if (!Files.exists(path))
            Files.copy(input, path);



    }
}
