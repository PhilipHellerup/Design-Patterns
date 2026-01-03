package SimpleFactory; // Project Organization

/* --- AnimalFactory Class --- */
// Centralizes the creation logic for Animal objects.
// Decides which concrete Animal implementation to instantiate
// based on the provided AnimalType.
public class AnimalFactory{
    // # Methods
    // Creates and returns an Animal based on the given type
    /** @param type the type of animal to create **/
    /** @return a concrete Animal implementation **/
    /** @throws IllegalArgumentException if the animal type is unknown **/
    public Animal createAnimal(AnimalType type) {
        // Create and return an Animal based on the given type
        return switch (type) {
            case DOG -> new Dog();
            case CAT -> new Cat();
            default -> throw new IllegalArgumentException("Unknown Animal Type");
        };
    }
}
