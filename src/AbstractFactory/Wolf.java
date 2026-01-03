package AbstractFactory; // Project Organization

/* --- Wolf Class --- */
// Concrete Dog product belonging to the Wild family.
public class Wolf implements Dog {
    // # Methods
    // Displays behavior specific to a wild dog (wolf)
    @Override
    public void displayBehavior() {
        System.out.println("Wolf howls");
    }
}
