package Visitor; // Project Organization

/* --- Element Interface --- */
// Element interface.
// Declares the accept method that allows
// a visitor to perform operations on it.
public interface DocumentElement {
    // # Visitor Acceptance
    // Accepts a visitor and delegates
    // the operation via double dispatch
    void accept(DocumentVisitor visitor);
}
