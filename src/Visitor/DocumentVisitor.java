package Visitor; // Project Organization

/* --- Visitor Interface --- */
// Visitor interface.
// Declares visit methods for each concrete
// element type in the object structure.
public interface DocumentVisitor {
    // # Visit Operations
    // Visit a TextElement
    void visit(TextElement text);

    // Visit an ImageElement
    void visit(ImageElement image);

    // Visit a TableElement
    void visit(TableElement table);
}
