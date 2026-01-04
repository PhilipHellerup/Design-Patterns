package Strategy; // Project Organization

/* --- PayPalPayment Class --- */
// Concrete Strategy.
// Implements the payment algorithm
// using PayPal.
public class PayPalPayment implements PaymentStrategy {
    // # Methods
    // Processes payment via PayPal
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}
