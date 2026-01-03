package FactoryMethod; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Factory Method Pattern.
// The client works with the abstract factory and
// does not know which concrete Animal is created.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {

        // Choose a concrete factory at runtime
        AnimalFactory factory = new DogFactory();

        // Use factory logic without knowing the concrete Animal
        factory.displayAnimalBehavior();
    }
}
