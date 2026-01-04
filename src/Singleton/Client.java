package Singleton; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Singleton Pattern.
// The client retrieves the Logger instance
// via the static access method.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Retrieve the singleton instance
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Configure the logger
        logger1.setLevel(1);

        // Use the logger
        logger2.log("Application started");

        // Verify both references point to the same instance
        System.out.println(logger1 == logger2); // true
    }
}
