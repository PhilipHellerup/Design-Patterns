package AbstractFactory; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Abstract Factory Pattern.
// The client works only with abstract factories and products
// and is unaware of concrete implementations.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Choose a concrete factory (Pet or Wild)
        AnimalFactory factory = new PetAnimalFactory();

        // Create related products from the same factory
        Dog dog = factory.createDog();
        Cat cat = factory.createCat();

        // Use products polymorphically
        dog.displayBehavior();
        cat.displayBehavior();
    }
}
