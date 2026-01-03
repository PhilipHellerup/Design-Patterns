package Decorator; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Decorator Pattern.
// The client works only with the Beverage interface
// and is unaware of concrete decorators.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create a base beverage
        Beverage order = new Coffee();

        // Dynamically add features by wrapping
        order = new MilkDecorator(order);
        order = new SugarDecorator(order);

        // Use the decorated object
        System.out.println(order.getDescription());
        System.out.println("Total: " + order.cost());
    }
}
