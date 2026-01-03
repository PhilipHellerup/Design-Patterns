package FactoryMethod; // Project Organization

/* --- AnimalFactory Class --- */
// Abstract factory class.
// Declares the factory method that subclasses must implement.
public abstract class AnimalFactory {
    // # Factory Method
    // Creates and returns an Animal.
    // Subclasses decide which concrete Animal to instantiate.
    protected abstract Animal createAnimal();

    // # Methods
    // Common business logic using the factory method
    public void displayAnimalBehavior() {
        Animal animal = createAnimal();
        animal.displayBehavior();
    }
}
