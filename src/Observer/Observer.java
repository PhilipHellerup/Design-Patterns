package Observer; // Project Organization

/* --- Observer Interface --- */
// Observer interface.
// Declares the update method that the Subject
// calls when its state changes.
public interface Observer {
    // # Methods
    // Called by the Subject to notify the observer
    // about a state change
    void update(float temperature);
}
