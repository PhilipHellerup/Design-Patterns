package Observer; // Project Organization

/* --- Subject Interface --- */
// Subject interface.
// Manages observer registration and notification.
public interface Subject {
    // # Methods
    // Registers an observer
    void registerObserver(Observer observer);

    // Removes a previously registered observer
    void removeObserver(Observer observer);

    // Notifies all registered observers
    void notifyObservers();
}
