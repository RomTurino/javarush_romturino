package level26;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Последовательный вывод файлов
*/

public class FileWork{
    public static String firstFileName;
    public static String secondFileName;

    //напишите тут ваш код
    static {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = br.readLine();
            secondFileName = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //напишите тут ваш код
    public static class ReadFileThread extends Thread implements ReadFileInterface {
        private String fileName;
        private String fileContent;

        public String getFileName() {
            return fileName;
        }

        @Override
        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public String getFileContent() {
            return fileContent;
        }

        public void setFileContent(String fileContent) {
            this.fileContent = fileContent;
        }

        public void run(){
            StringBuilder sb = new StringBuilder();
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
                while (br.ready()) {
                    sb.append(br.readLine()).append(" ");
                }
                setFileContent(sb.toString());


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
