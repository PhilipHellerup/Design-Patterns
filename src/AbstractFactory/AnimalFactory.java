package AbstractFactory; // Project Organization

/* --- AnimalFactory Interface --- */
// Abstract factory interface.
// Declares methods for creating a family of related products.
public interface AnimalFactory {
    // # Factory Methods
    // Creates a Dog belonging to the factory's family
    Dog createDog();

    // Creates a Cat belonging to the factory's family
    Cat createCat();
}
