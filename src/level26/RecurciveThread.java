package level26;

public class RecurciveThread {
    static int count = 15;
    static volatile int createdThreadCount;

    public static void main(String[] args) {
        System.out.println(new GenerateThread());

    }

    public static class GenerateThread extends Thread {
        public GenerateThread() {
            super("" + ++createdThreadCount);
            start();

        }

        @Override
        public String toString() {
            return getName() + " created";
        }

        @Override
        public void run() {
            if (createdThreadCount < count) {
                System.out.println(new GenerateThread());
            }
        }
    }
}
