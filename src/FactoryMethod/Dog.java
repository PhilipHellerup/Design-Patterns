package FactoryMethod; // Project Organization

/* --- Dog Class --- */
// Concrete product representing a Dog.
public class Dog implements Animal {
    // # Methods
    // Displays the behavior specific to a Dog
    @Override
    public void displayBehavior() {
        System.out.println("Dog barks");
    }
}
