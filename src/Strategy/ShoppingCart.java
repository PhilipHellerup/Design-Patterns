package Strategy; // Project Organization

/* --- ShoppingCart Class --- */
// Context class.
// Maintains a reference to a Strategy
// and delegates payment behavior to it.
public class ShoppingCart {
    // # Attributes
    // Current payment strategy
    private PaymentStrategy paymentStrategy;

    // # Strategy Configuration
    // Allows changing the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // # Business Logic
    // Delegates payment processing to the strategy
    public void checkout(int amount) {
        paymentStrategy.pay(amount);
    }
}
