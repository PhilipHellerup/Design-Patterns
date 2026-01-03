package Decorator; // Project Organization

/* --- Beverage Interface --- */
// Component interface.
// Declares the common operations for all beverages
// and decorators.
public interface Beverage {
    // # Methods
    // Returns a textual description of the beverage
    String getDescription();

    // Returns the cost of the beverage
    double cost();
}
