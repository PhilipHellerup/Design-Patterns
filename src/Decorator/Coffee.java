package Decorator; // Project Organization

/* --- Coffee Class --- */
// Concrete Component.
// Represents the base object that can be decorated.
public class Coffee implements Beverage {
    // # Methods
    // Returns the base description
    @Override
    public String getDescription() {
        return "Coffee";
    }

    // Returns the base cost
    @Override
    public double cost() {
        return 20.0;
    }
}
