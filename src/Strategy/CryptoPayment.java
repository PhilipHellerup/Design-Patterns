package Strategy; // Project Organization

/* --- CryptoPayment Class --- */
// Concrete Strategy.
// Implements the payment algorithm
// using cryptocurrency.
public class CryptoPayment implements PaymentStrategy {
    // # Methods
    // Processes payment via cryptocurrency
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Cryptocurrency");
    }
}
