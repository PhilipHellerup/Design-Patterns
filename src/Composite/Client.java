package Composite; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Composite Pattern.
// The client treats Files and Folders uniformly
// through the FileSystemComponent interface.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create leaf objects
        FileSystemComponent file1 = new File("resume.pdf");
        FileSystemComponent file2 = new File("photo.jpg");

        // Create a composite object
        Folder documents = new Folder("Documents");
        documents.add(file1);
        documents.add(file2);

        // Create a higher-level composite
        Folder root = new Folder("Root");
        root.add(documents);
        root.add(new File("notes.txt"));

        // Execute operation on the entire hierarchy
        root.showDetails();
    }
}
