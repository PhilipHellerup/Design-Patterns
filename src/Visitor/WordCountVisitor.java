package Visitor; // Project Organization

/* --- WordCountVisitor Class --- */
// Concrete Visitor.
// Calculates the total number of words
// across text elements in a document.
public class WordCountVisitor implements DocumentVisitor {
    // # Attributes
    // Accumulated word count
    private int wordCount = 0;

    // # Accessors
    public int getWordCount() {
        return wordCount;
    }

    // # Visit Implementations
    @Override
    public void visit(TextElement text) {
        String trimmed = text.getText().trim();

        if (!trimmed.isEmpty()) {
            wordCount += trimmed.split("\\s+").length;
        }
    }

    @Override
    public void visit(ImageElement image) {
        // Images do not contain words
        // → nothing to count
    }

    @Override
    public void visit(TableElement table) {
        // Tables are ignored for word counting
        // (could be extended if needed)
    }
}
