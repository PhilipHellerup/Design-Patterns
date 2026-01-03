package FactoryMethod; // Project Organization

/* --- Cat Class --- */
// Concrete product representing a Cat.
public class Cat implements Animal {
    // # Methods
    // Displays the behavior specific to a Cat
    @Override
    public void displayBehavior() {
        System.out.println("Cat meows");
    }
}
