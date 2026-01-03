package Adapter; // Project Organization

/* --- LegacyPaymentSystem Class --- */
// Adaptee class.
// Represents an existing or legacy system with
// an incompatible interface.
public class LegacyPaymentSystem {
    // # Methods
    // Processes a payment using cents instead of dollars
    public void makePayment(int cents) {
        System.out.println("Paid " + cents + " cents using legacy system");
    }
}
