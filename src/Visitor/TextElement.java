package Visitor; // Project Organization

/* --- TextElement Class --- */
// Concrete Element.
// Represents a text component in the document.
public class TextElement implements DocumentElement {
    // # Attributes
    // Text content of the element
    private final String text;

    // # Constructor
    public TextElement(String text) {
        this.text = text;
    }

    // # Accessors
    // Exposes text content for visitors
    public String getText() {
        return text;
    }

    // # Visitor Handling
    // Accepts a visitor and performs
    // double dispatch by passing itself
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
