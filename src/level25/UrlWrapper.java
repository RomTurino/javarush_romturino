package level25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class UrlWrapper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        int indexLast = url.lastIndexOf("?");
        String[] params = url.substring(indexLast + 1).split("&");
        System.out.println(Arrays.toString(params));
        String obj;
        boolean isObject = false;
        String res = "";
        for (String param : params) {
            obj = param.split("=")[0];
            System.out.print(obj + " ");
            if (obj.equals("obj")) {
                isObject = true;
                res = param.split("=")[1];
            }
        }
        System.out.println();
        if  (isObject) {
            try{
                double value = Double.parseDouble(res);
                alert(value);
            } catch (Exception e) {
                alert(res);
            }
        }

    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

}
