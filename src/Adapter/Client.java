package Adapter; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Adapter Pattern.
// The client works only with the Target interface
// and is unaware of the legacy system.
public class Client {

    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create the legacy system
        LegacyPaymentSystem legacySystem = new LegacyPaymentSystem();

        // Wrap the legacy system with an adapter
        PaymentProcessor processor = new PaymentAdapter(legacySystem);

        // Use the adapter through the target interface
        processor.pay(25.50);
    }
}
