package Command; // Project Organization

/* --- Client Class --- */
// Demonstrates usage of the Command Pattern.
// The client creates receivers, commands,
// and connects them to the invoker.
public class Client {
    // # Methods
    // Application Entry Point
    public static void main(String[] args) {
        // Create the receiver
        Light light = new Light();

        // Create concrete commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        // Create the invoker
        RemoteControl remote = new RemoteControl();

        // Execute commands
        remote.pressButton(lightOn);
        remote.pressButton(lightOff);

        // Undo last actions
        remote.pressUndo();
        remote.pressUndo();

        // Redo actions
        remote.pressRedo();
        remote.pressRedo();
    }
}
