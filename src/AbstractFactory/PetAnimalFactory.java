package AbstractFactory; // Project Organization

/* --- PetAnimalFactory Class --- */
// Concrete factory that creates Pet animal products.
public class PetAnimalFactory implements AnimalFactory {
    // # Factory Methods
    @Override
    public Dog createDog() {
        return new PetDog();
    }

    @Override
    public Cat createCat() {
        return new PetCat();
    }
}
