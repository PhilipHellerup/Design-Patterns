package Visitor; // Project Organization

/* --- TableElement Class --- */
// Concrete Element.
// Represents a table component in the document.
public class TableElement implements DocumentElement {
    // # Attributes
    // Number of rows
    private final int rows;

    // Number of columns
    private final int cols;

    // # Constructor
    public TableElement(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
    }

    // # Accessors
    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    // # Visitor Handling
    // Accepts a visitor and performs
    // double dispatch by passing itself
    @Override
    public void accept(DocumentVisitor visitor) {
        visitor.visit(this);
    }
}
