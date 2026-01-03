package AbstractFactory; // Project Organization

/* --- PetCat Class --- */
// Concrete Cat product belonging to the Pet family.
public class PetCat implements Cat {
    // # Methods
    // Displays behavior specific to a pet cat
    @Override
    public void displayBehavior() {
        System.out.println("Pet cat purrs");
    }
}
