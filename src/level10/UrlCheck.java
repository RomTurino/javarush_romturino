package level10;

public class UrlCheck {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш код
        if (url.matches("https?.*")){
            int protocol = url.indexOf("//");
            return url.substring(0, protocol-1);
        }
        return "неизвестный";


    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        if (url.matches(".*\\.(ru|com|org|net)\b?")){
            int start = url.indexOf(".");
            return url.substring(start + 1);
        }
        return "неизвестный";
    }
}
