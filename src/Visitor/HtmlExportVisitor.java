package Visitor; // Project Organization

/* --- HtmlExportVisitor Class --- */
// Concrete Visitor.
// Implements HTML export behavior
// for each document element type.
public class HtmlExportVisitor implements DocumentVisitor {
    // # Visit Implementations
    @Override
    public void visit(TextElement text) {
        System.out.println("<p>" + escape(text.getText()) + "</p>");
    }

    @Override
    public void visit(ImageElement image) {
        System.out.println("<img src=\"" + escape(image.getFilename()) + "\" />");
    }

    @Override
    public void visit(TableElement table) {
        System.out.println(
                "<table data-rows=\"" + table.getRows()
                        + "\" data-cols=\"" + table.getCols() + "\"></table>"
        );
    }

    // # Helper Methods
    // Escapes special HTML characters
    private String escape(String value) {
        return value
                .replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }
}
