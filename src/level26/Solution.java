package level26;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
        threads.get(1).start();
        Thread.sleep(500);
        threads.get(1).interrupt();

    }

    public static class Thread1 extends Thread {
        public void run() {
            while (true) {

            }
        }
    }

    public static class Thread2 extends Thread {
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        public void run() {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException _) {
                }

            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        public void showWarning() {
            if (Thread.currentThread().isAlive())
                Thread.currentThread().interrupt();
        }


        public void run() {
            while (!isInterrupted()) {
            }


        }
    }

    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;
            try {
                while (true) {
                    String s = br.readLine();
                    if (s.equals("N")) {
                        break;
                    }
                    int n = Integer.parseInt(s);
                    sum += n;
                }
                System.out.println(sum);

            } catch (IOException e) {
                System.out.println(sum);
            }
        }
    }
}
