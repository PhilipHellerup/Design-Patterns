package Strategy; // Project Organization

/* --- CreditCardPayment Class --- */
// Concrete Strategy.
// Implements the payment algorithm
// using a credit card.
public class CreditCardPayment implements PaymentStrategy {
    // # Methods
    // Processes payment via credit card
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}
