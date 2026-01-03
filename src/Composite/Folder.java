package Composite; // Project Organization

/* --- Imports --- */
import java.util.ArrayList;
import java.util.List;

/* --- Folder Class --- */
// Composite class.
// Represents a group of FileSystemComponent objects.
// Can contain both Files and other Folders.
public class Folder implements FileSystemComponent {
    // # Attributes
    private final String name;
    private final List<FileSystemComponent> children = new ArrayList<>();

    // # Constructor
    public Folder(String name) {
        this.name = name;
    }

    // # Methods
    // Adds a component to the folder
    public void add(FileSystemComponent component) {
        children.add(component);
    }

    // Removes a component from the folder
    public void remove(FileSystemComponent component) {
        children.remove(component);
    }

    // Displays folder details and delegates
    // the call to all child components
    @Override
    public void showDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : children) {
            component.showDetails();
        }
    }
}
