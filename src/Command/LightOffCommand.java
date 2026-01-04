package Command; // Project Organization

/* --- LightOffCommand Class --- */
// Concrete Command.
// Encapsulates the request to turn the light off
// and binds it to the Light receiver.
public class LightOffCommand implements Command {
    // # Attributes
    // Reference to the receiver
    private final Light light;

    // # Constructor
    // Binds the command to its receiver
    public LightOffCommand(Light light) {
        this.light = light;
    }

    // # Command Execution
    // Executes the "turn off" action
    @Override
    public void execute() {
        light.turnOff();
    }

    // Undoes the "turn off" action
    @Override
    public void undo() {
        // Undo by performing the opposite action
        light.turnOn();
    }
}
