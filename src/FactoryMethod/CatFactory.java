package FactoryMethod; // Project Organization

/* --- CatFactory Class --- */
// Concrete factory responsible for creating Cat objects.
public class CatFactory extends AnimalFactory {
    // # Factory Method Implementation
    @Override
    protected Animal createAnimal() {
        return new Cat();
    }
}
