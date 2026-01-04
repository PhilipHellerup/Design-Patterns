package Command; // Project Organization

import java.util.ArrayDeque;
import java.util.Deque;

/* --- RemoteControl Class --- */
// Invoker class.
// Responsible for triggering commands
// without knowing how they are executed.
public class RemoteControl {
    // # Attributes
    // Stack of executed commands (for undo)
    private final Deque<Command> undoStack = new ArrayDeque<>();

    // Stack of undone commands (for redo)
    private final Deque<Command> redoStack = new ArrayDeque<>();

    // # Command Handling
    // Executes a command and stores it for undo
    public void pressButton(Command command) {
        command.execute();

        // Save command for undo operations
        undoStack.push(command);

        // Clear redo history when a new command is executed
        redoStack.clear();
    }

    // Undoes the last executed command
    public void pressUndo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Command lastCommand = undoStack.pop();
        lastCommand.undo();

        // Store undone command for redo
        redoStack.push(lastCommand);
    }

    // Redoes the last undone command
    public void pressRedo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Command lastUndoneCommand = redoStack.pop();
        lastUndoneCommand.execute();

        // Restore command to undo stack
        undoStack.push(lastUndoneCommand);
    }
}
