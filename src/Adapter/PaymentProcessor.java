package Adapter; // Project Organization

/* --- PaymentProcessor Interface --- */
// Target interface.
// Defines the interface expected by the client.
public interface PaymentProcessor {
    // # Methods
    // Processes a payment in dollars
    void pay(double amount);
}
