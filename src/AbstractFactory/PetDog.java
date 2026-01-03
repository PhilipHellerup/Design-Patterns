package AbstractFactory; // Project Organization

/* --- PetDog Class --- */
// Concrete Dog product belonging to the Pet family.
public class PetDog implements Dog {
    // # Methods
    // Displays behavior specific to a pet dog
    @Override
    public void displayBehavior() {
        System.out.println("Pet dog barks happily");
    }
}
