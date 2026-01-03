package Adapter; // Project Organization

/* --- PaymentAdapter Class --- */
// Adapter class.
// Implements the Target interface and
// translates client requests to the Adaptee.
public class PaymentAdapter implements PaymentProcessor {
    // # Attributes
    // Wrapped legacy system
    private final LegacyPaymentSystem legacySystem;

    // # Constructor
    public PaymentAdapter(LegacyPaymentSystem legacySystem) {
        this.legacySystem = legacySystem;
    }

    // # Methods
    // Adapts the pay() call to the legacy makePayment() method
    @Override
    public void pay(double amount) {
        // Convert dollars to cents
        int cents = (int) (amount * 100);

        // Delegate the call to the legacy system
        legacySystem.makePayment(cents);
    }
}
