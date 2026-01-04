package Strategy; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Strategy Pattern.
// The client selects and swaps strategies
// at runtime.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create the context
        ShoppingCart cart = new ShoppingCart();

        // Select and use Credit Card strategy
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);

        // Swap to PayPal strategy
        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(200);

        // Swap to Cryptocurrency strategy
        cart.setPaymentStrategy(new CryptoPayment());
        cart.checkout(300);
    }
}
