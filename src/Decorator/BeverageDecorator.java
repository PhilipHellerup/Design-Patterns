package Decorator; // Project Organization

/* --- BeverageDecorator Class --- */
// Abstract Decorator.
// Implements the Beverage interface and
// wraps another Beverage object.
public abstract class BeverageDecorator implements Beverage {
    // # Attributes
    // Wrapped component
    protected final Beverage beverage;

    // # Constructor
    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }
}
