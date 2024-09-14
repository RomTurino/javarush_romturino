package level10;

public class RenewPath {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int start = path.indexOf("jdk");
        int end = path.indexOf("/", start);
        String old = path.substring(start, end);
        return path.replace(old, jdk);
    }
}
