package Singleton; // Project Organization

/* --- Logger Class --- */
// Singleton class.
// Ensures that only one Logger instance
// exists throughout the application.
public class Logger {
    // # Attributes
    // Holds the single instance of Logger
    private static Logger instance;

    // Example internal state (logging level)
    private int level = 0;

    // # Constructor
    // Private constructor prevents external instantiation
    private Logger() {
        // Initialization logic (if needed)
    }

    // # Singleton Access
    // Provides global access to the single Logger instance
    public static Logger getInstance() {
        // Lazy initialization:
        // Create the instance only on the first request
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // # Business Logic
    // Logs a message depending on the current logging level
    public void log(String message) {
        if (this.level > 0) {
            System.out.println("Log: " + message);
        }
    }

    // Updates the logging level
    public void setLevel(int level) {
        this.level = level;
    }
}
