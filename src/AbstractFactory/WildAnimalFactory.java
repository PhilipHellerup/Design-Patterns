package AbstractFactory; // Project Organization

/* --- WildAnimalFactory Class --- */
// Concrete factory that creates Wild animal products.
public class WildAnimalFactory implements AnimalFactory {
    // # Factory Methods
    @Override
    public Dog createDog() {
        return new Wolf();
    }

    @Override
    public Cat createCat() {
        return new Tiger();
    }
}
