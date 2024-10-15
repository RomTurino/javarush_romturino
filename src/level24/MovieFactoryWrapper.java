package level24;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class MovieFactoryWrapper {
    public static void main(String[] args) throws Exception {
        //ввести с консоли несколько ключей (строк), пункт 7
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> availableKeys = Arrays.asList("cartoon", "thriller", "soapOpera");
        String key;
        do{
            key = reader.readLine();
            Movie movie = MovieFactory.getMovie(key);
            System.out.println(movie.getClass().getSimpleName());
        } while (availableKeys.contains(key));


    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;


            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }
            else if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }
            else if ("thriller".equals(key)) {
                movie = new Thriller();
            }


            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie {

    }

    static class Thriller extends Movie {

    }
}
