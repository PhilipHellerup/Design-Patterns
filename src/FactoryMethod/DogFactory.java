package FactoryMethod; // Project Organization

/* --- DogFactory Class --- */
// Concrete factory responsible for creating Dog objects.
public class DogFactory extends AnimalFactory {
    // # Factory Method Implementation
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
