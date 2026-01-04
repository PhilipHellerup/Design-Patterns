package Visitor; // Project Organization

/* --- ImageElement Class --- */
// Concrete Element.
// Represents an image component in the document.
public class ImageElement implements DocumentElement {
    // # Attributes
    // Image file name or path
    private final String filename;

    // # Constructor
    public ImageElement(String filename) {
        this.filename = filename;
    }

    // # Accessors
    // Exposes image filename for visitors
    public String getFilename() {
        return filename;
    }

    // # Visitor Handling
    // Accepts a visitor and performs
    // double dispatch by passing itself
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
