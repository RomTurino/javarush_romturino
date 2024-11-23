package level30;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/*
Знакомство с properties
*/

public class PropertiesReader{

    public static Map<String, String> runtimeStorage = new HashMap<>();

    static {
        runtimeStorage.put("key1", "value1");
        runtimeStorage.put("key2", "value2");
        runtimeStorage.put("key3", "value3");
    }

    public static void save(OutputStream outputStream) throws Exception {
        //напишите тут ваш код
        Properties properties = new Properties();
        for (String key: runtimeStorage.keySet()) {
            properties.setProperty(key, runtimeStorage.get(key));
        }
        properties.store(outputStream, null);
    }

    public static void load(InputStream inputStream) throws IOException {
        //напишите тут ваш код
        Properties properties = new Properties();
        properties.load(inputStream);
        for (String key: properties.stringPropertyNames()) {
            runtimeStorage.put(key, properties.getProperty(key));
        }
    }

    public static void main(String[] args) {
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//             FileInputStream fos = new FileInputStream(reader.readLine())) {
//            load(fos);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
              FileOutputStream fos = new FileOutputStream(reader.readLine())) {
            save(fos);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println(runtimeStorage);
    }
}
