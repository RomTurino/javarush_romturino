package level27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class SecretCode {
    public static void main(String[] args) throws IOException {
        String key = args[0];
        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);
        while (in.available() > 0){
            if (key.equals("-e")){
                out.write(in.read() + 32);

            }else{
                out.write(in.read() - 32);
            }
        }

        in.close();
        out.close();

    }


}
