package Command; // Project Organization

/* --- LightOnCommand Class --- */
// Concrete Command.
// Encapsulates the request to turn the light on
// and binds it to the Light receiver.
public class LightOnCommand implements Command {
    // # Attributes
    // Reference to the receiver
    private final Light light;

    // # Constructor
    // Binds the command to its receiver
    public LightOnCommand(Light light) {
        this.light = light;
    }

    // # Command Execution
    // Executes the "turn on" action
    @Override
    public void execute() {
        light.turnOn();
    }

    // Undoes the "turn on" action
    @Override
    public void undo() {
        // Undo by performing the opposite action
        light.turnOff();
    }
}
