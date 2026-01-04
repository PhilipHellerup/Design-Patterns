package Visitor; // Project Organization

import java.util.List;

/* --- Client Class --- */
// Demonstrates usage of the Visitor Pattern.
// Builds an object structure and applies
// multiple visitors without modifying elements.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create object structure (document)
        List<DocumentElement> document = List.of(
                new TextElement("Hello visitor pattern"),
                new ImageElement("diagram.png"),
                new TableElement(3, 4),
                new TextElement("Double dispatch is the key")
        );

        // Visitor 1: HTML export
        DocumentVisitor htmlVisitor = new HtmlExportVisitor();
        document.forEach(element -> element.accept(htmlVisitor));

        // Visitor 2: Word counting
        WordCountVisitor wordCounter = new WordCountVisitor();
        document.forEach(element -> element.accept(wordCounter));

        System.out.println("Word count: " + wordCounter.getWordCount());
    }
}
