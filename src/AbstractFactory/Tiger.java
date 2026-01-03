package AbstractFactory; // Project Organization

/* --- Tiger Class --- */
// Concrete Cat product belonging to the Wild family.
public class Tiger implements Cat {
    // # Methods
    // Displays behavior specific to a wild cat (tiger)
    @Override
    public void displayBehavior() {
        System.out.println("Tiger roars");
    }
}
