package Strategy; // Project Organization

/* --- Strategy Interface --- */
// Strategy interface.
// Declares the algorithm that concrete
// strategies must implement.
public interface PaymentStrategy {
    // # Methods
    // Executes the payment algorithm
    void pay(int amount);
}
