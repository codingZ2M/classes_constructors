package creational.design.patterns.singleton.pattern;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Starting app...");
        logger2.log("Running module...");

        // Both loggers point to the same instance
        System.out.println(logger1 == logger2); // true
    }
}