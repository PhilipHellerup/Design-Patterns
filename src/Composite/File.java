package Composite; // Project Organization

/* --- File Class --- */
// Leaf class.
// Represents an individual object in the hierarchy.
// A File cannot contain other components.
public class File implements FileSystemComponent {
    // # Attributes
    private final String name;

    // # Constructor
    public File(String name) {
        this.name = name;
    }

    // # Methods
    // Displays file-specific details
    @Override
    public void showDetails() {
        System.out.println("File: " + name);
    }
}
