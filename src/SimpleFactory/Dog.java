package SimpleFactory; // Project Organization

/* --- Dog Class --- */
// Concrete product representing a Dog.
// Implements the Animal interface.
public class Dog implements Animal {
    // # Methods
    // Displays the behavior specific to a Dog
    @Override
    public void displayBehavior() {
        System.out.println("Dog barks");
    }
}
