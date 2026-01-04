package Command; // Project Organization

/* --- Command Interface --- */
// Declares the interface for all commands.
// Commands encapsulate a request as an object
// and expose a common execution interface.
public interface Command {
    // # Methods
    // Executes the command
    void execute();

    // Undoes the command's action
    void undo();
}
