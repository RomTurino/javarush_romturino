package level10;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Tokenizer {
    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath,"\\.");
        System.out.println(Arrays.toString(tokens));
    }

    public static String[] getTokens(String query, String delimiter){
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        String[] result = new String[tokenizer.countTokens()];
        int i = 0;
        while(tokenizer.hasMoreTokens()){
            result[i++] = tokenizer.nextToken();
        }
        return result;
    }
}
