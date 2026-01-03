package SimpleFactory; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Simple Factory Pattern.
// The client requests an Animal from the AnimalFactory
// without knowing which concrete class is instantiated.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create the factory responsible for object creation
        AnimalFactory factory = new AnimalFactory();

        // Request an Animal from the factory
        Animal animal = factory.createAnimal(AnimalType.DOG);

        // Use the returned Animal polymorphically
        animal.displayBehavior();
    }
}
