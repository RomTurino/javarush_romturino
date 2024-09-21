package level12;

public class Car {
    public Engine engine = new Engine();
    class Engine {
        private boolean isRunning;
        public void start() {
            isRunning = true;
        }
        public void stop() {
            isRunning = false;
        }
    }
}
